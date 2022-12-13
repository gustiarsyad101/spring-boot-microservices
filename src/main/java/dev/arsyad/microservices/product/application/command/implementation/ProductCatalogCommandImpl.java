package dev.arsyad.microservices.product.application.command.implementation;

import dev.arsyad.microservices.product.application.command.IProductCatalogCommand;
import dev.arsyad.microservices.product.application.domain.model.Product;
import dev.arsyad.microservices.product.application.domain.model.ProductCatalog;
import dev.arsyad.microservices.product.application.domain.repository.IProductCatalogRepository;
public class ProductCatalogCommandImpl implements IProductCatalogCommand {

    private final IProductCatalogRepository productCatalogRepository;

    public ProductCatalogCommandImpl(IProductCatalogRepository productCatalogRepository) {
        this.productCatalogRepository = productCatalogRepository;
    }

    @Override
    public Long addProduct(Product product) {
        var productCatalog = new ProductCatalog(productCatalogRepository);
        return productCatalog.addProduct(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        var productCatalog = new ProductCatalog(productCatalogRepository);
        productCatalog.deleteProduct(productId);
    }

    @Override
    public void publish(Long productId) {
        var productCatalog = new ProductCatalog(productCatalogRepository);
        productCatalog.publish(productId);

    }

    @Override
    public Long updateProduct(Product product) {
        var productCatalog = new ProductCatalog(productCatalogRepository);
        return productCatalog.updateProduct(product);
    }

}
