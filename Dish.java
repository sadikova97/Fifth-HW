package zverio;

public class Dish {

public String animaldi;
		public void init(String a) {
		this.animaldi = a;
		
	}
	public String setDish(){
		if (animaldi == "���") return "di2"; else
		if (animaldi == "��������") return "di1" ;else
		if (animaldi == "����") return "di4" ;
		if (animaldi == "�����") return "di3" ;
		else return "+";
	}




}
