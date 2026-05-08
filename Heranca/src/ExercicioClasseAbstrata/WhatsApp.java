package ExercicioClasseAbstrata;

public class WhatsApp extends CanalNotificacao{
    private String statusLeitura;

    public WhatsApp(String mensagem, String destinatario,String statusLeitura) {
        super(mensagem, destinatario);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        System.out.printf("Enviando Zap para %s... Mensagem: %s\n",this.destinatario,this.mensagem);
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                super.toString() +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }
}
