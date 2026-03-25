package basics;

public class Casting {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 2 types of casting
        // widening cast-> small -> large (safe)
        // /narrow cast -> Large -> small (risky)

        // wide cast
        // 
        short smallType = 10;
        int bigType = smallType;

        // Narrow cast
        double largeType = 123888888888888999.456;
        int small = (int)largeType; 
        System.out.println(small);

    }
}
