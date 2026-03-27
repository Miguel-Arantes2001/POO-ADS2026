package classeassociacao;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int numerovoo;
    private String origem,destino;
    private LocalDateTime dataVoo; // dia, mes, ano, hora e minuto

    public Voo() {
    }

    public Voo(int numerovoo, String origem, String destino, LocalDateTime dataVoo) {
        this.numerovoo = numerovoo;
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
    }

    public int getNumerovoo() {
        return numerovoo;
    }

    public void setNumerovoo(int numerovoo) {
        this.numerovoo = numerovoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return "Voo{" +
                "numerovoo=" + numerovoo +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dataVoo=" + dataVoo.format(formatoBR) +
                '}';
    }
}
