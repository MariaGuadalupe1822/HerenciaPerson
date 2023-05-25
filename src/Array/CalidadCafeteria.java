package Array;


import java.security.SecureRandom;

public class CalidadCafeteria {
    static int generaRespuesta(int n) {
        SecureRandom random = new SecureRandom();
        return 1 + random.nextInt();

    }

    public static void main(String[] args) {
        final int CANT_ALUMNOS = 30;
        int[] calificaciones = new int[6];

        for (int i = 0; i < CANT_ALUMNOS; i++) {
            calificaciones[generaRespuesta(5)] += 1;

        }

        System.out.println("Se recibieron " + CANT_ALUMNOS + "respuestas");


        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println();
        }
    }

}

