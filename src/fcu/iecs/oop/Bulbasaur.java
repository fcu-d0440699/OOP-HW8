package fcu.iecs.oop;

public class Bulbasaur extends Pokemon{
	
	public Bulbasaur(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);
		// TODO Auto-generated constructor stub
	}

	public void attack(){
		System.out.println("Tackle...");
	}
}