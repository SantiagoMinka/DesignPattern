package org.unisabana.reports;

public class ReporteExcel extends Reporte {

	@Override
	public void formatearDatos() {
		System.out.println("Paso 4: Formatear Datos Excel");
	}

	@Override
	public void imprimirReporte() {
		System.out.println("Paso 5: Imprimir reporte Excel");
	}
}