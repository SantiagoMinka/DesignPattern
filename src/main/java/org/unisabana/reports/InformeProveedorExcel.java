package org.unisabana.reports;

public class InformeProveedorExcel extends Informe {

	@Override
	public void aplicarCalculos() {
		System.out.println("Paso 2: Aplicar cálculos para informe de Proveedores");
	}

	@Override
	public void formatearDatos() {
		System.out.println("Paso 3: Formatear resultados para generar EXCEL");

	}

	@Override
	public void imprimirInforme() {
		System.out.println("Paso 4: Imprimir informe de Proveedores en formato EXCEL");
	}
}