package Array;

public class ArrayType {
    public static void main(String[] args) {
        String[]bugs={"Cricket", "beatle", "ladybug"};
        String[]alias= bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString());

        System.out.println(bugs[0]);
        System.out.println(bugs[1]);
        System.out.println(bugs[2]);
        for (int i=0; i<bugs.length; i++) {
            System.out.println(bugs[i]); //el for ejecuta en una vez
        }
    }
}
