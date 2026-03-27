package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int codigo;
    private LocalDateTime data;
    private int poltrona;
    private Passageiro passageiro;
    private Voo voo1;

    public Reserva() {
    }

    public Reserva(int codigo, LocalDateTime data, int poltrona, Passageiro passageiro, Voo voo1) {
        this.codigo = codigo;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.voo1 = voo1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo1() {
        return voo1;
    }

    public void setVoo1(Voo voo1) {
        this.voo1 = voo1;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy  'às'HH:mm");
        return "Reserva{" +
                "codigo=" + codigo +
                ", data=" + data.format(formatoBR) +
                ", poltrona=" + poltrona +
                ", \npassageiro=" + passageiro +
                ", \nvoo=" + voo1 +
                '}';
    }
}
