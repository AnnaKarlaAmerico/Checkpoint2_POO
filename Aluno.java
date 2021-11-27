package Checkpoint2;

public class Aluno extends Pessoa{
    private String telefone;
    private String email;

    public Aluno(String nome, int codigo, String telefone, String email) {
        super(nome, codigo);
        this.telefone = telefone;
        this.email = email;
    }

    public void treinar(){}
}

