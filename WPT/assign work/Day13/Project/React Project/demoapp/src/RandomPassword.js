// Install axios: npm install axios
import React, { useState } from 'react';
import axios from 'axios';

function PasswordGenerator() {
  const [length, setLength] = useState(12);
  const [password, setPassword] = useState('');

const generatePassword = async () => {
  try {
    const response = await axios.post('/api/generate-password', { length });
    setPassword(response.data.password);
  } catch (error) {
    console.log(error); // Log the error for debugging
    setPassword('Error generating password');
  }
};

  return (
    <div>
      <label>
        Password Length:
        <input
          type="number"
          min="6"
          value={length}
          onChange={(e) => setLength(Number(e.target.value))}
        />
      </label>
      <button onClick={generatePassword}>Generate Password</button>
      <div>
        Generated Password: <input type="text" value={password} readOnly />
      </div>
    </div>
  );
}

export default PasswordGenerator;
