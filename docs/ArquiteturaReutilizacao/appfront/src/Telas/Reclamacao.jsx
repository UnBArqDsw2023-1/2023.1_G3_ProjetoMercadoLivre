// Reclamacao.jsx
import React, { useState } from 'react';

import Form from '../Components/form/form';
import TextInput from '../Components/textInput/textinput';
import Title from '../Components/title/title';
import Button from '../Components/button/button';

const Reclamacao = () => {
  const [nome, setNome] = useState('');
  const [email, setEmail] = useState('');
  const [descricao, setDescricao] = useState('');

  const handleFormSubmit = () => {
    // Lógica para lidar com a submissão do formulário
    console.log('Formulário de reclamação enviado');
  };

  const handleNomeChange = (e) => {
    setNome(e.target.value);
  };

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handleDescricaoChange = (e) => {
    setDescricao(e.target.value);
  };

  const fields = [
    <TextInput label="Nome" value={nome} onChange={handleNomeChange} />,
    <TextInput label="Email" value={email} onChange={handleEmailChange} />,
    <textarea
      placeholder="Descrição da reclamação"
      value={descricao}
      onChange={handleDescricaoChange}
    />,
  ];

  return (
    <div>
      <Title text="Reclamação" />
      <Form fields={fields} onSubmit={handleFormSubmit} buttonText="Enviar reclamação" />
    </div>
  );
};

export default Reclamacao;
