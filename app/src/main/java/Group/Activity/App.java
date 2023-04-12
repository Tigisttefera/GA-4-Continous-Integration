package Group.Activity;
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter arrayList size:- ");
        int size = arrListSize(new Scanner(System.in));
        System.out.println("Enter " + size +" integers:- ");
         ArrayList<Integer> num = new ArrayList<Integer>(size);
        
        for (int i = 0; i < size; i++) {

            num.add(new Scanner(System.in).nextInt());
        }
      System.out.println(even_Checker(num));

    }

    private static int arrListSize(Scanner scanner) {
        int size = scanner.nextInt();
        if(size>=0){
        return size;
    }
        else{
            System.out.println("illegal entry enter again");
            size = arrListSize(new Scanner(System.in));
        return size;
    }
        
    }
    public static ArrayList<Integer> even_Checker(ArrayList<Integer> list_num){
        ArrayList<Integer> even_list = new ArrayList<>();
        for (Integer l:list_num) {
            if(l % 2 == 0 ){
                even_list.add(l);
            }
        }

        return even_list;
    }
}

