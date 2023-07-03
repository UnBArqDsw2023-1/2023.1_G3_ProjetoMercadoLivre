import React from 'react';
import {BrowserRouter, Navigate,Route, Routes } from 'react-router-dom'


import Compras from './Telas/Compras';
import Estorno from './Telas/Estorno';
import Reclamacao from './Telas/Reclamacao';
import Devolucao from './Telas/Devolucao';
import Navbar from './Components/navbar/navbar';

const App = () => {
  return (
<BrowserRouter>
<Navbar/>
    <Routes>
    <Route exact path="/compras" element={<Compras />} />
    <Route exact path="/reclamacao" element={<Reclamacao />} />
    <Route exact path="/estorno" element={<Estorno />} />        
      <Route exact path="/devolucao" element={<Devolucao />} />
   
  </Routes>
  </BrowserRouter>

   
  );
};

export default App;
