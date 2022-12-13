package dev.arsyad.microservices.product.application.query;

import dev.arsyad.microservices.product.application.domain.model.Product;
import dev.arsyad.microservices.product.application.query.model.QueryParameter;

import java.util.List;


public interface IProductCatalogQuery {
    Product getProduct(Long productId);
    List<Product> getProducts(QueryParameter queryParameter);

}
