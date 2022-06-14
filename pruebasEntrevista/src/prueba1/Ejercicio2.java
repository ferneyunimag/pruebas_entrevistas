package prueba1;
// Teniendo un arrego de 10 elementos  en el rango de 1 -9  escriba un programa en Java
// que imprima el numero que tiene mas  repeticiones segidas y tambien la cantidad de
// veces que aparece en el arreglo
// ejemplo (1,2,3,4,4,8,8,8)
//Longest:3
//Number:8


public class Ejercicio2 {
    static int[] myArray = {2, 8, 2, 4, 5, 6, 8, 8, 8, 8,9,7};

    public static void main(String[] args) {
        int longest = 1;
        int number = myArray[0];
        int tempLongest = 1;
        int tempNumber = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == number) {
                longest++;
            } else {
                number = myArray[i];
                longest = 1;
            }

            if (longest > tempLongest) {
                tempLongest = longest;
                tempNumber = number;
            }

        }

        System.out.println("Longest: "+tempLongest+"\n"+"Number: "+tempNumber);
    }
}
