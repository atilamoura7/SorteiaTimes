package sorteio;

import java.util.ArrayList;
import java.util.Random;
import model.Jogador;
import model.Time;

public class Sorteio
{
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();
    private int totalTimes;
    private int timesFormados;
    
    public Sorteio()
    {
      this.setTimesFormados(0);
      this.setTotalTimes(0);
      criaLista();
    }
    public void criaLista()
    {
        System.out.println("Criou lista");
        Jogador jogador1 = new Jogador("Moura", 1, 1);
        Jogador jogador2 = new Jogador("Joe", 2, 2);
        Jogador jogador3 = new Jogador("Bill", 3,3);
        Jogador jogador4 = new Jogador("Bob", 4, 4);
        Jogador jogador5 = new Jogador("Rick", 1, 5);
        Jogador jogador6 = new Jogador("Pedro", 2,6);
        Jogador jogador7 = new Jogador("Raul", 3, 7);
        Jogador jogador8 = new Jogador("Biel", 4,8);
        Jogador jogador9 = new Jogador("Saulo", 1,9);
        Jogador jogador10 = new Jogador("Henri", 5,10);
        this.adicionaJogador(jogador1);
        this.adicionaJogador(jogador2);
        this.adicionaJogador(jogador3);
        this.adicionaJogador(jogador4);
        this.adicionaJogador(jogador5);
        this.adicionaJogador(jogador6);
        this.adicionaJogador(jogador7);
        this.adicionaJogador(jogador8);
        this.adicionaJogador(jogador9);
        this.adicionaJogador(jogador10);
    }
    public int numeroLista()
    {
        return listaJogadores.size();
    }
    public void adicionaJogador(Jogador jogador)
    {
        listaJogadores.add(jogador);
    }
    public void buscaJogador(int id)
    {
       for(int i = 0; i<listaJogadores.size(); i++)
       {
           if(listaJogadores.get(i).getId()== id)
           {
               System.out.println("passou");
               removeJogador(i);
               break;
           }
           else
           {
               System.out.println("Jogador não encontrado.");
           }
       }
    }
    public void removeJogador(int i)
    {
       listaJogadores.remove(i);
    }

    public ArrayList<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    public int getTotalTimes() {
        return totalTimes;
    }

    public void setTotalTimes(int totalTimes) {
        this.totalTimes = totalTimes;
    }

    public int getTimesFormados() {
        return timesFormados;
    }

    public void setTimesFormados(int timesFormados) {
        this.timesFormados = timesFormados;
    }
    
    
    
