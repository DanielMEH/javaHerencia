package personas;

public class EmpleadoEventual extends Empleado{
    private double honorariosHora;
    private String fechaTerminoContrato;
    /**
     * @return the honorariosHora
     */
    public double getHonorariosHora() {
        return honorariosHora;
    }
    /**
     * @param honorariosHora the honorariosHora to set
     */
    public void setHonorariosHora(double honorariosHora) {
        this.honorariosHora = honorariosHora;
    }
    /**
     * @return the fechaTerminoContrato
     */
    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }
    /**
     * @param fechaTerminoContrato the fechaTerminoContrato to set
     */
    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }
}

