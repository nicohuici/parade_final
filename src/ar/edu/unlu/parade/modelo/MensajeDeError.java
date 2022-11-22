package ar.edu.unlu.parade.modelo;

import java.io.Serializable;

public class MensajeDeError implements Serializable {
	private IJugador receptor;
	private String mensaje;
	
	public MensajeDeError(IJugador receptor, String mensaje) {
		this.receptor = receptor;
		this.mensaje = mensaje;
	}
	
	
	public IJugador getReceptor() {
		return receptor;
	}
	public String getMensaje() {
		return mensaje;
	}
}