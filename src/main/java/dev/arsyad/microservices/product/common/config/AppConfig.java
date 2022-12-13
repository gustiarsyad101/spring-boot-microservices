package dev.arsyad.microservices.product.common.config;

import dev.arsyad.microservices.product.application.command.IProductCatalogCommand;
import dev.arsyad.microservices.product.application.command.implementation.ProductCatalogCommandImpl;
import dev.arsyad.microservices.product.application.domain.repository.IProductCatalogRepository;
import dev.arsyad.microservices.product.application.factory.IProductCatalogFactory;
import dev.arsyad.microservices.product.application.factory.implementation.ProductCatalogFactoryImpl;
import dev.arsyad.microservices.product.application.query.IProductCatalogQuery;
import dev.arsyad.microservices.product.application.query.implementation.ProductCatalogQueryImpl;
import dev.arsyad.microservices.product.persistence.repository.ProductCatalogRepositoryImpl;
import dev.arsyad.microservices.product.persistence.repository.jpa.IProductCatalogJpaRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Setter
public class AppConfig {

    @Autowired private IProductCatalogJpaRepository productCatalogJpaRepository;

    @Bean
    public IProductCatalogFactory productCatalogFactory() {
        return new ProductCatalogFactoryImpl(productCatalogCommand(), productCatalogQuery());
    }

    private IProductCatalogQuery productCatalogQuery() {
        return new ProductCatalogQueryImpl(productCatalogRepository());
    }

    @Bean
    public IProductCatalogCommand productCatalogCommand() {
        return new ProductCatalogCommandImpl(productCatalogRepository());
    }

    private IProductCatalogRepository productCatalogRepository() {
        return new ProductCatalogRepositoryImpl(productCatalogJpaRepository);
    }

}
