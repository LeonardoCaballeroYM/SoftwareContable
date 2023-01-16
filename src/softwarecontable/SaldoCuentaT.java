package softwarecontable;
/**** @author Richard */
public class SaldoCuentaT {
    private String nomCuenta;
    private double sumaCargo;
    private double sumaAbono;
    private int cuenta;
    private int subCuenta;
    private double parcial;
    private String namecuenta;
    private String descripcion;
    
    public SaldoCuentaT(String nomcuenta, double sumacargo, double sumaabono,
            int cuenta, int subCuenta, double parcial, String namecuenta,
            String descripcion) {
    this.nomCuenta = nomcuenta;
    this.sumaCargo = sumacargo;
    this.sumaAbono = sumaabono;
    this.cuenta = cuenta;
    this.subCuenta = subCuenta;
    this.parcial = parcial;
    this.namecuenta = namecuenta;
    this.descripcion = descripcion;
    }
    
    public String getNombreCuenta() {
    return nomCuenta;
    }
    
    public void setNombreCuenta(String nomcuenta){
    this.nomCuenta = nomcuenta;
    }
    
    public double getSumaCargo() {
    return sumaCargo;
    }
    
    public void setSumaCargo(double sumacargo){
    this.sumaCargo = sumacargo;
    }
    
    public double getsumaAbono() {
    return sumaAbono;
    }
    
    public void setSumaAbono(double sumaAbono){
    this.sumaAbono = sumaAbono;
    }
    
    public int getCuenta() {
    return cuenta;
    }
    
    public void setCuenta(int cuenta){
    this.cuenta = cuenta;
    }
    
    public int getSubCuenta() {
    return subCuenta;
    }
    
    public void setSubCuenta(int subCuenta){
    this.subCuenta = subCuenta;
    }
    
    public double getParcial() {
    return parcial;
    }
    
    public void setParcial(double parcial){
    this.parcial = parcial;
    }
    
    public String getNameCuenta() {
    return namecuenta;
    }
    
    public void setNameCuenta(String namecuenta){
    this.namecuenta = namecuenta;
    }
    
    public String getDescripcion() {
    return descripcion;
    }
    
    public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
    }
    
    
    @Override
    public String toString() {
    return String.format("Cuenta\nNombre: %s, SumaDebe: %.2f, SumaAbono: %.2f,"
            + " Cuenta: %d, SubCuenta: %d, Parcial: %.2f, Name Cuenta: %s,"
            + " Descripción: %s", this.nomCuenta, this.sumaCargo, this.sumaAbono,
            this.cuenta, this.subCuenta, this.parcial, this.namecuenta, this.descripcion);
    }
}
