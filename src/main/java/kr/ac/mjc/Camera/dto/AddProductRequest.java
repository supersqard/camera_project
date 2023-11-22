package kr.ac.mjc.Camera.dto;

import kr.ac.mjc.Camera.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddProductRequest {
    private String name;

    private String type;

    private String brand;

    private int price;

    public Product toEntity(){
        Product product = new Product(this.name,this.type,this.brand,this.price);
        return product;
    }
}
