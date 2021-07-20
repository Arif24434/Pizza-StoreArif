package Arif.PizzaStore.config;

import Arif.PizzaStore.domain.Ingredient;
import Arif.PizzaStore.domain.Pizza;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class ApplicationConfiguration {
    private Map<Long, Pizza> pizzas;
    private Map<Long, Ingredient> additionalIngredients;
    private String pizzaStoreName;
}
