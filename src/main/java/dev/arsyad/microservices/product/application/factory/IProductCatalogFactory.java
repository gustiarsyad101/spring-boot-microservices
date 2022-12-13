package dev.arsyad.microservices.product.application.factory;

import dev.arsyad.microservices.product.application.command.ProductCatalogCommand;
import dev.arsyad.microservices.product.application.query.ProductCatalogQuery;
public interface ProductCatalogFactory {


    /**
     * returns product catalog command
     *
     * @return ProductCatalogCommand
     */
    ProductCatalogCommand getProductCatalogCommand();

    /**
     * returns product catalog query
     *
     * @return query
     */
    ProductCatalogQuery getProductQuery();

}
