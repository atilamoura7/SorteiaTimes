package sorteio;

import java.util.Scanner;
import model.Jogador;
import model.Time;

public class Teste
{

    public static void main(String[]args)
    {
        
        try
        {
            Scanner sc = new Scanner (System.in);
            int op;
            int id = 11;
            Sorteio sorteio = new Sorteio();
            Jogador jogador = null;
            
            do
            {
               sorteio.opcoes();
               op = sc.nextInt();
               
               if(op!=5)
               {
                   switch(op)
                    {
                        case 1:
                            jogador= new Jogador();
                            jogador.informacoesJogador();
                            jogador.setId(id);
                            sorteio.adicionaJogador(jogador);
                            id++;
                            break;

                        case 2: 
                            System.out.println("Informe o Id do jogador: ");
                            id = sc.nextInt();
                            sorteio.buscaJogador(id);
                            break;

                        case 3: 
                            sorteio.quantidadeTimes();
                            break;
                            
                        case 4:
                            System.out.println(sorteio.getListaJogadores());
                            break;
                           
                        default:
                            System.out.println("Informe um número válido");
                            break;
                    }
               }
            }
            while(op!=5);
            
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+ e);
        }
    }
}