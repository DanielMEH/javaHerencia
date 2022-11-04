package personas;

public class Medico extends EmpleadoPlanilla{
    private String especialidad;
    private int numConsultorio;
    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }
    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    /**
     * @return the numConsultorio
     */
    public int getNumConsultorio() {
        return numConsultorio;
    }
    /**
     * @param numConsultorio the numConsultorio to set
     */
    public void setNumConsultorio(int numConsultorio) {
        this.numConsultorio = numConsultorio;
    }
}

