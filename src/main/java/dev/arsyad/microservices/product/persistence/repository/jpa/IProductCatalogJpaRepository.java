package dev.arsyad.microservices.product.persistence.repository.jpa;

import dev.arsyad.microservices.product.persistence.repository.model.ProductPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface ProductCatalogJpaRepository extends JpaRepository<ProductPersistable, Long>{

    @Query("SELECT u FROM ProductPersistable u WHERE u.productStatus = ?1")
    List<ProductPersistable> findAll(String status);

}
