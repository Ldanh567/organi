package application.service.impl;

//import application.model.responsedto.ProductResponseDto;
import application.controller.exception.ProductNotFoundException;
import application.model.entity.Category;
import application.model.entity.Product;
import application.controller.exception.CategoryNotFoundException;
import application.repository.CategoryRepository;
import application.repository.ProductRepository;
import application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Product> findAll() {

         return productRepository.findAll();

    }

    @Override
    public Product findById(int id) {
        Product productId = productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("There is no suitable product"));
        return productId;
    }

    @Override
    public List<Product> findByCategoryId(int categoryId) {
        List<Category> category = categoryRepository.findByCategoryId(categoryId);

        if(category.size() ==0){
            throw new CategoryNotFoundException("There is no suitable category");
        }
        List<Product> findByCategoryId = productRepository.findByCategoryId(categoryId);
        return findByCategoryId;


    }

    @Override
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }


}
