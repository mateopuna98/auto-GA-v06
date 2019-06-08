package uitesting.upb.org.learningabstractinterface;

public class Trabajo {
    public static void main(String[] args) {

        Empresa recruiterPersonal = new PersonalRecursosHumanos("Reclutador de personal");
        System.out.println(recruiterPersonal.getNombre());

        PersonalRecursosHumanos finanzas = new PersonalRecursosHumanos("Finanzas");
        System.out.println(finanzas.getNombre());
        finanzas.trabajoPorHora(160);
        System.out.println("finanzas.horastrabajadas = " + finanzas.horasTrabajadas());

    }
}
