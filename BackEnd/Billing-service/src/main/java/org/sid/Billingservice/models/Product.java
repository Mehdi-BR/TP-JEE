package org.sid.Billingservice.models;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String reference;
    private double price;

    private double quantity;
 }
