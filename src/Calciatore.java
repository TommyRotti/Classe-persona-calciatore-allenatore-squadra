public class Calciatore extends Persona{

    private String ruolo;
    private int nMaglia, nGol;
    public Calciatore(String nome, String sesso, int annoNascita,
                      String ruolo, int nMaglia, int nGol) {
        super(nome, sesso, annoNascita);
        this.nGol = nGol;
        this.nMaglia = nMaglia;
        this.ruolo = ruolo;
    }

    public String toString(){
        String rit = "{\n";
        rit += "Persona: \n"+super.toString();
        rit += "\nruolo: "+this.ruolo+"\n";
        rit += "nMaglia: "+this.nMaglia+"\n";
        rit += "nGol: "+this.nGol+"\n";
        rit += "}";
        return rit;
    }
}
