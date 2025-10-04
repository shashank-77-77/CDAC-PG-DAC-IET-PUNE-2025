import React, { useCallback, useEffect, useState } from 'react';

function PasswordGenerator() {

  const [password, setPassword] = useState('');
  const [length, setLength] = useState(12);
  const [includeNumbers, setIncludeNumbers] = useState(false);
  const [includeSymbols, setIncludeSymbols] = useState(false);





  const generatePassword = () => {
    let characters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
    if (includeNumbers) characters += '0123456789';
    if (includeSymbols) characters += '!@#$%^&*()_+';

    let newPassword = '';
    for (let i = 0; i < length; i++) {
      newPassword += characters.charAt(
        Math.floor(Math.random() * characters.length));
    }

    // state passowrd 
    setPassword(newPassword);
  };

  useEffect(() => { generatePassword() },
    [length, includeNumbers, includeSymbols])
  //performace   function def 
  // data useMemo Virtual DOM 
  useCallback(() => { generatePassword() },
    [length, includeNumbers, includeSymbols])

  //const passwordGenerte = useCallback(generatePassword, [length, includeNumbers])

  const copyToClipboard = () => {
    navigator.clipboard.writeText(password);
    alert('Password copied to clipboard!');
  };

  return (
    <div className="password-generator">
      <h1>Random Password Generator</h1>
      <div>
        <label>Password Length:</label>
        <input
          type="number"
          value={length}
          onChange={(e) => setLength(parseInt(e.target.value))}
          min="1"
          max="32"
        />
      </div>

      <div>
        <label>
          <input
            type="checkbox"
            checked={includeNumbers}// false 
            onChange={() => setIncludeNumbers(!includeNumbers)}
          />
          Include Numbers
        </label>
      </div>
      <div>
        <label>
          <input
            type="checkbox"
            checked={includeSymbols}
            onChange={() => setIncludeSymbols(!includeSymbols)}
          />
          Include Symbols
        </label>
      </div>
      <button onClick={generatePassword}>Generate Password</button>
      <div>
        <input type="text" value={password} readOnly />
        <button onClick={copyToClipboard}>Copy</button>
      </div>
    </div>
  );
}

export default PasswordGenerator;