package logico;

public class ExperienciaLaboral {
	private String nombreEmpresa;
	private String areaTrabajo1;
	private int tiempotrabajoRealizado1; // 5 anos
	private String nombreReferente;
	private String numeroReferente;
	
	
	public ExperienciaLaboral(String nombreEmpresa, String areaTrabajo1, int tiempotrabajoRealizado1,
			String nombreReferente, String numeroReferente) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.areaTrabajo1 = areaTrabajo1;
		this.tiempotrabajoRealizado1 = tiempotrabajoRealizado1;
		this.nombreReferente = nombreReferente;
		this.numeroReferente = numeroReferente;
	}
	
	
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getAreaTrabajo1() {
		return areaTrabajo1;
	}
	public void setAreaTrabajo1(String areaTrabajo1) {
		this.areaTrabajo1 = areaTrabajo1;
	}
	public int getTiempotrabajoRealizado1() {
		return tiempotrabajoRealizado1;
	}
	public void setTiempotrabajoRealizado1(int tiempotrabajoRealizado1) {
		this.tiempotrabajoRealizado1 = tiempotrabajoRealizado1;
	}
	public String getNombreReferente() {
		return nombreReferente;
	}
	public void setNombreReferente(String nombreReferente) {
		this.nombreReferente = nombreReferente;
	}
	public String getNumeroReferente() {
		return numeroReferente;
	}
	public void setNumeroReferente(String numeroReferente) {
		this.numeroReferente = numeroReferente;
	} 

}
