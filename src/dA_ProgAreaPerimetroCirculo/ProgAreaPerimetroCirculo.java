package dA_ProgAreaPerimetroCirculo;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgAreaPerimetroCirculo {
    private double radio, area, perimetro;
    public ProgAreaPerimetroCirculo() {
    }
    public static void main(String[] args) {
        ProgAreaPerimetroCirculo objProgTerreno = new ProgAreaPerimetroCirculo();
        objProgTerreno.menu();
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
                case 2:procesarArea();procesarPerimetro();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        } while(opc!=3);
    }
    public void ingresarElementos() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio = objScanner.nextInt();
    }
    public void procesarArea() {
        area = Math.PI * Math.pow(radio, 2);
    }
    public void procesarPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
    public void mostrarResultado() {
        //procesarArea();
        //procesarPerimetro();
        System.out.println("\nEl area es: " + area);
        System.out.println("El perimetro es: " + perimetro+"\n");
    }
    public void salir() {
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
