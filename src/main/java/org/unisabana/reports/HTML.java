package org.unisabana.reports;

public class HTML extends Formato {

	@Override
	public void formatearResultado() {
		System.out.println("Paso 3: Formatear resultados para generar HTML");

	}

	@Override
	public void generarDocumento() {
		System.out.println("Paso 4: Generar documento HTML");
	}

}