package Run;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import view.FenetreJeu;

public class MainApplication {

	private static FenetreJeu ihm ;
	/**Lanceur de l'application*/
    public static void main(String[] args) {

	Init();

    }
    /** Initialisation des differentes parties du projet*/
    private static void Init(){
	//initialisation voiture ;
	MainApplication.init_ihm();
	MainApplication.init_timer(1000,0);
    }
    
    /** Initialiser de la partie graphique du projet*/
    private static void init_ihm(){
    	ihm = new FenetreJeu();
		ihm.setSize(600, 600);
		ihm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ihm.setVisible(true);
    }

    /** initialisation de la partie timer du projet*/
    private static void init_timer(Integer time_sync,Integer start_timer){
	long temps = time_sync;
        long startTime = 0;  
        Timer timer = new Timer();           
        TimerTask tache = new TimerTask() { 
            @Override
                public void run() {
                    MainApplication.timer_task();
                    System.out.println("Updating position");
                }
        };
        timer.scheduleAtFixedRate(tache,startTime,temps);  
    }
    
    private static void timer_task(){
	
	
    }
    

}
