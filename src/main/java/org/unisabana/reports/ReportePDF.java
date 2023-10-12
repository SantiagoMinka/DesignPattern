package org.unisabana.reports;

public class ReportePDF extends Reporte {

	@Override
	public void formatearDatos() {
		System.out.println("Paso 4: Formatear Datos PDF");
	}

	@Override
	public void imprimirReporte() {
		System.out.println("Paso 5: Imprimir reporte PDF");
	}
}