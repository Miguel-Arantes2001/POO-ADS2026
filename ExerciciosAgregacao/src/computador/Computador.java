package computador;

public class Computador {
    private int id;
    private String marca;
    Processador processador;

    public Computador(int id, String marca) {
        this.id = id;
        this.marca = marca;
        this.processador =  new Processador("Intel","Core i5","2.4 GHz");
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
