// Compras.jsx
import React from 'react';

import Card from '../Components/card/card';
import Title from '../Components/title/title';
const Compras = () => {
  const compras = [
    { id: 1, title: 'Compra 1', content: 'Detalhes da compra 1' },
    { id: 2, title: 'Compra 2', content: 'Detalhes da compra 2' },
    { id: 3, title: 'Compra 3', content: 'Detalhes da compra 3' },
  ];

  return (
    <div>
      <Title text="Compras" />
      {compras.map((compra) => (
        <Card key={compra.id} title={compra.title} content={compra.content} />
      ))}
    </div>
  );
};

export default Compras;
