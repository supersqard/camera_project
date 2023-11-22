package kr.ac.mjc.Camera.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "price", nullable = false)
    private int price;

    public Product(String name, String type, String brand, int price) {
        this.name =name;
        this.type =type;
        this.brand =brand;
        this.price =price;
    }
    public void update(String name,String type,String brand, int price){
        this.name =name;
        this.type =type;
        this.brand =brand;
        this.price =price;
    }


}
