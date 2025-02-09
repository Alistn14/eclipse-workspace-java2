package com.banco;

public class Cliente {
	
	//Constructores
	public Cliente() {
		this.id=1;
		this.id_gestor=1;
		this.usuario="Marc";
		this.password="12345";
		this.correo="marc@correo.com";
		this.saldo=2000.0;
	}
	
	//Atributos
	private int id;
	private int id_gestor;
	private String usuario;
	private String password;
	private String correo;
	private double saldo;
	
	//M�todos "getters" y "setters"
	
	public int getId() {
		return id;
	};
	public void setId(int id) {
		this.id = id;
	};
	public int getIdGestor() {
		return id_gestor;
	};
	public void setIdGestor(int id_gestor) {
		this.id_gestor = id_gestor;
	};
	public String getUsuario() {
		return usuario;
	};
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	};
	public String getPassword() {
		return password;
	};
	public void setPassword(String password) {
		this.password = password;
	};
	public String getCorreo() {
		return correo;
	};
	public void setCorreo(String correo) {
		this.correo = correo;
	};
	public double getSaldo() {
		return saldo;
	};
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	};
}