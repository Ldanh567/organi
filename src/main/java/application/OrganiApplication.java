package application;

import application.model.entity.Category;
import application.model.entity.Product;
import application.repository.CategoryRepository;
import application.repository.ProductRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class OrganiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganiApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner runner(ProductRepository productRepository, CategoryRepository categoryRepository){
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args)  {
//                if(productRepository.count() == 0){
//                    Faker faker = new Faker();
//                    Random random = new Random();
//                    List<Product> productList = new ArrayList<>();
//                    for (int i = 0; i < 100; i++) {
//                        productList.add(Product.builder().name(faker.funnyName().name()).categoryId(random.nextInt())
//                                                            .createdDate(faker.date().birthday()).createdBy(faker.name().name())
//                                                            .price(random.nextDouble()*10000).quantity(random.nextInt())
//                                                            .discount(random.nextDouble())
//                                                            .shortDescription(faker.funnyName().name())
//                                                            .detailDescription(faker.funnyName().name()).build());
//                    }
//                    productRepository.saveAll(productList);
//
//                }
//
//                if(categoryRepository.count() == 0){
//                    Faker faker = new Faker();
//                    Random random = new Random();
//                    List<Category> categoryList = new ArrayList<>();
//                    for (int i = 0; i < 5; i++) {
//                        categoryList.add(Category.builder().name(faker.funnyName().name()).createdDate(faker.date().birthday()).build());
//                    }
//                    categoryRepository.saveAll(categoryList);
//
//                }
//
//            }
//        };
//    }

}
