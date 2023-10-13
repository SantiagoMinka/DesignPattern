package Library;

public class ConversionAdapter implements ClientReport {
	
	private ConversionService conversionService;
	
	public ConversionAdapter () {
		
	}
	
	

	@Override
	public String displayGeoJSON(String geoJson) {
		// TODO Auto-generated method stub
		
		return geoJson = conversionService.GeoJsonServices(geoJson);
	}

	@Override
	public String convertGeoJsontoKML(String KML) {
		// TODO Auto-generated method stub
		
		KML = conversionService.ConvertKMLServices(KML);
		return null;
	}

}
