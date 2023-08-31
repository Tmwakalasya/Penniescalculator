import java.util.Scanner;

public class PenniesConversion {
    public static int dollars,pennies,quarters,dimes,nickels;


    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many pennies do you have in your piggybank ? ");
        pennies = keyboard.nextInt();
        getDollars();
        getQuarters();
        getDimes();
        getNickels();
    }
    public static void getDollars(){
        dollars = pennies/100;
        pennies = pennies % 100;
        System.out.println("You have " + "$"+dollars + " in your piggybank");
        System.out.println("The remaining pennies are " + pennies);
    }
    public static  void getQuarters(){
        quarters = pennies / 25;
        pennies = pennies % 25;
        System.out.println("You have " + quarters + " quarters " + " in your piggybank");
    }
    public static void getDimes(){
        dimes = pennies / 10;
        pennies = pennies % 10;
        System.out.println("You have " + dimes + " dimes " + " in your piggybank");

    }
    public static  void getNickels(){
        nickels = pennies / 5;
        pennies = pennies % 5;
        System.out.println("You have " + nickels + " nickels " + " in your piggybank");
    }
}
