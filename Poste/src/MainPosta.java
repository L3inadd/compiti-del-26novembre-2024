//Kapllani Daniel  5Dinf 


import java.util.ArrayList;

public class MainPosta {
    public static final int NumeroSportelli =3;
    public static void main(String[] args) {


        ListaClienti listaClienti = new ListaClienti();
        Thread arriviThread = new Thread( new Arrivi(listaClienti));
        ArrayList<Thread> sportelloThreadList = new ArrayList<Thread>();
        arriviThread.start();
        for (int i=0; i<NumeroSportelli; i++){
            sportelloThreadList.add(sportelloThread);
            sportelloThread.start();
        }

    }
}