package kr.ac.mjc.Camera.repository;

import kr.ac.mjc.Camera.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
