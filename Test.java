//IMPORTS
import java.util.Random;
import java.util.random.*;
//BEGINNING OF CLASS
public class Test {
    public static void main(String[] args) { 
        int[] feld1 = new int[10];
            //man erstellt ein neues Feld
        fillArrayRand(feld1);
        //fillArrayIn(feld1);
            //dieses erstellte feld wird hier übergeben und mit zufälligen Zahlen gefüllt

        Suche search = new Suche(feld1);        //ein neues Objekt der Klasse Suche wird erstellt und man übergibt der Klasse das erstellte Feld
        
        search.ausgeben();
        System.out.println();
        search.bubblesort();
        System.out.println();
        //search.tauschen(2, 3);
        //System.out.println();
        //System.out.println(search.vergleichen(2, 3));
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