public abstract class Informe {
    private String nombre;
        private String formato;
        public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombreInforme){
        this.nombre = nombreInforme;
        System.out.println("Paso 4: Asignando nombre al Informe:"+nombre+"."+formato);
    }
    public String getFormato(){
        return this.formato;
    }
    public void setFormato(String tipoFormato){
        this.formato = tipoFormato;
    }
    public final void generarInforme(String nombreInforme, String tipoFormato){
        consultarBD();
        aplicarCalculo();
        imprimirInforme(tipoFormato);
        setNombre(nombreInforme);
    }

    private void consultarBD(){
        System.out.println("Paso 1: Obtener datos de BD");
    }
    public abstract void aplicarCalculo();

    private void imprimirInforme(String tipoFormato){
        this.formato=tipoFormato;
        System.out.println("Paso 3: Imprimir informme en formato:"+tipoFormato);
        }

}
