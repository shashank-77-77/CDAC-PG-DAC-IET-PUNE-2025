import React from "react";

const Contact = () => {
    return (
        <div style={{ textAlign: "center", maxWidth: "600px" }}>
            <h2 style={{ color: "#2c3e50" }}>Contact Us</h2>
            <p style={{ fontSize: "18px", fontWeight: "bold" }}>
                You can find us here:
            </p>
            <address
                style={{
                    fontSize: "16px",
                    fontWeight: "bold",
                    color: "#333",
                    marginTop: "10px",
                }}
            >
                IET Pune 
            </address>
        </div>
    );
};

export default Contact;