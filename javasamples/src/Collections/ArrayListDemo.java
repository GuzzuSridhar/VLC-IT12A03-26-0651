package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Hello");
            list.add("World");
            list.add("Java");
            System.out.println(list);

            //access Element using Index
            System.out.println(list.get(0)); // Output: Hello

            //update Element
            list.set(1, "Everyone");
            System.out.println(list);

            //remove Element
            list.remove(2); 
            System.out.println(list);

            //check size of ArrayList
            System.out.println("Size of ArrayList: " + list.size());

            //iterate through ArrayList
            for (String str : list) {
                System.out.println(str);
            }
    }
}
