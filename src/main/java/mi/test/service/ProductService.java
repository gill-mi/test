package mi.test.service;


import mi.test.domain.Product;
import mi.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createPro(Product product){
            productRepository.save(product);
    }

    public List<Product> findAllPro(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        return productRepository.findById(id).get();
    }

    public void deletePro(Long id){
        productRepository.deleteById(id);
    }
}


