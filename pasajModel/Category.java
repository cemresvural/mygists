package org.example;

public class Category {

        public int id;
        private String categoryName;

        public Category(String categoryName, int id) {
                this.categoryName = categoryName;
                this.id = id;
        }
        public Category()
        {

        }


        public String getCategoryName() {
                return categoryName;
        }

        public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
        }
}
