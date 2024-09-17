
import java.util.ArrayList;
import java.util.Scanner;

public class RecursionProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intArrayList = new ArrayList<>();
        boolean invalidInput = true;
        int userInput = 0;

        //prompting user for 5 numbers
        System.out.println("Enter 5 whole numbers");

        for (int i = 1; i <= 5; i++) {
            while (invalidInput) {
                try {
                    System.out.println("Enter number " + i);
                    userInput = sc.nextInt();
                    invalidInput = false;
                } catch (Exception e) {
                    System.out.println("You entered " + sc.next());
                    System.out.println("You did not enter a valid number, please enter a whole number!");
                }
            }
            intArrayList.add(userInput);
            invalidInput = true;
        }

        //validating scanner
        // for (Integer i : intArrayList) {
        //     System.out.println(i);
        // }
        int product = productOfWholeNumbers(intArrayList, 0);
        System.out.println("The product of the numbers is : " + product);
    }

    public static int productOfWholeNumbers(ArrayList<Integer> nums, int index) {

        //stop after last element
        if (index == nums.size() - 1) {
            return nums.get(index);
        }

        return nums.get(index) * productOfWholeNumbers(nums, index + 1);
    }
}
