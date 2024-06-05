package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.Product;

public interface ProductService {

    Iterable <Product> getProduct();

    Product createdProduct (Product product);

    void updateProduct (Long id, Product updateProduct);

    void deleteProduct(Long id);
}
