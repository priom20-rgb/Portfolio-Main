import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int i = 100;
        while (i >= 1) {

            System.out.println("i = " + i);
            sum += i;
            i--;
        }

        System.out.println("The Sum is: " + sum);

    }
