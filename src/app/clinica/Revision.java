package app.clinica;
import java.util.Date;

public class Revision {
	private Date fechaDeRevisión;
	private int idDoctor;
	private String motivo;
	private String diagnostico;
	private String tratamiento;
	
	public Revision() {
		super();
		this.fechaDeRevisión=new Date();
		this.idDoctor=42;
		this.motivo="";
		this.diagnostico="Lupus";
		this.tratamiento="";
	}

	public Date getFechaDeRevisión() {
		return fechaDeRevisión;
	}

	public void setFechaDeRevisión(Date fechaDeRevisión) {
		this.fechaDeRevisión = fechaDeRevisión;
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
		return "Revision [fechaDeRevisión=" + fechaDeRevisión + ", idDoctor=" + idDoctor + ", motivo=" + motivo
				+ ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + "]";
	}
	
}
