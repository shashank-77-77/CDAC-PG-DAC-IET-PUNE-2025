import React, { useState } from "react";

const Calculator = () => {
  const [result, setResult] = useState(0);

  return (
    <div>
      <h2>Calculator</h2>
      <h3>Current Result: {result}</h3>
      <button onClick={() => setResult(result + 1)}>Add</button>
      <button onClick={() => setResult(result - 1)}>Subtract</button>
    </div>
  );
};

export default Calculator;
