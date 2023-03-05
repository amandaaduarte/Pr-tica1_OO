public class Aluno {
    public String nome;
    public int matricula;
    public double notaAV1;
    public double notaAV2;
    public double notaAE;
    public String curso;
    public int periodo;

    public Aluno(String nome, int matricula, double notaAV1, double notaAV2, double notaAE, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void setNotaAV1(double notaAV1){
        this.notaAV1 = notaAV1;
    }
    public void setNotaAV2(double notaAV2){
        this.notaAV2 = notaAV2;
    }
    public void setNotaAE(double notaAE){
        this.notaAE = notaAE;
    }

    String avaliarAluno(){
        return (notaAV1+notaAV2 >= 60 ? "APROVADO":"RECUPERACAO");
    }
    String avaliarRecuperação(){
        return (notaAV1+notaAV2+notaAE >= 60 ? "APROVADO":"REPROVADO");
    }
}
