package classeassociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro("123","Siclano");
        LocalDateTime data = LocalDateTime.of(2026,7,13,13,30);
        Voo voo1 = new Voo(777,"Ribeirao Preto","Salvador",data);

        Reserva reserva1 = new Reserva(111,LocalDateTime.now(),10,passageiro1,voo1);
        System.out.println(reserva1.toString());
    }
}
