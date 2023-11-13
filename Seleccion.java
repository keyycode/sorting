package com.mycompany.sorting;


public class Seleccion {
    
    void metodoSeleccion(int[] a){
        int menor, aux;
        
        for(int i=0;i<a.length-1;i++){
            menor=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]< a[menor]){
                    menor= j;
                }
            }
            aux= a[i];
            a[i]=a[menor];
            a[menor]=aux;
            
        }
    }
    
}
