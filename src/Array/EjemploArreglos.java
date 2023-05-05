

package Array;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[]zoo={"monkey", "chimp", "donkey", "Elephant, Lion", "turtle", "zebra", "Tiger", "Snake", "panda"};
        String[]alias= zoo;
        System.out.println(zoo.equals(alias));
        System.out.println(zoo.toString());

        System.out.println(zoo[0]);
        System.out.println(zoo[1]);
        System.out.println(zoo[2]);
        for (int i=0; i<zoo.length; i++) {
            System.out.println(zoo[i]); //el for ejecuta en una vez
        }
    }
}

