import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int mid =((min + max) / 2);
        String strInput = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Загадайте число от 0 до 100:\n" +  "Введите свое число:");
        strInput = scan.nextLine();

        while (!strInput.equals("=")) {
            System.out.println("Это число больше, меньше или равно " + mid + "? " +
                    "Введите  + если больше, - если меньше и = если равно ");
            strInput = scan.nextLine();
            if (strInput.equals("=")) {
                System.out.println("Ваше число " + mid);
                break;
            } else if (strInput.equals("+")) {
                min = mid;

                mid = ((min + max) / 2);

                if (min == mid && mid !=100) {
                    mid += 1;
                }
            } else if (strInput.equals("-")) {
                max = mid;
                mid = ((min + max) / 2);
            }
        }
    }
}