package zverio;

public class Insult {

public String animalin;
	
	public void init(String a) {
		this.animalin = a;
		
	}
	public String setInsult(){
		if (animalin == "Лев") return "in1"; else
		if (animalin == "Антилопа") return "in2" ;else
		if (animalin == "Заяц") return "in2" ;
		if (animalin == "Кошка") return "in3" ;
		else return "+";
	}



}
