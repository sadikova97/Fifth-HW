package zverio;

public class Insult {

public String animalin;
	
	public void init(String a) {
		this.animalin = a;
		
	}
	public String setInsult(){
		if (animalin == "���") return "in1"; else
		if (animalin == "��������") return "in2" ;else
		if (animalin == "����") return "in2" ;
		if (animalin == "�����") return "in3" ;
		else return "+";
	}



}
