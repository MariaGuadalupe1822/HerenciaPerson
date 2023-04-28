package Interfases;




public class InterfaseApp {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(
                "Juan",
                "Perez",
                20,
                "UNLP",
                "Informatica",
                "2do"
        );

        Empleado empleado = new Empleado(
                "Pedro",
                "Gomez",
                30,
                "Google",
                "Senior Programmer",
                "150000"
        );

        AlumnoTrabajador alumnoTrabajador = new AlumnoTrabajador(
                "Maria",
                "Gonzalez",
                25,
                "UNLP",
                "Informatica",
                "9no",
                "Facebook",
                "Junior Programmer",
                "100000"
        );

        System.out.println(alumno.toString());
        System.out.println(empleado.toString());
        System.out.println(alumnoTrabajador.toString());
    }
}



