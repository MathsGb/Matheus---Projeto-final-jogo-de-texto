public class Escolha {
    String textesc;
    Capitulo next;
    int danodeesc;
    
    Escolha(String text, Capitulo proximo, int dano) {
        this.textesc = text;
        this.next = proximo;
        this.danodeesc = dano;
    }
}
