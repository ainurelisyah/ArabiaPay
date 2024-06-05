package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.ProductService;
import com.Spring.SpringBootMysql.model.Product;
import com.Spring.SpringBootMysql.repository.ProductRepo;


@Service
@Transactional
public class ProductServicesImpl implements ProductService  {

    @Autowired
    ProductRepo productRepo;

    //READ PRODUCT
    @Override
    public Iterable<Product> getProduct() {
        return productRepo.findAll();
    }

    //POST PRODUCT
    @Override
    public Product createdProduct(Product product) {
        return productRepo.save(product);
    }

    //UPDATE PRODUCT
    @Override
    public void updateProduct(Long id, Product updateProduct) {
        Optional <Product> productToUpdateOptional = productRepo.findById(id);

        if (productToUpdateOptional.isPresent()) {
            Product productToUpdate = productToUpdateOptional.get();
            productToUpdate.setProduct_name(updateProduct.getProduct_name());
            productToUpdate.setProduct_price(updateProduct.getProduct_price());
            productRepo.save(updateProduct);
        }
        
    }

    //DELETE PRODUCT
    @Override
    public void deleteProduct(Long id) {
        Optional<Product> productToDeleteOptional = productRepo.findById(id);

        if (productToDeleteOptional.isPresent()) {
            Product productToDelete = productToDeleteOptional.get();
            productRepo.delete(productToDelete);
        }
    }
    
}
