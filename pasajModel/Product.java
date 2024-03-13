package org.example;

public class Product extends SubCategory{
    private int id;
    private String title;
    private String imageUrl;
    private String color;
    private double unitPrice;

    public Product(String categoryName, int id, int id1, String subCategoryName, int id2, String title, String imageUrl, String color, double unitPrice) {
        super(categoryName, id, id1, subCategoryName);
        this.id = id2;
        this.title = title;
        this.imageUrl = imageUrl;
        this.color = color;
        this.unitPrice = unitPrice;
    }
    public Product(String title)
    {
        this.title=title;
    }
    public Product()
    {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0)
        {
            System.out.println("0 dan büyük değer girilmeli");
        }
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
