package Library;



public class ConversionService {
	
	private String KML;
	
	public ConversionService(String KML) {
		this.KML = KML;
	}
	
	public String ConvertKMLServices(String KML) {
		
		 ObjectMapper objectMapper = new ObjectMapper(new KmlFactory()); 
	        JsonNode jsonNode = objectMapper.readTree(geoJson); 
	        String kml = objectMapper.writeValueAsString(jsonNode);
	        return kml;
	}
	
	
	public String GeoJsonServices(String GeoJson) {
		
		
	        return GeoJson = "Data GeoJson";
	}
	
	

}
