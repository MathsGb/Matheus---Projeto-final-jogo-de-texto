import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Leitor {
    
    public HashMap<String, Agente> lerPerson(String caminhoP)
    {
        HashMap<String, Agente> person = new HashMap<String, Agente>();
        File ArquivoPerson = new File(caminhoP);

        try
        {
        Scanner scannerleitor = new Scanner(ArquivoPerson, "UTF-8");

        String linha= "";
        while(scannerleitor.hasNextLine())
        {
            while(!linha.equals("AGENTE"))
            {
                linha = scannerleitor.nextLine();
            }
            LerPessoa(person, scannerleitor);
            linha = "";
        }

        scannerleitor.close();
        }
        catch (FileNotFoundException ErroDeArquivo){

            ErroDeArquivo.printStackTrace();
        }
        return person;
    }

    public HashMap<String, Capitulo> lerCap(String caminhoC, Agente person, Scanner informação)
    {

    HashMap<String, Capitulo> historia = new HashMap<String, Capitulo>();
    File ArquivoHistoria = new File(caminhoC);

    String linha = "";
    String lerNomedoCap = "";
    String lerhistoria = "";
    String nomeCapAnterior = "";
    String texto = "";
    String nomeProximoCap = "";
    int danoEscolha = 0;

    try{
        Scanner scannerLeitor = new Scanner(ArquivoHistoria, "UTF-8");
        while(scannerLeitor.hasNextLine())
        {
            while(!linha.equals("CAPITULO") && !linha.equals("ESCOLHA"))
            {
                linha = scannerLeitor.nextLine();
            }
            if(linha.equals("CAPITULO")){
                LerCapitulos(person, informação, historia, scannerLeitor);
                linha = "";
            }

            else if(linha.equals("ESCOLHA"))
            {
                LerEscolha(historia, scannerLeitor);
                linha = "";
            }
        }
            scannerLeitor.close();
        }

        catch(FileNotFoundException ErroArquivo)
        {
            ErroArquivo.printStackTrace();
        }
        return historia;
    }

    private void LerCapitulos(Agente person,
                            Scanner informação,
                            HashMap<String, Capitulo> historia,
                            Scanner scannerLeitor)
        {
        
        String linha;
        String lerNomedoCap;
        String lerhistoria;
        
        linha = scannerLeitor.nextLine();
        lerNomedoCap = scannerLeitor.nextLine();
        linha = scannerLeitor.nextLine();
        lerhistoria = scannerLeitor.nextLine();
        historia.put(lerNomedoCap, new Capitulo(lerNomedoCap, lerhistoria, person, informação));
        // String paragrafo;
        // while(!lerhistoria.equals("END")) // Compilar o texto da história em parágrafos
        // {
        //     paragrafo += lerhistoria + "\n";
        //     lerhistoria = scannerLeitor.nextLine();
        // }
        // paragrafo = "";
    }

    private void LerEscolha(HashMap<String, Capitulo> historia, Scanner scannerLeitor)
    {

        String linha;
        String nomeCapAnterior;
        String texto;
        String nomeProximoCap;
        int danoEscolha;

        linha = scannerLeitor.nextLine();
        nomeCapAnterior = scannerLeitor.nextLine(); // Lendo o capítulo anterior

        linha = scannerLeitor.nextLine();
        texto = scannerLeitor.nextLine(); // Texto da história

        linha = scannerLeitor.nextLine();
        nomeProximoCap = scannerLeitor.nextLine(); // Para onde o capítulo irá

        linha = scannerLeitor.nextLine();
        danoEscolha = Integer.parseInt(scannerLeitor.nextLine()); // Dano que essa escolha carrega

        historia.get(nomeCapAnterior).adicionaEscolha(new Escolha(texto, historia.get(nomeProximoCap), danoEscolha));
    }

    private void LerPessoa(HashMap<String, Agente> person, Scanner scannerleitor) {
        String linha;
        String lerNome = "";
        String lerEspecialidade = "";

        linha = scannerleitor.nextLine();
        lerNome = scannerleitor.nextLine(); // Nome do Agente
        linha = scannerleitor.nextLine();
        lerEspecialidade = scannerleitor.nextLine(); // Playstyle de cada personagem
    
        person.put(lerNome, new Agente(lerNome, lerEspecialidade));
    }
}