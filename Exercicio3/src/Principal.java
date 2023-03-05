import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        String nome,curso,situacao;
        int matricula,periodo;
        double notaAV1 = 0,notaAV2 = 0,notaAE = 0;

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite seu curso: ");
        curso = ler.nextLine();
        System.out.println("Digite seu matricula: ");
        matricula = ler.nextInt();
        System.out.println("Digite seu periodo: ");
        periodo = ler.nextInt();
        Aluno aluno = new Aluno(nome,matricula,notaAV1,notaAV2,notaAE,curso,periodo);

        System.out.println("Nota da primeira avalicao: ");
        notaAV1 = ler.nextInt();
        aluno.setNotaAV1(notaAV1);

        System.out.println("Nota da segunda avalicao: ");
        notaAV2 = ler.nextInt();
        aluno.setNotaAV2(notaAV2);

        situacao = aluno.avaliarAluno();
        System.out.println("Sua sitação é: " + situacao);

        if(situacao == "RECUPERACAO"){
            System.out.println("Digite a nota da recuperacao:");
            notaAE = ler.nextInt();
            aluno.setNotaAE(notaAE);
            situacao = aluno.avaliarRecuperação();
            System.out.println("Sua sitação é: " + situacao);
        } else {
            System.out.println("Sua sitação é: " + situacao);
        }

    }
}
