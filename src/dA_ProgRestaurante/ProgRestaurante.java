package dA_ProgRestaurante;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgRestaurante {
    private String nombrePlatoEntrada,nombrePlatoFondo,nombrePlatoPostre;
    private int cantPlatosEntrada1,cantPlatosEntrada2,cantPlatosEntrada3,cantPlatosFondo4;
    private int cantPlatosFondo5,cantPlatosFondo6,cantPlatosPostre7,cantPlatosPostre8,cantPlatosPostre9;
    private int cantPlatosFondo,cantPlatosPostre;
    private double precioPlato1,precioPlato2,precioPlato3,precioPlato4,precioPlato5;
    private double precioPlato6,precioPlato7,precioPlato8,precioPlato9;
    private double precioTotal1,precioTotal2,precioTotal3;
    private double precioTotal4,precioTotal5,precioTotal6;
    private double precioTotal7,precioTotal8,precioTotal9;
    private double precioGeneral;
    public ProgRestaurante(){}
    public static void main(String[] args) {
        ProgRestaurante objProgRestaurante=new ProgRestaurante();
        objProgRestaurante.menu();
    }
    public void menu(){
    int opc;
        do{
           System.out.println("********************");
            System.out.println(" MENU DE OPCIONES  ");
            System.out.println("********************");
            System.out.println(" (1) INGRESAR ELEMENTOS ");
            System.out.println(" (2) IMPRIMIR BOLETA ");
            System.out.println(" (3) SALIR ");
            System.out.print(" ELEGIR UNA OPCION (1-3): ");
            Scanner objScanner = new Scanner(System.in);
            opc = objScanner.nextInt();
            switch (opc) {
                case 1:ingresarElementos();break;
                case 2:procesarprecioPlato();procesarprecioTotal();imprimirBoleta();break;
                case 3:salir();break;
                default:System.out.print("LA OPCION" + opc + "NO EXISTE");
            }
        }while(opc!=3);
    }
    public void ingresarElementos(){
        Scanner objScanner=new Scanner(System.in);
        System.out.print("Ingresar el nombre del plato de entrada(tequeños,ceviche,torta de choclo): ");
        nombrePlatoEntrada=objScanner.nextLine();
        System.out.print("Ingresar el nombre del plato de fondo(arroz con pato,aji de gallina,cabrito): ");
        nombrePlatoFondo=objScanner.nextLine();
        System.out.print("Ingresar el nombre del postre(helado de lucuma,gelatina,mazamorra): ");
        nombrePlatoPostre=objScanner.nextLine();
        System.out.print("Ingresar la cantidad de tequenos: ");
        cantPlatosEntrada1=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de ceviche: ");
        cantPlatosEntrada2=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de torta de choclo: ");
        cantPlatosEntrada3=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de arroz con pato: ");
        cantPlatosFondo4=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de aji de galiina: ");
        cantPlatosFondo5=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de cabrito: ");
        cantPlatosFondo6=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de helado de lucuma: ");
        cantPlatosPostre7=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de gelatina: ");
        cantPlatosPostre8=objScanner.nextInt();
        System.out.print("Ingresar la cantidad de mazamorra: ");
        cantPlatosPostre9=objScanner.nextInt();
    }
    public void procesarprecioPlato(){
        switch (nombrePlatoEntrada) {
            case "tequenos":
                precioPlato1=2;break;
            case "ceviche":
                precioPlato2=3.50;break;
            case "torta de choclo":
                precioPlato3=2.50;break;
            default:
                System.out.print("El nombre de plato de entrada no es valido");break;
        }
        switch (nombrePlatoFondo) {
            case "arroz con pato":
                precioPlato4=35;break;
            case "aji de gallina":
                precioPlato5=25.50;break;
            case "cabrito":
                precioPlato6=28;break;
            default:
                System.out.print("El nombre de plato de fondo no es valido");break;
        }
        switch (nombrePlatoPostre) {
            case "helado de lucuma":
                precioPlato7=7;break;
            case "gelatina":
                precioPlato8=2;break;
            case "mazamorra":
                precioPlato9=4.50;break;
            default:
                System.out.print("El nombre de plato de fondo no es valido");break;
        }    
    }
    public void procesarprecioTotal(){
        precioTotal1=(precioPlato1*cantPlatosEntrada1);
        precioTotal2=(precioPlato2*cantPlatosEntrada2);
        precioTotal3=(precioPlato3*cantPlatosEntrada3);
        precioTotal4=(precioPlato4*cantPlatosFondo4);
        precioTotal5=(precioPlato5*cantPlatosFondo5);
        precioTotal6=(precioPlato6*cantPlatosFondo6);
        precioTotal7=(precioPlato7*cantPlatosPostre7);
        precioTotal8=(precioPlato8*cantPlatosPostre8);
        precioTotal9=(precioPlato9*cantPlatosPostre9);
        precioGeneral=(precioTotal1+precioTotal2+precioTotal3+precioTotal4+precioTotal5+precioTotal6+precioTotal7+precioTotal8+precioTotal9);
    }
    public void imprimirBoleta(){
        System.out.println("Nombre plato de entrada: "+nombrePlatoEntrada);
        System.out.println("Nombre plato de fondo: "+nombrePlatoFondo);
        System.out.println("Nombre plato de postre: "+nombrePlatoPostre);
        System.out.println("Precio unitario plato 1: "+precioPlato1);
        System.out.println("Precio Unitario plato 2: "+precioPlato2);
        System.out.println("Precio unitario plato 3: "+precioPlato3);
        System.out.println("Precio unitario plato 4: "+precioPlato4);
        System.out.println("Precio Unitario plato 5: "+precioPlato5);
        System.out.println("Precio unitario plato 6: "+precioPlato6);
        System.out.println("Precio unitario plato 7: "+precioPlato7);
        System.out.println("Precio Unitario plato 8: "+precioPlato8);
        System.out.println("Precio unitario plato 9: "+precioPlato9);
        System.out.println("Monto a pagar: "+precioGeneral);
    }
    public void salir(){
        System.out.print(" GRACIAS ");
        System.exit(0);
    }
}
