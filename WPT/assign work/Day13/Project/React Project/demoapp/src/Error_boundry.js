import {Component} from "react";
class ErrorBound extends Component{
    constructor(props)
    {
        super(props);
        this.state={hasError :false}

    }
    static getDerivedStateFromError(error)
    {
        return {hasError:true};

    }

    render()
    {
        if(this.state.hasError)
        {
            return <h3> Something went wrong</h3>
        }
         return this.props.children;
    }

}
export default ErrorBound;
