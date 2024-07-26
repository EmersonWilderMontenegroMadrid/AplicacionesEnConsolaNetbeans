package dA_ProgCalculo;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgCalculo {
    private double sueldoBruto, desc,sueldoNeto,tarifaHoraria;
    private int hTrabajadas;
    public ProgCalculo(){}
    public static void main(String[] args) {
        ProgCalculo objProgCalculo=new ProgCalculo();
        objProgCalculo.menu();
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
                case 2:procesarSueldoBruto();procesardesc();procesarSueldoNeto();mostrarResultado();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        }while(opc!=3);
    }
    public void ingresarElementos(){
        Scanner objScanner=new Scanner(System.in);
        System.out.print("Ingresar las horas trabajadas: ");
        hTrabajadas=objScanner.nextInt();
        System.out.print("Ingresar la tarifa horaria normal: ");
        tarifaHoraria=objScanner.nextInt();
    }
    public void procesarSueldoBruto(){
        if (hTrabajadas<=48){
            sueldoBruto=hTrabajadas*tarifaHoraria;
        }else{
            sueldoBruto=hTrabajadas*tarifaHoraria+(tarifaHoraria*0.15)*(hTrabajadas-48);
        }
    }
    public void procesardesc(){
        if(sueldoBruto>1700){
            desc=sueldoBruto*0.11;
        }else{
            desc=0;
        }
    }
    public void procesarSueldoNeto(){
        sueldoNeto=sueldoBruto-desc;
    }
    public void mostrarResultado(){
        System.out.println("El sueldo bruto es: "+sueldoBruto);
        System.out.println("El descuento es: "+desc);
        System.out.println("El sueldo neto es: "+sueldoNeto);
    }
    public void salir(){
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
