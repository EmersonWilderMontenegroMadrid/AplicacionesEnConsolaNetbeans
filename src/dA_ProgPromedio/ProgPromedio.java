package dA_ProgPromedio;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgPromedio {
    private double a,b,c,promedio;
    public ProgPromedio() {
    }
    public static void main(String[] args) {
        ProgPromedio objProgPromedio= new ProgPromedio();
        objProgPromedio.menu();
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
                case 2:procesarPromedio();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        } while(opc!=3);
    }
    public void ingresarElementos() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        a= objScanner.nextInt();
        System.out.print("Ingrese b: ");
        b= objScanner.nextInt();
        System.out.print("Ingrese c: ");
        c= objScanner.nextInt();
    }
    public void procesarPromedio() {
        promedio = (a + b + c)/3;
    }
    public void mostrarResultado() {
        //procesarPromedio();//
        System.out.println("\nEl promedio es: " +promedio);
    }
    public void salir() {
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
