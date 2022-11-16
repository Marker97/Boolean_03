public class Main {
    public static void main(String[] args) {
        /*
        [A]: !(!(!(false ^ false) || (true && true)))
        [B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1))
         */

        boolean A = !(!(!(false ^ false) || (true && true))); // !(!(true || true)) = !(!true) = !false = true



        int x = 3 ;
        int y = 2;
        boolean B = !((x * y) <= 6) && (x - y != 1); // = !(6 <= 6) && (1 != 1) = !true && false = false



        System.out.println("[A] = " + A + "\n[B] = " + B );

    }
}
