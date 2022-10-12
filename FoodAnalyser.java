
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author thika
 */
public class FoodAnalyser {
    static String foodName;
    static int numbServing;
    static double fatGrams, calories;
    static Scanner input = new Scanner(System.in);
    static final int CAL_GRAM = 9;
    
    public static void main(String[] args) {
        askFood();
        printCal();
    }
    static void askFood(){
        System.out.println("Enter name of food item, fatgrams and number of servings:");
        foodName = input.next();
        fatGrams = input.nextDouble();
        numbServing = input.nextInt();
    }
     static double calculateCal() {
        calories = (fatGrams*CAL_GRAM)/numbServing;
        return calories;
    }
    static void printCal() {
        System.out.println("Calories in " + foodName + " per saving: " + String.format("%.2f",calculateCal()));
    }
}


