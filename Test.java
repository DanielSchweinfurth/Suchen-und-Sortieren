//IMPORTS
import java.util.Random;
//BEGINNING OF CLASS
public class Test {
    public static void main(String[] args) { 
        int[] feld1 = new int[10];
        fillArrayRand(feld1);

        Suche search = new Suche(feld1);        //ein neues Objekt der Klasse Suche wird erstellt und man übergibt der Klasse das erstellte Feld
        
        search.ausgeben();
        
        System.out.println(search.isSorted());
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