package br.fatecrl.mvcdemo.models;

public class Aluno {
private String nome;
private String matricula;
private float p1;
private float p2;

public Aluno(String nome, String matricula, float p1, float p2) {
this.nome = nome;
this.matricula = matricula;
this.p1 = p1;
this.p2 = p2;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }
}
