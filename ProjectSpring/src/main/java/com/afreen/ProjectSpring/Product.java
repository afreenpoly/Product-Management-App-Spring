package com.afreen.ProjectSpring;

public class Product {
    private String name;
    private String type;
    private String colour;
    private int price;


    public Product(String name, String type, String colour, int price) {
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.price = price;
    }


    public Product() {
        //TODO Auto-generated constructor stub
    }


    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }


    public String getColour() {
        return colour;
    }


    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Products{name=" + name + ", type=" + type + ", colour=" + colour + ", price=" + price + "}";
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setType(String type) {
        this.type = type;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }


    public void setPrice(int price) {
        this.price = price;
    }
}
