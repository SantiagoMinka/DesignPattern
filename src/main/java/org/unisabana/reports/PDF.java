package org.unisabana.reports;

public class PDF extends Formato {

	@Override
	public void formatearResultado() {
		System.out.println("Paso 3: Formatear resultados para generar PDF");

	}

	@Override
	public void generarDocumento() {
		System.out.println("Paso 4: Generar documento PDF");
	}

}