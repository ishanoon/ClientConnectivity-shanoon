package com.turntabl.Client_Connectivity.portfolio.model;

import java.util.List;

public class PortfolioResponse {
    private Long user_id;
    private int portfolio_id;
    private double initial_amount;
    private double amount_spent;
    private double revenue;
    private List<Product> products;


    public PortfolioResponse(){}

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public int getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(int portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public double getInitial_amount() {
        return initial_amount;
    }

    public void setInitial_amount(double initial_amount) {
        this.initial_amount = initial_amount;
    }

    public double getAmount_spent() {
        return amount_spent;
    }

    public void setAmount_spent(double amount_spent) {
        this.amount_spent = amount_spent;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
