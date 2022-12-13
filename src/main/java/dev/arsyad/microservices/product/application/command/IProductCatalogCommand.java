package dev.arsyad.microservices.product.application.command;

import dev.arsyad.microservices.product.application.domain.model.Product;
public interface IProductCatalogCommand {
    Long addProduct(Product product);

    void deleteProduct(Long productId);

    void publish(Long productId);

    Long  updateProduct(Product product);
}

