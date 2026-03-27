package clinicaMedica;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Silvio",1,"Hematologista");


        Paciente paciente = new Paciente("Miguel",2,"4128716212");

        LocalDateTime data = LocalDateTime.of(2026,05,20,14,00);
        Consulta consulta = new Consulta(data,200, medico,paciente);
        System.out.println(consulta);
    }
}
