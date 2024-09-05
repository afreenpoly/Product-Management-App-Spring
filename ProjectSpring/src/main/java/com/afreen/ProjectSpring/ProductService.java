package com.afreen.ProjectSpring;

import java.util.List;

public class ProductService{
       
    ProductDB db;

    // //method to add products,which adds product to array
    // public void addProduct(Product p) {
    //     // prodlist.add(p);
    //     db.save(p);
    // }


    public List<Product> getAllProducts() {
        // return prodlist;
        return db.findAll();
    }

}