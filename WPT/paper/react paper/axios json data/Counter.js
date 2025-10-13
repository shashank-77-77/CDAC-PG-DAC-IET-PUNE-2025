import React, { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <h2>🔄 Counter Operations</h2>
      <h3>Current Count: {count}</h3>
      <button onClick={() => setCount(count + 1)} style={{ marginRight: "10px" }}>
        Increment ➕
      </button>
      <button onClick={() => setCount(count - 1)}>
        Decrement ➖
      </button>
    </div>
  );
}

export default Counter;
