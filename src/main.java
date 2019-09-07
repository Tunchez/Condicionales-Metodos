
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        estructuras metodo = new estructuras();
        Scanner entrada = new Scanner(System.in);

        int op, x = 0;

        do {
            do {
                System.out.println("MENU\n1. IGUAL\n2. MAYOR\n3. MENOR"
                        + "\n4. RESTA\n5. MULTIPLICACION\n6. DIVISION\n7. RAIZ"
                        + "\n8. FORMULA CUADRATICA\n9. MAXIMO\n10. AND"
                        + "\n11. OR\n12. NOT\n13. FINALIZAR");
                System.out.print("\nEliga su opcion: ");
                op = entrada.nextInt();
                System.out.println(" ");

                switch (op) {
                    case 1:
                        metodo.Igual(5, 5);
                        break;
                    case 2:
                        metodo.Mayor(6, 5);
                        break;
                    case 3:
                        metodo.Menor(5, 9);
                        break;
                    case 4:
                        metodo.Resta(8, 2);
                        break;
                    case 5:
                        metodo.Multiplicacion(2, 8);
                        break;
                    case 6:
                        metodo.Division(10, 2);
                        break;
                    case 7:
                        metodo.Raiz(9);
                        break;
                    case 8:
                        metodo.FormulaCuadratica(5, 8, 3);
                        break;
                    case 9:
                        int[] A = new int[5];
                        for (int i = 0; i < A.length; i++) {
                            A[i] = (int) Math.floor(Math.random() * (1 - 10 + 1) + 10);
                        }
                        metodo.Maximo(A);
                        break;
                    case 10:
                        metodo.AND(false, true);
                        break;
                    case 11:
                        metodo.OR(true, false);
                        break;
                    case 12:
                        metodo.NOT(true);
                        break;
                    case 13:
                        System.out.println("Finalizando programa...");
                        System.exit(0);
                    default:
                        System.out.println("Opcion invalida\n");
                }
            } while (op < 1 || op > 13);
        } while (x == 0);
    }
}
