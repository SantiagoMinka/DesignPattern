package org.unisabana.reports;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***** Generar PDF *****");
		Informe pdf = new PDF();
		pdf.generarInforme();
		System.out.println("***** Generar EXCEL *****");
		Informe excel = new EXCEL();
		excel.generarInforme();
		System.out.println("***** Generar HTML *****");
		Informe html = new HTML();
		html.generarInforme();
	}
}