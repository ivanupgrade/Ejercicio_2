public class Principal {
    public static void main(String[] args) {
        int [] numeros = {1, 4, 6, 8, 2};
        
        Vectores.mostrarVector(numeros);

        if (Numeros.par(numeros[1])) {
            System.out.printf("%d es par", numeros[1]);
        } else {
            System.out.printf("%d no es par", numeros[1]);
        }
    }
}