package org.example;

import java.util.Date;

public class Comment extends CorporateCustomer{
    private int id;
    private double score;
    private String message;
    private String date;
    private int productId;

    public Comment(String corporateName, int id, double score, String message, String date, int productId) {
        super(corporateName);
        this.id = id;
        this.score = score;
        this.message = message;
        this.date = date;
        this.productId = productId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
