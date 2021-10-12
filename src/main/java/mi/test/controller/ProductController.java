package mi.test.controller;


import mi.test.domain.Product;
import mi.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    //등록
    @PostMapping("/post")
    public void createProduct(@RequestBody Product product){
        productService.createPro(product);
    }

    //리스트갖고오기
    @GetMapping("/post")
    public List<Product> findAllProducts(){
        List<Product> products = productService.findAllPro();
        return productService.findAllPro();
    }

    //검색
    @GetMapping("/post/{id}")
    public Optional<Product> findOne(){
        return productService
    }

    //수정
    @PutMapping
    public Product update(){
        Optional<Product> product = productService.findById();

    }

    //삭제
    @DeleteMapping
    public void delete(@RequestParam Long id){

        productService
    }
}
