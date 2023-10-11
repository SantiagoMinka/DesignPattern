package org.unisabana.reports;

public abstract class Informe {

	public final void generarInforme(String tipoFormato) {
		consultarBD();
		aplicarCalculo();
		imprimirInforme(tipoFormato);
	}

	private void consultarBD() {
		System.out.println("Paso 1: Obtener datos de BD");
	}

	public abstract void aplicarCalculo();

	private void imprimirInforme(String tipoFormato) {

	}
}