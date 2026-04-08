package Exercicio2;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        DevJunior junior = new DevJunior("Fulano","Siclano","Java",4000);
        DevPleno pleno = new DevPleno(8,"Carlos","Java",6000);
        DevSenior senior = new DevSenior(30000,"José","Java",9000);
        Desenvolvedor dev1 = new Desenvolvedor("Maria","Python",5000);

        Desenvolvedor[] devs = new Desenvolvedor[4];
        devs[0] =  junior;
        devs[1] =  pleno;
        devs[2] =  senior;
        devs[3] = dev1;

        for(Desenvolvedor dev : devs){
            dev.codar();
            System.out.println("Bonus do desenvolvedor: "+dev.calcularBonus()+" R$");
            System.out.println(dev.toString());
            System.out.println("=====================================\n");
        }
    }
}
