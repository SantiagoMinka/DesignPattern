package Library;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientReport datosGeograficos = new ConversionAdapter();
		
		
		datosGeograficos.convertGeoJsontoKML("Data GeoJson");
		
		datosGeograficos.displayGeoJSON("Data GeoJson");
	}

}
