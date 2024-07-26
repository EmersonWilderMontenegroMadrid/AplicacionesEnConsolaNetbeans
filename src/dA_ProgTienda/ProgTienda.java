package dA_ProgTienda;
import java.util.Scanner;
/**
 * @Montenegro Madrid Emerson
 */
public class ProgTienda {
    private int cantdocenas,cantlapi;
    private double desc=0,obsequio,montoCompra,preciounit,montoPago;
    public ProgTienda(){}
    public static void main(String[] args) {
        ProgTienda objProgTienda=new ProgTienda();
        objProgTienda.menu();
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
                case 2:procesarCompra();procesarObsequio();procesarDes();procesarPago();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        }while(opc!=3);
    }
    public void ingresarElementos(){
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Ingresar el numero de docenas: ");
        cantdocenas=objScanner.nextInt();
        System.out.print("Ingresar el precio de cada producto: ");
       preciounit=objScanner.nextInt();
    }
    public void procesarDes(){
        if(cantdocenas==6){
            desc=0.15;
        }else{
            desc=0.10;
        }
    }
    public void procesarObsequio(){
        if(cantdocenas>=30){
            obsequio=2*(cantdocenas/3);
        }else{
            obsequio=0;
        }
    }
    public void procesarCompra(){
        montoCompra=cantdocenas*preciounit;
    }
    
    public void procesarPago(){
        montoPago=montoCompra-desc;
    }
    public void mostrarResultado(){
        System.out.println("El monto de compra es: "+montoCompra);
        System.out.println("El monto de descuento es: "+desc);
        System.out.println("El monto de pago es: "+montoPago);
        System.out.println("El monto de obsequios es: "+obsequio);
    }
    public void salir(){
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
