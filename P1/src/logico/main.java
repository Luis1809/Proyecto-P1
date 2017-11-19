package logico;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import com.oracle.net.Sdp;

public class main {

	private static Bolsa miBolsa;
	public static void main(String[] args) {
		
		miBolsa =new Bolsa();
		ArrayList<String> idiomas=new ArrayList<>();
		ArrayList<ExperienciaLaboral> exp =new ArrayList<>();
		
		idiomas.add("ingles");
		idiomas.add("Espanol");
		
		ExperienciaLaboral e = new ExperienciaLaboral("La Fabril", "TI", 5, "Jose Maita", "809-849-3030");
		exp.add(e);
		
		Solicitantes s1= new Tecnico("111-111-1","Ricardo","Santos", "809-100-200", "2000", "M", "Soltero","al lado tuyo","La vega", "Rep.Dom", LocalDate.of(1995, Month.JANUARY, 1), 10000, true, true, "Tiempo Completo", idiomas, "Ventas",false, true, LocalDate.now(), exp, "Pucmm", "Limpiador");
		
		miBolsa.insertarSolicitante(s1);
	
	

		
		
		
		
		
		
		
		
		
	}

}
