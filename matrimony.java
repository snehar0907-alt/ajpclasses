package Day3;

import java.util.Scanner;

public class matrimony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        String gender;

        System.out.print("Enter your gender (Male/Female): ");
        gender = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (gender.equalsIgnoreCase("Male") && age > 21) {
            System.out.println("Eligible for Marriage");
        } else if (gender.equalsIgnoreCase("Female") && age > 24) {
            System.out.println("Eligible for Marriage");
        } else {
            System.out.println("Not Eligible for Marriage");
        }

        sc.close();
    }
}
