import React from "react";
import {
    BrowserRouter, Routes, Route, NavLink
    , Link,
    useNavigate
} from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";
import LoginDemo from '../DemoLogin/Login';



const App1 = () => {
    return (
        <BrowserRouter>

            {/* Navigation Bar */}
            <nav
                style={{
                    backgroundColor: "blue",
                    padding: "10px",
                    display: "flex",
                    justifyContent: "center",
                }}
            >
                <ul
                    style={{
                        listStyle: "none",
                        display: "flex",
                        gap: "20px",
                        padding: "0",
                        margin: "0",
                    }}
                >
                    <li>
                        <NavLink to="/" style={linkStyle}>
                            Home
                        </NavLink>
                    </li>
                    <li>
                        <Link to="/about" style={linkStyle}>
                            About Us
                        </Link>
                    </li>
                    <li>
                        <Link to="/contact" style={linkStyle}>
                            Contact Us
                        </Link>
                    </li>
                    <li>
                        <Link to="/login" style={linkStyle}>
                            Login
                        </Link>
                    </li>
                </ul>
            </nav>

            {/* Page Content */}

            <div
                style={{ display: "flex", justifyContent: "center", padding: "20px" }}
            >



                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/about" element={<About />} />
                    <Route path="/contact" element={<Contact />} />
                    <Route path="/login" element={<LoginDemo />} />
                </Routes>
            </div>

        </BrowserRouter>
    );
};

// Style for navigation links
const linkStyle = {
    textDecoration: "none",
    color: "white",
    fontSize: "18px",
    fontWeight: "bold",
};

export default App1;