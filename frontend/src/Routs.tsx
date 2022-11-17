import { BrowserRouter, Routes, Route  } from 'react-router-dom';
import Header from './components/Header';
import Charts from './pages/Charts';
import Home from './pages/Home';
import Records from './pages/Records';

function Routs() {
    return (
        <BrowserRouter>
            <Header />
            <Routes>
                <Route path="/" element={<Home/>} />
            </Routes>

            <Routes>
                <Route path="/records" element={<Records/>} />
            </Routes>

            <Routes>
                <Route path="/charts" element={<Charts/>} />
            </Routes>
        </BrowserRouter>
    );
}

export default Routs;