package Trimestre2.Ejercicio1;

public class Cuenta {

	private String nc;
	private float saldo;
	
	public Cuenta(String ncta, float scta) {
		nc = ncta;
		saldo = scta;
	}
	
	public String getNc() {
		return nc;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setNc(String nnc) {
		nc = nnc;
	}
	
	public void setSaldo(float nsl) {
		saldo = nsl;
	}
	
	public void ingresar(float cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
		}
	}
	
	public void retirar(float cantidad) {
		if (cantidad > 0 && cantidad <= saldo) {
			saldo = saldo - cantidad;
		}
	}
	
	public void transferir(float cantidad, Cuenta ctadest) {
		if (cantidad > 0 && cantidad <= saldo) {
			saldo = saldo - cantidad;
			ctadest.ingresar(cantidad);
		}
	}
}