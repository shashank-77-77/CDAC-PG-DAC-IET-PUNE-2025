import React from "react";
import Contact from "./Contact";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";

const Home = () => {
    // let n = useNavigate();
    return (
        <div style={{ textAlign: "center", maxWidth: "600px" }}>
            <h2 style={{ color: "#2c3e50" }}>Home Page</h2>
            <p style={{ fontSize: "18px", fontWeight: "bold" }}>
                Welcome to the home page!
            </p>

        </div>
    );
};

export default Home;