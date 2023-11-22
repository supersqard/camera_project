package kr.ac.mjc.Camera.controller;

import kr.ac.mjc.Camera.domain.Product;
import kr.ac.mjc.Camera.dto.AddProductRequest;
import kr.ac.mjc.Camera.dto.UpdateProductRequest;
import kr.ac.mjc.Camera.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/api/cameras")
    public ResponseEntity<Product> saveProduct(@RequestBody AddProductRequest request){
        Product saveRequest=productService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveRequest);
    }
    @GetMapping("/api/cameras")
    public ResponseEntity<List<Product>> allProduct(){
        List<Product> products=productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
    @GetMapping("/api/cameras/{id}")
    public ResponseEntity<Product> findProduct(@PathVariable long id) {
        Product product = productService.findOne(id);
        return ResponseEntity.ok().body(product);
    }
    @DeleteMapping("/api/cameras/{id}")
    public ResponseEntity<Void> deleteCamera(@PathVariable long id){
        productService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/api/cameras/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable long id,
            @RequestBody UpdateProductRequest request){
        Product product =  productService.update(id, request);
        return ResponseEntity.ok().body(product);
    }
    @PostMapping("/api/cameras/site")
    public ResponseEntity<Product> goProduct(@RequestBody AddProductRequest request){
        Product saveRequest=productService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveRequest);
    }
    @GetMapping("/api/cameras/site")
    public ResponseEntity<List<Product>> lookProduct(){
        List<Product> products=productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
    @GetMapping("/api/cameras/site/{id}")
    public ResponseEntity<Product> detailProduct(@PathVariable long id) {
        Product product = productService.findOne(id);
        return ResponseEntity.ok().body(product);
    }

}
