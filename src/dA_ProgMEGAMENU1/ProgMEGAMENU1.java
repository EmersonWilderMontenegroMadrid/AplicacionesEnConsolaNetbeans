package dA_ProgMEGAMENU1;
import java.util.Scanner;
/**
 *
 * @Montenegro Madrid Emerson
 */
public class ProgMEGAMENU1 {
    //1
    private double largo,ancho,areaRectangulo;
    //2
    private double radio,areaCirculo;
    //3
    private double perimetroCirculo;
    //4
    private double n1,n2,suma,resta,mult,div;
    //5
    private double n,cuadrado;
    //6
    private double cubo;
    //7
    private double a,b,c,promedio;
    //8
    private int pre, edad;
    private double desc=0, tpagar;
    //9
    private int edaddelapersona1;
    private int edaddelapersona2;
    private int edaddelapersona3;
    private int montoarepartir;
    private int sumatotaldeedades;
    private double montodelapersona1;
    private double montodelapersona2;
    private double montodelapersona3;
    //10
    private int aprobados=0,reprobados=0,f,nota;
    //11
    private int suma11,f11,valor11,promedio11;
    //12
    private int num;
    private String resDia;
    //13
    private int sexo;
    private String Categoria;
    //14
    private int donacion;
    private double centrodesalud;
    private double comedorinfantil;
    private double escuelainfantil;
    private double asilodeancianos;
    //15
    private String nombre, apellido;
    private String nomMayus, apeMinus, resGenero, resEdad;
    private int longitud;
    private double notaParcial, notaFinal;
    private char genero;
    //16
    private String planetas;
    private double velocidad;
    //17
    private int cantidad,totalapagar,precio;
    private String talla;
    //18
    private String tipo;
    private double preciototal,respreciounitario;
    public ProgMEGAMENU1() {}
    public static void main(String[] args) {
        ProgMEGAMENU1 objProgMEGAMENU1 = new ProgMEGAMENU1();
        objProgMEGAMENU1.menu();
    }
    public void menu() {
        int opc;
        do {
            System.out.println("*********************");
            System.out.println("     MENU GENERAL    ");
            System.out.println("*********************");
            System.out.println(" (1) AREA RECTANGULO ");
            System.out.println(" (2) AREA CIRCULO    ");
            System.out.println(" (3) PERIMETRO CIRCULO ");
            System.out.println(" (4) CALCULADORA  ");
            System.out.println(" (5) CUADRADO DE N NUMEROS  ");
            System.out.println(" (6) CUBO DE N NUMEROS  ");
            System.out.println(" (7) PROMEDIO DE 3 NOTAS  ");
            System.out.println(" (8) PAGO ENTRADAS   ");
            System.out.println(" (9) REPARTIR    ");
            System.out.println(" (10) APROBADOS Y DESAPROBADOS  ");
            System.out.println(" (11) PROMEDIO DE 10 NOTAS ");
            System.out.println(" (12) DIA DE LA SEMANA ");
            System.out.println(" (13) CATEGORIA ");
            System.out.println(" (14) REPARTO ");
            System.out.println(" (15) REPORTE ");
            System.out.println(" (16) VELOCIDADES ");
            System.out.println(" (17) COMPRAR PANTALONES ");
            System.out.println(" (18) HELADERIA ");
            System.out.println(" (19) SALIR ");
            System.out.print(" BIENVENIDO ELIGE UN PROGRAMA (1-18): ");
            Scanner objScanner = new Scanner(System.in);
            opc = objScanner.nextInt();
            switch (opc) {
                case 1:
                    int opc1;
                    do{
                        System.out.println("************************");
                        System.out.println("    MENU RECTANGULO     ");
                        System.out.println("************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR       ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc1 = objScanner.nextInt();
                        if (opc1==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese el largo: ");
                            largo = teclado.nextInt();
                            System.out.print("Ingrese el ancho: ");
                            ancho = teclado.nextInt();
                            areaRectangulo = ancho * largo;
                        }else if(opc1==2){
                            System.out.println("\nEl area del rectangulo es: "+areaRectangulo+"\n");
                        }else if (opc1==3) {
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else {
                            System.out.println("LA OPCION "+opc1+" NO EXISTE");
                        }
                    }while(opc1!=3);
                case 2:
                    int opc2;
                    do{
                        System.out.println("*************************");
                        System.out.println("    MENU AREA CIRCULO    ");
                        System.out.println("*************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS  ");
                        System.out.println(" (2) MOSTRAR RESULTADOS  ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc2 = objScanner.nextInt();
                        if (opc2==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese el radio: ");
                            radio = teclado.nextInt();
                            areaCirculo = Math.PI * Math.pow(radio, 2);
                        }else if(opc2==2){
                            System.out.println("\nEl area del circulo es: "+areaCirculo+"\n");
                        }else if (opc2==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc2+" NO EXISTE");
                        }
                    }while(opc2!=3);
                case 3:
                    int opc3;
                    do{
                        System.out.println("******************************");
                        System.out.println("    MENU PERIMETRO CIRCULO    ");
                        System.out.println("******************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc3 = objScanner.nextInt();
                        if (opc3==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese el radio: ");
                            radio = teclado.nextInt();
                            perimetroCirculo = 2 * Math.PI * radio;
                        }else if(opc3==2){
                            System.out.println("\nEl perimetro es: " +perimetroCirculo+"\n");
                        }else if (opc3==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc3+" NO EXISTE");
                        }
                    }while(opc3!=3);
                case 4:
                    int opc4;
                    do{
                        System.out.println("************************");
                        System.out.println("    MENU CALCULADORA    ");
                        System.out.println("************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc4 = objScanner.nextInt();
                        if (opc4==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese n1: ");
                            n1= teclado.nextInt();
                            System.out.print("Ingrese n2: ");
                            n2= teclado.nextInt();
                            suma = n1 + n2;
                            resta = n1 - n2;
                            mult = n1 * n2;
                            div = n1 / n2;
                        }else if(opc4==2){
                            System.out.println("\nLa suma es: " +suma);
                            System.out.println("La resta es: " +resta);
                            System.out.println("La multiplicacion es: " +mult);
                            System.out.println("La division es: " +div+"\n");
                        }else if (opc4==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc4+" NO EXISTE");
                        }
                    }while(opc4!=3);
                case 5:
                    int opc5;
                    do{
                        System.out.println("**********************************");
                        System.out.println("    MENU CUADRADO DE N NUMEROS    ");
                        System.out.println("**********************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc5 = objScanner.nextInt();
                        if (opc5==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese n: ");
                            n= teclado.nextInt();
                            cuadrado=(n*(n+1)*(2*n+1))/6;
                        }else if(opc5==2){
                            System.out.println("\nSuma de los cuadrados de los primeros números es: " +cuadrado+"\n");
                        }else if (opc5==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc5+" NO EXISTE");
                        }
                    }while(opc5!=3);
                case 6:
                    int opc6;
                    do{
                        System.out.println("******************************");
                        System.out.println("    MENU CUBO DE N NUMEROS    ");
                        System.out.println("******************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc6 = objScanner.nextInt();
                        if (opc6==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese n: ");
                            n= teclado.nextInt();
                            cubo=(n*n*(n+1)*(n+1))/4;
                        }else if(opc6==2){
                            System.out.println("\nSuma de los cubos de los primeros números es: " +cubo+"\n");
                        }else if (opc6==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc6+" NO EXISTE");
                        }
                    }while(opc6!=3);
                case 7:
                    int opc7;
                    do{
                        System.out.println("************************");
                        System.out.println("      MENU PROMEDIO     ");
                        System.out.println("************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc7 = objScanner.nextInt();
                        if (opc7==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese a: ");
                            a= teclado.nextInt();
                            System.out.print("Ingrese b: ");
                            b= teclado.nextInt();
                            System.out.print("Ingrese c: ");
                            c= teclado.nextInt();
                            promedio = (a + b + c)/3;
                        }else if(opc7==2){
                            System.out.println("\nEl promedio es: " +promedio+"\n");
                        }else if (opc7==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc7+" NO EXISTE");
                        }
                    }while(opc7!=3);
                case 8:
                    int opc8;
                    do{
                        System.out.println("**************************");
                        System.out.println("    MENU PAGO ENTRADAS    ");
                        System.out.println("**************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc8 = objScanner.nextInt();
                        if (opc8==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("INGRESE EL PRECIO DEL BOLETO:");
                            pre=teclado.nextInt();
                            System.out.print("INGRESE LA EDAD DEL NIÑO:");
                            edad=teclado.nextInt();
                            if (edad<10){
                               desc=0.25*pre; 
                            }  
                            tpagar=pre-desc ;
                        }else if(opc8==2){
                            System.out.println("\nEl total a pagar es: "+tpagar+"\n");
                        }else if (opc8==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc8+" NO EXISTE");
                        }
                    }while(opc8!=3);
                case 9:
                    int opc9;
                    do{
                        System.out.println("********************");
                        System.out.println("    MENU REPARTIR   ");
                        System.out.println("********************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc9 = objScanner.nextInt();
                        if (opc9==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("INGRESA edad de la persona 1: ");
                            edaddelapersona1=teclado.nextInt();
                            System.out.print("INGRESA edad de la persona 2: ");
                            edaddelapersona2=teclado.nextInt();
                            System.out.print("INGRESA edad de la persona 3: ");
                            edaddelapersona3=teclado.nextInt();
                            System.out.print("INGRESA monto a repartir: ");
                            montoarepartir=teclado.nextInt();
                            sumatotaldeedades=edaddelapersona1+edaddelapersona2+edaddelapersona3;
                            montodelapersona1=(edaddelapersona1*montoarepartir )/sumatotaldeedades;
                            montodelapersona2=(edaddelapersona2*montoarepartir )/sumatotaldeedades;
                            montodelapersona3=(edaddelapersona3*montoarepartir )/sumatotaldeedades;
                        }else if(opc9==2){
                            System.out.println("\nEl monto de la persona 1 es: " +montodelapersona1);
                            System.out.println("El monto de la persona 2 es: " +montodelapersona2);
                            System.out.println("El monto de la persona 3 es: " +montodelapersona3+"\n");
                        }else if (opc9==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc9+" NO EXISTE");
                        }
                    }while(opc9!=3);
                case 10:
                    int opc10;
                    do{
                        System.out.println("**************************");
                        System.out.println("    MENU APROBADOS Y DESAPROBADOS   ");
                        System.out.println("**************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc10 = objScanner.nextInt();
                        if (opc10==1){
                            Scanner teclado=new Scanner(System.in);
                            for(f=1;f<=10;f++){
                                System.out.print("Ingrese la nota del estudiante: ");
                                nota=teclado.nextInt();
                                if (nota>=7){
                                    aprobados++;
                                }else{
                                    reprobados++;
                                }
                            }
                        }else if(opc10==2){
                            System.out.println("\nEl numero de aprobados es: "+aprobados);
                            System.out.println("El numero de reprobados es: "+reprobados+"\n");
                        }else if (opc10==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc10+" NO EXISTE");
                        }
                    }while(opc10!=3);
                case 11:
                    int opc11;
                    do{
                        System.out.println("**************************");
                        System.out.println("    MENU PROMEDIO DE 10 NOTAS   ");
                        System.out.println("**************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc11 = objScanner.nextInt();
                        if (opc11==1){
                            Scanner teclado=new Scanner(System.in);
                            suma11=0;
                            for(f11=1;f11<=10;f11++){
                                System.out.print("Ingrese el valor: ");
                                valor11=teclado.nextInt();
                                suma11=suma11+valor11;
                            }
                            promedio11=suma11/10;
                        }else if(opc11==2){
                            System.out.println("\nLa suma es: "+suma11);
                            System.out.println("El promedio es: "+promedio11+"\n");
                        }else if (opc11==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc11+" NO EXISTE");
                        }
                    }while(opc11!=3);
                case 12:
                    int opc12;
                    do{
                        System.out.println("**************************");
                        System.out.println("    MENU DIA DE LA SEMANA  ");
                        System.out.println("**************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc12 = objScanner.nextInt();
                        if (opc12==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingrese el numero del dia: ");
                            num=teclado.nextInt();
                            switch(num){
                                case 1:resDia="lunes";break;
                                case 2:resDia="martes";break;
                                case 3:resDia="miercoles";break;
                                case 4:resDia="jueves";break;
                                case 5:resDia="viernes";break;
                                case 6:resDia="sabado";break;
                                case 7:resDia="domingo";break;
                                default:resDia="EL NUMERO NO PERTENECE, RESPETAR RANGO(1,7)";
                            }
                        }else if(opc12==2){
                            System.out.println("\nEl dia de la semana es: "+resDia+"\n");
                        }else if (opc12==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc12+" NO EXISTE");
                        }
                    }while(opc12!=3);
                case 13:
                    int opc13;
                    do{
                        System.out.println("*******************");
                        System.out.println("  MENU CATEGORIA   ");
                        System.out.println("*******************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc13 = objScanner.nextInt();
                        if (opc13==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("\nIngrese su sexo(f=0, m=1): ");
                            sexo=teclado.nextInt();
                            System.out.print("Ingrese su edad: ");
                            edad=teclado.nextInt();
                            if (sexo==0){
                                if(edad<23){
                                    Categoria="FA";
                                }else
                                    Categoria="FB";
                            }else{
                                if(edad<25){
                                    Categoria="MA";
                                }else
                                    Categoria="MB";
                            }
                        }else if(opc13==2){
                            System.out.println("\nLa categoria es: "+Categoria+"\n");
                        }else if (opc13==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc13+" NO EXISTE");
                        }
                    }while(opc13!=3);
                case 14:
                    int opc14;
                    do{
                        System.out.println("*****************");
                        System.out.println("  MENU REPARTO   ");
                        System.out.println("*****************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc14 = objScanner.nextInt();
                        if (opc14==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("\nIngrese el monto que donara: ");
                            donacion=teclado.nextInt();
                            centrodesalud=donacion*100*0.25;
                            comedorinfantil=donacion*100*0.35;
                            escuelainfantil=donacion*100*0.25;
                            asilodeancianos=donacion*100*0.15;
                        }else if(opc14==2){
                            System.out.println("\nEl monto para el centro de salud es: " +centrodesalud+"\n");
                            System.out.println("\nEl monto para el comedor infantil es: " +comedorinfantil+"\n");
                            System.out.println("\nEl monto para la escuela infantil es : " +escuelainfantil+"\n");
                            System.out.println("\nEl monto para el asilo de ancianos es: " +asilodeancianos+"\n");
                        }else if (opc14==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS POR SU DONACION ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc14+" NO EXISTE");
                        }
                    }while(opc14!=3);break;
                case 15:
                    int opc15;
                    do{
                        System.out.println("*****************");
                        System.out.println("  MENU REPORTE  ");
                        System.out.println("*****************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc15 = objScanner.nextInt();
                        if (opc15==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingresar el nombre: ");
                            nombre = teclado.nextLine();
                            System.out.print("Ingresar los apellidos: ");
                            apellido = teclado.nextLine();
                            System.out.print("Ingresar genero(M:masculino, F:femenino): ");
                            genero = teclado.nextLine().charAt(0);
                            System.out.print("Ingresar edad: ");
                            edad = teclado.nextInt();
                            System.out.print("Ingresar nota parcial: ");
                            notaParcial = teclado.nextInt();
                            System.out.print("Ingresar nota final: ");
                            notaFinal = teclado.nextInt();
                            longitud = nombre.length();
                            nomMayus = nombre.toUpperCase();
                            apeMinus = apellido.toLowerCase();
                            promedio = (notaParcial + notaFinal) / 2;
                            if (edad >= 18) {
                                resEdad = "Es mayor de edad";
                            } else {
                                resEdad = "Es menor de edad";
                            }
                            if (genero=='M'){
                                resGenero= "Es genero masculino";
                            }else{
                                resGenero = "Es genero femenino";
                            }
                        }else if(opc15==2){
                            System.out.println("\n--------------------");
                            System.out.println("Nombre: " + nomMayus);
                            System.out.println("Apellidos: " + apeMinus);
                            System.out.println("Longitud del nombre: " + longitud);
                            System.out.println("Promedio: " + promedio);
                            System.out.println("Genero: " + resGenero);
                            System.out.println("Edad: " + resEdad+"\n");
                        }else if (opc15==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc15+" NO EXISTE");
                        }
                    }while(opc15!=3);break;
                case 16:
                    int opc16;
                    do{
                        System.out.println("*****************");
                        System.out.println("  MENU VELOCIDADES   ");
                        System.out.println("*****************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc16 = objScanner.nextInt();
                        if (opc16==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingresar el nombre(MERCURIO,VENUS,TIERRA,MARTE,JUPITER,SATURNO,URANO,NEPTUNO,PLUTON,LUNA): ");
                            planetas=teclado.nextLine();
                            switch(planetas){
                                case"MERCURIO":velocidad=4.2;break;
                                case"VENUS":velocidad=10.3;break;
                                case"TIERRA":velocidad=11.2;break;
                                case"MARTE":velocidad=5.0;break;
                                case"JUPITER":velocidad=61.0;break;
                                case"SATURNO":velocidad=36.0;break;
                                case"URANO":velocidad=22.0;break;
                                case"NEPTUNO":velocidad=24.0;break;
                                case"PLUTON":velocidad=5.3;break;
                                case"LUNA":velocidad=2.4;break;
                            }
                        }else if(opc16==2){
                            System.out.println("\nLa velocidad es : "+velocidad+"\n");
                        }else if (opc16==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc16+" NO EXISTE");
                        }
                    }while(opc16!=3);break;
                case 17:
                    int opc17;
                    do{
                        System.out.println("***************************");
                        System.out.println("  MENU COMPRAR PANTALONES  ");
                        System.out.println("***************************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc17 = objScanner.nextInt();
                        if (opc17==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("\nIngresar la talla(Small, Medium, Large): ");
                            talla=teclado.nextLine();
                            System.out.print("Ingresar la cantidad de pantalones: ");
                            cantidad=teclado.nextInt();objScanner.nextLine();
                            switch (talla) {
                                case "Small":precio=50;break;
                                case "Medium":precio=60;break;
                                default:precio=70;break;
                            }  
                            totalapagar=precio*cantidad;
                        }else if(opc17==2){
                            System.out.println("\nEl pago total es: "+totalapagar+"\n");
                        }else if (opc17==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc17+" NO EXISTE");
                        }
                    }while(opc17!=3);break;
                case 18:
                    int opc18;
                    do{
                        System.out.println("******************");
                        System.out.println("  MENU HELADERIA  ");
                        System.out.println("******************");
                        System.out.println(" (1) INGRESAR ELEMENTOS ");
                        System.out.println(" (2) MOSTRAR RESULTADOS ");
                        System.out.println(" (3) SALIR ");
                        System.out.print(" ELEGIR UNA OPCION (1-3): ");
                        opc18 = objScanner.nextInt();
                        if (opc18==1){
                            Scanner teclado=new Scanner(System.in);
                            System.out.print("Ingresar el tipo de helado(SOL,FRESA,MAR,RICO): ");
                            tipo = teclado.nextLine();
                            System.out.print("Ingresar la cantidad de helados: ");
                            cantidad= teclado.nextInt();
                            switch (tipo) {
                                case"SOL":respreciounitario=1.5;break;
                                case"FRESA":respreciounitario=2;break;
                                case"MAR":respreciounitario=1.7;break;
                                case"RICO":respreciounitario=2.5;break;
                                default:respreciounitario=1;
                            }
                            preciototal=respreciounitario*cantidad;
                        }else if(opc18==2){
                             System.out.print("El total a pagar es: "+preciototal+"\n");
                        }else if (opc18==3){
                            System.out.println("PROGRAMA TERMINADO");
                            System.out.println(" GRACIAS ");
                            System.exit(0);
                        }else{
                            System.out.println("LA OPCION "+opc18+" NO EXISTE");
                        }
                    }while(opc18!=3);break;
                case 19:
                    System.out.println("\n Gracias");break;
                default:
                    System.out.println("\nLA OPCION "+opc+" NO EXISTE\n");
            }
        } while (opc!= 19);
    }
}