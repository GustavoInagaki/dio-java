public class Smart {
    
    boolean ligado = false;
    int volume = 10;
    int canal = 1;



    public void ligarTv(){

        ligado = true;

    }

    public void desligarTv(){

        ligado = false;

    }


    public void aumentarVolume(){
        if(volume >= 20){
            System.out.println("O volume está no máximo");
        }else{
            ++volume;
        }
    }
    public void diminuirVolume(){
        if(volume <= 0){
            System.out.println("A TV está no mudo");
        }else{
            --volume ;
        }
    }

}
