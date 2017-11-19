package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Bolsa b =new Bolsa();
		ArrayList<String> idiomas=new ArrayList<String>();
		
		idiomas.add("ingles");
		idiomas.add("Espanol");
		LocalDate d =LocalDate.now();
		Date d= new Date(17, 05, 17);
		LocalDate d2 ;
		ExperienciaLaboral exp =new ExperienciaLaboral("La Fabril", "TI", 5, "Jose Maita", "809-849-3030");
		
		Solicitantes s1=new Tecnico("111-111-1","Ricardo","Santos", "809-100-200", "2000", "M", "Soltero","al lado tuyo","La vega", "Rep.Dom", d, 10000, true, true, "Tiempo Completo", idiomas, "Ventas",false, "Si", d, exp, "Pucmm", "Limpiador");
	
		
		b.insertarSolicitante(s1);
	
	

		
		
		
		
		
		
		
		
		
	}

}
