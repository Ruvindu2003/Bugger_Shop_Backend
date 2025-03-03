package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Order;
import org.example.dto.Product;
import org.example.service.OrderService;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
@CrossOrigin
@RequiredArgsConstructor

public class ProductController {
    final ProductService productServices;

    @PostMapping("/product-add")
    public void addProduct(@RequestBody Product product){
        productServices.addProduct(product);
    }


    @PutMapping("/product-update")
    public void updateProduct(@RequestBody Product product){

        productServices.updateProduct(product);
    }

    @DeleteMapping("/product-delete/{id}")
    public void deleteProduct(@PathVariable String id){

        productServices.deleteProduct(id);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {

        return productServices.getAll();
    }
    @GetMapping("Search-by-id{id}")
      public Product searchProduct(@PathVariable String id){
          Product product=productServices.SearchByID(id);
          return product;
        }


    @GetMapping("/product-search-by-category/{category}")
    public List<Product>searchByCategory(@PathVariable String category){
        return productServices.searchByCategory(category);
        }


}
