package fcu.iecs.oop;

public abstract class Pokemon implements Fightable {
	
	private final String nickName;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String nickName ,PokemonType type,int cp){
		this.nickName = nickName;
		this.type = type;
		this.cp = cp;
	}
	
	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}


	public String getNickName() {
		return nickName;
	}

	public PokemonType getType() {
		return type;
	}


}
