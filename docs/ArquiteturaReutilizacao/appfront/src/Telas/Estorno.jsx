// Estorno.jsx
import React, { useState } from 'react';
import Form from '../Components/form/form';
import TextInput from '../Components/textInput/textinput';
import Title from '../Components/title/title';
import Button from '../Components/button/button';

const Estorno = () => {
  const [numeroPedido, setNumeroPedido] = useState('');
  const [valorEstorno, setValorEstorno] = useState('');
  const [motivo, setMotivo] = useState('');
  const [enviado, setEnviado] = useState(false); // Estado para controlar se o formulário foi enviado com sucesso

  const handleFormSubmit = () => {
    // Lógica para lidar com a submissão do formulário
    console.log('Formulário de estorno enviado');
    setEnviado(true);
  };

  const handleNumeroPedidoChange = (e) => {
    setNumeroPedido(e.target.value);
  };

  const handleValorEstornoChange = (e) => {
    setValorEstorno(e.target.value);
  };

  const handleMotivoChange = (e) => {
    setMotivo(e.target.value);
  };

  const handleResetForm = () => {
    setNumeroPedido('');
    setValorEstorno('');
    setMotivo('');
    setEnviado(false);
  };

  const fields = [
    <TextInput label="Número do pedido" value={numeroPedido} onChange={handleNumeroPedidoChange} />,
    <TextInput label="Valor do estorno" value={valorEstorno} onChange={handleValorEstornoChange} />,
    <textarea placeholder="Motivo" value={motivo} onChange={handleMotivoChange} />,
  ];

  return (
    <div>
      <Title text="Estorno" />
      {enviado ? (
        <div>
          <p>O estorno foi solicitado com sucesso!</p>
          <Button text="Solicitar outro estorno" onClick={handleResetForm} />
        </div>
      ) : (
        <Form fields={fields} onSubmit={handleFormSubmit} buttonText="Solicitar estorno" />
      )}
    </div>
  );
};

export default Estorno;
