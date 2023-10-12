package org.unisabana.reports;

public class ReporteHTML extends Reporte {

	@Override
	public void formatearDatos() {
		System.out.println("Paso 4: Formatear Datos HTML");
	}

	@Override
	public void imprimirReporte() {
		System.out.println("Paso 5: Imprimir reporte HTML");
	}
}