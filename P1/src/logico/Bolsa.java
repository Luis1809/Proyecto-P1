package logico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;

public class Bolsa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5854934147985305391L;
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
	
///////////////////////////////// *FICHEROS*/////////////////////////////////////////////
 //Guardar cliente
 	public static void GuardarEmpresa() throws IOException{
 		FileOutputStream f = new FileOutputStream("Empresa.dat");
 		ObjectOutputStream oos = new ObjectOutputStream(f);
 		
 		oos.writeInt(miEmpresa.size());
 		
 		for(int i=0;i<miEmpresa.size();i++){
 			oos.writeObject(miEmpresa.get(i));}
 		
 		f.close();
 	}
 			
 	public static void CargarEmpresa() throws ClassNotFoundException, IOException{
 		FileInputStream f = new FileInputStream("Empresa.dat");
 		ObjectInputStream oos = new ObjectInputStream(f);
 		
 		int count = oos.readInt();
 		for(int i=0;i<count;i++){
 			EmpresaSolicitadora e=((EmpresaSolicitadora)oos.readObject());
 			miEmpresa.add(e);
 			}
 			
 		f.close();
 	}
 	
 	public static void GuardarSolic() throws IOException{
 		FileOutputStream f = new FileOutputStream("Solic.dat");
 		ObjectOutputStream oos = new ObjectOutputStream(f);
 		
 		oos.writeInt(solic);
 		oos.writeObject(solic);
 
 		
 		f.close();
 	}
 			
 	public static void CargarSolic() throws ClassNotFoundException, IOException{
 		FileInputStream f = new FileInputStream("Solic.dat");
 		ObjectInputStream oos = new ObjectInputStream(f);
 	
 		int s=((int)oos.readInt());
 		solic=s;
 			
 		f.close();
 	}
 	
 	public static void GuardarSolicitante() throws IOException{
 		FileOutputStream f = new FileOutputStream("Solicitante.dat");
 		ObjectOutputStream oos = new ObjectOutputStream(f);
 		
 		oos.writeInt(miSolicitante.size());
 		
 		for(int a=0;a<miSolicitante.size();a++){
 			oos.writeObject(miSolicitante.get(a));}
 		
 		f.close();
 	}
 			
 	public static void Cargarsolicitante() throws ClassNotFoundException, IOException{
 		FileInputStream f = new FileInputStream("Solicitante.dat");
 		ObjectInputStream oos = new ObjectInputStream(f);
 		
 		int count = oos.readInt();
 		for(int a=0;a<count;a++){
 			Solicitantes c=((Solicitantes)oos.readObject());
 			miSolicitante.add(c);}
 			
 		f.close();
 	}
 	
 	public static boolean archivoCreadoEmpresa() throws IOException{
 		boolean creado=false;
 		File f = new File("Empresa.dat");
 		//System.out.println(f.length());
 		if(f.exists() && !f.isDirectory() && f.length()!=4) 
 			creado=true;
 		return creado;
 	}
	public static boolean archivoCreadoSolicitante() throws IOException{
 		boolean creado=false;
 		File f = new File("Solicitante.dat");
 		//System.out.println(f.length());
 		if(f.exists() && !f.isDirectory() && f.length()!=4) 
 			creado=true;
 		return creado;
 	}
	
	public static boolean archivoCreadoSolic() throws IOException{
 		boolean creado=false;
 		File f = new File("Solic.dat");
 		//System.out.println(f.length());
 		if(f.exists() && !f.isDirectory() && f.length()!=4) 
 			creado=true;
 		return creado;
 	}

	public  static boolean SolicitanteRepetido (String ced){
		boolean repetido = true;
		Solicitantes s= null; 
		s= buscarSolicitante(ced);
		if(s==null)
			repetido=false;
		return repetido;
	}
	
	public static boolean EmpresaRepetida (String RNC){
		boolean repetido = true;
		EmpresaSolicitadora s= null; 
		s= buscarEmpresa(RNC);
		if(s==null)
			repetido=false;
		return repetido;
	}
	
	public  static Solicitantes buscarSolicitante(String ced) {
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
	
	public static  EmpresaSolicitadora buscarEmpresa(String RNC) {
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
	

	public static Solicitudes buscarSolicitud(String ID) {
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
	
	public static void RealizarMacheo(Solicitudes Solicitud, String RNC){
		float porciento=0;
		int plazas=Solicitud.plaza;
		EmpresaSolicitadora miEmpresaMACHEO = buscarEmpresa(RNC);
		for (int i=0; i<miSolicitante.size();i++){
			for (int n=0; n<miSolicitante.get(i).getMiSolicitud().size();n++){
				porciento=0;
				
				//////////////////////////////////////////////////////////////////////////////////////Universidad
				if(Solicitud instanceof SolicitudesUni && miSolicitante.get(i).getMiSolicitud().get(n) instanceof Universitario && plazas>0 &&  miSolicitante.get(i).habilitado==true){
					Solicitantes SolicitanteUni = miSolicitante.get(i);
					Universitario SolicitudUni = (Universitario) miSolicitante.get(i).getMiSolicitud().get(n);
					SolicitudesUni solEmp = (SolicitudesUni) Solicitud;
					if(SolicitudUni.getCarrera().equalsIgnoreCase(solEmp.getCarrera()) && SolicitudUni.getAreaInteres().equalsIgnoreCase(solEmp.getAreaInteres())){
						
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
						if(SolicitudUni.getSalirioSolicitado()<=solEmp.getSalirioSolicitado())//////////SalarioSolicitado
							porciento+=8.3333;
						if(SolicitudUni.isDispMudarse()==false && solEmp.dispMudarse==true)//////////DisponibilidadMudarse
							System.out.println("");
						else
							porciento+=8.3333;
						if(SolicitudUni.isDispViajar()==false && solEmp.dispViajar==true)//////////DisponibilidadViajar
							System.out.println("");
						else
							porciento+=8.3333;
						if(SolicitudUni.getTipoJornada().equalsIgnoreCase(solEmp.getTipoJornada()))////////////////////////Jornada
							porciento+=8.3333;
						
						for(int v=0;v<SolicitanteUni.getIdioma().size();v++){ ////////////////////////Idioma
							for(int b=0;b<solEmp.getIdioma().size();b++){
								if(SolicitanteUni.getIdioma().get(v).equalsIgnoreCase(solEmp.getIdioma().get(b)))
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
							if(SolicitudUni.getInstitucion().equalsIgnoreCase(solEmp.getInstitucion()))
							porciento+=8.3333;		
					}
					
					if(porciento>=solEmp.porcientoAceptable){
						plazas--;
						miSolicitante.get(i).getMiSolicitud().get(n).setPorciento(porciento);
						for(int m=0;m<miSolicitante.get(i).getMiSolicitud().size();m++){
							if(m!=n)
								miSolicitante.get(i).getMiSolicitud().remove(m);}
						Solicitud.miSolicitantes.add(miSolicitante.get(i));
						miSolicitante.get(i).setHabilitado(false);
					}
				}
				
				//////////////////////////////////////////////////////////////////////////////////////OBRERO
				if(Solicitud instanceof SolicitudesObrero && miSolicitante.get(i).getMiSolicitud().get(n) instanceof Obrero && plazas>0 &&  miSolicitante.get(i).habilitado==true){
					int paso = 0;
					Solicitantes SolicitanteObrero = miSolicitante.get(i);
					Obrero SolicitudObrero = (Obrero) miSolicitante.get(i).getMiSolicitud().get(n);
					SolicitudesObrero solEmp = (SolicitudesObrero) Solicitud;
					if(SolicitudObrero.getAreaInteres().equalsIgnoreCase(solEmp.getAreaInteres())){
						for(int d=0;d<SolicitudObrero.getListaHabilidades().size();d++){ ////////////////////////HABILIDADES
							for(int e=0;e<solEmp.getListaHabilidades().size();e++){
								if(SolicitudObrero.getListaHabilidades().get(d).equalsIgnoreCase(solEmp.getListaHabilidades().get(e)))
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
							if(SolicitudObrero.getSalirioSolicitado()<=solEmp.getSalirioSolicitado())//////////SalarioSolicitado
								porciento+=9.09;
							if(SolicitudObrero.isDispMudarse()==false && solEmp.dispMudarse==true)//////////DisponibilidadMudarse
								System.out.println("");
							else
								porciento+=9.09;
							if(SolicitudObrero.isDispViajar()==false && solEmp.dispViajar==true)//////////DisponibilidadViajar
								System.out.println("");
							else
								porciento+=9.09;
							if(SolicitudObrero.getTipoJornada().equalsIgnoreCase(solEmp.getTipoJornada()))////////////////////////Jornada
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
						miSolicitante.get(i).getMiSolicitud().get(n).setPorciento(porciento);
						for(int m=0;m<miSolicitante.get(i).getMiSolicitud().size();m++){
							if(m!=n)
								miSolicitante.get(i).getMiSolicitud().remove(m);}
						
						Solicitud.miSolicitantes.add(miSolicitante.get(i));
						miSolicitante.get(i).setHabilitado(false);
					}
				}
				
				/////////////////////////////////////////////////////////////////////////////////////TECNICO
				if(Solicitud instanceof SolicitudesTecnico && miSolicitante.get(i).getMiSolicitud().get(n) instanceof Tecnico && plazas>0 &&  miSolicitante.get(i).habilitado==true ){	
					Solicitantes SolicitanteTecnico = miSolicitante.get(i);
					Tecnico SolicitudTecnico = (Tecnico) miSolicitante.get(i).getMiSolicitud().get(n);
					SolicitudesTecnico solEmp = (SolicitudesTecnico) Solicitud;
					if(SolicitudTecnico.getTecnico().equalsIgnoreCase(solEmp.getTecnico()) && SolicitudTecnico.getAreaInteres().equalsIgnoreCase(solEmp.getAreaInteres())){
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
						if(SolicitudTecnico.getSalirioSolicitado()<=solEmp.getSalirioSolicitado())//////////SalarioSolicitado
							porciento+=8.3333;
						if(SolicitudTecnico.isDispMudarse()==false && solEmp.dispMudarse==true)//////////DisponibilidadMudarse
							System.out.println("");
						else
							porciento+=8.3333;
						if(SolicitudTecnico.isDispViajar()==false && solEmp.dispViajar==true)//////////DisponibilidadViajar
							System.out.println("");
						else
							porciento+=8.3333;
						if(SolicitudTecnico.getTipoJornada().equalsIgnoreCase(solEmp.getTipoJornada()))////////////////////////Jornada
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
						miSolicitante.get(i).getMiSolicitud().get(n).setPorciento(porciento);
						
						for(int m=0;m<miSolicitante.get(i).getMiSolicitud().size();m++){
							if(m!=n)
								miSolicitante.get(i).getMiSolicitud().remove(m);}
						Solicitud.miSolicitantes.add(miSolicitante.get(i));
						miSolicitante.get(i).setHabilitado(false);
					}	
				}
			}
		}
		if(plazas==0){
			Solicitud.setSatisfecho(true);
		}
	}
	
	public  static void insertarSolicitante(Solicitantes solic){
		miSolicitante.add(solic);
	}
	public static void eliminarSolicitante(Solicitantes solic){
		miSolicitante.remove(solic);
	}
	public static void insertarEmpresa(EmpresaSolicitadora Es){
		miEmpresa.add(Es);
	}
	public static void eliminarEmpresa(EmpresaSolicitadora Es){
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
