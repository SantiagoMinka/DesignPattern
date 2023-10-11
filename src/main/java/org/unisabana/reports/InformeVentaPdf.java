package org.unisabana.reports;

public class InformeVentaPdf extends Informe {

	@Override
	public void aplicarCalculos() {
		System.out.println("Paso 2: Aplicar cálculos para Informe de Ventas");
	}

	@Override
	public void formatearDatos() {
		System.out.println("Paso 3: Formatear resultados para generar PDF");

	}

	@Override
	public void imprimirInforme() {
		System.out.println("Paso 4: Imprimir informe de Ventas en formato PDF");
	}
}