import java.util.List;

public class Inscripcion {

    private Alumno alumnoSolicitante;
    private List<Materia> solicitudDeMaterias;

    public void setAlumnoSolicitante(Alumno alumnoSolicitante) {
        this.alumnoSolicitante = alumnoSolicitante;
    }

    public void setSolicitudDeMaterias(List<Materia> solicitudDeMaterias) {
        this.solicitudDeMaterias = solicitudDeMaterias;
    }
    public Inscripcion(Alumno unAlumno, List<Materia> listaDeMaterias){
        alumnoSolicitante = unAlumno;
        solicitudDeMaterias = listaDeMaterias;
    }

    public boolean aprobada(){
        boolean puedeInscribirse = true;
        for (Materia materia : solicitudDeMaterias){
            puedeInscribirse = alumnoSolicitante.getMateriasAprobadas().containsAll(materia.getNecesariasParaCursar());
            if (!puedeInscribirse) break;
        }
        return puedeInscribirse;
    }
}
