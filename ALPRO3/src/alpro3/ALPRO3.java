package alpro3;

import java.util.ArrayList;

/**
 * @author 16171024
 */
public class ALPRO3 {

    public static void main(String[] args) {
        System.out.println("sumatoria: " + sumaN(5));
        System.out.println("sumatoria-recursivo: " + sumRecursivoSumaN(5));
        System.out.println("sumatoriaKN-recursivo: " + sumatoriaKN(4, 5));

        //ejecucion ejercicio 3
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("sumatoriaArrray-recursivo: " + sumaArrayList(a, 0));
        System.out.println("numMayor-recursivo: " + numMayour(a, 0));
        System.out.println("Es palindromo : " + (isPalindromo("sugus") ? "true" : "false"));
        System.out.println("Binario: " + getBinario(10));
    }

    //Ejercicio 1 suma de todos los numeros desde 0 hasta n
    public static int sumaN(int n) {
        return (n * (n + 1)) / 2;
    }

    //Ejerciico 1 de manera recursiva
    public static int sumRecursivoSumaN(int n) {
        return (n == 0) ? 0 : n + sumRecursivoSumaN(n - 1);
    }

    //Ejercicio 2 recurusivo, sumatoria de K hasta J
    public static int sumatoriaKN(int k, int j) {
        return (j == k) ? j : j + sumatoriaKN(k, j - 1);
    }

    //Ejerciico 3 recucivo, sumatoria de un string 
    //se espera que la posicion inicial siempre sea 0
    public static int sumaArrayList(ArrayList a, int posicion) {
        return posicion == a.size() - 1 ? (int) a.get(posicion) : (int) a.get(posicion) + (int) sumaArrayList(a, posicion + 1);
    }

    //Ejercicio 4 recursivo - numero mayor de un arreglo
    public static int numMayour(ArrayList a, int posicion) {
        if (posicion == a.size() - 1) {
            return (int) a.get(posicion);
        }
        return (int) a.get(posicion) > numMayour(a, posicion + 1)
                ? (int) a.get(posicion)
                : numMayour(a, posicion + 1);
    }

    //Ejercicio 5 recursivo - validacion palindromo
    public static boolean isPalindromo(String s) {
        if (s.length() % 2 == 0) {
            return false;
        }
        return isPal(s);
    }

    //Ejerciio 5 complemento
    static boolean isPal(String s) {
        if (s.length() == 1) {
            return true;
        }
        return s.charAt(0) == s.charAt(s.length() - 1)
                ? isPal(s.substring(1, s.length() - 1))
                : false;
    }

    //Ejercicio 6 - Entero a String binario
    public static String getBinario(int n) {
        return n == 0 ? "0" : getBinario(n / 2) + n % 2;
    }

}
