import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a1 =  new ArrayList();

        a1.add(10);
        a1.add("Karan");
        a1.add(null);
        a1.add(true);
        a1.add(1,2);
        System.out.println("ArrayList of Objects");
        System.out.println(a1);
        for (Object o: a1){
            System.out.println("Objects Are: "+o);
        }


        //Restrict using Wrapper Class
        System.out.println("\nNew Arraylist Using Integer Wrapper Class");
        ArrayList<Integer> a2 =  new ArrayList();

        //Add Value of type Int
        a2.add(10);
        a2.add(30);

        //Size of Arraylist
        System.out.println("\nSize of ArrayList: "+a2.size());
        System.out.println("Printing Arraylist Elements");

        //Aproach 1 : Print
        System.out.println("\n1. Using println ");
        System.out.println(a2);

        //Aproach 2 : Print
        System.out.println("\n2. Using for each loop ");
        for (int i: a2){
            System.out.println("Integer values Are: "+i);
        }

        //Aproach 3 : Print
        System.out.println("\n3. Using for loop ");
        for (int index=0;index<a2.size();index++){
            System.out.println("Integer Values: "+a2.get(index));
        }

        //Aproach 4 : Print
        System.out.println("\n4. Using Iterator Interface ");
        Iterator<Integer> iterator = a2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Aproach 5
        System.out.println("\n5. Using List Iterator Interface ");
        ListIterator <Integer> integerListIterator = a2.listIterator();

        //Aproach 5.1 : Print Forward
        System.out.println("5.1 Forward ");
        while(integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }

        //Aproach 5.2 : Print Backward
        System.out.println("5.2 Backward ");
        while(integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previous());
        }

        //Aproach 6 : Print
        System.out.println("\n6. Using forEach Method");
        a2.forEach(obj -> System.out.println(obj));
    }
}