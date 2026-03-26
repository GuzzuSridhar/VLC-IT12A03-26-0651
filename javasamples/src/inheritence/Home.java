package inheritence;

public class Home {
    public static void main(String[] args) {
        
        // upward cast
        Device myDevice = new SmartBulb();
        myDevice.name = "Bed Room Light";
        myDevice.powerOn();

        //  myDevice.SetBright(10);  // not allowed

        // safe downcasting
        if(myDevice instanceof SmartBulb b){
            b.SetBright(50);
        }

    }
}
