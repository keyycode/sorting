
package com.mycompany.sorting;


public class Insercion {
    void metodoInserccion(int[]array){
       
        int aux;
        for(int i=1;i<array.length;i++){
            int j=i;
            aux=array[i];
            while(j>0 && aux <array[j-1]){
                array[j]=array[j-1];
                j--;
            }
            array[j]=aux;
        }
    }
    
}
