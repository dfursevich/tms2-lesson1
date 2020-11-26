/**
 * @author Dzmitry Fursevich
 */
public class Run6 {
    public static void main(String[] args) {
        //[,20)[20,30)[30,100)[100,]
        int x = 30;
        if (x < 20) {
            System.out.println("[,20)");
        } else if (x >= 20 && x < 30) {
            System.out.println("[20,30)");
        } else if (x >= 30 && x < 100) {
            System.out.println("[20,30)");
        } else {
            System.out.println("[30,]");
        }
    }
}
