public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("T", "Maschio", 2006);
        System.out.println(p.toString());
        Persona p2 = (Persona) p.clone();
        p2.setSesso("Fimmina");
        System.out.println(p2.toString());
    }
}