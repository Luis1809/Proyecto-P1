package logico;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Bolsa {
	
	private static ArrayList<Solicitantes> miSolicitante;
	private static ArrayList<EmpresaSolicitadora> miEmpresa;
	
	public static void init() {
		miSolicitante = new ArrayList<>();
		miEmpresa = new ArrayList<>();
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
	
	public static boolean SolicitanteRepetido (String ced){
		boolean repetido = true;
		Solicitantes s= null; 
		s= buscarSolicitante(ced);
		if(s==null)
			repetido=false;
		return repetido;
	}
	
	public static boolean EmpresaRepetida (String ced){
		boolean repetido = true;
		Solicitantes s= null; 
		s= buscarSolicitante(ced);
		if(s==null)
			repetido=false;
		return repetido;
	}
	
	public static Solicitantes buscarSolicitante(String ced) {
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
	
	public static EmpresaSolicitadora buscarEmpresa(String nombre, String pais) {
		EmpresaSolicitadora Es=null;
		if(miEmpresa.size()>0){
			for(int i=0 ; i<miEmpresa.size();i++){
				if (miEmpresa.get(i).getNombreEmpresa().equalsIgnoreCase(nombre)&&miEmpresa.get(i).getPaisEmpresa().equalsIgnoreCase(pais)){
					Es=miEmpresa.get(i);
				}
			}
		}
		return Es;	
	}
	
	public static ArrayList<Solicitantes> RealizarMacheo(Solicitudes Solicitud){
		float porciento=0;
		int plazas=Solicitud.plaza;
		ArrayList<Solicitantes> miSolicitudAceptada = new ArrayList<>();
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
					
					for(int c=0;c<SolicitanteUni.getExp().size();c++){ /////////////////////////////////////////AreaExp
						if(SolicitanteUni.getExp().get(c).getAreaTrabajo1().equalsIgnoreCase(solEmp.areadeExp)&&
								SolicitanteUni.getExp().get(c).getTiempotrabajoRealizado1()>=solEmp.getAnosExp())
							porciento+=8.3333;
					}
					
					if(solEmp.getInstitucion().equalsIgnoreCase("N/A"))////////////////////////Institucion
						porciento+=8.3333;
					else
						if(SolicitanteUni.getInstitucion().equalsIgnoreCase(solEmp.getInstitucion()))
						porciento+=8.3333;		
				}
				
				if(porciento>=solEmp.porcientoAceptable){
					plazas--;
					miSolicitudAceptada.add(SolicitanteUni);
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
						
						for(int j=0;j<SolicitanteObrero.getExp().size();j++){ /////////////////////////////////////////AreaExp
							if(SolicitanteObrero.getExp().get(j).getAreaTrabajo1().equalsIgnoreCase(solEmp.areadeExp)&&
									SolicitanteObrero.getExp().get(j).getTiempotrabajoRealizado1()>=solEmp.getAnosExp())
								porciento+=9.09;
						}	
					}	
				}
				if(porciento>=solEmp.porcientoAceptable){
					plazas--;
					miSolicitudAceptada.add(SolicitanteObrero);
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
					
					for(int m=0;m<SolicitanteTecnico.getExp().size();m++){ /////////////////////////////////////////AreaExp
						if(SolicitanteTecnico.getExp().get(m).getAreaTrabajo1().equalsIgnoreCase(solEmp.areadeExp)&&
								SolicitanteTecnico.getExp().get(m).getTiempotrabajoRealizado1()>=solEmp.getAnosExp())
							porciento+=8.3333;
					}
					
					if(solEmp.getInstitucion().equalsIgnoreCase("N/A"))////////////////////////Institucion
						porciento+=8.3333;
					else
						if(SolicitanteTecnico.getInstitucion().equalsIgnoreCase(solEmp.getInstitucion()))
						porciento+=8.3333;		
				}
				if(porciento>=solEmp.porcientoAceptable){
					plazas--;
					miSolicitudAceptada.add(SolicitanteTecnico);
					miSolicitante.get(i).setHabilitado(false);
				}
			}
		}
		return miSolicitudAceptada;
	}
	
	public static void insertarSolicitante(Solicitantes solic){
		miSolicitante.add(solic);
	}
	public static void eliminarCliente(Solicitantes solic){
		miSolicitante.remove(solic);
	}
	public static void insertarCuenta(EmpresaSolicitadora Es){
		miEmpresa.add(Es);
	}
	public static void eliminarCuenta(EmpresaSolicitadora Es){
		miEmpresa.remove(Es);
	}
	public static ArrayList<Solicitantes> getMiSolicitante() {
		return miSolicitante;
	}
	public static void setMiSolicitante(ArrayList<Solicitantes> miSolicitante) {
		Bolsa.miSolicitante = miSolicitante;
	}
	public static ArrayList<EmpresaSolicitadora> getMiEmpresa() {
		return miEmpresa;
	}
	public static void setMiEmpresa(ArrayList<EmpresaSolicitadora> miEmpresa) {
		Bolsa.miEmpresa = miEmpresa;
	}
}
