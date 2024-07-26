package dA_ProgEmpresa;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgEmpresa {
    private double montTotalCompra,prestamo,plataQuePrestara,plataPropiaInvertir;
    public ProgEmpresa(){}
    public static void main(String[] args) {
        ProgEmpresa objpProgEmpresa=new ProgEmpresa();
        objpProgEmpresa.menu();
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
                case 2:procesarPrestamo();procesarInversion();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        }while(opc!=3);
    }
    public void ingresarElementos(){
        Scanner objScanner=new Scanner(System.in);
        System.out.print("Ingresar el monto total de compra: ");
        montTotalCompra=objScanner.nextInt();
    }
    public void procesarPrestamo(){
        if(montTotalCompra>=5000000){
            plataQuePrestara=montTotalCompra*0.30;
            Scanner objScanner=new Scanner(System.in);
            System.out.print("Ingresar prestamo: ");
            prestamo=objScanner.nextInt();
        }else{
            plataQuePrestara=montTotalCompra*0.20;
        }
    }
    public void procesarInversion(){
        plataPropiaInvertir=montTotalCompra-prestamo;
    }
    public void mostrarResultado(){
        System.out.println("El monto propio a invertir es : "+plataPropiaInvertir);
        System.out.println("El monto prestado al banco es : "+plataQuePrestara);
    }
    public void salir(){
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
