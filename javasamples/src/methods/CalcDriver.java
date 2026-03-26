package methods;

public class CalcDriver {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        p.P.p(""+calc.add(10, 10));
        p.P.p(""+calc.add(10, 10, 20));
        p.P.p(""+calc.add(10, 10, 20,40));
        p.P.p(""+calc.add(10, 10, 20,40,7,4,6,8,7,20,5,6,7));
        p.P.p(""+calc.add(10.0f, 11.8f));

        p.P.p(""+calc.diff(10, 10));
        p.P.p(""+calc.prod(10, 10));
        p.P.p(""+calc.div(10, 10));
    }
}
