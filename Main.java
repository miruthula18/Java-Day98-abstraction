
import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to hear dog sound:");
        int choice = sc.nextInt();

        if (choice == 1) {
            Animal obj = new Dog();
            obj.sound();
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
