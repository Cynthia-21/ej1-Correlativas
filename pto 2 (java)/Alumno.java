import java.util.List;
public class Alumno {

    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Integer getLegajo(){
        return this.legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriaAprobada(Materia unaMateria){
        this.materiasAprobadas.add(unaMateria);
    }

    public Alumno(Integer legajo, List<Materia> materias){
        this.legajo = legajo;
        this.materiasAprobadas = materias;
    }

}
