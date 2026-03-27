package timeBasquete;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta(1,"Marcos","Ala");
        Atleta atleta2 = new Atleta(2,"Jonas","Armador");

        Time francaBasquete = new Time("Franca Basquete","Helinho",1);
        francaBasquete.contratarAtleta(atleta1);
        francaBasquete.contratarAtleta(atleta2);
        System.out.println(francaBasquete.getAtletas());

        francaBasquete = null;
        System.out.println("\nTime foi anulado!");

        System.out.println(atleta1);

    }
}
