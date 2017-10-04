package codes;
 
import itens.*;
import codes.Combate;
import codes.Enemy;



public class Player extends Character {
	private Arma arma;
        private Cigarro cigar;
	
	
    public Player(int life, int attack) {
        super(life, attack);
    }
    
    
    
    public void setArma(Arma arma){
    	this.arma = arma;
    }

    public Arma getArma(){
    
    	return this.arma;
    }
    
    public void setCigarro(Cigarro cigar){
        this.cigar = cigar;
    }
    
    public Cigarro getCigarro(){
        return this.cigar;
    }
    
    
    
    public void battle(Enemy enemy) {

        System.out.println("Eh HORA DO DUELOOO");
        System.out.println("* BANG  BANG *");
        while(this.isAlive() && enemy.isAlive()){
            Combate.duelo(enemy,this);
        }
        if(!this.isAlive())
            System.out.println("See you hell cowboy.");
        if (!enemy.isAlive()){
            System.out.println("* INIMIGO RENDIDO *");
            System.out.println("Spike: E aqui vao os meus 5 milhoes.");

       }
    }
}
