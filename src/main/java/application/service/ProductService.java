package application.service;

import application.model.entity.Category;
import application.model.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    List<Product> findByCategoryId(int categoryId);
    List<Category> findAllCategory();
}
