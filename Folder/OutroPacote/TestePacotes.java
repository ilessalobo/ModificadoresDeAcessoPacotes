package Folder.OutroPacote;

import Folder.Forma.Forma;
import Folder.Quadrado.Quadrado;

public class TestePacotes {

	public static void main(String[] args) {
		
		/*Acessa o método da classe com atributos public*/
		Forma f = new Forma();
		f.lado = 5.5;
		f.getArea();
		
		/*Não acessa o método da classe com atributos private ou métodos private*/
//		FormaOutra fo = new FormaOutra();
//		fo.lado = 5.5;
//		fo.getArea();
		
		/*Acessa o método da classe com atributos protecteds neste caso se a classe estive em mesmo pacote*/
		Triangulo t = new Triangulo();
		t.lado = 5.5;
		t.getArea();
		
		/*Conseguirá pegar atributos private acessando pelos métodos getters e setters que estão publicos*/ 
		Quadrado q = new Quadrado();
		q.getLado();
		q.setLado(5.5);
		/*Mas não consegue acessar o método private da classe*/
		
		}
	
}
