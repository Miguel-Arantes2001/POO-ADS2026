package ExercicioClasseAbstrata;

public class Sms extends CanalNotificacao{

    private int numeroTelefone;

    public Sms(String mensagem, String destinatario,int numeroTelefone) {
        super(mensagem, destinatario);
        this.numeroTelefone = numeroTelefone;

    }

    @Override
    public void enviar() {
        System.out.printf( "Enviando SMS para o número %d: %s\n", this.numeroTelefone, getMensagem());
    }

    @Override
    public String toString() {
        return "Sms{" +
                super.toString() +
                "numeroTelefone=" + numeroTelefone +
                '}';
    }
}
