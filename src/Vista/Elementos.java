package Vista;

import javax.swing.JButton;

public class Elementos {

	int ancho_boton = 150;
	int alto_boton = 40;

	
	public Elementos() {


	}
	
	public JButton crear_boton(String texto,String nombre,int x, int y) {
		JButton resultado;
		resultado = new JButton(texto);
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;
	}

	public JButton boton_volver(String nombre,int x) {
		JButton resultado;
		int y = 5;
		resultado = new JButton("Volver");
		resultado.setName(nombre);
		resultado.setBounds(x,y,ancho_boton,alto_boton);
		return resultado;	
	}

}
