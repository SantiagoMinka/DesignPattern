package org.unisabana.reports;

public abstract class Informe {

	final void generarInforme() {
		consultarBD();
		aplicarCalculo();
		formatearResultado();
		generarDocumento();
	}

	void consultarBD() {
		System.out.println("Paso 1: Conexión a la base de datos");
	}

	void aplicarCalculo() {
		System.out.println("Paso 2: Aplicar cálculos");
	}

	public abstract void formatearResultado();

	public abstract void generarDocumento();

}