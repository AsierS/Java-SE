package com.ipartek.formacion.clases;

public class AlumnoAriketa extends PersonaAriketa{
	private String email;
	private String github;
	private int nota;
	
	public AlumnoAriketa() {
		super();
		this.email="";
		this.github="";
		this.nota=0;
	}
	//array de alumnos
	//String alumnos[];
	//alumnos = new String[4];
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString()+" AlumnoAriketa [email=" + email + ", github=" + github + ", nota=" + nota + "]";
	}
	

}
