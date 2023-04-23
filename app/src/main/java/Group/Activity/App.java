package Group.Activity;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        
        int size ;
        try {
            size = getUserInput();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }
        System.out.println("Enter " + size +" integers:- ");
         ArrayList<Integer> num = new ArrayList<Integer>(size);
        
        for (int i = 0; i < size; i++) {

            num.add(new Scanner(System.in).nextInt());
        }
      System.out.println(even_Checker(num));

    }
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter arrayList size: ");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        } while (size <= 0);
        return size;
    }
        
    public static List<Integer> even_Checker(List<Integer> list_num) {
        return list_num.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }
}

