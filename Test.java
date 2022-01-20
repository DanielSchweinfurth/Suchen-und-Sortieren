//IMPORTS
import java.util.Random;
//BEGINNING OF CLASS
public class Test {
    public static void main(String[] args) { 
        int[] feld1 = new int[10];
        fillArrayRand(feld1);

        Suche search = new Suche(feld1);        //ein neues Objekt der Klasse Suche wird erstellt und man übergibt der Klasse das erstellte Feld
            


        
        //     //Auskommentieren = strg + k +c ; unkommentieren = strg + k + u
        //     //Bubblesort
        // long zeitStart = System.nanoTime();
        // search.bubblesort();
        // long zeitEnde = System.nanoTime();
        // System.out.println("Der Prozess hat ca. : " + (zeitEnde-zeitStart) / 1000000000 + "s gedauert" );
        // System.out.println("Der Prozess hat : " + search.counter() + " operationen gebraucht");

        
            //Randomsort
        // long zeitStart = System.nanoTime();
        // search.randomsort();
        // System.out.println();
        // //search.ausgeben();
        // long zeitEnde = System.nanoTime();
        // System.out.println();
        // System.out.println("Der Prozess hat ca. : " + (zeitEnde-zeitStart) / 1000000000 + "s gedauert" );
        // System.out.println("Der Prozess hat : " + search.counter() + " operationen gebraucht");

            //Selectionsort
        search.ausgeben();
        System.out.println();
        search.selectionsort();
        search.ausgeben();
    }

    //VARAIBLEN
    //CONSTRUCKTOREN
    //GETTER UND SETTER
    //METHODEN
    public static void fillArrayRand(int[] feldTofill){
        Random zufall = new Random();
        for(int i = 0; i < feldTofill.length; i++){
            feldTofill[i] = zufall.nextInt(100);
        }
    }

    public static void fillArrayIn(int[] feldTofill){
        for(int i = 0; i < feldTofill.length; i++){
            feldTofill[i] = i;
        }
    }

   
    
}