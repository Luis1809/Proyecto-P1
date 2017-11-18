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
	
	public static void RealizarMacheo(Solicitudes Solicitud){
		float porciento=0;
		for (int i=0; i<miSolicitante.size();i++){
			
			if(Solicitud instanceof SolicitudesUni && miSolicitante.get(i) instanceof Universitario ){
				Universitario SolicitanteUni = (Universitario) miSolicitante.get(i);
				SolicitudesUni solEmp = (SolicitudesUni) Solicitud;
				if(SolicitanteUni.getCarrera().equalsIgnoreCase(solEmp.getCarrera()) && SolicitanteUni.getAreaInteres().equalsIgnoreCase(solEmp.getAreaInteres())){
					
					if(solEmp.getSexo().equalsIgnoreCase("N/A"))///////////////////Sexo
						porciento+=10;
					else
					if(SolicitanteUni.getSexo().equalsIgnoreCase(solEmp.getSexo()))
						porciento+=10;
					if(solEmp.getEstadoCivil().equalsIgnoreCase("N/A"))///////////////////EstadoCivil
						porciento+=10;
					else
						if(SolicitanteUni.getEstadoCivil().equalsIgnoreCase(solEmp.getEstadoCivil()))
						porciento+=10;
					if(solEmp.getCuidad().equalsIgnoreCase("N/A"))////////////////////////Cuidad
						porciento+=10;
					else
						if(SolicitanteUni.getCuidad().equalsIgnoreCase(solEmp.getCuidad()))
						porciento+=10;
					if(SolicitanteUni.getPais().equalsIgnoreCase(solEmp.getPais()))////////////////////////Pais
						porciento+=10;
					if(SolicitanteUni.getSalirioSolicitado()<=solEmp.getSalirioSolicitado())//////////SalarioSolicitado
						porciento+=10;
					if(SolicitanteUni.dispMudarse==false && solEmp.dispMudarse==true)//////////DisponibilidadMudarse
						System.out.println("");
					else
						porciento+=10;
					if(SolicitanteUni.dispViajar==false && solEmp.dispViajar==true)//////////DisponibilidadViajar
						System.out.println("");
					else
						porciento+=10;
					if(SolicitanteUni.getTipoJornada().equalsIgnoreCase(solEmp.getTipoJornada()))////////////////////////Jornada
						porciento+=10;
					
					for(int a=0;a<SolicitanteUni.getIdioma().size();a++){ ////////////////////////Idioma
						for(int b=0;b<solEmp.getIdioma().size();b++){
							if(SolicitanteUni.getIdioma().get(a).equalsIgnoreCase(solEmp.getIdioma().get(b)))
								porciento+=(10/solEmp.getIdioma().size());
						}
					}
					
					if(SolicitanteUni.licencia==false && solEmp.licencia==true)///////////////Licencia
						System.out.println("");
					else
						porciento+=10;
					
					for(int c=0;c<SolicitanteUni.getExp().size();c++){ /////////////////////////////////////////AreaExp
						if(SolicitanteUni.getExp().get(c).getAreaTrabajo1().equalsIgnoreCase(solEmp.areadeExp)&&
								SolicitanteUni.getExp().get(c).getTiempotrabajoRealizado1()>=solEmp.getAnosExp())
							porciento+=10;
					}
					
					if(solEmp.getInstitucion().equalsIgnoreCase("N/A"))////////////////////////Institucion
						porciento+=10;
					else
						if(SolicitanteUni.getInstitucion().equalsIgnoreCase(solEmp.getInstitucion()))
						porciento+=10;		
				}
			}
			
			if(Solicitud instanceof SolicitudesObrero && miSolicitante.get(i) instanceof Obrero){
				
			}
			
			if(Solicitud instanceof SolicitudesTecnico){
		
			}
		}
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
