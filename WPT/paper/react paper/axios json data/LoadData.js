import React, { useState, useEffect } from "react";
import axios from "axios";

function LoadData() {
  const [data, setData] = useState([]);
  const [error, setError] = useState("");

  useEffect(() => {
    axios
      .get("https://jsonplaceholder.typicode.com/users")
      .then((response) => {
        setData(response.data);
      })
      .catch((err) => {
        setError("⚠️ Data loading failed. Check API or network connection.");
      });
  }, []);

  return (
    <div>
      <h2>📊 JSON Data via Axios</h2>
      {error && <p style={{ color: "red" }}>{error}</p>}
      <ul style={{ listStyle: "none", padding: 0 }}>
        {data.map((user) => (
          <li key={user.id}>
            {user.name} — {user.email}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default LoadData;
