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
		
		if(Solicitud instanceof SolicitudesUni){
			
		}
		if(Solicitud instanceof SolicitudesObrero){
			
		}
		if(Solicitud instanceof SolicitudesTecnico){
	
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
