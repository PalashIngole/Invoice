package com.invoice.request;

import lombok.Data;

@Data
public class InvoiceInlineRequest {

	private Long lineItemId;

	private int quantity;

	private int workingHours;

	private int price;

	private Long invoiceId;

	private Long productId;

}
