// Devolucao.jsx
import React, { useState } from 'react';
import Form from '../Components/form/form';
import TextInput from '../Components/textInput/textinput';
import Title from '../Components/title/title';
import Button from '../Components/button/button';

const Devolucao = () => {
  const [numeroPedido, setNumeroPedido] = useState('');
  const [motivoDevolucao, setMotivoDevolucao] = useState('');
  const [detalhesAdicionais, setDetalhesAdicionais] = useState('');
  const [enviado, setEnviado] = useState(false); // Estado para controlar se o formulário foi enviado com sucesso

  const handleFormSubmit = () => {
    // Lógica para lidar com a submissão do formulário
    console.log('Formulário de devolução enviado');
    setEnviado(true);
  };

  const handleNumeroPedidoChange = (e) => {
    setNumeroPedido(e.target.value);
  };

  const handleMotivoDevolucaoChange = (e) => {
    setMotivoDevolucao(e.target.value);
  };

  const handleDetalhesAdicionaisChange = (e) => {
    setDetalhesAdicionais(e.target.value);
  };

  const handleResetForm = () => {
    setNumeroPedido('');
    setMotivoDevolucao('');
    setDetalhesAdicionais('');
    setEnviado(false);
  };

  const fields = [
    <TextInput label="Número do pedido" value={numeroPedido} onChange={handleNumeroPedidoChange} />,
    <textarea
      placeholder="Motivo da devolução"
      value={motivoDevolucao}
      onChange={handleMotivoDevolucaoChange}
    />,
    <textarea
      placeholder="Detalhes adicionais"
      value={detalhesAdicionais}
      onChange={handleDetalhesAdicionaisChange}
    />,
  ];

  return (
    <div>
      <Title text="Devolução" />
      {enviado ? (
        <div>
          <p>A devolução foi solicitada com sucesso!</p>
          <Button text="Solicitar outra devolução" onClick={handleResetForm} />
        </div>
      ) : (
        <Form fields={fields} onSubmit={handleFormSubmit} buttonText="Solicitar devolução" />
      )}
    </div>
  );
};

export default Devolucao;
