public class Persona {
    private String nome, sesso;
    private int annoNascita;

    public Persona(String nome, String sesso, int annoNascita){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }

    public String toString(){
        String rit = "{\n";
        rit += "nome: "+this.nome+"\n";
        rit += "sesso: "+this.sesso+"\n";
        rit += "anno di nascita: "+this.annoNascita+"\n";
        rit += "}";
        return rit;
    }
}
