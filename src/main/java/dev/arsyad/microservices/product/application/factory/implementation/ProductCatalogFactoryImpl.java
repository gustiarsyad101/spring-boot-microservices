package dev.arsyad.microservices.product.application.factory.implementation;

import dev.arsyad.microservices.product.application.command.IProductCatalogCommand;
import dev.arsyad.microservices.product.application.factory.IProductCatalogFactory;
import dev.arsyad.microservices.product.application.query.IProductCatalogQuery;
public class ProductCatalogFactoryImpl implements IProductCatalogFactory {

    private final IProductCatalogCommand productCatalogCommand;
    private final IProductCatalogQuery productCatalogQuery;

    public ProductCatalogFactoryImpl(
            IProductCatalogCommand productCatalogCommand, IProductCatalogQuery productCatalogQuery) {
        this.productCatalogCommand = productCatalogCommand;
        this.productCatalogQuery = productCatalogQuery;
    }

    @Override
    public IProductCatalogCommand getProductCatalogCommand() {
        return productCatalogCommand;
    }

    @Override
    public IProductCatalogQuery getProductQuery() {
        return productCatalogQuery;
    }

}
