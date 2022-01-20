import java.util.Random;

//IMPORTS

//BEGINNING OF CLASS
public class Suche {
    //VARAIBLEN
   private int[] feldToSort;
   private int loopCounter;
    //CONSTRUCKTOREN
    public Suche(int[] feld){
        this.feldToSort = feld;
    }
    //GETTER UND SETTER
    public int counter() {
        return loopCounter;
    }

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
    for (int i = 0; i < feldToSort.length -1; i++) {
        if (feldToSort[i] > feldToSort[i +1]) {
            return false;            
        }
    }
    return true;
    }


    //Bubblesort
    public void bubblesort(){
        System.out.println("Aufgerufen Bubble Sort" );
        for(int n = 0; n < feldToSort.length -1; n++){
            ausgeben();
            loopCounter ++;
            System.out.println();
            for(int i = 0;i < feldToSort.length -1; i++){
                if(vergleichen(feldToSort[i], feldToSort[i+1])){
                    tauschen(i, i+1);
                }
            }    
        }    
    }
    //Selectionsort
    public void selectionsort(){
        int kleinstIndex = feldToSort[1];
        int untereGrenze = 0;
        for (int i = 0; i < feldToSort.length; i++) {
            if(feldToSort[i] < kleinstIndex){
                kleinstIndex = i;
                tauschen(untereGrenze, kleinstIndex);
                untereGrenze ++;
            }
        }
        
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
        int ersterIndex;
        int zweiterIndex;
        Random zufall = new Random();
        while (isSorted() == false){ 
            ersterIndex = zufall.nextInt(feldToSort.length);
            zweiterIndex = zufall.nextInt(feldToSort.length);
            tauschen(ersterIndex, zweiterIndex);

            loopCounter++;
            ausgeben();
            System.out.println();
        }
        //System.out.println(loopCounter);
    }


}
