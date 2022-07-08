package br.com.inatel.quotationmanagement.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String stockId;
	@OneToMany(mappedBy = "stock")
	private List<Quote> quotes = new ArrayList<>();

	public Stock(String id, String stockId) {
		this.id = id;
		this.stockId = stockId;
	}
	
	public Stock() {}

	public String getId() {
		return id;
	}

	public String getStockId() {
		return stockId;
	}

	public List<Quote> getQuotes() {
		return quotes;
	}
	
	@PrePersist
	@PreUpdate
	private void onSave() {
		if (this.id == null) {
			this.id = UUID.randomUUID().toString();
		}
	}
	
}
