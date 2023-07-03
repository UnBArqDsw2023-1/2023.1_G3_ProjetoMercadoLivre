import React, { useState } from 'react';
import Card from '../Components/card/card';

import Title from '../Components/title/title';
import Pagination from '../Components/pagination/pagination';
import LoadingSpinner from '../Components/loadingSpinnner/loadingSpinner';
import ErrorAlert from '../Components/errorAlert/errorAlert';


const Compras = () => {
  const [compras, setCompras] = useState([]);
  const [currentPage, setCurrentPage] = useState(1);
  const [itemsPerPage] = useState(3);
  const [isLoading, setIsLoading] = useState(false);
  const [error, setError] = useState(null);

  // Simulate fetching data from API
  const fetchData = () => {
    setIsLoading(true);
    setError(null);

    // Simulate API call delay
    setTimeout(() => {
      // Simulated data
      const data = [
        { id: 1, title: 'Compra 1', content: 'Detalhes da compra 1' },
        { id: 2, title: 'Compra 2', content: 'Detalhes da compra 2' },
        { id: 3, title: 'Compra 3', content: 'Detalhes da compra 3' },
        { id: 4, title: 'Compra 4', content: 'Detalhes da compra 4' },
        { id: 5, title: 'Compra 5', content: 'Detalhes da compra 5' },
        { id: 6, title: 'Compra 6', content: 'Detalhes da compra 6' },
      ];

      // Calculate pagination
      const indexOfLastItem = currentPage * itemsPerPage;
      const indexOfFirstItem = indexOfLastItem - itemsPerPage;
      const currentItems = data.slice(indexOfFirstItem, indexOfLastItem);

      setCompras(currentItems);
      setIsLoading(false);
    }, 1000);
  };

  // Simulate handling pagination
  const handlePageChange = (pageNumber) => {
    setCurrentPage(pageNumber);
  };

  // Fetch data on component mount
  React.useEffect(() => {
    fetchData();
  }, []);

  return (
    <div className="compras">
      <Title text="Compras" />
      {isLoading ? (
        <LoadingSpinner />
      ) : error ? (
        <ErrorAlert message="Ocorreu um erro ao carregar as compras." />
      ) : (
        <>
          <div className="compras-list">
            {compras.map((compra) => (
              <Card key={compra.id} title={compra.title} content={compra.content} />
            ))}
          </div>
          <Pagination
            currentPage={currentPage}
            itemsPerPage={itemsPerPage}
            totalItems={compras.length}
            onPageChange={handlePageChange}
          />
        </>
      )}
    </div>
  );
};

export default Compras;
