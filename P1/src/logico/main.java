package logico;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class main {

	private static Bolsa miBolsa;
	public static void main(String[] args) {
		
		miBolsa =new Bolsa();
		
		//Solicitante Tecnico
		ArrayList<String> idiomas=new ArrayList<>();
		ArrayList<ExperienciaLaboral> exp1 =new ArrayList<>();
		idiomas.add("ingles");
		idiomas.add("Espanol");
		ExperienciaLaboral e = new ExperienciaLaboral("La Fabril", "TI", 5, "Jose Maita", "809-849-3030");
		exp1.add(e);
		Solicitantes s1= new Tecnico("111-111-1","Ricardo","Santos", "809-100-200", "2000", "M", "Soltero","al lado tuyo","La vega", "Rep.Dom", LocalDate.of(1995, Month.JANUARY, 1), 10000, true, true, "Tiempo Completo", idiomas, "Ventas",false, true, LocalDate.now(), exp1, "Pucmm", "Limpiador");
		//
		
		//Solicitante Universitario
		ExperienciaLaboral e2 = new ExperienciaLaboral("SAMSUNG", "Desarrollo", 5, "Fernando", "809-849-1030");
		exp1.add(e2);
		Solicitantes s2 =new Universitario( "222-222-2","Jan","Rodriguez", "809-302-7070", "4000", "M", "Soltero","En la Esquina","Santiago", "Rep.Dom", LocalDate.of(1998, Month.JANUARY, 6), 10000, true, true, "Tiempo Completo", idiomas, "Ventas",false, true, LocalDate.now(), exp1, "Pucmm","Telematica");
		//
		
		miBolsa.insertarSolicitante(s1);
		miBolsa.insertarSolicitante(s2);
	    
		//Solicitud Empresa Obrero1
		ArrayList<String> idiomas2=new ArrayList<>();
		ArrayList<String> ListaHabilidades =new ArrayList<>();
		idiomas2.add("Arabe");
		idiomas2.add("Espanol");
		ListaHabilidades.add("Plomero");
		ListaHabilidades.add("Maestro Constructor");	
		Solicitudes sol = new SolicitudesObrero("M", "Soltero", "La vega", "Rep.Dom", 10000, true, true, "Tiempo Completo", idiomas2, "Ventas", true,"Ventas" , 5, 3, ListaHabilidades , 30);
		//
		
		
		
		
	}

}
