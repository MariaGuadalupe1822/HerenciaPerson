package Array;
import java.security.SecureRandom;
public class Volado {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int[] volado = new int[3];

        int lanzamientos = 100;
        int aguila = 1;
        int sol = 2;
        volado[aguila] = 0;
        volado[sol] = 0;


        for (int i = 0; i <= lanzamientos; i++) {
            lanzamientos=random.nextInt(2)+1;
            if(lanzamientos==aguila) {
                volado[aguila] += 1;
            }
                if (lanzamientos==sol){
                    volado[sol] += 1;
                }
        }

        System.out.println("Cayó " + volado [aguila]+ " veces aguila");
        System.out.println("Cayó " + volado [sol]+  " veces sol");
    }
}
