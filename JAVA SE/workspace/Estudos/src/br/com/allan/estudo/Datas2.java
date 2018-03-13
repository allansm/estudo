package br.com.allan.estudo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {
	
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(1994,4,21);
		Date date = c.getTime();
		System.out.println(c.getTime());
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		DateFormat t = DateFormat.getTimeInstance();
		System.out.println(t.format(date));
	}
}
