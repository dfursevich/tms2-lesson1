/**
 * @author Dzmitry Fursevich
 */
public class Run2 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println(a);

        int c = 100;
        byte d = (byte) c;
        System.out.println(d);

        float e = c;
        System.out.println(e);
    }
}
