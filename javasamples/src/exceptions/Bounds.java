package exceptions;

public class Bounds {

    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        try{
        System.out.println(nums[4]);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        }
        catch(ArrayIndexOutOfBoundsException i){
            System.out.println(i.getMessage());
        }

        System.out.println("This line is after the expected exception");
    }

}
