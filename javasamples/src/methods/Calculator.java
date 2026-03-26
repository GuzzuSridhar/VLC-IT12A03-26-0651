package methods;

public class Calculator {

    // Method Overload rules
    /*
    1. Same Method name
    2. Differe parameters (number,type, order)

    Note:
    Return type does not make any difference, may be the same or different
    
    */


    int add(int x, int y){
        return x + y;
    }

    double add(int x, float y){
        return x + y;
    }

    // Changing order is with respect to types and not names
    // double add(int y, float x){
    //     return x + y;
    // }

    //change order of parameters
    double add(float x, int y){
        return x + y;
    }

    // change number of parameters
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return a+b+c;
    }

    // unlimited arguments (var args)
    int add(int...a){
        int res= 0;
        for (int i : a) {
            res += i;
        }
        return res;
    }

    // change type of parameters
    float add(float x, float y){
        return x+y;
    }


    int diff(int x,int y){
        return x-y;
    }

    int prod(int x,int y){
        return x*y;
    }

    int div(int x,int y){
        return x/y;
    }
}
