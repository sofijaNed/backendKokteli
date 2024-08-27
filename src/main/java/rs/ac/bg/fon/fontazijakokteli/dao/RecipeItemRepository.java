package rs.ac.bg.fon.fontazijakokteli.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.bg.fon.fontazijakokteli.entity.RecipeItem;
import rs.ac.bg.fon.fontazijakokteli.entity.primaryKey.RecipeItemPK;

import java.util.List;

@Repository
public interface RecipeItemRepository extends JpaRepository<RecipeItem, RecipeItemPK> {

    List<RecipeItem> findByCocktailCocktailName(String cocktailName);
    List<RecipeItem> findByIngredientIngredientID (Integer ingredientID);
}