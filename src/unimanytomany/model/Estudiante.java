package unimanytomany.model;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private Integer idEstudiante;
    private String nombre;
    private List<Materia> materias = new ArrayList<Materia>();

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }
}
