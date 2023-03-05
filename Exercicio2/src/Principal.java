public class Principal {
    public static void main(String[] args){
        String nome = "João Felipe";
        double salario = 1568.20;
        int horasAula = 4;
        EmpregoFaculdade empregoFaculdade1 = new EmpregoFaculdade(nome, salario, horasAula);

        System.out.println(empregoFaculdade1.getInfo());
        System.out.println("Salario: " + empregoFaculdade1.getGastos());


    }

}