    public float calculaMediaEstrelas()
    {
        int tot = 0;
        float soma=0;
        for(int i = 0; i<listaJogadores.size(); i++)
        {
            soma = soma + listaJogadores.get(i).getEstrelas();
            tot++;
        }
        float media = soma/tot;
        return media;
    }
    public void setJogadorDisponivelFalso(int id)
    {
        for(int i=0; i<listaJogadores.size(); i++)
        {
            if(listaJogadores.get(i).getId()==id)
            {
                listaJogadores.get(i).setDisponivel(false);
            }
        }
    }
    public Jogador jogadorDisponivelAleatorio()
    {
        Jogador jogador = null;
        Random rd = new Random();
        int tot = listaJogadores.size();
        try
        {
            while(jogador==null)
            {
                for(int i=0; i<listaJogadores.size(); i++)
                {
                    int aleatorio = rd.nextInt(tot);
                    if(listaJogadores.get(aleatorio).isDisponivel())
                    {
                        jogador = listaJogadores.get(aleatorio);
                        return jogador;
                    }
                }
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("Busca aleatória não encontrou Jogador disponível, Exception: "+e);
            return null;
        }
        return null;
    }
    
    public Jogador jogadorDisponivelLista()
    {
        try
        {
            Jogador jogador = null;
            while(jogador==null)
            {
                for(int i=0; i<listaJogadores.size(); i++)
                {
                    if(listaJogadores.get(i).isDisponivel())
                    {
                        jogador = listaJogadores.get(i);
                        return jogador;
                    }
                }
            } 
        }
        
        catch(NullPointerException e)
        {
            System.out.println("Nenhum jogador disponível na lista, Exception: "+e);
            return null;
        }
        return null;
    }
    public int jogadoresDisponiveis()
    {
        int disponivel = 0;
        for(int i=0; i<listaJogadores.size(); i++)
        {
            if(listaJogadores.get(i).isDisponivel())
            {
                disponivel++;
            }
        }
        if(disponivel>=1)
        {
            return disponivel; 
        }
        else
        {
            return 0;
        }
    }
    public Time ultimoTime(int disponivel)
    {
        try
        {
            Time time = null;
            if(disponivel==1)
            {
                Jogador jogador= jogadorDisponivelLista();
                this.setJogadorDisponivelFalso(jogador.getId());
                time = new Time(jogador);
                return time;
            }
            else if(disponivel==2)
            {
                Jogador jogador1 = jogadorDisponivelLista();
                this.setJogadorDisponivelFalso(jogador1.getId());

                Jogador jogador2 = jogadorDisponivelLista();
                this.setJogadorDisponivelFalso(jogador2.getId());
                time = new Time(jogador1,jogador2);
                return time;
            }
            else if(disponivel==3)
            {
                Jogador jogador1 = jogadorDisponivelLista();
                this.setJogadorDisponivelFalso(jogador1.getId());
                Jogador jogador2 = jogadorDisponivelLista();
                this.setJogadorDisponivelFalso(jogador2.getId());
                Jogador jogador3 = jogadorDisponivelLista();
                this.setJogadorDisponivelFalso(jogador3.getId());
                time = new Time(jogador1,jogador2, jogador3);
                return time;
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("Erro ao formar o Último Time, Exception: "+e);
            return null;
        }
        return null;
            
    }
    public Time sorteiaTime()
    {
        try
        {
            Time time = null;
            int totTentativas = 0;
            do
            {
                Jogador jogador1 = jogadorDisponivelAleatorio();
                Jogador jogador2 = jogadorDisponivelAleatorio();
                Jogador jogador3 = jogadorDisponivelAleatorio();
                Jogador jogador4 = jogadorDisponivelAleatorio();
                
                time = new Time(jogador1,jogador2,jogador3,jogador4);
                if((jogadoresDiferentes(time))&&(verificaMediaTimeLista(time)))
                {
                    setJogadoresIndisponiveis(time);
                    return time;
                }
                else
                {
                    totTentativas++;
                    time = null;
                    if(totTentativas==20)
                    {
                        break;
                    }
                }
            }while(time==null);
        }
        catch(NullPointerException e)
        {
            System.out.println("Erro ao Sortear Times, Exception: "+e);
            return null;
        }
        return null;
    }
    public void quantidadeTimes()
    {
        try
        {
            int tot = listaJogadores.size();
            int qtdTimes = 0;
            Time time = null;
            if((tot>=8)&&(tot<=20))
            {
                qtdTimes = tot/4;
                this.setTotalTimes(this.getTotalTimes()+qtdTimes);
                float mediaEstrelasLista = calculaMediaEstrelas();
                System.out.println("Média da lista: "+mediaEstrelasLista);
                while(this.getTimesFormados()!=this.getTotalTimes())
                {
                    for(int i = 0;i<this.getTotalTimes();i++)
                    {
                        time = sorteiaTime();
                        if(time!=null)
                        {
                            this.setTimesFormados(this.getTimesFormados()+1);
                            System.out.println(time.toString());
                        }
                        else
                        {
                            if((this.getTimesFormados())==(this.getTotalTimes()-1))
                            {
                                time = ultimoTime();
                                System.out.println(time.toString());
                            }
                        }
                        
                    }
                }
                this.verificaLista();
                this.statusSorteio();
            }
            else
            {
                System.out.println("Minimo de jogadores é 8, máximo 20.");
            }
            
        }
        catch(NullPointerException e)
        {
            System.out.println("Formação de times não foi completa, exception: "+e);
            
        }
    }
    public Time ultimoTime()
    {   
        if(this.getTimesFormados()==(this.getTotalTimes()-1))
        {
            if(jogadoresDisponiveis()==4)
            {
                Jogador jogador1 = jogadorDisponivelLista();
                this.setJogadorDisponivelFalso(jogador1.getId());
                Jogador jogador2 = jogadorDisponivelAleatorio();
                this.setJogadorDisponivelFalso(jogador2.getId());
                Jogador jogador3 = jogadorDisponivelAleatorio();
                this.setJogadorDisponivelFalso(jogador3.getId());
                Jogador jogador4 = jogadorDisponivelAleatorio();
                this.setJogadorDisponivelFalso(jogador4.getId());
                Time time = new Time(jogador1,jogador2,jogador3,jogador4);
                this.setTimesFormados(this.getTimesFormados()+1);
                return time;
            }
        }
        
        return null;
        
    }
    public boolean jogadoresDiferentes(Time time)
    {
        //verifica se todos os jogadores são diferentes
        if((time.getJogador1().getId()!=time.getJogador2().getId())&&(time.getJogador1().getId()!=time.getJogador3().getId())&&
          (time.getJogador1().getId()!=time.getJogador4().getId())&&(time.getJogador2().getId()!=time.getJogador3().getId())&&
          (time.getJogador2().getId()!=time.getJogador4().getId()&&(time.getJogador3().getId()!=time.getJogador4().getId())))
        {
            return true;
        }
        else
        {
          return false;
        }
    }
    public boolean verificaMediaTimeLista(Time time)
    {
        //verifica se a média de estrelas do time está abaixo até -0.5 da médiaLista ou até +0.5
        float mediaEstrelasLista = calculaMediaEstrelas();
        if((time.getMediaTime()>=(mediaEstrelasLista-0.5f))&&(time.getMediaTime()<=(mediaEstrelasLista+0.50f)))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public void verificaLista()
    {
        Time fechandoTime = null;
        if((jogadoresDisponiveis()>=1)&&(jogadoresDisponiveis()<=3))
        {
           fechandoTime = ultimoTime(jogadoresDisponiveis());
           this.setTimesFormados(this.getTimesFormados()+1);
           System.out.println(fechandoTime.toString());
        }
    }
    public void setJogadoresIndisponiveis(Time time)
    {
        this.setJogadorDisponivelFalso(time.getJogador1().getId());
        this.setJogadorDisponivelFalso(time.getJogador2().getId());
        this.setJogadorDisponivelFalso(time.getJogador3().getId());
        this.setJogadorDisponivelFalso(time.getJogador4().getId());
    }
    public void statusSorteio()
    {
        System.out.println("Times Formados: "+this.getTimesFormados());
        
    }
    public void opcoes()
    {
        System.out.println("==============================");
        System.out.println("1- Cadastrar Jogador");
        System.out.println("2- Remover Jogador");
        System.out.println("3- Sortear times");
        System.out.println("4- Ver Lista de jogadores");
        System.out.println("5- Sair");
        System.out.println("==============================");
    }
}
 
            
