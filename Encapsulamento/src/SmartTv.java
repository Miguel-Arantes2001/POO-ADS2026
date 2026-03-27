public class SmartTv{
    private String marca,modelo;
    private int volume;
    private boolean internet;


    public SmartTv() {

    }
    public SmartTv(String marca, String modelo, int volume, boolean internet){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.internet = internet;

    }

    public void setVolume(int volume){
        if  (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume invalido");
    }

    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        // metodo length() de instância
        if(marca.length()<=30){
            this.marca = marca;
        }
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);
        if (resp){
            this.modelo = modelo;
        }
        System.out.println("Modelo invalido");
    }

    public String getModelo(){
        return this.modelo;
    }

    public void aumentaVolume(int x) {
        this.setVolume(this.volume + x);
    }

    public void diminuiVolume(int x) {
        this.setVolume(this.volume - x);
    }

    public void abrirYoutube(){
        //conecta internet
        if(this.conectaInternet()){
            System.out.println("Youtube conectado");
        }
        else {
            System.out.println("Sem internet para abrir youtube");
        }

    }
    // nao vamos expor o método, nao quero torná-lo visível em outra classe
    private boolean conectaInternet(){
        System.out.println("Verificando conexoes disponíveis");
        System.out.println("Consultando as credenciais");
        int randomico = (int) (Math.random() * 10);
        if (randomico <5){
            System.out.println("IP gerado com sucesso");
            return true;
        }
        else{
            System.out.println("Falha na conexão");
            return false;
        }
    }
}
