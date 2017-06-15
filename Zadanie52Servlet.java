
package com;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zverio.Character;
import zverio.Dish;
import zverio.Insult;
import zverio.Paw;


@SuppressWarnings("serial")
public class Zadanie52Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");

		String character = req.getParameter("character");
		String insult = req.getParameter("insult");
		String dish = req.getParameter("dish");
		String paw = req.getParameter("paw");

		
		int lion = 0, antelope = 0, hare = 0, cat=0;

		lion = podschet("Лев", character, insult, dish);
		antelope = podschet("Антилопа", character, insult, dish);
		hare = podschet("Заяц", character, insult, dish);
		cat = podschet("Кошка", character, insult, dish);
		
		int arr[] = {lion, antelope, hare, cat};
		int max=0;
		String m;
		
		for (int i=0; i<4; i++)
			if (arr[i]>max) max=arr[i];
		
		if (max==0)
			resp.getWriter().println("<div class=\"bad\">Ррррр  <br>    Введите хоть что-нибудь</div>");
		else{
			Paw p = new Paw();
			p.init(paw);
			if (p.setPaw() == "Молодец"){
				resp.getWriter().println("<div class=\"holod \"> p.setPaw  </div>" );
			}
			
			resp.getWriter().println("<div class=\"well\"> Вы  </div>" );
			
			if (lion==max){
				resp.getWriter().println("<div class=\"well\"> <img src=\"checkmark_icon-icons.com_50429.png\" width=\"30\"> <b> Лев </b> </div>" );
				
			}
			if (antelope==max){
				resp.getWriter().println("<div class=\"well\"> <img src=\"checkmark_icon-icons.com_50429.png\" width=\"30\"> <b> Антилопа </b> </div>" );
			
			}
			if (hare==max){
				resp.getWriter().println("<div class=\"well\"> <img src=\"checkmark_icon-icons.com_50429.png\" width=\"30\">  <b> Заяц  </b> </div>" );
				
			}
			if (cat==max){
				resp.getWriter().println("<div class=\"well\"> <img src=\"checkmark_icon-icons.com_50429.png\" width=\"30\">  <b> Кошка  </b> </div>" );
				
			}
		}
	}
	

	public int podschet(String name, String character, String insult, String dish) {

		int sum = 0;
		int s;

		Character g = new Character();
		g.init(name);
		if (g.setCharacter().indexOf(character) != -1)
			sum++;

		Insult d = new Insult();
		d.init(name);
		if (d.setInsult().indexOf(insult) != -1)
			sum++;

		Dish r = new Dish();
		r.init(name);
		if (r.setDish().indexOf(dish) != -1)
			sum++;

		
		return sum;
		
	}

}


