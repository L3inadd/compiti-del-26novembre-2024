import java.awt.image.renderable.RenderableImage;
import java.util.List;

public class Sportello implements  Runnable{
    private ListaClienti listaClienti;
    private final int minTempoServito=6000;
    private final int maxTempoServizio=12000;
    private int numeroSportello;

    public Sportello(ListaClienti listaClienti, int numeroSportello){
        this.listaClienti=listaClienti;
        this.numeroSportello= numeroSportello;
    }

    public void run(){
        try{
            while (!Thread.interrupted()){
                Integer clienteServito = listaClienti.rimuoviClinet();
                System.out.println("Chiamo Cleinte Numero \t " + clienteServito + " dallo sportello numero " + numeroSportello);

                int tempoServizio = (int)(Math.random()*(maxTempoServizio-minTempoServito+1)+minTempoServito);
                Thread.sleep(tempoServizio);
                System.out.println("Servizio Cliente Numero \t" + clienteServito + " dallo sportello " + numeroSportello);
            }
        } catch (InterruptedException e){
            System.out.println("Thread interrotto dunrate lo sleep");
        }finally{
            System.out.println("Sportello Chiuso");
        }
    }
}
