package logico;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;

public class Bolsa {
	
	private static ArrayList<Solicitantes> miSolicitante;
	private static ArrayList<EmpresaSolicitadora> miEmpresa;
	private static int solic;
	
	
	private static Bolsa bolsa = null;
	
	public static void init() {
		miSolicitante = new ArrayList<>();
		miEmpresa = new ArrayList<>();
		solic=0;
	}
	public static Bolsa getIntance() {
		if (bolsa == null) {
			bolsa= new Bolsa();
		}
		return bolsa;
	}

   public static void setIntance(Bolsa ban){
	    
	   bolsa=ban;
	   
   }
	/*
	public static void GuardarCliente () throws IOException{
		FileOutputStream f = new FileOutputStream("C:/Users/wichy_000/Documents/Bolsa.dat");
		ObjectOutputStream oos = new ObjectOutputStream(f);
		
		oos.writeInt(cantCliente);
		for(int i=0;i<cantCliente;i++)
			oos.writeObject(miCliente[i]);
		f.close();
	}
	
	
	public static void CargarCliente() throws ClassNotFoundException, IOException{
		FileInputStream f = new FileInputStream("C:/Users/wichy_000/Documents/hola.dat");
		ObjectInputStream oos = new ObjectInputStream(f);
		
		int count = oos.readInt();
		for(int i=0;i<count;i++)
			miCliente[i]=((Cliente)oos.readObject());
		f.close();
	}*/


///////////////////////////////// *FICHEROS*/////////////////////////////////////////////

/// Binario///
public void guardarBolsa() {
try {


FileOutputStream file = new FileOutputStream("BolsaData.dat");//creado directoro o hoja
ObjectOutputStream escritor = new ObjectOutputStream(file);// crendo el lapiz para escribir en la hoja
escritor.writeObject(Bolsa.getIntance()); // escribiendo en la hoja

file.close();
escritor.close();

} catch (IOException e) {
System.out.println("ERROR");
}

}

public void LeerBolsa() {
try {
FileInputStream file = new FileInputStream("BolsaData.dat");
ObjectInputStream leer = new ObjectInputStream(file);
//Referencia a la controladora , puede hacerce instancia a popular si se crea una variable static
Bolsa.setIntance((Bolsa)leer.readObject());
file.close();
leer.close();
} catch (Exception e) {
// TODO: handle exception
}
}

	public  boolean SolicitanteRepetido (String ced){
		boolean repetido = true;
		Solicitantes s= null; 
		s= buscarSolicitante(ced);
		if(s==null)
			repetido=false;
		return repetido;
	}
	
	public  boolean EmpresaRepetida (String RNC){
		boolean repetido = true;
		EmpresaSolicitadora s= null; 
		s= buscarEmpresa(RNC);
		if(s==null)
			repetido=false;
		return repetido;
	}
	
	public  Solicitantes buscarSolicitante(String ced) {
		Solicitantes solic=null;
		if(miSolicitante.size()>0){
			for(int i=0 ; i<miSolicitante.size();i++){
				if (miSolicitante.get(i).getCedula().equalsIgnoreCase(ced)){
					solic=miSolicitante.get(i);
				}
			}
		}
		return solic;	
	}
	
	public  EmpresaSolicitadora buscarEmpresa(String RNC) {
		EmpresaSolicitadora Es=null;
		if(miEmpresa.size()>0){
			for(int i=0 ; i<miEmpresa.size();i++){
				if (miEmpresa.get(i).getRNC().equalsIgnoreCase(RNC)){
					Es=miEmpresa.get(i);
				}
			}
		}
		return Es;	
	}
	

	public  Solicitudes buscarSolicitud(String ID) {
		Solicitudes Es=null;
		if(miEmpresa.size()>0){
			for(int i=0 ; i<miEmpresa.size();i++){
				for(int a=0; a<miEmpresa.get(i).getMiSolicitudes().size();a++){
					if (miEmpresa.get(i).getMiSolicitudes().get(a).getId().equalsIgnoreCase(ID)){
						Es=miEmpresa.get(i).getMiSolicitudes().get(a);
					}
				}
			}
		}
		return Es;	
	}
	
