public class EmpregoFaculdade {
        private String nome;
        private double salario;
        private int horasAula;

        public  EmpregoFaculdade(String nome, double salario, int horasAula){
            setNome(nome);
            setSalario(salario);
            setHorasAula(horasAula);
        }
        public void setSalario(double salario){
            this.salario = salario;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setHorasAula(int horasAula){
            this.horasAula = horasAula;
        }

        double getGastos(){
            return (this.horasAula * 40) + this.salario;
        }
        String getInfo(){
            return "nome: " + this.nome + " com salario " + this.salario + " horasAula " + this.horasAula;
        }

    }


