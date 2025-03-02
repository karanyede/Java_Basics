package List;
import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Karan");
        list.add("Piyush");

        System.out.println("1.-----------------------");
        System.out.println(list.get(0));

        System.out.println("2.-----------------------");
        for (Object o : list){
            System.out.println(o);
        }

        System.out.println("3.-----------------------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("4.-----------------------");
        for(String n:list){
            System.out.println(n);
        }

        System.out.println(list.contains("Karan"));

        list.remove("Piyush");
        for(String n:list) {
            System.out.println("list Elements \n" + n);
        }

        list.clear();
        for(String n:list){
            System.out.println("list Elements \n"+n);
        }

        System.out.println(list.isEmpty());
        for(String n:list){
            System.out.println("list"+n);
        }


    }
}
