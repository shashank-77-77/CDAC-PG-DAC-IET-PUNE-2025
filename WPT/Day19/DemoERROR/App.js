import Counter from "./Counter";
import ErrorBoundary from './ErrorBoundry'

export default function AppDemo() {



    return (
        <>
            <ErrorBoundary>
                <Counter></Counter>
            </ErrorBoundary>
        </>
    )
}