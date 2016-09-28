/**
 * Created by Marc on 28/9/2016.
 */
public class MiEscribidor extends Thread {
    int id;

    public MiEscribidor(int num) {
        id = num;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int pos = i + 1;
            System.out.println("Soy Thread " + this.id + " en posición " + pos);
        }
    }
}