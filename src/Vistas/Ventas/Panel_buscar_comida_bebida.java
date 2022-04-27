package Vistas.Ventas;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_buscar_comida_bebida extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton boton_volver;
	JButton boton_bebidas;
	JButton boton_comidas;
	JButton boton_todo;
	JTextField caja_busqueda;
	JButton boton_buscar;
	JTable visualizador_servicio;
	JButton boton_anyadir;
	JButton boton_ver_receta;
	
	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;
	
	int ancho_caja = 200;
	
	int ancho_etiqueta = 120;

	int alto_contenedor_texto = 40;

	int ancho_visualizador;
	int alto_visualizador;

	int separacion_y = 5;
	int separacion_x = 5;


	
	public void Panel_() {

	} 

	public void inicializar_componentes() {

	}

	public void establecerManejador(ControladorVentana manejador) {


	}

	private JButton crear_boton(String texto,String nombre,int x, int y) {
		JButton resultado;
		resultado = new JButton(texto);
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;
	}

	private JButton boton_volver(String nombre,int x) {
		JButton resultado;
		int y = 5;
		resultado = new JButton("Volver");
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;	
	} 


}
