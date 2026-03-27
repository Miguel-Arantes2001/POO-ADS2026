package projetoSoftware;

public class Main {
    public static void main(String[] args) {
        Programador p1 = new Programador("Miguel","Python",1);
        Programador p2 = new Programador("Ana","Java",2);
        Programador p3 = new Programador("Carlos","Python",3);

        Projeto projeto = new Projeto(1,"Sistema Cadastro");
        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);
        projeto.adicionarProgramador(p3);

        System.out.println(projeto.getProgramadores());
    }
}
