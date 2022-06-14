package prueba1;

//Escribir un programa en Java que reccora un arreglo y gener un histograma
//en base a los numeros de este. El arreglose llama myArray y contiene 10 elementos que corresponden
//a numeros entre el 1 y el 5. Un histograma representa que tantos aparece un numero en un conjuntod de datos
//debe mostrar la fecuencia de todos los numeros del 1 al 5 incluso si no estan incluidos en el arreglo
//ejemplo: para el arreglo  myArray={1,2,1,3,3,1,2,1,5,1}
//la salida debe ser
//
//1:*****
//2:**
//3:**
//4:
//5:*

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
    static int[] myArray = {1, 2, 1, 5, 1, 8, 8, 9, 9, 9, 9, 6, 6, 6, 6, 6, 6, 6, 6, 0, 8};


    public static void main(String[] args) {
        TreeMap<Integer, Integer> values = new TreeMap<Integer, Integer>();
        for (int x : myArray) {
            if (values.containsKey(x)) {
                values.put(x, (values.get(x)) + 1);
            } else {
                values.put(x, 1);
            }
        }
//valiendose de la caracteristica TreeMap organiza en forma descendente todas las llaves
        int lVal = values.lastKey();

// se itera para  imprimir la cantidad de asteriscos necesarios  si no existe se imprime un espacio vacio

        for (int i = 1; i <= lVal; i++) {
            if (values.containsKey(i)) {
                System.out.print(i + ": ");
                for (int e = 1; e <= values.get(i); e++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println(i + ":");
            }
        }


    }


}
