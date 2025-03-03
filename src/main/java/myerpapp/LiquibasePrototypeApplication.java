package myerpapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = {
    @ComponentScan.Filter(type = FilterType.REGEX, pattern = "myerpapp.inventory.*")
})
@EntityScan(basePackages = {
    "myerpapp.base"
})
public class LiquibasePrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiquibasePrototypeApplication.class, args);
    }

    @Configuration
    @ComponentScan("myerpapp.inventory")
    @EntityScan(basePackages = {
        "myerpapp.inventory"
    })
    @ConditionalOnProperty(name = "myerpapp.inventory.enabled", havingValue = "true")
    static class InventoryManagementExtension {
    }

}
