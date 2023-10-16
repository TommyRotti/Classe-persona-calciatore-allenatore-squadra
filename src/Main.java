public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("T", "Maschio", 2006, 46);
        System.out.println(p.toString());
        Persona p2 = (Persona) p.clone();
        p2.setSesso("Fimmina");
        System.out.println(p2.toString());
        Calciatore c = new Calciatore("G", "Masculo", 2007, 43, "Panchinaro", 17, 0);
        System.out.println("\n");
        System.out.println(c.toString());
        Calciatore c2 = (Calciatore) c.clone();
        c2.setRuolo("Porta Borraccie");
        System.out.println(c2.toString());
    }
}