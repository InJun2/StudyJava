import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import ScrollToTop from './component/ScrollToTop';
import Home from './page/Home';
import Header from './page/Header';
import Posts from './page/Posts';
import Footer from './page/Footer';
import SideNavigation from './page/Side_Navigaion';

export default function App() {
  return (
    <BrowserRouter>
      <SideNavigation/>

      <ScrollToTop/>
      <Header/>
      <Routes>
        <Route path="/" element={<Home/>}/>
        <Route path="/post" element={<Posts/>}/>
      </Routes>
      <Footer/>
    </BrowserRouter>
  );
}
