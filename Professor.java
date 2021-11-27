package Checkpoint2;

public class Professor extends Pessoa{
    private String especializacao;

    public Professor(String nome, int codigo, String especializacao) {
        super(nome, codigo);
        this.especializacao = especializacao;
    }

    public void fazerAvaliacaoFisica(){}
}
