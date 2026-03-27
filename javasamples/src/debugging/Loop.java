package debugging;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if(i == 5)
                continue;
            System.out.println(i);
        }
    }
}

// click on the desired line to create a breakpoint
// start debug
// open the (Run and Debug) from the primary side bar
