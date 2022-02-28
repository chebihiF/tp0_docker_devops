package suptech.miage.tp0.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    private final ProductRepository productRepository;

    public ProductConfiguration(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Bean
    CommandLineRunner initData(){
        return args -> {
          productRepository.save(new Product(null,"product1",1526,1));
          productRepository.save(new Product(null,"product2",2000,9));
          productRepository.save(new Product(null,"product3",1500,100));
          productRepository.save(new Product(null,"product4",15,20));
        };
    }
}
