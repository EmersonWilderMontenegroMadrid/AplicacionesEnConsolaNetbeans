package dA_ProgPesos;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgPesos {
    private String cursos, resValidar;
    private int not1, not2, not3, pesopc1, pesopc2, pesopc3, promedio;
    public ProgPesos() {
    }
    public static void main(String[] args) {
        ProgPesos objProgPesos = new ProgPesos();
        objProgPesos.menu();
    }
    public void menu(){
        int opc;
        do{
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
                case 2:procesarPesos();procesarpromedio();procesarAprobado();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        }while(opc!=3);
    }
    public void ingresarElementos() {
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingresar el curso: ");
        cursos = objScanner.nextLine();
        System.out.print("Ingresar la nota de la pc 1: ");
        not1 = objScanner.nextInt();
        System.out.print("Ingresar la nota de la pc 2: ");
        not2 = objScanner.nextInt();
        System.out.print("Ingresar la nota de la pc 3: ");
        not3 = objScanner.nextInt();
    }
    public void procesarPesos() { 
        if (not1 == not1) {
            pesopc1 = 1;
        }
        if (not2 == not2) {
            pesopc2 = 2;
        }
        if (not3 == not3) {
            pesopc3 = 3;
        }
    }
    public void procesarpromedio(){
        promedio = (not1 + not2 + not3) / 3;
    }
    public void procesarAprobado(){
        if (promedio < 13) {
            resValidar = "Desaprobado";
        } else {
            resValidar = "Aprobado";
        }
    }
    public void mostrarResultado() {
        System.out.println("El peso de la pc 1 es: " + pesopc1);
        System.out.println("El peso de la pc 2 es: " + pesopc2);
        System.out.println("El peso de la pc 3 es: " + pesopc3);
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("El alumno esta: " + resValidar);
    }
    public void salir() {
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
