import React, { useState } from "react";

const PasswordGenerator = () => {
  const [password, setPassword] = useState("");

  const generatePassword = () => {
    const chars =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
    let newPassword = "";
    for (let i = 0; i < 10; i++) {
      newPassword += chars.charAt(Math.floor(Math.random() * chars.length));
    }
    setPassword(newPassword);
  };

  return (
    <div>
      <h2>Random Password Generator</h2>
      <input
        type="text"
        value={password}
        readOnly
        style={{
          width: "250px",
          padding: "8px",
          marginRight: "10px",
          border: "1px solid #ccc",
        }}
      />
      <button onClick={generatePassword}>Generate Password</button>
    </div>
  );
};

export default PasswordGenerator;
