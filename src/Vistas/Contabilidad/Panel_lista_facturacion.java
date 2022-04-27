package Vistas.Contabilidad;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

import Controladores.ControladorVentana;

public class Panel_lista_facturacion  extends JPanel {
	JButton boton_volver;
	JButton boton_ver;
	JButton boton_calcular_ganancias;
	
	JTable visualizador_facturaciones;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;

	int ancho_visualizador;
	int alto_visualizador;

	int separacion_y = 5;
	int separacion_x = 40;

	/*
	 * Constructores de la clase 
	 */
	
	public Panel_lista_facturacion() {

		ancho_panel = 0;
		alto_panel = 0;

		inicializar_panel();
		inicializar_componentes();
		
	}
	
	public Panel_lista_facturacion(int ancho,int alto) {

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

		int pos_x_visualizador;
		int pos_y_visualizador;
		
		int pos_x_ver;
		int pos_y_ver;

		int pos_x_calcular;
		int pos_y_calcular;

		int alto;
		int desplazamiento_y = 0;

		ancho_visualizador = this.getWidth()*4/5;
		alto_visualizador = this.getHeight()*2/3;

		alto = alto_visualizador + alto_boton + separacion_y; 

		pos_x_visualizador = this.getWidth()/2 - ancho_visualizador/2;
		pos_x_ver = this.getWidth()/2 - ancho_boton - separacion_y/2;
		pos_x_calcular = pos_x_ver + ancho_boton + separacion_x;
		
		pos_y_visualizador = this.getHeight()/2 - alto/2 - desplazamiento_y;
		pos_y_ver = pos_y_visualizador + alto_visualizador + separacion_y;
		pos_y_calcular = pos_y_ver;		
		
		
		
		boton_volver = boton_volver("volver",pos_x_volver);
		this.add(boton_volver);

		visualizador_facturaciones = new JTable();
		visualizador_facturaciones.setLocation(pos_x_visualizador,pos_y_visualizador);
		visualizador_facturaciones.setSize(ancho_visualizador,alto_visualizador);
		this.add(visualizador_facturaciones);

		boton_ver = crear_boton("ver","ver",pos_x_ver,pos_y_ver);
		this.add(boton_ver);
				
		boton_calcular_ganancias = crear_boton("calcular ganancias","calcular ganancias",pos_x_calcular,pos_y_calcular);
		this.add(boton_calcular_ganancias);


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