	public  void RealizarMacheo(Solicitudes Solicitud, String RNC){
		float porciento=0;
		int plazas=Solicitud.plaza;
		EmpresaSolicitadora miEmpresaMACHEO = buscarEmpresa(RNC);
		for (int i=0; i<miSolicitante.size();i++){
			porciento=0;
			
			//////////////////////////////////////////////////////////////////////////////////////Universidad
			if(Solicitud instanceof SolicitudesUni && miSolicitante.get(i) instanceof Universitario && plazas>0 &&  miSolicitante.get(i).habilitado==true){
				Universitario SolicitanteUni = (Universitario) miSolicitante.get(i);
				SolicitudesUni solEmp = (SolicitudesUni) Solicitud;
				if(SolicitanteUni.getCarrera().equalsIgnoreCase(solEmp.getCarrera()) && SolicitanteUni.getAreaInteres().equalsIgnoreCase(solEmp.getAreaInteres())){
					
					if(solEmp.getSexo().equalsIgnoreCase("N/A"))///////////////////Sexo
						porciento+=8.3333;
					else
						if(SolicitanteUni.getSexo().equalsIgnoreCase(solEmp.getSexo()))
							porciento+=8.3333;
					
					if(solEmp.getEstadoCivil().equalsIgnoreCase("N/A"))///////////////////EstadoCivil
						porciento+=8.3333;
					else
						if(SolicitanteUni.getEstadoCivil().equalsIgnoreCase(solEmp.getEstadoCivil()))
							porciento+=8.3333;
					
					if(solEmp.getCuidad().equalsIgnoreCase("N/A"))////////////////////////Cuidad
						porciento+=8.3333;
					else
						if(SolicitanteUni.getCuidad().equalsIgnoreCase(solEmp.getCuidad()))
							porciento+=8.3333;
					
					if(SolicitanteUni.getPais().equalsIgnoreCase(solEmp.getPais()))////////////////////////Pais
						porciento+=8.3333;
					if(SolicitanteUni.getSalirioSolicitado()<=solEmp.getSalirioSolicitado())//////////SalarioSolicitado
						porciento+=8.3333;
					if(SolicitanteUni.dispMudarse==false && solEmp.dispMudarse==true)//////////DisponibilidadMudarse
						System.out.println("");
					else
						porciento+=8.3333;
					if(SolicitanteUni.dispViajar==false && solEmp.dispViajar==true)//////////DisponibilidadViajar
						System.out.println("");
					else
						porciento+=8.3333;
					if(SolicitanteUni.getTipoJornada().equalsIgnoreCase(solEmp.getTipoJornada()))////////////////////////Jornada
						porciento+=8.3333;
					
					for(int a=0;a<SolicitanteUni.getIdioma().size();a++){ ////////////////////////Idioma
						for(int b=0;b<solEmp.getIdioma().size();b++){
							if(SolicitanteUni.getIdioma().get(a).equalsIgnoreCase(solEmp.getIdioma().get(b)))
								porciento+=(8.3333/solEmp.getIdioma().size());
						}
					}
					
					if(SolicitanteUni.licencia==false && solEmp.licencia==true)///////////////Licencia
						System.out.println("");
					else
						porciento+=8.3333;
					
					 /////////////////////////////////////////AreaExp
					if(SolicitanteUni.getAreaTrabajo1().equalsIgnoreCase(solEmp.areadeExp)&&
						SolicitanteUni.getTiempotrabajoRealizado1()>=solEmp.getAnosExp())
						porciento+=8.3333;
					
					
					if(solEmp.getInstitucion().equalsIgnoreCase("N/A"))////////////////////////Institucion
						porciento+=8.3333;
					else
						if(SolicitanteUni.getInstitucion().equalsIgnoreCase(solEmp.getInstitucion()))
						porciento+=8.3333;		
				}
				
				if(porciento>=solEmp.porcientoAceptable){
					plazas--;
					miSolicitante.get(i).setPorciento(porciento);
					Solicitud.miSolicitantes.add(miSolicitante.get(i));
					miSolicitante.get(i).setHabilitado(false);
				}
			}
			
			//////////////////////////////////////////////////////////////////////////////////////OBRERO
			if(Solicitud instanceof SolicitudesObrero && miSolicitante.get(i) instanceof Obrero && plazas>0 &&  miSolicitante.get(i).habilitado==true){
				int paso = 0;
				Obrero SolicitanteObrero = (Obrero) miSolicitante.get(i);
				SolicitudesObrero solEmp = (SolicitudesObrero) Solicitud;
				if(SolicitanteObrero.getAreaInteres().equalsIgnoreCase(solEmp.getAreaInteres())){
					for(int d=0;d<SolicitanteObrero.getListaHabilidades().size();d++){ ////////////////////////HABILIDADES
						for(int e=0;e<solEmp.getListaHabilidades().size();e++){
							if(SolicitanteObrero.getListaHabilidades().get(d).equalsIgnoreCase(solEmp.getListaHabilidades().get(e)))
								paso += 1;
						}
					}
					
					if(paso==solEmp.getListaHabilidades().size()){
					
						if(solEmp.getSexo().equalsIgnoreCase("N/A"))///////////////////Sexo
							porciento+=9.09;
						else
						if(SolicitanteObrero.getSexo().equalsIgnoreCase(solEmp.getSexo()))
							porciento+=9.09;
						if(solEmp.getEstadoCivil().equalsIgnoreCase("N/A"))///////////////////EstadoCivil
							porciento+=9.09;
						else
							if(SolicitanteObrero.getEstadoCivil().equalsIgnoreCase(solEmp.getEstadoCivil()))
							porciento+=9.09;
						if(solEmp.getCuidad().equalsIgnoreCase("N/A"))////////////////////////Cuidad
							porciento+=9.09;
						else
							if(SolicitanteObrero.getCuidad().equalsIgnoreCase(solEmp.getCuidad()))
							porciento+=9.09;
						if(SolicitanteObrero.getPais().equalsIgnoreCase(solEmp.getPais()))////////////////////////Pais
							porciento+=9.09;
						if(SolicitanteObrero.getSalirioSolicitado()<=solEmp.getSalirioSolicitado())//////////SalarioSolicitado
							porciento+=9.09;
						if(SolicitanteObrero.dispMudarse==false && solEmp.dispMudarse==true)//////////DisponibilidadMudarse
							System.out.println("");
						else
							porciento+=9.09;
						if(SolicitanteObrero.dispViajar==false && solEmp.dispViajar==true)//////////DisponibilidadViajar
							System.out.println("");
						else
							porciento+=9.09;
						if(SolicitanteObrero.getTipoJornada().equalsIgnoreCase(solEmp.getTipoJornada()))////////////////////////Jornada
							porciento+=9.09;
						
						for(int g=0;g<SolicitanteObrero.getIdioma().size();g++){ ////////////////////////Idioma
							for(int h=0;h<solEmp.getIdioma().size();h++){
								if(SolicitanteObrero.getIdioma().get(g).equalsIgnoreCase(solEmp.getIdioma().get(h)))
									porciento+=(9.09/solEmp.getIdioma().size());
							}
						}
						
						if(SolicitanteObrero.licencia==false && solEmp.licencia==true)///////////////Licencia
							System.out.println("");
						else
							porciento+=9.09;
						
						/////////////////////////////////////////AreaExp
						if(SolicitanteObrero.getAreaTrabajo1().equalsIgnoreCase(solEmp.areadeExp)&&
								SolicitanteObrero.getTiempotrabajoRealizado1()>=solEmp.getAnosExp())
							porciento+=9.09;
						
						
					}	
				}
				if(porciento>=solEmp.porcientoAceptable){
					plazas--;
					miSolicitante.get(i).setPorciento(porciento);
					Solicitud.miSolicitantes.add(miSolicitante.get(i));
					miSolicitante.get(i).setHabilitado(false);
				}
			}
			
			/////////////////////////////////////////////////////////////////////////////////////TECNICO
			if(Solicitud instanceof SolicitudesTecnico && miSolicitante.get(i) instanceof Tecnico && plazas>0 &&  miSolicitante.get(i).habilitado==true ){	
				Tecnico SolicitanteTecnico = (Tecnico) miSolicitante.get(i);
				SolicitudesTecnico solEmp = (SolicitudesTecnico) Solicitud;
				if(SolicitanteTecnico.getTecnico().equalsIgnoreCase(solEmp.getTecnico()) && SolicitanteTecnico.getAreaInteres().equalsIgnoreCase(solEmp.getAreaInteres())){
					if(solEmp.getSexo().equalsIgnoreCase("N/A"))///////////////////Sexo
						porciento+=8.3333;
					else
					if(SolicitanteTecnico.getSexo().equalsIgnoreCase(solEmp.getSexo()))
						porciento+=8.3333;
					if(solEmp.getEstadoCivil().equalsIgnoreCase("N/A"))///////////////////EstadoCivil
						porciento+=8.3333;
					else
						if(SolicitanteTecnico.getEstadoCivil().equalsIgnoreCase(solEmp.getEstadoCivil()))
						porciento+=8.3333;
					if(solEmp.getCuidad().equalsIgnoreCase("N/A"))////////////////////////Cuidad
						porciento+=8.3333;
					else
						if(SolicitanteTecnico.getCuidad().equalsIgnoreCase(solEmp.getCuidad()))
						porciento+=8.3333;
					if(SolicitanteTecnico.getPais().equalsIgnoreCase(solEmp.getPais()))////////////////////////Pais
						porciento+=8.3333;
					if(SolicitanteTecnico.getSalirioSolicitado()<=solEmp.getSalirioSolicitado())//////////SalarioSolicitado
						porciento+=8.3333;
					if(SolicitanteTecnico.dispMudarse==false && solEmp.dispMudarse==true)//////////DisponibilidadMudarse
						System.out.println("");
					else
						porciento+=8.3333;
					if(SolicitanteTecnico.dispViajar==false && solEmp.dispViajar==true)//////////DisponibilidadViajar
						System.out.println("");
					else
						porciento+=8.3333;
					if(SolicitanteTecnico.getTipoJornada().equalsIgnoreCase(solEmp.getTipoJornada()))////////////////////////Jornada
						porciento+=8.3333;
					
					for(int k=0;k<SolicitanteTecnico.getIdioma().size();k++){ ////////////////////////Idioma
						for(int l=0;l<solEmp.getIdioma().size();l++){
							if(SolicitanteTecnico.getIdioma().get(k).equalsIgnoreCase(solEmp.getIdioma().get(l)))
								porciento+=(8.3333/solEmp.getIdioma().size());
						}
					}
					
					if(SolicitanteTecnico.licencia==false && solEmp.licencia==true)///////////////Licencia
						System.out.println("");
					else
						porciento+=8.3333;
					
					/////////////////////////////////////////AreaExp
					if(SolicitanteTecnico.getAreaTrabajo1().equalsIgnoreCase(solEmp.areadeExp)&&
							SolicitanteTecnico.getTiempotrabajoRealizado1()>=solEmp.getAnosExp())
						porciento+=8.3333;
					
				}
				if(porciento>=Solicitud.porcientoAceptable){
					plazas--;
					miSolicitante.get(i).setPorciento(porciento);
					Solicitud.miSolicitantes.add(miSolicitante.get(i));
					miSolicitante.get(i).setHabilitado(false);
				}	
			}
		}
		if(plazas==0){
			Solicitud.setSatisfecho(true);
		}
	}
	
	public  void insertarSolicitante(Solicitantes solic){
		miSolicitante.add(solic);
	}
	public  void eliminarSolicitante(Solicitantes solic){
		miSolicitante.remove(solic);
	}
	public  void insertarEmpresa(EmpresaSolicitadora Es){
		miEmpresa.add(Es);
	}
	public  void eliminarEmpresa(EmpresaSolicitadora Es){
		miEmpresa.remove(Es);
	}
	public  ArrayList<Solicitantes> getMiSolicitante() {
		return miSolicitante;
	}
	public  void setMiSolicitante(ArrayList<Solicitantes> miSolicitante) {
		Bolsa.miSolicitante = miSolicitante;
	}
	public  ArrayList<EmpresaSolicitadora> getMiEmpresa() {
		return miEmpresa;
	}
	public  void setMiEmpresa(ArrayList<EmpresaSolicitadora> miEmpresa) {
		Bolsa.miEmpresa = miEmpresa;
	}
	
	public  int getSolic() {
		return solic;
	}

	public  void setSolic(int solic) {
		Bolsa.solic = solic;
	}
}
