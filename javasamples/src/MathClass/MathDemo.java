package MathClass;

public class MathDemo {
    public static void main(String[] args) {
        double d = 0.4;
        // Math class Methods
        Math.floor(d);
        Math.ceil(d);
        Math.round(d);

        int x = 10, y= 20, z =30;
        System.out.println(Math.abs(x-y));
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));

        int res = Math.max(Math.max(x,y),z);
        System.out.println(res);

        System.out.println(Math.pow(10,10));



    }

}
