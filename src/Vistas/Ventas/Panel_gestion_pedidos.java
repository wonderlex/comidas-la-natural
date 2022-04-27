package Vistas.Ventas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import Controladores.ControladorVentana;

public class Panel_gestion_pedidos extends JPanel {

	JButton boton_volver;
	JLabel etiqueta_mesas;
	JLabel etiqueta_llevar;
	JButton boton_mesa1;
	JButton boton_mesa2;
	JButton boton_mesa3;
	JButton boton_mesa4;
	JButton boton_mesa5;
	JButton boton_mesa6;
	JButton boton_mesa7;
	JButton boton_mesa8;
	JButton boton_nuevo_cliente;
	JButton boton_modificar_cliente;
	JTable visualizador_clientes_llevar;
	JButton boton_ver_pedido;
	
	
	public void Panel_() {

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
