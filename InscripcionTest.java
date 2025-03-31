import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class InscripcionTest {
    @Test

    public void inscripcionAprobada(){

    }

    public void aprobada() {
        List<Materia> listaCorrelativasVacia = new ArrayList<Materia>();
        Materia algoritmosYEstructurasDeDatos = new Materia("algoritmos",listaCorrelativasVacia);

        List<Materia> listaDecorrelativasParadigmas = new ArrayList<>();
        listaDecorrelativasParadigmas.add(algoritmosYEstructurasDeDatos);
        Materia paradigamasDeLaProgramacion = new Materia("paradigmas",listaDecorrelativasParadigmas);

        List<Materia> listaDecorrelativasDisenio = new ArrayList<>();
        listaDecorrelativasDisenio.add(paradigamasDeLaProgramacion);
        Materia disenioDeSistemas = new Materia("disenio",listaDecorrelativasDisenio);

        Alumno alumno1 = new Alumno(1111, List.of(algoritmosYEstructurasDeDatos));
        //alumno1.getMateriasAprobadas().add(paradigamasDeLaProgramacion);

        Inscripcion inscripcion = new Inscripcion(alumno1, List.of(paradigamasDeLaProgramacion));

        assertTrue(inscripcion.aprobada());
    }

    public void desaprobada(){
        List<Materia> listaCorrelativasVacia = new ArrayList<Materia>();
        Materia algoritmosYEstructurasDeDatos = new Materia("algoritmos",listaCorrelativasVacia);

        List<Materia> listaDecorrelativasParadigmas = new ArrayList<>();
        listaDecorrelativasParadigmas.add(algoritmosYEstructurasDeDatos);
        Materia paradigamasDeLaProgramacion = new Materia("paradigmas",listaDecorrelativasParadigmas);

        List<Materia> listaDecorrelativasDisenio = new ArrayList<>();
        listaDecorrelativasDisenio.add(paradigamasDeLaProgramacion);
        Materia disenioDeSistemas = new Materia("disenio",listaDecorrelativasDisenio);

        Alumno alumno1 = new Alumno(1111, List.of(algoritmosYEstructurasDeDatos));

        Inscripcion inscripcion = new Inscripcion(alumno1, List.of(disenioDeSistemas));

        assertFalse(inscripcion.aprobada());
    }

}