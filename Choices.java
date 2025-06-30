import java.util.Scanner;

public class Choices {
    Scanner sc = new Scanner(System.in);
    int price;

    public void getPrice() {

        if (price < 25) {
            System.out.println("I'll buy!");

        }else {
                System.out.println("Too expensive");
            }
        }
    }



