package softwarecontable;
/**** @author Rudy */
public class Contabilidad {
    private String nombrecuenta;
    private double cargo;
    private double abono;

    public Contabilidad( String nombrecuenta, double cargo, double abono) {
        this.nombrecuenta = nombrecuenta;
        this.cargo = cargo;
        this.abono = abono;
       
    }

    public String getNombreCuenta() {
        return nombrecuenta;
    }
    
    public void setNombreCuenta(String nombrecuenta){
        this.nombrecuenta = nombrecuenta;
    }

    public double getCargo() {
        return cargo;
    }
    
    public void setCargo(double cargo){
        this.cargo = cargo;
    }

    public double getAbono() {
        return abono;
    }
    
    public void setAbono(double abono){
        this.abono = abono;
    }

    @Override
    public String toString() {
        return String.format("Cuenta" + "Nombre: %s, Cargo: %.2f, "
                + "Abono: %.2f", this.nombrecuenta, this.cargo, this.abono);
    }
}

