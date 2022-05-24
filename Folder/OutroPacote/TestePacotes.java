package Folder.OutroPacote;

import Folder.Forma.Forma;
import Folder.Quadrado.Quadrado;

public class TestePacotes {

	public static void main(String[] args) {
		
		/*Acessa o m�todo da classe com atributos public*/
		Forma f = new Forma();
		f.lado = 5.5;
		f.getArea();
		
		/*N�o acessa o m�todo da classe com atributos private ou m�todos private*/
//		FormaOutra fo = new FormaOutra();
//		fo.lado = 5.5;
//		fo.getArea();
		
		/*Acessa o m�todo da classe com atributos protecteds neste caso se a classe estive em mesmo pacote*/
		Triangulo t = new Triangulo();
		t.lado = 5.5;
		t.getArea();
		
		/*Conseguir� pegar atributos private acessando pelos m�todos getters e setters que est�o publicos*/ 
		Quadrado q = new Quadrado();
		q.getLado();
		q.setLado(5.5);
		/*Mas n�o consegue acessar o m�todo private da classe*/
		
		}
	
}
