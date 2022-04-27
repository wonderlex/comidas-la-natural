package Vistas.General;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controladores.ControladorVentana;

public class Panel_login extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel etiqueta_principal_login;
	JLabel etiqueta_usuario;
	JLabel etiqueta_contrasenya;
	JTextField caja_usuario;
	JPasswordField caja_contrasenya;
	JButton boton_aceptar_login;	
	JButton boton_borrar_login;

	int ancho_panel;
	int alto_panel;
	
	int ancho_boton = 150;
	int alto_boton = 40;
	
	int ancho_caja = 200;
	
	int ancho_etiqueta = 70;

	int alto_contenedor_texto = 40;

	/*
	 * Constructores de la clase 
	 */
	
	//public Panel_login() {

	//	ancho_panel = 0;
	//	alto_panel = 0;

	//	inicializar_panel();
	//	inicializar_componentes();
		
	//}
	
	public Panel_login(int ancho,int alto) {

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

		int separacion_botones = 5;
		int desplazamiento_y = 0;
		int separacion_y = 5;
		int ancho_total;
		int alto_total;
		int pos_x_eu; // etiqueta_usuario;
		int pos_y_eu; // etiqueta_usuario;
		int pos_x_ec; // etiqueta_contrasenya;
		int pos_y_ec; // etiqueta_contrasenya;
		int pos_x_cu; // caja_usuario;
		int pos_y_cu; // caja_usuario;
		int pos_x_cc; // caja_contrasenya;
		int pos_y_cc; // caja_contrasenya;
		int pos_x_bal; // boton_aceptar_login;	
		int pos_y_bal; // boton_aceptar_login;	
		int pos_x_bbl; // boton_borrar_login;
		int pos_y_bbl; // boton_borrar_login;

		if ((ancho_boton * 2 + separacion_botones) > (ancho_etiqueta + ancho_caja)) {
			ancho_total = ancho_boton * 2 + separacion_botones;
		} else {
			ancho_total = ancho_etiqueta + ancho_caja;
		}

		pos_x_eu = this.getWidth()/2 - ancho_total/2; // etiqueta_usuario;
		pos_x_ec = pos_x_eu; // etiqueta_contrasenya;
		pos_x_bal = pos_x_eu; // boton_aceptar_login;	
		
		pos_x_cu = this.getWidth()/2 + ancho_total/2 - ancho_caja; // caja_usuario;
		pos_x_cc = pos_x_cu; // caja_contrasenya;
		pos_x_bbl = this.getWidth()/2 + ancho_total/2 - ancho_boton; // boton_borrar_login;
		
		alto_total = alto_contenedor_texto*2 + alto_boton + separacion_y*2;
		pos_y_eu = this.getHeight()/2 - alto_total/2 - desplazamiento_y; 
		pos_y_ec = pos_y_eu + alto_contenedor_texto + separacion_y - desplazamiento_y; 
		pos_y_cu = pos_y_eu; 
		pos_y_cc = pos_y_ec; 
		pos_y_bal = pos_y_cc + alto_contenedor_texto + separacion_y - desplazamiento_y;
		pos_y_bbl = pos_y_bal;

		etiqueta_principal_login = new JLabel("Comida la natural");
		etiqueta_principal_login.setFont(new Font("Courier", Font.BOLD, 36));
		etiqueta_principal_login.setSize(this.getWidth(), 80);
		etiqueta_principal_login.setLocation(0, 0);
		etiqueta_principal_login.setHorizontalTextPosition(JLabel.CENTER);
		this.add(etiqueta_principal_login);

		etiqueta_usuario = new JLabel("usuario");
		etiqueta_usuario.setSize(ancho_etiqueta,alto_contenedor_texto);
		etiqueta_usuario.setLocation(pos_x_eu, pos_y_eu);
		this.add(etiqueta_usuario);

		etiqueta_contrasenya = new JLabel("contraseña");
		etiqueta_contrasenya.setSize(ancho_etiqueta,alto_contenedor_texto);
		etiqueta_contrasenya.setLocation(pos_x_ec, pos_y_ec);
		this.add(etiqueta_contrasenya);

		caja_usuario = new JTextField();
		caja_usuario.setSize(ancho_caja, alto_contenedor_texto);
		caja_usuario.setLocation(pos_x_cu, pos_y_cu);
		this.add(caja_usuario);

		caja_contrasenya = new JPasswordField();
		caja_contrasenya.setSize(ancho_caja, alto_contenedor_texto);
		caja_contrasenya.setLocation(pos_x_cc, pos_y_cc);
		this.add(caja_contrasenya);

		boton_aceptar_login = crear_boton("Aceptar","aceptar_login",pos_x_bal, pos_y_bal);	
		this.add(boton_aceptar_login);

		boton_borrar_login = crear_boton("Borrar","borrar_login",pos_x_bbl, pos_y_bbl);
		this.add(boton_borrar_login);
	}

	/**
	 * Establece que elementos necesitan un escuchador y se le asigna
	 */
	public void establecerManejador(ControladorVentana manejador) {

		boton_aceptar_login.addActionListener(manejador);
		boton_borrar_login.addActionListener(manejador);

	}

	/**
	 *  Crea un elemento JButton
	 * @param texto: texto del botón
	 * @param nombre: nombre del botón
	 * @param x: posición x del botón
	 * @param y: posición y del botón
	 * @return entrega un objeto botón
	 */
	private JButton crear_boton(String texto,String nombre,int x, int y) {
		JButton resultado;
		resultado = new JButton(texto);
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;
	}

	
	/*
	 * Getter para comunicarse con el exterior
	 */
	
	public JTextField getCaja_usuario() {
		return caja_usuario;
	}

	public JPasswordField getCaja_contrasenya() {
		return caja_contrasenya;
	}

	public JButton getBoton_aceptar_login() {
		return boton_aceptar_login;
	}

	public JButton getBoton_borrar_login() {
		return boton_borrar_login;
	}

}
