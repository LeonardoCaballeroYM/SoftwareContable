package softwarecontable;
/**** @author Richard */
public class Egresos {
    private int Cuenta;
    private int subCuenta;
    private String nombreCuenta;
    private double Parcial;
    private double Debe;
    private double Haber;
    
    public Egresos(int cuenta, int subcuenta,String nombrecuenta, double parcial,
    double debe, double haber) {
    this.Cuenta = cuenta;
    this.subCuenta = subcuenta;
    this.nombreCuenta = nombrecuenta;
    this.Parcial = parcial;
    this.Debe = debe;
    this.Haber = haber;
    }
    
    public int getCuenta(){
        return Cuenta;
    }
    
    public void setCuenta(int cuenta){
        this.Cuenta = cuenta;
    }
    
    public int getSubCuenta(){
        return subCuenta;
    }
    
    public void setSubCuenta(int subcuenta){
        this.subCuenta = subcuenta;
    }
    
    public String getNombreCuenta() {
    return nombreCuenta;
    }
    
    public void setNombreCuenta(String nombrecuenta){
    this.nombreCuenta = nombrecuenta;
    }
    
    public double getParcial() {
    return Parcial;
    }
    
    public void setParcial(double parcial){
    this.Parcial = parcial;
    }
    
    public double getDebe() {
    return Debe;
    }
    
    public void setDebe(double debe){
    this.Debe = debe;
    }
    
    public double getHaber() {
    return Haber;
    }
    
    public void setHaber(double haber){
    this.Haber = haber;
    }
    
    @Override
    public String toString() {
    return String.format("Cuenta" + "Cuenta: %d, subCuenta: %d Nombre: %s, Parcial: %.2f,"
            + " Debe: %.2f, Haber: %.2f", this.Cuenta, this.subCuenta, this.nombreCuenta,
            this.Parcial, this.Debe, this.Haber);
    }
}
