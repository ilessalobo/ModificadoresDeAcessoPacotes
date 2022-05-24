package Folder.Forma;

public class FormaOutra {

	private double lado = 5.5;

	/*Este método não sera acessado fora da classe*/
	private double getArea() {
		return 0;
	}

	/*Estes métodos poderão ser acessados*/
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}
