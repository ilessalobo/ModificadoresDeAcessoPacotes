package Folder.Forma;

public class FormaOutra {

	private double lado = 5.5;

	/*Este m�todo n�o sera acessado fora da classe*/
	private double getArea() {
		return 0;
	}

	/*Estes m�todos poder�o ser acessados*/
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}
