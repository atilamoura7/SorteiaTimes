package model;

public class Time 
{
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogador3;
    private Jogador jogador4;
    private int totEstrelas;
    private float mediaTime;
    public Time(Jogador jogador1, Jogador jogador2, Jogador jogador3, Jogador jogador4)
    {
        this.setJogador1(jogador1);
        this.setJogador2(jogador2);
        this.setJogador3(jogador3);
        this.setJogador4(jogador4);
        calcularEstrelas();
    }
    
    public Time(Jogador jogador1, Jogador jogador2, Jogador jogador3)
    {
        this.setJogador1(jogador1);
        this.setJogador2(jogador2);
        this.setJogador3(jogador3);
        calcularEstrelas();
    }
    
    public Time(Jogador jogador1, Jogador jogador2)
    {
        this.setJogador1(jogador1);
        this.setJogador2(jogador2);
        calcularEstrelas();
    }
    
    public Time(Jogador jogador1)
    {
        this.setJogador1(jogador1);
        calcularEstrelas();
    }
    
    public void calcularEstrelas()
    {   
        //soma a estrela de cada jogador se ele for diferente de null
        //divide o total de estrelas pelo total de jogadores no time para saber a média de estrelas 
        float totEstrelas = 0;
        float totJogadores = 0;
        float mediaEstrelas=0;
        if(this.getJogador1()!=null)
        {
            totEstrelas += this.getJogador1().getEstrelas();
            totJogadores++;
        }
        if(this.getJogador2()!=null)
        {
            totEstrelas += this.getJogador2().getEstrelas();
            totJogadores++;
        }
        if(this.getJogador3()!=null)
        {
            totEstrelas += this.getJogador3().getEstrelas();
            totJogadores++;
        }
        if(this.getJogador4()!=null)
        {
            totEstrelas += this.getJogador4().getEstrelas();
            totJogadores++;
        }
        mediaEstrelas = totEstrelas/totJogadores;
        this.setMediaTime(mediaEstrelas);
        this.setTotEstrelas((int)totEstrelas);
    }
    
    public String toString()
    {
        //devolve os dados de cada jogador que for diferente de null;
        String time = "Média Time: "+this.getMediaTime()+"\n";
        if(this.getJogador1()!=null)
        {
            time +="Jogadores:\n"+this.getJogador1();
        }
        if(this.getJogador2()!=null)
        {
            time +=""+this.getJogador2();
        }
        if(this.getJogador3()!=null)
        {
            time +=""+this.getJogador3();        
        }
        if(this.getJogador4()!=null)
        {
            time +=""+this.getJogador4();
        }
        return time;
    }
    
    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Jogador getJogador3() {
        return jogador3;
    }

    public void setJogador3(Jogador jogador3) {
        this.jogador3 = jogador3;
    }

    public Jogador getJogador4() {
        return jogador4;
    }

    public void setJogador4(Jogador jogador4) {
        this.jogador4 = jogador4;
    }

    public int getTotEstrelas() {
        return totEstrelas;
    }

    public void setTotEstrelas(int totEstrelas) {
        this.totEstrelas = totEstrelas;
    }

    public float getMediaTime() {
        return mediaTime;
    }

    public void setMediaTime(float mediaTime) {
        this.mediaTime = mediaTime;
    }
    
}
