package dev.arsyad.microservices.product.application.factory;

import dev.arsyad.microservices.product.application.command.IProductCatalogCommand;
import dev.arsyad.microservices.product.application.query.IProductCatalogQuery;
public interface IProductCatalogFactory {


    /**
     * returns product catalog command
     *
     * @return ProductCatalogCommand
     */
    IProductCatalogCommand getProductCatalogCommand();

    /**
     * returns product catalog query
     *
     * @return query
     */
    IProductCatalogQuery getProductQuery();

}
