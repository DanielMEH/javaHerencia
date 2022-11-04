package personas;

public class Empleado extends Persona{
    private String codEmpleado;
    private String numHorasExtras;
    private String fechaIngreso;
    private String area;
    private String Cargo;
    /**
     * @return the codEmpleado
     */
    public String getCodEmpleado() {
        return codEmpleado;
    }
    /**
     * @param codEmpleado the codEmpleado to set
     */
    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    /**
     * @return the numHorasExtras
     */
    public String getNumHorasExtras() {
        return numHorasExtras;
    }
    /**
     * @param numHorasExtras the numHorasExtras to set
     */
    public void setNumHorasExtras(String numHorasExtras) {
        this.numHorasExtras = numHorasExtras;
    }
    /**
     * @return the fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }
    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * @return the cargo
     */
    public String getCargo() {
        return Cargo;
    }
    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}