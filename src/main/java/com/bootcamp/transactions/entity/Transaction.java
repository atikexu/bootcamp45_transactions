package com.bootcamp.transactions.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Clase de entidad
 */
@Data
@AllArgsConstructor
@Document(collection="transaction")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction {
	@Id
	private String id;
	private String productType;
	private String productId;
	private String customerId;
	private String transactionType;
	private Double amount;
	private LocalDateTime transactionDate;
	private String customerType;
	private Double balance;
}
