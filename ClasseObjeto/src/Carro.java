public class Carro {

    public String modelo,marca,placa;
    public boolean motor;// true(ligado) ou false(desligado)
    public float velAtual;

    // metodo construtor tem o mesmo nomeda classe
    public Carro(String modelo, String marca, String placa, boolean motor, float velAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.motor = motor;
        this.velAtual = velAtual;
    }

    public  void ligaCarro(){
            if(!this.motor){
                this.motor = true;
            } System.out.println("Carro foi ligado");
    }

    public void desligaCarro(){
        if (this.motor){
            this.motor = false;
        } System.out.println("Carro foi desligado");
    }

    // Métodos
    public String toString() {  // converte objeto para string
        // this representa objeto que chama o método
            return "Modelo: "+this.modelo+"\nMarca: "+this.marca+"\nPlaca: "+this.placa+
                    "\nMotor: "+(this.motor? "Ligado":"Desligado")
                    +"\nVelAtual: "+this.velAtual;
    }
}