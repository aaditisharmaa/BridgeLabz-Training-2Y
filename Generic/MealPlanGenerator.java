import java.util.*;

public class MealPlanGenerator {
    interface MealPlan {}
    static class VegetarianMeal implements MealPlan { public String toString(){return "Vegetarian";} }
    static class VeganMeal implements MealPlan { public String toString(){return "Vegan";} }
    static class KetoMeal implements MealPlan { public String toString(){return "Keto";} }

    static class Meal<T extends MealPlan> {
        T plan;
        Meal(T plan){this.plan=plan;}
        T getPlan(){return plan;}
    }

    public static <T extends MealPlan> boolean validateAndGenerate(Meal<T> meal) {
        // simple validation: non-null
        if (meal.getPlan() == null) return false;
        System.out.println("Generated meal plan: " + meal.getPlan());
        return true;
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = new Meal<>(new VegetarianMeal());
        validateAndGenerate(m1);
        Meal<KetoMeal> m2 = new Meal<>(new KetoMeal());
        validateAndGenerate(m2);
    }
}
