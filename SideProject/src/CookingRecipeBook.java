import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CookingRecipeBook {

    private static List<Recipe> recipeBook = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printRecipeBook();
                    break;
                case 2:
                    addRecipe();
                    break;
                case 3:
                    modifyRecipe();
                    break;
//                case 4:
//                    removeRecipe();
//                    break;
//                case 5:
//                    searchRecipe();
//                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the recipe book.");
        System.out.println("\t 2 - To add a recipe to the recipe book.");
        System.out.println("\t 3 - To modify a recipe in the recipe book.");
        System.out.println("\t 4 - To remove a recipe from the recipe book.");
        System.out.println("\t 5 - To search for a recipe in the recipe book.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void printRecipeBook() {
        if (recipeBook.size() > 0) {
            System.out.println("Your recipe book:");
            for (int i = 0; i < recipeBook.size(); i++) {
                Recipe recipe = recipeBook.get(i);
                System.out.println((i + 1) + ". " + recipe.getName());
            }
        } else {
            System.out.println("Your recipe book is empty.");
        }
    }

    private static void addRecipe() {
        System.out.print("Enter the name of the recipe: ");
        String name = scanner.nextLine();

        Recipe recipe = new Recipe(name);

        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("\nSelect an ingredient to add to the recipe:");
            Ingredient.printIngredients();
            System.out.print("Enter your choice (0 to finish): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    recipe.addIngredient(Ingredient.EGGS);
                    break;
                case 2:
                    recipe.addIngredient(Ingredient.MILK);
                    break;
                case 3:
                    recipe.addIngredient(Ingredient.FLOUR);
                    break;
                case 4:
                    recipe.addIngredient(Ingredient.SUGAR);
                    break;
                case 5:
                    recipe.addIngredient(Ingredient.SALT);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        recipeBook.add(recipe);
        System.out.println("Recipe added: " + recipe.getName());
    }

    private static void modifyRecipe() {
        System.out.print("Enter the index of the recipe to modify: ");
        int index;

    }
}

