public class Escolha {
    private String textesc;
    private Capitulo next;
    private int danodeesc;
    
    public Escolha(String text, Capitulo proximo, int dano) {
        this.textesc = text;
        this.next = proximo;
        this.danodeesc = dano;
    }

    public String getTextEsc(){
        return this.textesc;
    } 

    public Capitulo getNext(){
        return this.next;
    } 

    public int getDanodeEscolha(){
        return this.danodeesc;
    } 
}