// import logo from './logo.svg';
// import './App.css';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;


// import React from "react";
// import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
// import Home from "./Home";
// import AboutUs from "./AboutUs";
// import ContactUs from "./ContactUs";
// import Counter from "./Counter";


// function App() {
//   return (
//     <Router>
//       <div>
//         <nav
//           style={{
//             display: "flex",
//             gap: "15px",
//             backgroundColor: "#f0f0f0",
//             padding: "10px",
//           }}
//         >
//           <Link to="/">Home</Link>
//           <Link to="/about">About Us</Link>
//           <Link to="/contact">Contact Us</Link>
//           <Link to="/counter">Counter</Link>
//         </nav>

//         <hr />

//         <Routes>
//           <Route path="/" element={<Home />} />
//           <Route path="/about" element={<AboutUs />} />
//           <Route path="/contact" element={<ContactUs />} />
//           <Route path="/counter" element={<Counter />} />
//         </Routes>
//       </div>
//     </Router>
//   );
// }

// export default App;




import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Dashboard from "./Dashboard";
import Services from "./Services";
import Profile from "./Profile";
import Calculator from "./Calculator";


const App = () => {
  return (
    <Router>
      <div>
        <nav
          style={{
            display: "flex",
            gap: "20px",
            backgroundColor: "#e6e6e6",
            padding: "10px",
          }}
        >
          <Link to="/">Dashboard</Link>
          <Link to="/services">Services</Link>
          <Link to="/profile">Profile</Link>
          <Link to="/calculator">Calculator</Link>
        </nav>

        <hr />

        <Routes>
          <Route path="/" element={<Dashboard />} />
          <Route path="/services" element={<Services />} />
          <Route path="/profile" element={<Profile />} />
          <Route path="/calculator" element={<Calculator />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;

