public class Persona {
    private String nome, sesso;
    private int annoNascita;

    public Persona(String nome, String sesso, int annoNascita){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }

    public String getSesso() {
        return this.sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getNome() {
        return this.nome;
    }
    public int getAnnoNascita() {
        return this.annoNascita;
    }

    public Object clone(){
        return new Persona(this.nome, this.sesso, this.annoNascita);
    }
    public String toString(){
        String rit = "{\n";
        rit += this.toStringInner();
        return rit;
    }

    public String toStringInner(){
        String rit = "";
        rit += "nome: "+this.nome+"\n";
        rit += "sesso: "+this.sesso+"\n";
        rit += "anno di nascita: "+this.annoNascita;
        return rit;
    }
}
