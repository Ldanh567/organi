package application.controller;

//import application.model.responsedto.ProductResponseDto;

import application.controller.exception.ProductNotFoundException;
import application.model.entity.Category;
import application.model.entity.Product;
import application.repository.CategoryRepository;
import application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping(value = "/products")
    public List<Product> findAllProducts() {
        return productService.findAll();
    }

    @GetMapping(value = "products/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") int id) {
        Product productId = productService.findById(id);
        if(productId == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(productId,HttpStatus.OK);
        }
    }

    @GetMapping(value = "/category/{categoryId}")
    public ResponseEntity<List<Product>> findByCategoryId(@PathVariable("categoryId") int categoryId){
        List<Product> categoryProd = productService.findByCategoryId(categoryId);
        if (categoryProd.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryProd, HttpStatus.OK);
    }

    @GetMapping(value = "/category")
    public List<Category> findAllCategory(){
         return categoryRepository.findAll();
    }
}








