import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Leitor {
    
    HashMap<String, Agente> lerPerson(String caminhoP){

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

    HashMap<String, Capitulo> lerCap(String caminhoC, Agente person, Scanner informação){
        HashMap<String, Capitulo> historia = new HashMap<String, Capitulo>();
        
        File ArquivoHistoria = new File(caminhoC);
        try{
            Scanner scannerleitor = new Scanner(ArquivoHistoria, "UTF-8");
            
            String lerNomedoCap = "";
            String lerhistoria = "";
            String linha= "";
            while(scannerleitor.hasNextLine())
            {
                while(!linha.equals("CAPITULO"))
                {
                    linha = scannerleitor.nextLine();
                }
                linha = scannerleitor.nextLine();
                lerNomedoCap = scannerleitor.nextLine();

                linha = scannerleitor.nextLine();
                // while(!lerhistoria.equals("END")){
                //     lerhistoria = scannerleitor.nextLine();
                //     System.out.println(lerhistoria);
                // }
                lerhistoria = scannerleitor.nextLine();
                historia.put(lerNomedoCap, new Capitulo(lerNomedoCap, lerhistoria, person, informação));
            }
            scannerleitor.close();
        }
        catch(FileNotFoundException ErroArquivo){
            ErroArquivo.printStackTrace();
        }
        
        return historia;
    }
}
