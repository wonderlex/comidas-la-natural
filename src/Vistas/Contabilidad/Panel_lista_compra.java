package Vistas.Contabilidad;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Panel_lista_compra extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton boton_volver;
	JLabel etiqueta_desde;
	JTextField caja_desde;
	JButton boton_desde;
	JLabel etiqueta_hasta;
	JTextField caja_hasta;
	JButton boton_hasta;
	JLabel etiqueta_total;
	JLabel etiqueta_valor_total;
	JTable visualizador_factura;
	JButton boton_imprimir;	

	int ancho_caja = 100;
	
	int ancho_etiqueta = 120;

	int alto_contenedor_texto = 40;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 120;
	int alto_boton = 40;

	int ancho_visualizador;
	int alto_visualizador;

	int separacion_y = 5;
	int separacion_x = 40;
	/*
	 * Constructores de la clase 
	 */
	
	public Panel_lista_compra() {

		ancho_panel = 0;
		alto_panel = 0;

		inicializar_panel();
		inicializar_componentes();
		
	}
	
	public Panel_lista_compra(int ancho,int alto) {

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

		int pos_x_etiqueta_desde;
		int pos_y_etiqueta_desde;
		int pos_x_caja_desde;
		int pos_y_caja_desde;
		int pos_x_boton_desde;
		int pos_y_boton_desde;
		int pos_x_etiqueta_hasta;
		int pos_y_etiqueta_hasta;
		int pos_x_caja_hasta;
		int pos_y_caja_hasta;
		int pos_x_boton_hasta;
		int pos_y_boton_hasta;		
		int pos_x_etiqueta_total;
		int pos_y_etiqueta_total;
		int pos_x_etiqueta_valor_total;
		int pos_y_etiqueta_valor_total;
		int pos_x_visualizador_factura;
		int pos_y_visualizador_factura;
		int pos_x_boton_imprimir;	
		int pos_y_boton_imprimir;	

		int alto;
				
		ancho_visualizador = this.getWidth()/3;
		alto_visualizador = this.getHeight()*3/5; 

		alto = alto_visualizador + separacion_y + alto_boton; 
		
		pos_x_visualizador_factura = this.getWidth()/2 + (this.getWidth()/2 - ancho_visualizador)/2;
		pos_y_visualizador_factura = this.getHeight()/2 - alto/2;

		pos_x_etiqueta_desde = 5;
		pos_y_etiqueta_desde = this.getHeight()/2 - alto/2 + alto/4;
		
		pos_x_caja_desde = pos_x_etiqueta_desde + ancho_etiqueta + separacion_x;
		pos_y_caja_desde = pos_y_etiqueta_desde;
		
		pos_x_boton_desde = pos_x_caja_desde + ancho_etiqueta + separacion_x;
		pos_y_boton_desde = pos_y_etiqueta_desde;
		
		pos_x_etiqueta_hasta = pos_x_etiqueta_desde;
		pos_y_etiqueta_hasta = pos_y_etiqueta_desde + alto_contenedor_texto + separacion_y;
		
		pos_x_caja_hasta = pos_x_caja_desde;
		pos_y_caja_hasta = pos_y_etiqueta_hasta;
		
		pos_x_boton_hasta = pos_x_boton_desde;
		pos_y_boton_hasta = pos_y_etiqueta_hasta;
		
		pos_x_etiqueta_total = pos_x_etiqueta_desde;
		pos_y_etiqueta_total = pos_y_boton_hasta + alto_contenedor_texto + separacion_y*6;
		
		pos_x_etiqueta_valor_total = pos_x_etiqueta_total + ancho_etiqueta + separacion_x;
		pos_y_etiqueta_valor_total = pos_y_etiqueta_total;
		
		pos_x_boton_imprimir = this.getWidth()/2 - ancho_boton/2;	
		pos_y_boton_imprimir = pos_y_visualizador_factura + alto_visualizador;	

		
		
		
		boton_volver = boton_volver("volver",pos_x_volver);
		this.add(boton_volver);

		JLabel etiqueta_desde;
		etiqueta_desde = new JLabel("desde:");
		etiqueta_desde.setLocation(pos_x_etiqueta_desde,pos_y_etiqueta_desde);
		etiqueta_desde.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_desde);

		JTextField caja_desde;
		
		caja_desde = new JTextField();
		caja_desde.setLocation(pos_x_caja_desde,pos_y_caja_desde);
		caja_desde.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_desde);

		boton_desde = crear_boton("calendario","calendario hasta",pos_x_boton_desde,pos_y_boton_desde);
		this.add(boton_desde);

		JLabel etiqueta_hasta;
		etiqueta_hasta = new JLabel("hasta:");
		etiqueta_hasta.setLocation(pos_x_etiqueta_hasta,pos_y_etiqueta_hasta);
		etiqueta_hasta.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_hasta);

		JTextField caja_hasta;
		
		caja_hasta = new JTextField();
		caja_hasta.setLocation(pos_x_caja_hasta,pos_y_caja_hasta);
		caja_hasta.setSize(ancho_caja,alto_contenedor_texto);
		this.add(caja_hasta);

		boton_hasta = crear_boton("calendario","calendario hasta",pos_x_boton_hasta,pos_y_boton_hasta);
		this.add(boton_hasta);

		etiqueta_total = new JLabel("total ganancias:");
		etiqueta_total.setLocation(pos_x_etiqueta_total,pos_y_etiqueta_total);
		etiqueta_total.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_total);
		
		JLabel etiqueta_valor_total;
		etiqueta_valor_total = new JLabel("###.## €");
		etiqueta_valor_total.setLocation(pos_x_etiqueta_valor_total,pos_y_etiqueta_valor_total);
		etiqueta_valor_total.setSize(ancho_etiqueta,alto_contenedor_texto);
		this.add(etiqueta_valor_total);

		visualizador_factura = new JTable();
		visualizador_factura.setLocation(pos_x_visualizador_factura,pos_y_visualizador_factura);
		visualizador_factura.setSize(ancho_visualizador,alto_visualizador);
		this.add(visualizador_factura);
		
		boton_imprimir = crear_boton("imprimir","imprimir",pos_x_boton_imprimir,pos_y_boton_imprimir);
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
