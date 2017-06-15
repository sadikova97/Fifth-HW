package zverio;

public class Dish {

public String animaldi;
		public void init(String a) {
		this.animaldi = a;
		
	}
	public String setDish(){
		if (animaldi == "Лев") return "di2"; else
		if (animaldi == "Антилопа") return "di1" ;else
		if (animaldi == "Заяц") return "di4" ;
		if (animaldi == "Кошка") return "di3" ;
		else return "+";
	}




}
