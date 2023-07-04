// Form.jsx
import React from 'react';
import './form.css';

const Form = ({ fields, onSubmit, buttonText }) => {
  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit();
  };

  return (
    <form className="form" onSubmit={handleSubmit}>
      {fields.map((field, index) => (
        <div key={index} className="form-field">
          {field}
        </div>
      ))}
      <button type="submit" className="form-button">
        {buttonText}
      </button>
    </form>
  );
};

export default Form;
