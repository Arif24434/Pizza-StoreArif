package Arif.PizzaStore.service;

import Arif.PizzaStore.config.ApplicationConfiguration;
import Arif.PizzaStore.domain.Ingredient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IngredientService {

    private final ApplicationConfiguration configuration;

    public Collection<Ingredient> availableIngredients() {
        return configuration.getAdditionalIngredients().values();
    }

    //TODO: for non existing IDs throw an IngredientNotFoundException
    //TODO: add the test for this case
    public List<Ingredient> fromIds(List<Long> ids) {
        return ids.stream()
                .map(id -> configuration.getAdditionalIngredients().get(id))
                .collect(Collectors.toList());
    }

    public Ingredient typesIngredient() {
        return null;
    }
}
