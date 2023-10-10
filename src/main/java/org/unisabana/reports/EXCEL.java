package org.unisabana.reports;

public class EXCEL extends Informe {

	@Override
	public void formatearResultado() {
		System.out.println("Paso 3: Formatear resultados para generar EXCEL");

	}

	@Override
	public void generarDocumento() {
		System.out.println("Paso 4: Generar documento EXCEL");
	}
}