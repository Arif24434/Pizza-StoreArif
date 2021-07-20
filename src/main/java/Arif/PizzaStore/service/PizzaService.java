package Arif.PizzaStore.service;
import Arif.PizzaStore.config.ApplicationConfiguration;
import Arif.PizzaStore.domain.Pizza;
import Arif.PizzaStore.domain.Size;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
@Service

public class PizzaService {
    private  ApplicationConfiguration configuration;
    private  IngredientService ingredientService;

    public Collection<Pizza> availablePizzas() {
        return configuration.getPizzas().values();
    }

    //TODO: implement the method
    public Pizza customPizza(List<Long> ingredientIds, Size size) {
        return null;
    }

    //TODO: for non existing IDs throw an PizzaNotFoundException
    //TODO: add the test for this case
    public List<Pizza> fromIds(List<Long> ids) {
        return ids.stream()
                .map(id -> configuration.getPizzas().get(id))
                .collect(Collectors.toList());
    }
}
