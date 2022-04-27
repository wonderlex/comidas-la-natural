package Vistas.Almacen;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controladores.ControladorVentana;

public class Panel_producto_almacen extends JPanel {

	public void Panel_producto_almacen() {

	} 

	public void inicializar_componentes() {

	}

	public void establecerManejador(ControladorVentana manejador) {


	}

	private JButton crear_boton(String texto,String nombre,int x, int y) {
		JButton resultado;
		int ancho_boton = 150;
		int alto_boton = 40;
		resultado = new JButton(texto);
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;
	}

	private JButton boton_volver(String nombre,int x) {
		JButton resultado;
		int y = 5;
		int ancho = 150;
		int alto = 40;
		resultado = new JButton("Volver");
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho,alto);
		return resultado;	
	} 


}
