import React from 'react';
import './errorAlert.css';

const ErrorAlert = ({ message }) => {
  return <div className="error-alert">{message}</div>;
};

export default ErrorAlert;
