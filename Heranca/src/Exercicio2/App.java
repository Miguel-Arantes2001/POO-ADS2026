package Exercicio2;

import java.util.ArrayList;

public class App {

    public static void exibeDados(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString()+" Bônus: "+camaleao.calcularBonus());
    }
    public static void main(String[] args) {

        DevJunior junior = new DevJunior("Fulano","Siclano","Java",4000);
        exibeDados(junior);

        DevPleno pleno = new DevPleno(8,"Carlos","Java",6000);
        exibeDados(pleno);

        DevSenior senior = new DevSenior(30000,"José","Java",9000);
        exibeDados(senior);

        // vetor desenvolvedores
        ArrayList<Desenvolvedor> listaDevs = new ArrayList<>();

        // adiciona os desenvolvedores no vetor
        listaDevs.add(junior);
        listaDevs.add(pleno);
        listaDevs.add(senior);
    }
}
