package br.com.inatel.quotationmanagement.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Quote {

	@Id
	private String id;
	
	@ManyToOne
	private Stock stock;
	private Date dataQuote;
	private double valorQuote;
	
	public Quote(Date dataQuote, double valorQuote) {
		this.dataQuote = dataQuote;
		this.valorQuote = valorQuote;
	}
	
	public Quote() {}

	@PrePersist
	@PreUpdate
	private void onSave() {
		if (this.id == null) {
			this.id = UUID.randomUUID().toString();
		}
	}

	public String getId() {
		return id;
	}

	public Stock getStock() {
		return stock;
	}

	public Date getDataQuote() {
		return dataQuote;
	}

	public double getValorQuote() {
		return valorQuote;
	}
	

	
	
}
