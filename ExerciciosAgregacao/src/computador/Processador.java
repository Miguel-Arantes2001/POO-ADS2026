package computador;

public class Processador {
    private String marca,modelo,frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frequencia='" + frequencia + '\'' +
                '}';
    }
}
