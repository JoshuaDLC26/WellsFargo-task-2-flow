package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import com.wellsfargo.counselor.entity.Portfolio;
@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityID;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private int priceDate;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int  total;

    @Column(nullable = false)
    private int  quantity;

    @Column(nullable = false)
    private float  price;

    private Portfolio portfolio;


    protected Security() {

    }

    public Security(long securityID, float price, String symbol, String type, int total, int priceDate, int quantity, Portfolio portfolio) {
        this.securityID = securityID;
        this.price = price;
        this.symbol = symbol;
        this.type = type;
        this.total = total;
        this.priceDate = priceDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Portfolio getPortfolio(){
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPriceDate(){return priceDate;}

    public void setPriceDate(int priceDate){this.priceDate = priceDate;}

    public int getQuantity(){return quantity;}

    public void setQuantity(int quantity){this.quantity = quantity;}


}
