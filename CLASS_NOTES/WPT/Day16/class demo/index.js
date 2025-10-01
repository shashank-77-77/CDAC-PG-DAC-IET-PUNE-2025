import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import Custom from './custom';
import MyFunction from './myFunction';
import { Function2, Function3 } from './myFunction';
import reportWebVitals from './reportWebVitals';
import Factorial from './Factorial';

const root = ReactDOM.createRoot
  (document.getElementById('root'));

root.render(
  <>

    <App></App>

  </>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
