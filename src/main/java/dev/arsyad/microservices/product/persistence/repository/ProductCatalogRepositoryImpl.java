package dev.arsyad.microservices.product.persistence.repository;

import dev.arsyad.microservices.product.application.domain.model.Product;
import dev.arsyad.microservices.product.application.domain.repository.IProductCatalogRepository;
import dev.arsyad.microservices.product.application.query.model.QueryParameter;
import dev.arsyad.microservices.product.common.errorHandling.ResourceNotFoundException;
import dev.arsyad.microservices.product.persistence.mapper.ProductPersistableMapper;
import dev.arsyad.microservices.product.persistence.repository.jpa.IProductCatalogJpaRepository;
import dev.arsyad.microservices.product.persistence.repository.model.ProductPersistable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductCatalogRepositoryImpl implements IProductCatalogRepository {
    private final IProductCatalogJpaRepository productCatalogJpaRepository;

    public ProductCatalogRepositoryImpl(IProductCatalogJpaRepository productCatalogJpaRepository) {
        this.productCatalogJpaRepository = productCatalogJpaRepository;
    }

    @Override
    public Long save(Product product) {
        var entity = ProductPersistableMapper.MAPPER.map(product);
        entity = productCatalogJpaRepository.save(entity);
        return entity.getId();
    }

    @Override
    public Product get(Long productId) {
        Optional<ProductPersistable> productPersistable =
                productCatalogJpaRepository.findById(productId);
        return productPersistable
                .map(ProductPersistableMapper.MAPPER::map)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public List<Product> getAll(QueryParameter queryParameter) {
        var productPersistables = productCatalogJpaRepository.findAll(queryParameter.getStatus());
        return productPersistables.stream()
                .map(ProductPersistableMapper.MAPPER::map)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long productId) {
        productCatalogJpaRepository.deleteById(productId);
    }
}
