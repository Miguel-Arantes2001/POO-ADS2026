public class Ex1{

    // Atributos privados
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    // Construtor vazio
    public Ex1() {
    }

    // Construtor com parâmetros (usando setters)
    public Ex1(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    // Setter com validação
    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setMarca(String m) {
        if (m != null && m.length() >= 3) {
            this.marca = m;
        } else {
            System.out.println("Marca inválida");
        }
    }

    // Método público
    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Modo Turbo ativado!");
        } else {
            System.out.println("Falha no compressor");
        }
    }

    // Método privado
    private boolean verificarCompressor() {
        int numero = (int)(Math.random() * 5); // 0 a 4
        return numero > 2;
    }

    // toString
    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temperatura +
                "\nLigado: " + ligado;
    }
}