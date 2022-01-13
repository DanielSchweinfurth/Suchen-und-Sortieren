import java.util.*;

public class Suche {

    public static void main(String[] args){
        int[] un = new int[1000];

        fillArray(un);
        printArray(un);
    }


    public static void fillArray(int[] arrayToFill){
        //Random rand = new Random();
        for(int i = 0; i < arrayToFill.length; i++){
            arrayToFill[i] = i +1;
        }

    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]); 
        }
    }




    
}
