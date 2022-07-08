package br.com.inatel.quotationmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.inatel.quotationmanagement.model.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {


}
