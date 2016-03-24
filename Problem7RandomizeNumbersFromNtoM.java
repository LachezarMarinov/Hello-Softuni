import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Problem7RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int n = input.nextInt();
        int m = input.nextInt();
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
            listOfNumbers.add(i);
        }
        int counter = 0;
        while (listOfNumbers.isEmpty() == false){
            int randomNum = rnd.nextInt(Math.abs(n - m) + 1 - counter);
            System.out.print(listOfNumbers.get(randomNum) + " ");
            listOfNumbers.remove(randomNum);
            counter++;
        }

    }
}
