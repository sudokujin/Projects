import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private List<String> directions;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<String> getDirections() {
        return directions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setDirections(List<String> directions) {
        this.directions = directions;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);

    }

    public void removeIngredient(Ingredient ingredient){
        ingredients.remove(ingredient);

    }

    public void updateIngredient(Ingredient oldIngredient, Ingredient newIngredient){
        int index = ingredients.indexOf(oldIngredient);
        if(index >= 0){
            ingredients.set(index, newIngredient);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recipe Name: ").append(name).append("\n\n");
        sb.append("Ingredients: \n");
        for (Ingredient ingredient : ingredients) {
            sb.append("- ").append(ingredient).append("\n");
        }
        sb.append("\nDirections: \n");
        for (int i = 0; i < directions.size(); i++) {
            sb.append(i + 1).append(". ").append(directions.get(i)).append("\n");
        }
        return sb.toString();
    }
}

