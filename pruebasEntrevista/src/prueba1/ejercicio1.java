package prueba1;
//Escribir unprograma utilizanso java que
//encuentre lo dos elementos del arreglo que sumados dan 10
//se deben imprimir ambos  numeros como resultado separados por un espacio
//en el orden en que aparecene nel arreglo.
public class ejercicio1 {

    static int[] myArray = {1, 3, 4, 5, 5,6, 7, 2, 8, 9,5};

    public static void main(String[] args) {
        int count = 1;
        for (int x : myArray) {
            for (int i = count; i < myArray.length; i++) {
                if (x + myArray[i] == 10) {
                    System.out.println(x + ":" + myArray[i]);
                }

            }
            count++;
        }


    }


}
