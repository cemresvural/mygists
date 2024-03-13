package org.example;

public class SubCategory extends Category{
    private int id;
    private String subCategoryName;


    public SubCategory(String categoryName, int id, int id1, String subCategoryName) {
        super(categoryName, id);
        this.id = id1;
        this.subCategoryName = subCategoryName;
    }
    public SubCategory()
    {

    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
}
