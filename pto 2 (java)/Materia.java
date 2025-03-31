import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> necesariasParaCursar;

    public Materia(String unNombre, List<Materia> listaDeMaterias){
        necesariasParaCursar = listaDeMaterias;
        this.nombre = unNombre;
        System.out.print("Creada materia: "+ nombre + "\n");
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarCorrelativa(Materia unaMateria){
        if (necesariasParaCursar.contains(unaMateria)){
            System.out.print("Correlativa ya existente \n");
        }
        else necesariasParaCursar.add(unaMateria);
    }

    public List<Materia> getNecesariasParaCursar() {
        return necesariasParaCursar;
    }
}
