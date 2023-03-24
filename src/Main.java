import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I have random chosen a number between 1 and 100");
        System.out.println("Try to guess it");
        //System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess left. Choose again: ");
            int guess = scanner.nextInt();
            System.out.println("You guess was: " + guess);
            if (guess < randomNumber) {
                System.out.println("You guess to small number");
            } else if (guess > randomNumber) {
                System.out.println("You guess to big number");
            } else {
                hasWon = true;
                break;
            }

        }
        if (hasWon) {
            System.out.println("CORRECT You win !");
        } else System.out.println("GAME OVER You lose number was " + randomNumber);
    }
}