import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brookley's Better Bakery!");
        System.out.println("We contain peanut, gluten, soy and dairy in our products.");
        System.out.println();

        System.out.println("To search for the foods you can eat, please select the diet restriction: 'Gluten', 'Dairy', 'Egg', 'Treenut', 'Soy', or 'Sesame'");
        System.out.println("To sees a list of all our foods, please type 'all'");
        String reply = sc.nextLine();

        BakedGood bg = new BakedGood();
                }
    }
}