package Es2;

import java.util.*;


public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intero = 0;

        while (intero <= 0){
            System.out.println("insert a number");
            try {
                intero = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex){
                System.err.println("Please insert a number");
            }
        }

        List<Integer> list = orderedList(intero);
        System.out.println(list);
        System.out.println(reverseList(list));
        printIntero(reverseList(list), false);
    }


  public static List<Integer> orderedList (int num){
      List<Integer> list = new ArrayList<>();
      Random rdn = new Random();

      for (int i = 0; i < num; i++) {
          list.add(rdn.nextInt(101));
      }
      Collections.sort(list);
   return list;
  }

  public static List<Integer> reverseList(List<Integer> list){
        Collections.reverse(list);
        return list;
  }

  public static void printIntero(List<Integer> list, boolean t){
        ListIterator<Integer> in = list.listIterator();
        Integer num;
        int index;
      while (in.hasNext()){
            num = in.next();
            index = in.nextIndex();
            if (index % 2 == 0 && t) System.out.println(index + " - " + num);
            if (index % 2 != 0 && !t) System.out.println(index + " - " + num);
        }
  }

}
