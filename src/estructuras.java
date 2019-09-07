
public class estructuras {

    Integer num1 = 0;
    Integer num2 = 0;
    Integer num3 = 0;
    double x1 = 0;
    double x2 = 0;

    public void Igual(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        if (n1 == n2) {
            System.out.println("Los numeros son iguales\n");
        } else {
            System.out.println("Los numeros son diferentes\n");
        }
    }

    public void Mayor(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;

        if (num1 > num2) {
            System.out.println("El numero 1 es mayor\n");
        } else {
            System.out.println("El numero 2 es mayor\n");
        }

    }

    public void Menor(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        if (num1 < num2) {
            System.out.println("El numero 1 es menor\n");
        } else {
            System.out.println("el numero 2 es menor\n");
        }

    }

    public void Multiplicacion(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        System.out.println("La multiplicacion de los 2 numeros es: " + num1 * num2+"\n");
    }

    public void Resta(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        System.out.println("La Resta de los 2 numeros es: " + (num1 - num2)+"\n");
    }

    public void Division(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        System.out.println("La Division de los 2 numeros es: " + (num1 / num2)+"\n");
    }

    public void Raiz(int n1) {
        this.num1 = n1;
        double x = Math.sqrt(n1);
        System.out.println("La raiz Cuadrada es: " + x+"\n");
    }

    public void FormulaCuadratica(int n1, int n2, int n3) {
        this.num1 = n1;
        this.num2 = n2;
        this.num3 = n3;
        x1 = (-num2 + Math.sqrt(num2 * num2 - 4 * num1 * num3) / 2 * num1);
        x2 = -num2 - Math.sqrt(num2 * num2 - 4 * num1 * num3) / 2 * num1;
        System.out.println("Resultado de la Formula Cuadratica x1 es: " + x1);
        System.out.println("Resultado de la Formula Cuadratica x2 es: " + x2+"\n");
    }

    public void Maximo(int a[]) {
        int mayor = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        System.out.println("El valor maximo es: " + mayor+"\n");
    }

    public void AND(boolean x, boolean y) {

        if (x && y == true) {
            System.out.println("Verdadero\n");
        } else {
            System.out.println("Falso\n");
        }
    }

    public void OR(boolean x, boolean y) {

        if (x || y == true) {
            System.out.println("verdadero\n");
        } else {
            System.out.println("Falso\n");
        }
    }

    public void NOT(boolean x) {
        
        if (x == true) {
            System.out.println("falso\n");
        } else {
            System.out.println("verdadero\n");
        }
    }
}
