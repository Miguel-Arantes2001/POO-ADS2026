package edificio;

public class Main {
    public static void main(String[] args) {
        Edificio ed = new Edificio("Plaza","Rua 123");
        ed.construirApartamento(10,1);
        System.out.println(ed.getApartamentos());
    }
}
