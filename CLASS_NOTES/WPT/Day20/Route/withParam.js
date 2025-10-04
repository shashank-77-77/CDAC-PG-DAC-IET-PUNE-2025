import { BrowserRouter, Routes, Route, Link, useParams } from 'react-router-dom';


export default function Info() {
  const { firstname } = useParams();
  return <h1>Hello, {firstname}!</h1>;
}