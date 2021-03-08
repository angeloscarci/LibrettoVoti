package model;

import java.time.LocalDate;

public class TestiLibretto {
	
	public static void main(String[] args) {
	
	Libretto libretto = new Libretto();
	
	Voto voto1= new Voto("Analisi 1", 25, LocalDate.of(2019,1, 27));
	libretto.add(voto1);
	libretto.add(new Voto("Fisica 1", 19, LocalDate.of(2019, 7, 6)));
	libretto.add(new Voto("Informatica", 26, LocalDate.of(2019, 2, 1)));
	
	System.out.println(libretto);
	}
}
