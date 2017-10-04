package itens;

import java.awt.image.BufferedImage;

public class Arma {
	private final int dano;
	
	public Arma(int dano) {
            this.dano = dano;
	}
	
	public int getDano(){
            return dano;
	}
}
