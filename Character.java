package zverio;

public class Character {
public String animalch;
	
	public void init(String a) {
		this.animalch = a;
		
	}
	public String setCharacter(){
		if (animalch == "���") return "ch2"; else
		if (animalch == "��������") return "ch3" ;else
		if (animalch == "����") return "ch2" ;
		if (animalch == "�����") return "ch1" ;
		else return "+";
	}


}
