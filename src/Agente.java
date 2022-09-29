public class Agente {
    private String nome;
    private String especialidade;

    public Agente(String nome ,String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    public static void imprima(Agente pessoa) {
        System.out.println("Agente -- \n Nome: " + pessoa.nome);
        System.out.println(" É especialista em " + pessoa.especialidade);
    }
}