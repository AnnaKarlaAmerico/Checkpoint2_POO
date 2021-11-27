package Checkpoint2;

public class AvaliacaoFisica {
    private String sexo;
    private int idade;
    private double peso;
    private double altura;
    private double imc;

    public AvaliacaoFisica(String sexo, int idade, double peso, double altura) {
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura/100;
        this.imc = calcularIMC (this.peso, this.altura);
    }

    public double calcularIMC (double peso,double altura) {
        this.imc = peso / (altura * altura);
        return imc;
    }

    public String definirPesoIdeal() {
        if (this.imc < 18.5) {
           return "BAIXO";
        } else if (this.imc >= 25 ) {
            return "ALTO";
        } else {
            return "IDEAL";
        }
    }

    public void definirTreino() {
        Treino treino = new Treino();
        var pesoIdeal = definirPesoIdeal();
        if (idade <= 50 && sexo .equals("M")  &&  (pesoIdeal .equals("IDEAL") || pesoIdeal .equals("BAIXO"))) {
            System.out.println("O treino do aluno é o " + treino.getTreinoA());
        } else if (idade <= 50 && sexo .equals("F") &&  (pesoIdeal .equals("IDEAL") || pesoIdeal .equals("BAIXO"))) {
            System.out.println("O treino do aluno é o " + treino.getTreinoB());
        } else if (idade <= 50 && (sexo .equals("F") || sexo .equals("M")) && pesoIdeal .equals("ALTO")) {
            System.out.println("O treino do aluno é o " + treino.getTreinoC());
        } else if (idade > 50 && (sexo .equals("F") || sexo .equals("M")) && (pesoIdeal .equals("BAIXO") || pesoIdeal .equals("IDEAL"))) {
            System.out.println("O treino do aluno é o " + treino.getTreinoD());
        } else if (idade > 50 && (sexo .equals("F") || sexo .equals("M")) && pesoIdeal .equals("ALTO")) {
            System.out.println("O treino do aluno é o " + treino.getTreinoE());
        }
    }
}
