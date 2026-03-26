package inheritence;

public class SmartBulb extends Device  {
    int brightness = 20;

    void SetBright(int i){
        this.brightness = i;
        System.out.println("Brightness set to "+ i);
    }

}
