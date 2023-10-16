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

    public Calciatore(Calciatore calciatore) {
        //chiamo il costruttore per copia di Persona
        //Calciatore is a Persona
        super(calciatore);
        this.nGol = calciatore.nGol;
        this.nMaglia = calciatore.nMaglia;
        this.ruolo = calciatore.ruolo;
    }
    public int getnGol() {
        return this.nGol;
    }

    public void setnGol(int nGol) {
        this.nGol = nGol;
    }

    public String getRuolo() {
        return this.ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public int getnMaglia() {
        return this.nMaglia;
    }

    public void setnMaglia(int nMaglia) {
        this.nMaglia = nMaglia;
    }

    public Object clone(){
        Calciatore c = new Calciatore(this);
        /*c.ruolo=this.ruolo;
        c.nMaglia=this.nMaglia;
        c.nGol=this.nGol;*/
        return c;
    }
    public String toString(){
        String rit = "{\n";
        rit += this.toStringInner();
        return rit;
    }
    public String toStringInner(){
        String rit = "{\n";
        rit += "Persona: \n"+super.toStringInner();
        rit += "\nruolo: "+this.ruolo+"\n";
        rit += "nMaglia: "+this.nMaglia+"\n";
        rit += "nGol: "+this.nGol+"\n";
        rit += "}";
        return rit;
    }
}
