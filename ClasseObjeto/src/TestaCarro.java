public class TestaCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro("palio","Volkswagen","123EDJ",false,0 );

        carro1.desligaCarro();
        
        System.out.println(carro1.toString());
    }
}
