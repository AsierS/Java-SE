package app.clinica;
import java.util.Date;

public class Revision {
	private Date fechaDeRevisi�n;
	private int idDoctor;
	private String motivo;
	private String diagnostico;
	private String tratamiento;
	
	public Revision() {
		super();
		this.fechaDeRevisi�n=new Date();
		this.idDoctor=42;
		this.motivo="";
		this.diagnostico="Lupus";
		this.tratamiento="";
	}

	public Date getFechaDeRevisi�n() {
		return fechaDeRevisi�n;
	}

	public void setFechaDeRevisi�n(Date fechaDeRevisi�n) {
		this.fechaDeRevisi�n = fechaDeRevisi�n;
	}

	public int getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	@Override
	public String toString() {
		return "Revision [fechaDeRevisi�n=" + fechaDeRevisi�n + ", idDoctor=" + idDoctor + ", motivo=" + motivo
				+ ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + "]";
	}
	
}
