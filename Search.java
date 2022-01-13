import java.util.*;

public class Search{ 
  
    private int[] unsortiert;
    private int[] sortiert;
    private int n;
    
    // erstellt zwei Felder mit n Zufallszahlen
    // ein Feld ist unsortiert, eines ist sortiert
    public Search(int n){
        this.n=n;
        unsortiert = new int[n];
        sortiert = new int[n];
        Random zufall = new Random();
        for (int i=0;i<n;i++){
         unsortiert[i]=zufall.nextInt(100);
         sortiert[i]=unsortiert[i];
        }
        Arrays.sort(sortiert);
    }
    
    // Gibt die Felder auf der Konsole aus
    public void felderAnzeigen(){
     for(int i=0;i<n;i++){
       System.out.print(unsortiert[i]+" ");
     }
     System.out.println("");
     for(int i=0;i<n;i++){
       System.out.print(sortiert[i]+" ");
     }
    }
    
    // sucht die Zahl s im unsortierten Feld
    public void suchenLin(int s){
     boolean gefunden=false;
     for (int i=0; i<n;i++){
      if (unsortiert[i]==s){ 
       System.out.println(s+" gefunden an Stelle "+ i+" !");
       gefunden=true;
      }
     }
     if (!gefunden) System.out.println(s+" nicht gefunden!");
    }
    
    // sucht die Zahl s im sortierten Feld
    public void suchenBin(int s){
        
    }
    
}

