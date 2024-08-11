package com.example.sapphire_shop.product;

public class Bottom {

    String name,price;
    int image;

    public Bottom(String name, String price, int image) {
        this.name = name;
        this.image = image;
        this.price = price;
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

