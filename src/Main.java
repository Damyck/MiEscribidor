/**
 * Created by Marc on 28/9/2016.
 */
public class Main {
    public static void main(String[] arcs) {

        for (int i = 0; i<5; i++){
            Thread th = new MiEscribidor(i+1);
            th.start();
        }
    }

    }
