package Vistas.Contabilidad;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Panel_detalle_gastos extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton boton_volver;
	JLabel etiqueta_titulo;
	JLabel etiqueta_datos;
	JTable visualizador_compra;
	JLabel etiqueta_total;
	JButton boton_guardar;	
	JButton boton_imprimir;	
	
	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;

	int ancho_etiqueta = 200;

	int alto_contenedor_texto = 40;

	int ancho_visualizador;
	int alto_visualizador;

	int separacion_y = 5;
	int separacion_x = 40;
	
	
	/*
	 * Constructores de la clase 
	 */	
	public Panel_detalle_gastos() {

		ancho_panel = 0;
		alto_panel = 0;

		inicializar_panel();
		inicializar_componentes();
		
	}
	
	public Panel_detalle_gastos(int ancho,int alto) {

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
		setName("panel_login");

	}

	/**
	 * inicializador de los componentes de la clase
	 */
	public void inicializar_componentes() {

		int pos_x_volver = this.getWidth() - ancho_boton*5/4;

		int pos_x_etiqueta_titulo;
		int pos_y_etiqueta_titulo;
		int pos_x_etiqueta_datos;
		int pos_y_etiqueta_datos;
		int pos_x_visualizador_compra;
		int pos_y_visualizador_compra;
		int pos_x_etiqueta_total;
		int pos_y_etiqueta_total;
		int pos_x_boton_guardar;	
		int pos_y_boton_guardar;	
		int pos_x_boton_imprimir;	
		int pos_y_boton_imprimir;	
		
		int alto;

		ancho_visualizador = this.getWidth()*4/5;
		alto_visualizador = this.getHeight()*3/5;
		
		alto = alto_visualizador + alto_boton + separacion_y*4 + alto_contenedor_texto*4;

		
		pos_x_etiqueta_titulo = this.getWidth()/2 - ancho_visualizador/2;
		pos_y_etiqueta_titulo = this.getHeight()/2 - alto/2;		
		pos_x_etiqueta_datos = pos_x_etiqueta_titulo;
		pos_y_etiqueta_datos = pos_y_etiqueta_titulo + alto_contenedor_texto + separacion_y;
		pos_x_visualizador_compra = pos_x_etiqueta_titulo;
		pos_y_visualizador_compra = pos_y_etiqueta_datos + alto_contenedor_texto  + separacion_y;
		pos_x_etiqueta_total = this.getWidth()/2 - ancho_etiqueta/2;
		pos_y_etiqueta_total = pos_y_visualizador_compra + alto_visualizador + separacion_y;
		pos_x_boton_guardar = this.getWidth()/2 - ancho_boton - separacion_x/2;	
		pos_y_boton_guardar = pos_y_etiqueta_total + alto_contenedor_texto  + separacion_y;	
		pos_x_boton_imprimir = pos_x_boton_guardar + + ancho_boton + separacion_x;	
		pos_y_boton_imprimir = pos_y_boton_guardar;	
		
		boton_volver = boton_volver("volver",pos_x_volver);
		this.add(boton_volver);

		etiqueta_titulo = new JLabel("lista de la compra nº 5");
		etiqueta_titulo.setLocation(pos_x_etiqueta_titulo,pos_y_etiqueta_titulo);
		etiqueta_titulo.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_titulo);

		etiqueta_datos = new JLabel("realizada el 28/05/2022");
		etiqueta_datos.setLocation(pos_x_etiqueta_datos,pos_y_etiqueta_datos);
		etiqueta_datos.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_datos);

		JTable visualizador_compra;
		visualizador_compra = new JTable();
		visualizador_compra.setLocation(pos_x_visualizador_compra,pos_y_visualizador_compra);
		visualizador_compra.setSize(ancho_visualizador,alto_visualizador);
		this.add(visualizador_compra);

		etiqueta_total = new JLabel("total : ###.## €");
		etiqueta_total.setLocation(pos_x_etiqueta_total,pos_y_etiqueta_total);
		etiqueta_total.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_total);
		
		JButton boton_guardar;	
		boton_guardar = crear_boton("borrar","borrar",pos_x_boton_guardar,pos_y_boton_guardar);
		this.add(boton_guardar);

		JButton boton_imprimir;	
		boton_imprimir = crear_boton("borrar","borrar",pos_x_boton_imprimir,pos_y_boton_imprimir);
		this.add(boton_imprimir);

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
