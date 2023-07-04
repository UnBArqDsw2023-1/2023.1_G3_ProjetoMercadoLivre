// Button.jsx
import React from 'react';
import './button.css';

const Button = ({ onClick, text, style }) => {
  return (
    <button className="button" onClick={onClick} style={style}>
      {text}
    </button>
  );
};

export default Button;
