package org.unisabana.library;

public class Demo {

	public static void main(String[] args) {

		Library datosGeograficos = new ConversionAdapter();

		datosGeograficos.convertGeoJsontoKML("KML");

		datosGeograficos.displayGeoJSON("GeoJson");
	}
}