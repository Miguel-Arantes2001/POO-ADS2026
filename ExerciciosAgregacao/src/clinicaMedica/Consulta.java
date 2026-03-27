package clinicaMedica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {

    private LocalDateTime dataConsulta;
    private double valorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime dataConsulta, double valorConsulta, Medico medico, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.valorConsulta = valorConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Consulta marcada para o dia: " +
                dataConsulta.format(dtf) + " " +
                " , valor da consulta=" + valorConsulta +
                " , medico= " + medico.getNome() +
                " , paciente= " + paciente.getNome()
                ;
    }
}
