public class Teacher extends Person {

    private String adscription;
    private int biocard;
    private int Assignedhours;

    public Teacher() {
    }
    public Teacher(String name, String lastname, String email, String address) {
        super(name, lastname, email, address);

    }

    public Teacher(String name, String lastname, String email, String address, String adscription, int biocard, int assignedhours) {
        super(name, lastname, email, address);
        this.adscription = adscription;
        this.biocard = biocard;
        this.Assignedhours = assignedhours;
    }

    public String getAdscription() {
        return adscription;
    }

    public void setAdscription(String adscription) {
        this.adscription = adscription;
    }

    public int getBiocard() {
        return biocard;
    }

    public void setBiocard(int biocard) {
        this.biocard = biocard;
    }

    public int getAssignedhours() {
        return Assignedhours;
    }

    public void setAssignedhours(int assignedhours) {
        Assignedhours = assignedhours;
        }
        public String toString() {

            System.out.println("La maestra Maria Morales  =" + this.getName()+ " " + this.getLastname());
            System.out.println("El correo es " + this.getEmail());
            System.out.println("El la direccion es = " + this.getAddress());
            System.out.println("Las areas para dar clases = " + this.adscription);
            System.out.println("El numero de control es  =" + this.getBiocard());
            return "Soy un maestro";


        }
    public String soy () {
        return "Soy una persona y maestro";
    }
    }

