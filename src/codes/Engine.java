package codes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import itens.*;

/**
 * Created by filipebraida on 31/05/16.
 */
public class Engine {
    
   
    
    public static void main(String[] args) throws IOException {
        Book book = Engine.createBook();

        System.out.println(book.showHistoryBook());

        Scanner in = new Scanner(System.in);

        do {
            System.out.println(book.showHistory());

            System.out.println("Escolha:  ");

            for(Choice choice:book.nextEvents()) {
                System.out.println(choice.getDescription());
            }

            int i;
            do {
                i = in.nextInt();
            } while(!book.nextEvent(i));
        } while(!book.isTheEnd());

        System.out.println(book.showHistory());
    }

    public static Book createBook() {
    	Player spike = new Player(100,30);
    	spike.setArma(new Arma(70));
    	spike.setCigarro(new Cigarro(1));
    	
        Event endGame = new BlankEvent("SEE YOU SPACE COWBOY",new ArrayList<Choice>());
    	
        Collection escolhaResposta = new ArrayList<Choice>();
        Choice escolhaWhat = new BlankChoice("Spike: Whatever happens,happens.",endGame);
        escolhaResposta.add(escolhaWhat);
        
    	Event eventoLutar = new BlankEvent("Spike: E aqui vão os meus 5 milhões!\n\n"
        +"  *RÁDIO* \n"
        + "Jet: Spike,está faltando combustível,são chanches mínimas de você retornar.",escolhaResposta);
    	Event eventoRender = new BlankEvent("Spike larga a arma no chão, "
    	+"o rapaz percebe que ele é um caçador de recompensa e mata Spike.",new ArrayList<Choice>());
    	Collection escolhaLuta = new ArrayList<Choice>();
    	Choice escolhaLutar = new BattleChoice("Reagir",eventoLutar,new Fugitivo(50,50));
    	Choice escolhaRender = new BattleChoice("Se render",eventoRender,new Fugitivo(100,100));
    	escolhaLuta.add(escolhaLutar);
    	escolhaLuta.add(escolhaRender);
    	
    	
    	Event eventoBeco =  new BlankEvent("Spike seguiu o rapaz até um beco,"
        +" então o rapaz saca uma arma e ameaça Spike.",escolhaLuta);
    	Event eventoFim1 =  new BlankEvent("Spike ficou no bar e se embebedou ao invés de seguir a missão.",new ArrayList<Choice>());
    	Collection escolhaBar = new ArrayList<Choice>();
    	Choice escolhaSeguir = new BlankChoice("Seguí-lo",eventoBeco);
    	Choice escolhaIgnorar = new BlankChoice("Ignorar",eventoFim1);
    	escolhaBar.add(escolhaSeguir);
    	escolhaBar.add(escolhaIgnorar);
    	
    	
    	Event eventoViagem = new BlankEvent("Spike pega sua nave e dirige-se à Marte. "
        +"Para em um bar e um sujeito com um mala parece aflito, olha para os lados e começa a andar depressa",escolhaBar);
    	Collection escolhaViagem = new ArrayList<Choice>();
    	Choice escolhaViajar =  new BlankChoice("Spike: Okay, me avise se tiver notícias novas",eventoViagem);
    	escolhaViagem.add(escolhaViajar);
   
    	
    	Event eventoSujeito = new BlankEvent("Jet: Chama-se Yolo, ele carrega uma arma biológica ultra secreta, foi visto pela última vez em Marte.",escolhaViagem);
        Event eventoFim0 =  new BlankEvent("Jet: Ora, então arranje outra nave para morar.", new ArrayList<Choice>());  	
    	Collection escolhaConversa1 = new ArrayList<Choice>();
    	Choice escolhaAceitar = new BlankChoice("Spike: Valor interessante, quem é o sujeito?.",eventoSujeito);
        Choice escolhaNegar = new BlankChoice("Spike: Cansei de ser caçador de recompensa.", eventoFim0);
        escolhaConversa1.add(escolhaAceitar);
        escolhaConversa1.add(escolhaNegar);
    	
    	
    	Event eventoNoticia = new BlankEvent("Jet: Você vai adorar a recompensa nova."+"5 milhões de woolongs", escolhaConversa1);
        Event eventoReclamar =  new BlankEvent("Jet: Ora, então arranje outra nave para morar.", new ArrayList<Choice>());  	
    	Collection escolhaConversa = new ArrayList<Choice>();
    	Choice escolhaElogiar = new BlankChoice("Spike: Com essa fome, até poeira cairia bem.",eventoNoticia);
        Choice escolhaReclamar = new BlankChoice("Spike: Não tinha algo mehor?", eventoReclamar);
        escolhaConversa.add(escolhaElogiar);
        escolhaConversa.add(escolhaReclamar);
    	
    	
        Event eventoComer = new BlankEvent("Jet:Preparei ensopado de lagosta.", escolhaConversa);
        Event eventoDormir =  new BlankEvent("A preguiça lhe fez perder uma grande recompensa.", new ArrayList<Choice>()); 
        Collection escolhasIniciais = new ArrayList<Choice>();
        Choice escolhaSerGentil = new BlankChoice("Spike: Oh...O que você preparou?", eventoComer);
        Choice escolhaSerRude = new BlankChoice("Spike: Oh...Me deixe dormir,Jet.", eventoDormir);
        escolhasIniciais.add(escolhaSerGentil);
        escolhasIniciais.add(escolhaSerRude);

        Event eventoInitial = new BlankEvent("Jet: Ei,Spike! Acorda."+"O jantar está "+"pronto", escolhasIniciais);

        Book livro = new Book("Cowboy Bebop", eventoInitial,spike);

        return livro;
    }
}
