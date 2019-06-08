package uitesting.upb.org.learningabstractinterface;

public abstract class Empresa {

    private String nombre;

    public String getNombre() {
        return "UPB member -" + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract int horasTrabajadas();
}
