package org.unisabana.reports;

import java.util.Scanner;

public class Demo {
	static Scanner entrada = new Scanner(System.in);
	static int tipoInforme;
	static String tipoFormato;

	public static void main(String[] args) {
		System.out.println("Aplicación para generación de Informes!!");
		System.out.print("Ingrese tipo de Informe: 1. Ventas 2. Proveedor");
		tipoInforme = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingrese nombre del Informe:");
		System.out.println("Ingrese tipo de formato: a.PDF b. Excel c.Html");
		tipoFormato = entrada.nextLine();
		switch (tipoInforme) {
		case 1:
			Informe informeVenta = new InformeVenta();
			System.out.println("Generando informe Ventas...");
			informeVenta.generarInforme(tipoFormato);
			break;
		case 2:
			Informe informeProveedor = new InformeProveedor();
			System.out.println("Generando informe Proveedor...");
			informeProveedor.generarInforme(tipoFormato);
			break;
		}
	}
}