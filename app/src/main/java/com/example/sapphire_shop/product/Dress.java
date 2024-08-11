package com.example.sapphire_shop.product;

public class Dress {

    String name,price;
    int image;

    public Dress(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getImage() {

        return image;
    }

    public void setImage(int image) {

        this.image = image;
    }

}


