//IMPORTS
import java.util.random.*;
//BEGINNING OF CLASS
public class Suche {
    //VARAIBLEN
   private int[] feldToSort;
    //CONSTRUCKTOREN
    public Suche(int[] feld){
        this.feldToSort = feld;
    }
    //GETTER UND SETTER

    //METHODEN
    public void ausgeben(){
        for(int i = 0; i < feldToSort.length; i++){
            System.out.print(feldToSort[i] + " ");
        }
    }

    public boolean vergleichen(int eins, int zwei){ // gibt zurück ob das erste zu vergleichende Element größer ist als das nächse, wenn Ja kommt True zutück
        if(eins > zwei){
            return true;
        }else{
            return false;
        }        
    }

    public void tauschen(int stelleEins, int stelleZwei){ // Tauscht die Stellen im zu sortierenden Array
        int lager;// Zwischenlager für das zuerst gelöste Element
        lager = feldToSort[stelleEins];//Der Wert der ersten Stelle wird in das Lager gespeichert 
        feldToSort[stelleEins] = feldToSort[stelleZwei];// nun wird die erste Stelle mit dem Wert der zweiten überschrieben
        feldToSort[stelleZwei] = lager;// die Zweite Stelle wird mit der ersten überschrieben


    }

    //Bubblesort
    public void bubblesort(){
        //int lang = feldToSort.length;
        System.out.println("Aufgerufen Bubble Sort" );
        for(int n = 0; n < feldToSort.length; n++){
            for(int i = 0;i < feldToSort.length; i++){
                if(vergleichen(feldToSort[i], feldToSort[i+1]) == true){
                    System.out.println("Nummer 1 größer");
                    tauschen(feldToSort[i], feldToSort[i+1]);
                }
            }    
        }    
    }
    //Selectionsort 
    //Insertionsort
    //Gnomesort
    //Quicksort
    //Heapsort
    //Mergesort




    
}
