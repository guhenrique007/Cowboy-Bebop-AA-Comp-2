package codes;

import codes.Enemy;
import codes.Player;

public class Combate {

	public static void duelo(Enemy enemy, Player player){
        turnoEnemy(enemy,player);
        turnoPlayer(enemy,player);
	}
	
	private static void turnoEnemy(Enemy enemy,Player player){
		player.takeDamage(enemy.getAttack());
		System.out.println("Spike levou "+enemy.getAttack()+" de dano.");
		System.out.println("HP de Spike: "+player.getLife());
		
	}
	
	private static void turnoPlayer(Enemy enemy,Player player){
		if(player.isAlive()){
			enemy.takeDamage(player.getAttack()+player.getArma().getDano());
			int danoTotal = player.getAttack()+player.getArma().getDano();
			System.out.println("O inimigo levou "+danoTotal+" de dano.");
			System.out.println("HP inimigo: "+enemy.getLife());
		}
	}
	
	
	
	
}
