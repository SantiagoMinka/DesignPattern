package org.unisabana.reports;

import java.util.Scanner;

public class Demo {
	static Scanner entrada = new Scanner(System.in);
	static int tipoInforme;

	public static void main(String[] args) {
		System.out.println("Aplicación para generación de Informes!!");
		System.out.print(
				"Ingrese tipo de Informe: 1. Ventas PDF 2. Ventas EXCEL 3. Ventas HTML 4. Proveedor PDF 5. Proveedor EXCEL 6. Proveedor HTML");
		tipoInforme = entrada.nextInt();
		entrada.nextLine();
		switch (tipoInforme) {
		case 1:
			Informe informeVentaPdf = new InformeVentaPdf();
			System.out.println("Generando informe Ventas PDF...");
			informeVentaPdf.generarInforme();
			break;
		case 2:
			Informe informeVentaExcel = new InformeVentaExcel();
			System.out.println("Generando informe Ventas EXCEL...");
			informeVentaExcel.generarInforme();
			break;
		case 3:
			Informe informeVentaHtml = new InformeVentaHtml();
			System.out.println("Generando informe Ventas HTML...");
			informeVentaHtml.generarInforme();
			break;
		case 4:
			Informe informeProveedorPdf = new InformeProveedorPdf();
			System.out.println("Generando informe Proveedor PDF...");
			informeProveedorPdf.generarInforme();
			break;
		case 5:
			Informe informeProveedorExcel = new InformeProveedorExcel();
			System.out.println("Generando informe Proveedor EXCEL...");
			informeProveedorExcel.generarInforme();
			break;
		case 6:
			Informe informeProveedorHtml = new InformeProveedorHtml();
			System.out.println("Generando informe Ventas HTML...");
			informeProveedorHtml.generarInforme();
			break;
		}
	}
}