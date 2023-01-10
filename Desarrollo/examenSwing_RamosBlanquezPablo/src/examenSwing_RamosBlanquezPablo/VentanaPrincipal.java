/**
 * examenSwing_RamosBlanquezPablo examenSwing_RamosBlanquezPablo VentanaPrincipal.java
 * 29 nov 2022 8:38:28
 * @author Pablo Ramos Blánquez
 */
package examenSwing_RamosBlanquezPablo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * The Class VentanaPrincipal.
 *
 * @author pablo
 */
public class VentanaPrincipal extends JFrame implements ActionListener
{
	
	/** The mi panel. */
	private JPanel miPanel;
	
	/** The boton abrir. */
	private JButton botonAbrir;
	
	/** The mi barra. */
	private JMenuBar miBarra;
	
	/** The informacion. */
	private JMenu archivo, principal, informacion;
	
	/** The curiosidad. */
	private JMenuItem salir, abrir, curiosidad;
	
	/** The mi ventana principal. */
	private VentanaPrincipal miVentanaPrincipal;
	
	/**
	 * Instantiates a new ventana principal.
	 */
	public VentanaPrincipal() 
	{
		iniciarComponentes();
		
		setTitle("Taller de reparaciones Ricardo Linterna");
		
		setSize(400, 500);	
	}

	/**
	 * Iniciar componentes.
	 */
	private void iniciarComponentes() 
	{
		miPanel = new JPanel();
		
		miBarra = new JMenuBar();
		
		archivo = new JMenu("Archivo");
		principal = new JMenu("Principal");
		informacion = new JMenu("Informacion");
		
		salir = new JMenuItem("Salir");
		salir.addActionListener(this);
		abrir = new JMenuItem("Abrir");
		abrir.addActionListener(this);
		curiosidad = new JMenuItem("Curiosidad");
		curiosidad.addActionListener(this);
		
		miBarra.add(archivo);
		miBarra.add(principal);
		miBarra.add(informacion);
		
		archivo.add(salir);
		principal.add(abrir);
		informacion.add(curiosidad);
		
		this.setJMenuBar(miBarra);
		
		
		botonAbrir = new JButton();
		botonAbrir.setText("Abrir");
		botonAbrir.setBounds(200, 200, 90, 23);
		botonAbrir.addActionListener(this);
		
		this.add(botonAbrir);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == botonAbrir || e.getSource() == abrir) 
		{
			VentanaDialogo miVentanaDialogo = new VentanaDialogo(miVentanaPrincipal, true);
			miVentanaDialogo.setVisible(true);
		}
		
		if (e.getSource() == salir) 
		{
			System.exit(0);
		}
		
		if (e.getSource() == curiosidad) 
		{
			JOptionPane.showMessageDialog(curiosidad, "¡Cuidado con los golpes, por Ricardo Linterna!");
		}
	}

	/**
	 * Sets the ventana principal.
	 *
	 * @param miVentanaPrincipal the new ventana principal
	 */
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) 
	{
		this.miVentanaPrincipal = miVentanaPrincipal;
	}

}
