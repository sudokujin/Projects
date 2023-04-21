import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    public static final Ingredient EGGS = null;
    public static final Ingredient MILK = null;
    public static final Ingredient FLOUR = null;
    public static final Ingredient SUGAR = null;
    public static final Ingredient SALT = null;
    private String name;
    private double amount;
    private String unit;
    private List<String> measurements;


    public Ingredient(String name) {
        this.name = name;
        this.measurements = new ArrayList<>();
    }

    public static void printIngredients() {
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public List<String> getMeasurements(){
        return measurements;
    }

    public void setMeasurements(List<String> measurements){
        this.measurements = measurements;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

//    public void addIngredient(Ingredient ingredient){
//        Ingredient flour = new Ingredient("Flour");
//        List<Recipe> myRecipe = new ArrayList<>();
//        myRecipe.add();
//

    @Override
    public String toString() {
        return amount + " " + unit + " " + name;
    }
}
