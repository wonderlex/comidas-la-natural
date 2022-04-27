package Vistas.Recetario;

import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_receta extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton boton_volver;
	JLabel etiqueta_ingedientes;
	JLabel etiqueta_elaboracion;
	JTextField caja_nombre;
	JTextField caja_ingredientes;
	JButton boton_nuevo;
	JButton boton_modificar;
	JButton boton_borrar;
	JButton boton_guardar;
	
	JTable visualizador_ingedientes;

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
	int separacion_x = 40;

	/*
	 * Constructores de la clase 
	 */
	
	public Panel_receta() {

		ancho_panel = 0;
		alto_panel = 0;

		inicializar_panel();
		inicializar_componentes();
		
	}
	
	public Panel_receta(int ancho,int alto) {

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
		setName("panel_receta");

	}

	/**
	 * inicializador de los componentes de la clase
	 */
	public void inicializar_componentes() {

		int pos_x_volver = this.getWidth() - ancho_boton*5/4;
		
		int pos_x_nombre;
		int pos_y_nombre;
		
		int pos_x_etq_elaboracion;
		int pos_x_etq_ingredientes;
		int pos_x_caja_elaboracion;
		int pos_x_lista_ingredientes;
		int pos_x_nuevo;
		int pos_x_modificar;
		int pos_x_borrar;
		int pos_x_guardar;
		
		int pos_y_etiquetas;
		int pos_y_datos;
		int pos_y_botones;
		
		int alto;
		int separacion_datos;

		int alto_caja;
		
		alto_visualizador = this.getHeight()/3;
		ancho_visualizador = this.getWidth()*2/5;
		
		separacion_datos = (this.getWidth() - ancho_visualizador*2)/3;
		
		
		alto = alto_contenedor_texto*2 + alto_visualizador + alto_boton + separacion_y*3;

		pos_y_nombre = this.getHeight()/2 - alto/2;
		pos_y_etiquetas = pos_y_nombre + alto_contenedor_texto + separacion_y;
		pos_y_datos = pos_y_etiquetas + alto_contenedor_texto + separacion_y;
		pos_y_botones = pos_y_datos + alto_visualizador + separacion_y;
		pos_x_nombre = this.getWidth()/7;
		pos_x_caja_elaboracion = separacion_datos;
		pos_x_lista_ingredientes = separacion_datos*2 + ancho_visualizador;
		pos_x_etq_elaboracion = separacion_datos + ancho_visualizador/2 - ancho_etiqueta/2;
		pos_x_etq_ingredientes = pos_x_lista_ingredientes + ancho_visualizador/2 - ancho_etiqueta/2;
		pos_x_nuevo = this.getWidth()/2 - separacion_x*2 - ancho_boton*2;
		pos_x_modificar = pos_x_nuevo + separacion_x + ancho_boton;
		pos_x_borrar = pos_x_modificar + separacion_x + ancho_boton;
		pos_x_guardar = pos_x_borrar + separacion_x + ancho_boton;;

		alto_caja = alto_visualizador; 
				
		boton_volver = boton_volver("volver",pos_x_volver);
		this.add(boton_volver);

		caja_nombre = new JTextField();
		caja_nombre.setLocation(pos_x_nombre,pos_y_nombre);
		caja_nombre.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_nombre);

		etiqueta_ingedientes = new JLabel("ingredientes");
		etiqueta_ingedientes.setLocation(pos_x_etq_ingredientes,pos_y_etiquetas);
		etiqueta_ingedientes.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_ingedientes);

		etiqueta_elaboracion = new JLabel("elaboración");
		etiqueta_elaboracion.setLocation(pos_x_etq_elaboracion,pos_y_etiquetas);
		etiqueta_elaboracion.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_elaboracion);

		visualizador_ingedientes = new JTable();
		visualizador_ingedientes.setLocation(pos_x_caja_elaboracion,pos_y_datos);
		visualizador_ingedientes.setSize(ancho_visualizador,alto_visualizador);
		this.add(visualizador_ingedientes);

		caja_ingredientes = new JTextField();
		caja_ingredientes.setLocation(pos_x_lista_ingredientes,pos_y_datos);
		caja_ingredientes.setSize(ancho_visualizador,alto_visualizador);
		this.add(caja_ingredientes);

		boton_nuevo = crear_boton("nuevo","nuevo",pos_x_nuevo, pos_y_botones);
		this.add(boton_nuevo);

		boton_modificar = crear_boton("buscar","buscar",pos_x_modificar, pos_y_botones);
		this.add(boton_modificar);

		boton_borrar = crear_boton("borrar","borrar",pos_x_borrar, pos_y_botones);
		this.add(boton_borrar);

		boton_guardar = crear_boton("guardar","guardar",pos_x_guardar, pos_y_botones);
		this.add(boton_guardar);
		
	}

	public void establecerManejador(ControladorVentana manejador) {

		boton_nuevo.addActionListener(manejador);
		boton_modificar.addActionListener(manejador);
		boton_borrar.addActionListener(manejador);
		boton_guardar.addActionListener(manejador);

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

