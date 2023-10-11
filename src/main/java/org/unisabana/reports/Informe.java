package org.unisabana.reports;

public abstract class Informe {

	public final void generarInforme() {
		consultarBD();
		aplicarCalculos();
		formatearDatos();
		imprimirInforme();
	}

	private void consultarBD() {
		System.out.println("Paso 1: Obtener datos de la BD");
	}

	public abstract void aplicarCalculos();

	public abstract void formatearDatos();

	public abstract void imprimirInforme();
}