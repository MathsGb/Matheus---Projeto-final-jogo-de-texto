public class Condição{
    public static String CalCond(int Atual,int Dano, int Tipo){
        Atual -= Dano;
        if( Atual <= 0 ){
            return "Game over";
        }
        else if(Tipo == 1){
        return "Saúde atual "+ Integer.toString(Atual)+"/100";
    }
        else{
            return "Comprometimento atual "+ Integer.toString(Atual)+"/100";
        
        }
    }
}
