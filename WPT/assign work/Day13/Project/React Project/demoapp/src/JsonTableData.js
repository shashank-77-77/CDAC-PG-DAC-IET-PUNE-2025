import React, { useState } from "react";
import axios from "axios";
import './style.css';

const GetData = () => {
  const [data, setData] = useState([]);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(false);

  const fetchData = async () => {
    setLoading(true);
    setError(null);
    try {
      const response = await axios.get("https://jsonplaceholder.typicode.com/posts");
      setData(response.data);
    } catch (err) {
      setError(err.message);
    }
    setLoading(false);
  };

  return (
    <div>
      <h1>Posts</h1>
      <button onClick={fetchData}>Show Posts</button>
      {loading && <div>Loading...</div>}
      {error && <div>Error: {error}</div>}
      <table>
        <thead>
          <tr>
            <th>UserId</th>
            <th>Title</th>
          </tr>
        </thead>
        <tbody>
          {data.map((post) => (
            <tr key={post.id}>
              <td>{post.userId}</td>
              <td>{post.title}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default GetData;
