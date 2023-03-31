public class Student extends Person {

    private int controlNumber;
    private String career;
    private double generalAverage;

    public Student() {
    }

    public Student(String name, String lastname, String email, String address) {
        super(name, lastname, email, address);
    }

    public Student(String name, String lastname, String email, String address, int controlNumber, String career, double generalAverage) {
        super(name, lastname, email, address);
        this.controlNumber = controlNumber;
        this.career = career;
        this.generalAverage = generalAverage;
    }

    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public double getGeneralAverage() {
        return generalAverage;
    }

    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }

    public String toString() {
        System.out.println("El alumno Juan Perez  = " + this.getName() + this.getLastname());
        System.out.println("El numero de control es  =" + this.getControlNumber());
        System.out.println("El correo es " + this.getEmail());
        System.out.println("El alumno Juan Perez  = " + this.getAddress());

        return "soy un estudiante";
    }
    public String soy() {
    return"Soy una persona y estudiante";
        }
    }

