import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import Function from './Function';

import reportWebVitals from './reportWebVitals';
import Factorial from './Func_factorial';
import Calculator from './Cal';
import UpperCase from './UpperCase';
import RadioUpper from './RadioUpper';
import Dropdown from './Dropdown';
import Counter from './Use_Effect';
import Count from './TableofCounter';
import TextToList from './TextList_Webpage';
import RefFunct from './Ref_Function';
import GetData from './JsonTableData';
import PasswordGenerator from './RandomPassword';






const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
   <Function></Function>
   <Calculator></Calculator>
    <Factorial></Factorial>
    <UpperCase></UpperCase>
    <RadioUpper></RadioUpper>
    <Dropdown></Dropdown>
    <Counter></Counter>
    <Count></Count>
    <TextToList></TextToList>
    <RefFunct></RefFunct>
    <GetData></GetData>
    <PasswordGenerator></PasswordGenerator>

   
  </React.StrictMode>
);

reportWebVitals();
