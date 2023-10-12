package org.unisabana.reports;

public abstract class Reporte {

	public final void generarReporte() {
		consultarBD();
		aplicarCalculos();
		formatearDatos();
		imprimirReporte();
	}

	void consultarBD() {
		System.out.println("Paso 1: Obtener datos de la BD");
	}

	void aplicarCalculos() {
		System.out.println("Paso 2: Aplicar Cálculos");
	}

	public abstract void formatearDatos();

	public abstract void imprimirReporte();
}