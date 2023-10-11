import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   static Scanner entrada = new Scanner(System.in);
   static int tipoInforme;
   static String nombreInforme;
   static String tipoFormato;
   public static void main(String[] args) {
        System.out.println("Aplicación para generación de Informes!!");
        System.out.print("Ingrese tipo de Informe: 1. Ventas 2. Proveedor");
        tipoInforme=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese nombre del Informe:");
        nombreInforme= entrada.nextLine();
        System.out.println("Ingrese tipo de formato: a.PDF b. Excel c.Html");
        tipoFormato=entrada.nextLine();
        switch (tipoInforme){
        case 1:
            Informe informeVenta = new InformeVenta();
            System.out.println("Generando informe Ventas...");
            informeVenta.generarInforme(nombreInforme,tipoFormato);
        break;
        case 2:
            Informe informeProveedor = new InformeProveedor();
            System.out.println("Generando informe Proveedor...");
            informeProveedor.generarInforme(nombreInforme,tipoFormato);
        break;
        }
    }
}