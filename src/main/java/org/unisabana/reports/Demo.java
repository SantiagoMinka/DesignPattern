package org.unisabana.reports;

import java.util.Scanner;

public class Demo {
	static Scanner entrada = new Scanner(System.in);
	static int tipoInforme;

	public static void main(String[] args) {
		System.out.println("Aplicación para generación de Informes!!");
		System.out.print("Ingrese tipo de Informe: 1. PDF  2. EXCEL  3. HTML ");
		tipoInforme = entrada.nextInt();
		entrada.nextLine();
		switch (tipoInforme) {
		case 1:
			Reporte reportePdf = new ReportePDF();
			System.out.println("Generando reporte PDF...");
			reportePdf.generarReporte();
			break;
		case 2:
			Reporte reporteExcel = new ReporteExcel();
			System.out.println("Generando reporte EXCEL...");
			reporteExcel.generarReporte();
			break;
		case 3:
			Reporte reporteHtml = new ReporteHTML();
			System.out.println("Generando reporte HTML...");
			reporteHtml.generarReporte();
			break;
		}
	}
}