import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Leitor {
    
    public HashMap<String, Agente> lerPerson(String caminhoP){

        HashMap<String, Agente> person = new HashMap<String, Agente>();
        
        File ArquivoPerson = new File(caminhoP);

        try{
        Scanner scannerleitor = new Scanner(ArquivoPerson, "UTF-8");
        
        String lerNome = "";
        String lerEspecialidade = "";
        String linha= "";

        while(scannerleitor.hasNextLine()){

            while(!linha.equals("AGENTE")){
                linha = scannerleitor.nextLine();
            }
            linha = scannerleitor.nextLine();
            lerNome = scannerleitor.nextLine();

            linha = scannerleitor.nextLine();
            lerEspecialidade = scannerleitor.nextLine();

            person.put(lerNome, new Agente(lerNome, lerEspecialidade));

        }
        scannerleitor.close();
        }
        catch (FileNotFoundException ErroDeArquivo){
            // TODO Auto-generated catch block
            ErroDeArquivo.printStackTrace();
        }
        return person;
    }

    public HashMap<String, Capitulo> lerCap(String caminhoC, Agente person, Scanner informação){
        
        HashMap<String, Capitulo> historia = new HashMap<String, Capitulo>();
        File ArquivoHistoria = new File(caminhoC);
        try{
            Scanner scannerLeitor = new Scanner(ArquivoHistoria, "UTF-8");
            String lerNomedoCap = "";
            String lerhistoria = "";
            String linha = "";
            
            while(scannerLeitor.hasNextLine())
            {
                while(!linha.equals("CAPITULO") && !linha.equals("ESCOLHA"))
                {
                    linha = scannerLeitor.nextLine();
                }
                if(linha.equals("CAPITULO")){
                    linha = scannerLeitor.nextLine();
                    lerNomedoCap = scannerLeitor.nextLine();
                    linha = scannerLeitor.nextLine();
                    lerhistoria = scannerLeitor.nextLine();
                    historia.put(lerNomedoCap, new Capitulo(lerNomedoCap, lerhistoria, person, informação));
                }

                else if(linha.equals("ESCOLHA")){
                    String nomeCapAnterior = "";
                    String texto = "";
                    String nomeProximoCap = "";
                    int danoEscolha = 0;
                    
                    linha = scannerLeitor.nextLine();
                    nomeCapAnterior = scannerLeitor.nextLine();

                    linha = scannerLeitor.nextLine();
                    texto = scannerLeitor.nextLine();

                    linha = scannerLeitor.nextLine();
                    nomeProximoCap = scannerLeitor.nextLine();

                    linha = scannerLeitor.nextLine();
                    danoEscolha = Integer.parseInt(scannerLeitor.nextLine());
                    
                    historia.get(nomeCapAnterior).adicionaEscolha(new Escolha(texto, historia.get(nomeProximoCap), danoEscolha));
                }
            }
            scannerLeitor.close();
        }
        catch(FileNotFoundException ErroArquivo){
            ErroArquivo.printStackTrace();
        }
        return historia;
    }
}