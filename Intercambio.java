package com.mycompany.sorting;


class Intercambio {
     public void intercambiar(int []a, int i, int j){
        int aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
        }
     public void metodoIntercambio(int[] arrayParametro){
        
        
        for (int i = 0 ; i < arrayParametro.length-1; i++){ // se inicia desde cero para que coincida con los indices del arreglo
        // sitúa mínimo de a[i+1]...a[n-1] en a[i], se coloca i+1 ya que se compara con el elemento siguiente para realizar el intercambio.
            for (int j = i+1 ; j < arrayParametro.length; j++){
                if (arrayParametro[i] > arrayParametro[j]){
                 intercambiar(arrayParametro, i, j);
               }
           }
        }
    }
}
