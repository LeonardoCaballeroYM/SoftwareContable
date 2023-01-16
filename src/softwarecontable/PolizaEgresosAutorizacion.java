package softwarecontable;
/**** @author Richard */
public class PolizaEgresosAutorizacion {
    private String Realizado;
    private String Reviso;
    private String Autorizo;
    private String Auxiliares;
    private int NoPoliza;
    
    
    public PolizaEgresosAutorizacion(String realizado, String reviso, String autorizo,
            String auxiliares, int nopoliza) {
    this.Realizado = realizado;
    this.Reviso = reviso;
    this.Autorizo = autorizo;
    this.Auxiliares = auxiliares;
    this.NoPoliza = nopoliza;
    }
    
    public String getRealizado() {
    return Realizado;
    }
    
    public void setRealizado(String realizado){
    this.Realizado = realizado;
    }
    
    public String getReviso() {
    return Reviso;
    }
    
    public void setReviso(String reviso){
    this.Reviso = reviso;
    }
    
    public String getAutorizo() {
    return Autorizo;
    }
    
    public void setAutorizo(String autorizo){
    this.Autorizo = autorizo;
    }
    
    public String getAuxiliares() {
    return Auxiliares;
    }
    
    public void setAuxiliares(String auxiliares){
    this.Auxiliares = auxiliares;
    }
    
    public int getNoPoliza() {
    return NoPoliza;
    }
    
    public void setNoPoliza(int nopoliza){
    this.NoPoliza = nopoliza;
    }
    @Override
    public String toString() {
    return String.format("Autorización\nRealizado: %s, Reviso: %s, Autorizo: %s,"
            + " Auxiliares: %s, No Poliza: %d", this.Realizado,this.Reviso,
            this.Autorizo, this.Auxiliares, this.NoPoliza);
    }
}
