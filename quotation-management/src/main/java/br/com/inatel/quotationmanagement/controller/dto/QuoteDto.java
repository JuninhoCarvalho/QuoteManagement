package br.com.inatel.quotationmanagement.controller.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.inatel.quotationmanagement.model.Quote;

public class QuoteDto {

	private String id;
	private Date dataQuote;
	private double valorQuote;
	
	public QuoteDto(Quote quote) {
		this.id = quote.getId();
		this.dataQuote = quote.getDataQuote();
		this.valorQuote = quote.getValorQuote();
	}
	
	public static List<QuoteDto> converter(List<Quote> quotes) {
		return quotes.stream().map(QuoteDto::new).collect(Collectors.toList());
	}
	
	public String getId() {
		return id;
	}
	
	public Date getDataQuote() {
		return dataQuote;
	}
	
	public double getValorQuote() {
		return valorQuote;
	}
}
