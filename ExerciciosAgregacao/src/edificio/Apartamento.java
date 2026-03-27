package edificio;

public class Apartamento {
    private int numero,andar;

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numero = " + numero +
                ", andar = " + andar +
                '}';
    }
}
