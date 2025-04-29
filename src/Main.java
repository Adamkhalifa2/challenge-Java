import java.util.*;

class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    void showHello() {
        String choice;
        System.out.println("For every hello: ");
        choice = sc.nextLine();
        while ("h".equals(choice)) {
            System.out.println("Hello World");
            choice = sc.nextLine();
        }
    }

    public static void main(String[] args) {
        HelloTillStop program = new HelloTillStop();
        program.showHello();
        System.out.println("Program ended");
    }
}