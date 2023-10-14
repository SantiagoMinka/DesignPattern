package org.unisabana.library;

public class ConversionAdapter implements Library {

	private ConversionService conversionService = new ConversionService();

	@Override
	public void displayGeoJSON(String geoJson) {
		conversionService.GeoJsonServices(geoJson);
	}

	@Override
	public void convertGeoJsontoKML(String KML) {
		conversionService.ConvertKMLServices(KML);
	}
}