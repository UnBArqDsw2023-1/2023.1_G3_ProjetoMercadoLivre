import React from 'react';
import { Link, NavLink } from 'react-router-dom';
import './navbar.css'
const Navbar = () => {
  return (
    <nav className="navbar">
      <ul className="navbar-nav">
        <li className="nav-item">
          <NavLink to="/compras" className="nav-link" activeClassName="active">
            Compras
          </NavLink>
        </li>
        <li className="nav-item">
          <NavLink to="/reclamacao" className="nav-link" activeClassName="active">
            Reclamação
          </NavLink>
        </li>
        <li className="nav-item">
          <NavLink to="/estorno" className="nav-link" activeClassName="active">
            Estorno
          </NavLink>
        </li>
        <li className="nav-item">
          <NavLink to="/devolucao" className="nav-link" activeClassName="active">
            Devolução
          </NavLink>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
