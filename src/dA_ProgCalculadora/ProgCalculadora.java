package dA_ProgCalculadora;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgCalculadora {
    private double n1,n2,suma,resta,mult,div;
    public ProgCalculadora() {
    }
     public static void main(String[] args) {
        ProgCalculadora objProgCalculadora= new ProgCalculadora();
        objProgCalculadora.menu();
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
                case 2:procesarCalculadora();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        } while(opc!=3);
    }
    public void ingresarElementos() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingrese n1: ");
        n1= objScanner.nextInt();
        System.out.print("Ingrese n2: ");
        n2= objScanner.nextInt();
    }
    public void procesarCalculadora() {
        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
    }
    public void mostrarResultado() {
        //procesarCalculadora();//
        System.out.println("\nLa suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicacion es: " +mult);
        System.out.println("La division es: " +div+"\n");
    }
    public void salir() {
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
