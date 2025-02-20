package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Productentity;
import org.modelmapper.ModelMapper;
import org.example.dto.Product;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService{
    final  ProductRepository productRepository;
    final ModelMapper modelMapper;

    @Override
    public void addProduct(Product product) {
    productRepository.save(modelMapper.map(product, Productentity.class));

    }


    @Override
    public void updateProduct(Product product) {

    productRepository.save(modelMapper.map(product, Productentity.class));

    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);

    }

    @Override
    public List<Product> getAll() {
        List<Product>productList=new ArrayList<>();
        List<Productentity> all=productRepository.findAll();
        all.forEach(Productentity->{
            productList.add(modelMapper.map(Productentity,Product.class));
        });
        return List.of();
    }


}
