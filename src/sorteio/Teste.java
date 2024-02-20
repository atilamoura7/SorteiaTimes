package sorteio;

import model.Jogador;
import model.Time;

public class Teste
{
    public static void main(String[]args)
    {
        Sorteio p = new Sorteio();
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
        Jogador jogador11 = new Jogador("Fabio", 5,11);
        Jogador jogador12 = new Jogador("Vn", 4,12);
        Jogador jogador13 = new Jogador("Lucas", 3,13);
        Jogador jogador14 = new Jogador("Ronaldo", 5,14);
        Jogador jogador15 = new Jogador("Alberto", 1,15);
        Jogador jogador16 = new Jogador("Mario", 2, 16);
        Jogador jogador17 = new Jogador("Bruno", 4,17);
        Jogador jogador18 = new Jogador("Will", 3,18);
        Jogador jogador19 = new Jogador("Xuxa", 2,19);
        Jogador jogador20 = new Jogador("Dom", 5,20);
        
        
        
        p.adicionaJogador(jogador1);
        p.adicionaJogador(jogador2);
        p.adicionaJogador(jogador3);
        p.adicionaJogador(jogador4);
        p.adicionaJogador(jogador5);
        p.adicionaJogador(jogador6);
        p.adicionaJogador(jogador7);
        p.adicionaJogador(jogador8);
        p.adicionaJogador(jogador9);
//        p.adicionaJogador(jogador10);
//        p.adicionaJogador(jogador11);
//        p.adicionaJogador(jogador12);
//        p.adicionaJogador(jogador13);
//        p.adicionaJogador(jogador14);
//        p.adicionaJogador(jogador15);
//        p.adicionaJogador(jogador16);
//        p.adicionaJogador(jogador17);
//        p.adicionaJogador(jogador18);
//        p.adicionaJogador(jogador19);
//        p.adicionaJogador(jogador20);
        
        try
        {
            p.quantidadeTimes();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
         
}
