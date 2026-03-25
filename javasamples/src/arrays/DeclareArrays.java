package arrays;

import java.util.Arrays;

public class DeclareArrays {
    public static void main(String[] args) {
        // Arrays are homogenous
        // fixed type
        // fixed size
        // Array cannot be declared without a size
        // indexed (zero based)
        // 3 ways of declaring an array
        // array can be of a primitive type or reference type

        //  method 1 of declaring an array
           // declare an Array without initialization
           int[] nums = new int[5];
           String[] names = new String[3]; 
           float salaries[] = new float[10];

        //    adding values to int array
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

        // printing the int Array
        // System.out.println(nums); // prints the hashcode of array
        System.out.println("--------Print Int Array using API call-----------");
        System.out.println(Arrays.toString(nums));

        // using traditional for loop to traverse the array
        System.out.println("--------Traditional for Loop-----------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("--------Enhanced for Loop-----------");

        // using enhanced for loop to traverse the array
        for (int i : nums) {
            System.out.println(i);
        }
        //-------------------

        //    adding values to String array
        names[0] = "John";
        names[1] = "Alex";
        names[2] = "Sara";
        // printing the String Array
        // System.out.println(names); // prints the hashcode of array
        System.out.println("--------Print String Array using API call-----------");
        System.out.println(Arrays.toString(names));
        // using traditional for loop to traverse the array
        System.out.println("--------Traditional for Loop-----------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("--------Enhanced for Loop-----------");
        // using enhanced for loop to traverse the array
        for (String i : names) {
            System.out.println(i);
        }
        //-------------------
        //    adding values to float array
        salaries[0] = 5566.66f;
        salaries[1] = 3455.22f;
        salaries[2] = 234.44f;

        // printing the float Array
        // System.out.println(salaries); // prints the hashcode of array
        System.out.println("--------Print float Array using API call-----------");
        System.out.println(Arrays.toString(salaries));
        // using traditional for loop to traverse the array
        System.out.println("--------Traditional for Loop-----------");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }
        System.out.println("--------Enhanced for Loop-----------");
        // using enhanced for loop to traverse the array
        for (float i : salaries) {
            System.out.println(i);
        }
        //-------------------

        //  method 2 of declaring an array
        // declare an array and initialize
        int[] age = {10,20,30};
        String employees[] = {"Bill","Alex","John"};

        //  method 3 of declaring an array
        // declare an array and initialize
        String[] fruits = new String[] {"Apple","Banana","Orange"};
        // looping thru the array
        for (String string : fruits) {
            System.out.println(string);
        }
    }
}
