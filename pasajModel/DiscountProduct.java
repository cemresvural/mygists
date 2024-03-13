package org.example;

public class DiscountProduct extends Product{
    private int discount;

    public DiscountProduct(String categoryName, int id, int id1, String subCategoryName, int id2, String title, String imageUrl, String color, double unitPrice, int discount) {
        super(categoryName, id, id1, subCategoryName, id2, title, imageUrl, color, unitPrice);
        this.discount = discount;
    }

    public DiscountProduct()
    {

    }
    public int getDiscount() {

        return discount;
    }

    public void setDiscount(int discount) {
        Customer customer = new Customer();
        if (customer.isTurkcellCustomer()) {
            this.discount = discount + 2;
        } else {
            this.discount = discount;
        }
    }
}
