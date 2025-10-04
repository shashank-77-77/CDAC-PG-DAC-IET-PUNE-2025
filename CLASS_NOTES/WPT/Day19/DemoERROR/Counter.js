

import Counter1 from './Counter1'
import ErrorBoundary from './ErrorBoundry'
import Counter2 from './Counter2'
const { useState } = require("react")

const Counter = () => {
  const [count1, setCounter1] = useState(1);
  const increament1 = () => {
    setCounter1(count1 + 1);
  }  //

  const [count2, setCounter2] = useState(10);
  const increament2 = () => {
    setCounter2(count2 + 1);
  }



  return (
    <>
      <ErrorBoundary>
        <Counter1 value={count1}
          onClick={increament1}
        ></Counter1>
      </ErrorBoundary>

      <Counter2 value={count2}
        onClick={increament2}></Counter2>
    </>

  )





}

export default Counter;