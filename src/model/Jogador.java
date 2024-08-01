package model;

import java.util.Scanner;

public class Jogador
{
    private String nome;
    private int estrelas;
    private int id; 
    private boolean disponivel;
    Scanner sc;
    public Jogador(String nome, int estrelas, int id)
    {
        this.setNome(nome);
        this.setEstrelas(estrelas);
        this.setId(id);
        this.setDisponivel(true);
        
    }
    public Jogador()
    {
        this.setNome(nome);
        this.setEstrelas(estrelas);
        this.setId(id);
        this.setDisponivel(true);
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas){
        if((estrelas>=1)&&(estrelas<=5))
        {
            this.estrelas = estrelas;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString()
    {
        return "\nId:"+this.getId()+", Nome: "+this.getNome()+", Estrelas: "+this.getEstrelas()+", Disponível: "+this.isDisponivel();
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void informacoesJogador()
    {
        sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("     Form        ");
        System.out.println("Nome do jogador: ");
        this.setNome(sc.next());
        System.out.println("Número de estrelas do(a)"+this.getNome());
        this.setEstrelas(sc.nextInt());
        System.out.println("==============================");
        //sc.close();
    }
    
}
