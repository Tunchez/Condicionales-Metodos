
public class main {

    public static void main(String[] args) {
        estructuras metodo = new estructuras();
        metodo.Igual(5, 5);
        metodo.Mayor(6, 5);
        metodo.Menor(5, 9);
        metodo.Resta(8, 2);
        metodo.Multiplicacion(2, 8);
        metodo.Division(10, 2);
        metodo.Raiz(9);
        metodo.FormulaCuadratica(5, 8, 3);
        int[] A = new int[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.floor(Math.random() * (1 - 10 + 1) + 10);
        }
        metodo.Maximo(A);
        metodo.AND(false, true);
        metodo.OR(true, false);
        metodo.NOT(true);

    }
}
