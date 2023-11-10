package com.nnj.batch.dto;

import com.nnj.batch.entities.Order;
import com.nnj.batch.entities.Product;
import com.nnj.batch.entities.PurchaseDate;
import com.nnj.batch.entities.Purchaser;
import com.nnj.batch.entities.Supplier;

import lombok.Data;

@Data
public class ConvertedInputData {
	
	private Supplier supplier;
	
	private Purchaser purchaser;
	
	private Product product;
	
	private PurchaseDate purchaseDate;
	
	private Order order;

}

