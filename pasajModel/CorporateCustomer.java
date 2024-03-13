package org.example;

    public  class CorporateCustomer extends User{

        private int id;
        private String taxNo;
        private String corporateName;


        public CorporateCustomer(int identity, String email, String password, String address, int id, String taxNo, String corporateName) {
            super(identity, email, password, address);
            this.id = id;
            this.taxNo = taxNo;
            this.corporateName = corporateName;
        }

        public CorporateCustomer(String corporateName) {

            this.corporateName = corporateName;
        }


    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }
}
