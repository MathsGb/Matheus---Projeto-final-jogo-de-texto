public class Condição{
    public static String CalCond(int Atual,int Dano){
        if( Atual <= 0 ){
            return "Game over";
        }
        else{
            Atual -= Dano;
        }
        return "Integridade atual "+ Integer.toString(Atual)+"/100";
    }
    
    
}
