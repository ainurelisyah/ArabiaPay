package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringBootMysql.Service.ProductService;
import com.Spring.SpringBootMysql.model.Product;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    //GET PRODUCT
    @GetMapping("/product")
    public Iterable<Product> getProduct() {
        return productService.getProduct();
    }

    //POST NEW PRODUCT
    @PostMapping("/inputproduct")
    public Product createdProduct(@RequestBody Product product) {

        if (product == null) throw new NullPointerException();
        return productService.createdProduct(product);
    }

    //EDIT USER
    @PutMapping("/editproduct/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody Product updateProduct) {

        if (updateProduct == null) throw new NullPointerException();
        productService.updateProduct(id, updateProduct);
    }

     //DELETE PRODUCT
     @DeleteMapping("/deleteproduct")
     public void deleteProduct(@RequestParam Long id) {
         productService.deleteProduct(id);
     }

}
