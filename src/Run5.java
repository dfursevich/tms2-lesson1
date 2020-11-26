/**
 * @author Dzmitry Fursevich
 */
public class Run5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b)); //false
        System.out.println("a || b = " + (a || b)); //true
        System.out.println("!a = " + !a); //false

        boolean result = a && b;
        System.out.println(result);

        int c = 10;
        int d = 20;
        boolean result2 = (c > 5) && (d < 100);
        System.out.println(result2);

        boolean f = true;
        System.out.println(!f);
    }
}
