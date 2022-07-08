package br.com.inatel.quotationmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.inatel.quotationmanagement.controller.dto.StockDto;
import br.com.inatel.quotationmanagement.model.Stock;
import br.com.inatel.quotationmanagement.service.StockService;

@RestController
@RequestMapping("/stock")
public class StrockController {

	@Autowired
	StockService stockService;
	
	@GetMapping
	public List<StockDto> lista() {
		List<Stock> stocks = stockService.findAllWithQuotes();
		return StockDto.converter(stocks);
	}
	

}
