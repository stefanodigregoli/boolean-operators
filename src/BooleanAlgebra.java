public class BooleanAlgebra {
    public static void main(String[] args) {
        // [A]: 2 <= 2 && !true
        boolean resultA = 2 <= 2 && !true;
        System.out.println("Result of [A]: " + resultA);

        // [B]: !false && 3 > 2
        boolean resultB = !false && 3 > 2;
        System.out.println("Result of [B]: " + resultB);

        // [C]: considering that t=false and f=true: !(!t || f)
        boolean t = false;
        boolean f = true;
        boolean resultC = !(!t || f);
        System.out.println("Result of [C]: " + resultC);

        // [D]: 6 > 6 ^ !(true && true)
        boolean resultD = 6 > 6 ^ !(true && true);
        System.out.println("Result of [D]: " + resultD);
    }
}
