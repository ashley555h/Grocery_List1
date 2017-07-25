import static java.lang.System.out;
import java.util.Scanner;

public class Grocery_List
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //define variable for grocery item input
        String item1;
        String item2;
        String item3;
        //define variable for quantity of each item
        int item1_quantity;
        int item2_quantity;
        int item3_quantity;
        //define variable for price of each item
        float item1_price;
        float item2_price;
        float item3_price;
        //define variable for cost of each item per quantity
        float item1_total_cost;
        float item2_total_cost;
        float item3_total_cost;
        //price of grocery list
        float total_cost;

        
        out.println("Please list three items on your grocery shopping list.");

        out.print("Item 1? ");
        item1 = keyboard.nextLine();

        out.print("Item 2? ");
        item2 = keyboard.nextLine();

        out.print("Item 3? ");
        item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");

        out.print("How many " + item1 + "? ");
        item1_quantity = keyboard.nextInt();

        out.print("How many " + item2 + "? ");
        item2_quantity = keyboard.nextInt();

        out.print("How many " + item3 + "? ");
        item3_quantity = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");

        out.print("How much does one " + item1 + " cost? ");
        item1_price = keyboard.nextFloat();

        out.print("How much does one " + item2 + " cost? ");
        item2_price = keyboard.nextFloat();

        out.print("How much does one " + item3 + " cost? ");
        item3_price = keyboard.nextFloat();

        item1_total_cost = item1_quantity * item1_price;
        item2_total_cost = item2_quantity * item2_price;
        item3_total_cost = item3_quantity * item3_price;

        total_cost = item1_total_cost + item2_total_cost + item3_total_cost;

        out.println("Calculating your grocery bill.");
        out.println("Your total cost is " + total_cost + ".");

    }
}
