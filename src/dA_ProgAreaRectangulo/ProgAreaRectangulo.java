package dA_ProgAreaRectangulo;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgAreaRectangulo {
    private double largo,ancho, area;
    public ProgAreaRectangulo() {
    }
    public static void main(String[] args) {
        ProgAreaRectangulo objProgAreaRectangulo= new ProgAreaRectangulo();
        objProgAreaRectangulo.menu();
    }
    public void menu() {
        int opc;
        do {
            System.out.println("********************");
            System.out.println(" MENU DE OPCIONES  ");
            System.out.println("********************");
            System.out.println(" (1) INGRESAR ELEMENTOS ");
            System.out.println(" (2) MOSTRAR RESULTADOS ");
            System.out.println(" (3) SALIR ");
            System.out.print(" ELEGIR UNA OPCION (1-3): ");
            Scanner objScanner = new Scanner(System.in);
            opc = objScanner.nextInt();
            switch (opc) {
                case 1:ingresarElementos();break;
                case 2:procesarArea();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION "+ opc +" NO EXISTE");
            }
        } while(opc!=3);
    }
    public void ingresarElementos() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingrese el largo: ");
        largo= objScanner.nextInt();
        System.out.print("Ingrese el ancho: ");
        ancho= objScanner.nextInt();
    }
    public void procesarArea() {
        area =ancho*largo;
    }
    public void mostrarResultado() {
        //procesarArea();//
        System.out.println("\nEl area es: " + area);
    }
    public void salir() {
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
