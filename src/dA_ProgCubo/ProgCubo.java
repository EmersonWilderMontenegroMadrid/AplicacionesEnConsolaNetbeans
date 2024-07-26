package dA_ProgCubo;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgCubo {
    private double n,cubo;
    public ProgCubo() {
    }
    public static void main(String[] args) {
        ProgCubo objProgCubo= new ProgCubo();
        objProgCubo.menu();
    }
    public void menu() {
        int opc;
        do {
            System.out.println("********************");
            System.out.println(" MENU DE OPCOIONES  ");
            System.out.println("********************");
            System.out.println(" (1) INGRESAR ELEMENTOS ");
            System.out.println(" (2) MOSTRAR RESULTADOS ");
            System.out.println(" (3) SALIR ");
            System.out.print(" ELEGIR UNA OPCION (1-3): ");
            Scanner objScanner = new Scanner(System.in);
            opc = objScanner.nextInt();
            switch (opc) {
                case 1:ingresarElementos();break;
                case 2:procesarCuadrado();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        } while(opc!=3);
    }
    public void ingresarElementos() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        n= objScanner.nextInt();
    }
    public void procesarCuadrado() {
        cubo=(n*n*(n+1)*(n+1))/4;
    }
    public void mostrarResultado() {
         //procesarCubo();//
        System.out.println("\nSuma de los cubos de los primeros números es: " +cubo);
    }
    public void salir() {
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
