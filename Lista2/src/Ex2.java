public class Ex2 {

    // Atributos privados
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    // Setters com validação
    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura inválida (0 a 120 metros)");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Bateria inválida (0 a 100)");
        }
    }

    // Método público
    public void decolar() {
        if (bateria > 20) {
            if (testarMotores()) {
                emVoo = true;
                setAltura(2);
                System.out.println("Drone decolou!");
            } else {
                System.out.println("Falha nos motores");
            }
        } else {
            System.out.println("Bateria insuficiente");
        }
    }

    // Método privado
    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        int numero = (int)(Math.random() * 10); // 0 a 9
        return numero < 8;
    }

    // Métodos de voo
    public void subir(float x) {
        setAltura(this.altura + x);
    }

    public void descer(float x) {
        setAltura(this.altura - x);
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nAltura: " + altura +
                "\nBateria: " + bateria +
                "\nEm voo: " + emVoo;
    }
}