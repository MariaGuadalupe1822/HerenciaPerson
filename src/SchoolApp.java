public interface SchoolApp {
    public static void main(String[] args) {
        Student student1= new Student("Juan","Perez", "juanpigmail.com", "Iguala Guerrero");
        student1.setControlNumber(12345);
        student1.setCareer("Informatica");
        student1.setGeneralAverage(10);

        System.out.println(" El nombre del student1 = " + student1.getName() + " " + student1.getLastname());
        System.out.println("El numero de control de "+student1.getName() +"es " + student1.getControlNumber());


        Teacher teacher1= new Teacher("Maria","Morales", "mariamoralesgmail.com", "Iguala Guerrero") ;
        System.out.println(" El nombre del teacher1 = " + teacher1.getName() + " " + teacher1.getLastname());
        teacher1.setBiocard(1234662);
        teacher1.setAssignedhours(12);
        teacher1.setAdscription("Biologia");

        System.out.println("teacher1 = " + teacher1);

        //probando sobrecarga de metodos
        System.out.println("Metodo toString() de student1" + student1.toString());
        System.out.println("Metodo toString() de Teacher1" + teacher1.toString());

        System.out.println("teacher1 = " + teacher1);

        System.out.println("Soy una persona " + student1.toString());
        System.out.println("Soy una persona " + teacher1.toString());

    }




}
