package dev.arsyad.microservices.product.application.query.implementation;

import dev.arsyad.microservices.product.application.domain.model.Product;
import dev.arsyad.microservices.product.application.domain.model.ProductCatalog;
import dev.arsyad.microservices.product.application.domain.repository.IProductCatalogRepository;
import dev.arsyad.microservices.product.application.query.IProductCatalogQuery;
import dev.arsyad.microservices.product.application.query.model.QueryParameter;

import java.util.List;
public class ProductCatalogQueryImpl implements IProductCatalogQuery {

    private final IProductCatalogRepository productCatalogRepository;

    public ProductCatalogQueryImpl(IProductCatalogRepository productCatalogRepository) {
        this.productCatalogRepository = productCatalogRepository;
    }

    @Override
    public Product getProduct(Long productId) {
        var productCatalog = new ProductCatalog(productCatalogRepository);
        return productCatalog.get(productId);
    }

    @Override
    public List<Product> getProducts(QueryParameter queryParameter) {
        var productCatalog = new ProductCatalog(productCatalogRepository);
        return productCatalog.getAll(queryParameter);
    }

}
