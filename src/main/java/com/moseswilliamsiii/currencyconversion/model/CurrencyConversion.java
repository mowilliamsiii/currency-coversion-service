package com.moseswilliamsiii.currencyconversion.model;

import java.math.BigDecimal;

//@Entity
public class CurrencyConversion {
//
//    @Id
//    @Column(name = "id")
    private Long id;
//    @Column(name = "currency_from")
    private String from;
//    @Column(name = "currency_to")
    private String to;
//    @Column(name = "conversion")

    private BigDecimal quantity;
    private BigDecimal conversionMultiple;

    private BigDecimal totalCalAmount;
//    @Column(name = "environment")
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,BigDecimal totalCalAmount, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalAmount = totalCalAmount;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalAmount() {
        return totalCalAmount;
    }

    public void setTotalCalAmount(BigDecimal totalCalAmount) {
        this.totalCalAmount = totalCalAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
