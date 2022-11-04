package personas;

public class Paciente extends Persona{
    private String numHistoria;
    private String sexo;
    private String grupoSanguineo;
    private String listaMedicamentos[];
    /**
     * @return the numHistoria
     */
    public String getNumHistoria() {
        return numHistoria;
    }
    /**
     * @param numHistoria the numHistoria to set
     */
    public void setNumHistoria(String numHistoria) {
        this.numHistoria = numHistoria;
    }
    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * @param sexo the sexo to set

    Instructor: Cristian David Henao Hoyos.

     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * @return the grupoSanguineo
     */
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }
    /**
     * @param grupoSanguineo the grupoSanguineo to set
     */
    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
    /**
     * @return the listaMedicamentos
     */
    public String[] getListaMedicamentos() {
        return listaMedicamentos;
    }
    /**
     * @param listaMedicamentos the listaMedicamentos to set
     */
    public void setListaMedicamentos(String listaMedicamentos[]) {
        this.listaMedicamentos = listaMedicamentos;
    }
}
