package ExercicioClasseAbstrata;

import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void main(String[] args) {
        ArrayList<CanalNotificacao> canalNotificacoes = new ArrayList<>();

        Email email = new Email("Hello world!","Miguel","Boas vindas");
        Sms sms = new Sms("ola mundo","Joao",1699282912);
        WhatsApp whatsapp = new WhatsApp("Venha aqui","Carlos","lido");


        canalNotificacoes.add(email);
        canalNotificacoes.add(sms);
        canalNotificacoes.add(whatsapp);

        for (CanalNotificacao canal : canalNotificacoes) {
            canal.enviar();
        }
    }
}
