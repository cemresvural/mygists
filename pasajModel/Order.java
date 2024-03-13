package org.example;

public class Order  {
    private int orderId;
    private int ProductId;
    private int customerId;
    private String address;
    private String card;

    public Order(int orderId, int productId, int customerId, String address, String card) {
        this.orderId = orderId;
        ProductId = productId;
        this.customerId = customerId;
        this.address = address;
        this.card = card;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
