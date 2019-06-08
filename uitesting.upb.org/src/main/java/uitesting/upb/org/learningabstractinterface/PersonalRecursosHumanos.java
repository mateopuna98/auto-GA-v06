package uitesting.upb.org.learningabstractinterface;

public class PersonalRecursosHumanos extends Empresa {

    private  int horasTrabajadas;

    public PersonalRecursosHumanos(String nombreDepartamento) {
        setNombre(nombreDepartamento);
    }

    public void trabajoPorHora(int horasDeTrabajo){
        this.horasTrabajadas = horasDeTrabajo;
    }

    @Override
    int horasTrabajadas() {
        return this.horasTrabajadas;
    }
}
