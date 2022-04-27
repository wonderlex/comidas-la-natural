package Vistas.Usuarios;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import Controladores.ControladorVentana;

public class Panel_gestion_usuarios extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton boton_volver_gestion_usuarios;
	JButton boton_nuevo_gestion_usuarios;
	JButton boton_modificar_gestion_usuarios;
	JButton boton_eliminar_gestion_usuarios;
	JLabel etiqueta_gestion_usuarios;
	JTable visualizador_tabla_gestion_usuarios;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;
	int separacion_botones = 20;
	
	int ancho_etiqueta = 150;
	int alto_etiqueta = 40;
	
	/*
	 * Constructores de la clase 
	 */
	
	//public Panel_gestion_usuarios() {

	//	ancho_panel = 0;
	//	alto_panel = 0;

	//	inicializar_panel();
	//	inicializar_componentes();
		
	//}
	
	public Panel_gestion_usuarios(int ancho,int alto) {

		ancho_panel = ancho;
		alto_panel = alto;

		inicializar_panel();
		inicializar_componentes();
		
	}

	/**
	 * Inicializador de la clase
	 */
	public void inicializar_panel() {

		this.setLocation(0,0);
		this.setSize(ancho_panel,alto_panel);
		setLayout(null);
		setName("panel_gestion_usuarios");

	}

	/**
	 * inicializador de los componentes de la clase
	 */
	public void inicializar_componentes() {
		
		int pos_x_volver = this.getWidth() - ancho_boton*5/4;

		int ancho_tabla = this.getWidth()*8/10;
		int alto_tabla = this.getHeight()*3/5;

		int pos_x_visualizador = this.getWidth()/2 - ancho_tabla/2;
		int pos_y_visualizador = this.getHeight()/2 - alto_tabla/2;

		int pos_x_boton_nuevo = this.getWidth()/2 - ancho_boton*3/2 - separacion_botones;
		int pos_x_boton_modificar = pos_x_boton_nuevo + ancho_boton + separacion_botones;
		int pos_x_boton_eliminar = pos_x_boton_modificar + ancho_boton + separacion_botones;
		int pos_y_botones = (this.getHeight() - (pos_y_visualizador + alto_tabla))/2;
		
		pos_y_botones += pos_y_visualizador + alto_tabla - alto_boton;
		
		int pos_x_etiqueta = this.getWidth()/2 - ancho_etiqueta/2;
		int pos_y_etiqueta = pos_y_visualizador/2 - alto_etiqueta/2;

		boton_volver_gestion_usuarios = boton_volver("volver",pos_x_volver);
		this.add(boton_volver_gestion_usuarios);
		
		boton_nuevo_gestion_usuarios = crear_boton("nuevo","nuevo",pos_x_boton_nuevo, pos_y_botones);
		this.add(boton_nuevo_gestion_usuarios);

		boton_modificar_gestion_usuarios = crear_boton("Modificar","Modificar",pos_x_boton_modificar, pos_y_botones);
		this.add(boton_modificar_gestion_usuarios);
		
		boton_eliminar_gestion_usuarios = crear_boton("Eliminar","Eliminar",pos_x_boton_eliminar, pos_y_botones);
		this.add(boton_eliminar_gestion_usuarios);

		etiqueta_gestion_usuarios = new JLabel("Lista de usuarios");
		etiqueta_gestion_usuarios.setLocation(pos_x_etiqueta,pos_y_etiqueta);
		etiqueta_gestion_usuarios.setSize(ancho_etiqueta,alto_etiqueta);
		this.add(etiqueta_gestion_usuarios);

		visualizador_tabla_gestion_usuarios = new JTable() ;
		visualizador_tabla_gestion_usuarios.setLocation(pos_x_visualizador,pos_y_visualizador);
		visualizador_tabla_gestion_usuarios.setSize(ancho_tabla,alto_tabla);
		this.add(visualizador_tabla_gestion_usuarios);

	}

	public void establecerManejador(ControladorVentana manejador) {

		boton_volver_gestion_usuarios.addActionListener(manejador);
		boton_nuevo_gestion_usuarios.addActionListener(manejador);
		boton_modificar_gestion_usuarios.addActionListener(manejador);
		boton_eliminar_gestion_usuarios.addActionListener(manejador);

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
		int y = 15;
		int ancho = 150;
		int alto = 40;
		resultado = new JButton("Volver");
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho,alto);
		return resultado;	
	} 


	/*
	 * Getter para comunicarse con el exterior
	 */

	public JButton getBoton_volver_gestion_usuarios() {
		return boton_volver_gestion_usuarios;
	}

	public JButton getBoton_nuevo_gestion_usuarios() {
		return boton_nuevo_gestion_usuarios;
	}

	public JButton getBoton_modificar_gestion_usuarios() {
		return boton_modificar_gestion_usuarios;
	}

	public JButton getBoton_eliminar_gestion_usuarios() {
		return boton_eliminar_gestion_usuarios;
	}

	public JTable getVisualizador_tabla_gestion_usuarios() {
		return visualizador_tabla_gestion_usuarios;
	}


}
