package org.unisabana.reports;

public abstract class Formato {

	final void generarFormato(Informe informe) {
		formatearResultado();
		generarDocumento();
	}

	public abstract void formatearResultado();

	public abstract void generarDocumento();

}