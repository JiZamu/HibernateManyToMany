package unimanytomany.model;


public class Materia {
    private Integer idMateria;
    private String nombre;

    public Materia() {
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
