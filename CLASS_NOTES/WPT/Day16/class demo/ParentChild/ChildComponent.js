import "./ex2.css"
export default function ChildComponent({num1,num2,f1})
{
    function compute(e)
    {
        switch(e.target.value)
        {
            case "add" : let res = num1+num2;
                         f1(res)
                         break;
            case "pow" : let r =Math.pow(num1,num2);
                         f1(r)
                         break;
            default:break;
        }
    }

    return <div className="outline">
        <h5>Child Component</h5>
        <select onChange={compute}>
            <option value="add">Add</option>
            <option value="pow">Power</option>
        </select>
    </div>
}