package ExercicioClasseAbstrata;

public class Email extends CanalNotificacao{

    private String assunto;

    public Email(String mensagem, String destinatario,String assunto) {
        super(mensagem, destinatario);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.printf( "Enviando E-mail para %s  com o assunto %s: %s\n", this.destinatario, this.assunto, this.mensagem);
    }

    @Override
    public String toString() {
        return "Email{" +
                super.toString() +
                "assunto='" + assunto + '\'' +
                '}';
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
