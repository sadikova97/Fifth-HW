package zverio;

public class Character {
public String animalch;
	
	public void init(String a) {
		this.animalch = a;
		
	}
	public String setCharacter(){
		if (animalch == "Лев") return "ch2"; else
		if (animalch == "Антилопа") return "ch3" ;else
		if (animalch == "Заяц") return "ch2" ;
		if (animalch == "Кошка") return "ch1" ;
		else return "+";
	}


}
