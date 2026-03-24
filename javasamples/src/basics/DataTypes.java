package basics;

public class DataTypes {

    // 3 types of comments in Java

    // single line comments (Vs Code Shortcut "CTRL /")
    /*  multi line comment
      this is commented too */

      /** doc comments  
         @author : John
      */

         @SuppressWarnings("unused")
        public static void main(String[] args) {
            /* primitive types
                1. byte
                2. short
                3. int
                4. long
                5. float
                6. double
                7. char
                8. boolean
            */

                // byte
                // 8 bit signed integer
                byte age = 23;

                //short
                // 16 bit signed integer
                short s = 567;

                //int
                // 32 bit signed integer
                int count = 1989;

                //long
                // 64 bit signed integer
                long l = 18997;

                // float
                // 32 bit signed floating point values (~ 7-8 decimal places)
                float f = 10.7f;

                // double
                // 64 bit signed floating point values (~ 15-16 decimal places)
                double salary = 6567.88;

                // char
                // 16 bit unicode characters
                char c = 'a';
                char u = '\u0061'; // unicode character
                System.out.println(u);

                // boolean
                // 1 bit (true or false)
                boolean isValid = true;
                boolean isGood = false;


         }


}
