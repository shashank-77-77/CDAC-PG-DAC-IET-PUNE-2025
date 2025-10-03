import React, { useEffect, useState } from "react";
import axios from "axios";

const GetData = () => {
    const [data, setData] = useState([]);

    const [error, setError] = useState(null);

    useEffect(() => {
        // Make GET request to fetch data
        axios
            .get("https://jsonplaceholder.typiode.com/posts")
            .then((response) => {
                setData(response.data);
            })
            .catch((err) => {
                setError(err.message);

            });
    }, []);


    if (error) return <div>Error: {error}</div>;

    return (
        <div>
            <h1>Posts</h1>
            <ul>
                {data.map((post) => (
                    <li key={post.id}>{post.title}</li>
                ))}
            </ul>
        </div>
    );
};

export default GetData;