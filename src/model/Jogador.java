package model;

public class Jogador
{
    private String nome;
    private int estrelas;
    private int id; 
    private boolean disponivel;
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
        return "Nome: "+this.getNome()+", Estrelas: "+this.getEstrelas()+", Disponível: "+this.isDisponivel()+"\n";
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
