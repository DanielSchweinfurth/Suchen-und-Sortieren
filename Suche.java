//IMPORTS

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

    public boolean isSorted(){
        for (int i = 0; i < feldToSort.length-1; i++) {
            if (feldToSort[i] < feldToSort[i+1]) {
                return true;
            }
        }
        return false;
    }

    //Bubblesort
    public void bubblesort(){
        //int lang = feldToSort.length;
        System.out.println("Aufgerufen Bubble Sort" );
        for(int n = 0; n < feldToSort.length -1; n++){
            for(int i = 0;i < feldToSort.length -1; i++){
                if(vergleichen(feldToSort[i], feldToSort[i+1])){
                    System.out.println("Nummer 1 größer");
                    tauschen(i, i+1);
                }
            }    
        }    
    }
    //Selectionsort
    public void selectionsort(){

        //int minIndex;//für den index des kleinsten Elemnts
        //int temp;//Hilfsvariable 

    } 
    //Insertionsort
    public void insertionsort() {
        
    }
    //Gnomesort
    //Quicksort
    //Heapsort
    //Mergesort
    //Randomsort
    public void randomsort(){
        while (isSorted() == false){
            
        }
        
    }




    
}
