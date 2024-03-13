package org.example;

public class User {
    private int identity;
    private String email;
    private String password;
    private String address;

    public User(int identity, String email, String password, String address) {
        this.identity = identity;
        this.email = email;
        this.password = password;
        this.address = address;
    }
    public User()
    {

    }
    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
