package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import com.wellsfargo.counselor.entity.client;
@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private float risk;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int  total;

    private client client;

    protected Portfolio() {

    }

    public Portfolio(long portfolioID, String portfolioName, float risk, String type, int total, client client) {
        this.portfolioID = portfolioID;
        this.portfolioName = portfolioName;
        this.risk = risk;
        this.type = type;
        this.total = total;
        this.client = client;
    }

    public client getClient(){
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public float getRisk() {
        return risk;
    }

    public void setRisk(float risk) {
        this.risk = risk;
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



}
