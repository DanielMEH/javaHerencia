package personas;

public class EmpleadoPlanilla extends Empleado{
    private double salarioMensual;
    private double porcentajeAdicional;
    /**
     * @return the salarioMensual
     */
    public double getSalarioMensual() {
        return salarioMensual;
    }
    /**
     * @param salarioMensual the salarioMensual to set
     */
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    /**
     * @return the porcentajeAdicional
     */
    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    /**
     * @param porcentajeAdicional the porcentajeAdicional to set
     */
    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }
}
