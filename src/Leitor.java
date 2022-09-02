import java.util.HashMap;
import java.util.Map;
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
}
