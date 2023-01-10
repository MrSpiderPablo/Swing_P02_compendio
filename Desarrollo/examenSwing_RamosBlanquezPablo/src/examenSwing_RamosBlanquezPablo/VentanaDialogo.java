/**
 * examenSwing_RamosBlanquezPablo examenSwing_RamosBlanquezPablo VentanaDialogo.java
 * 29 nov 2022 9:07:58
 * @author Pablo Ramos Blánquez
 */
package examenSwing_RamosBlanquezPablo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

/**
 * The Class VentanaDialogo.
 *
 * @author pablo
 */
public class VentanaDialogo extends JDialog implements ActionListener
{
	
	/** The mi panel principal. */
	private JPanel miPanelPrincipal;
	
	/** The panel componentes. */
	private PanelComponentes panelComponentes;
	
	/** The panel averia. */
	private PanelAveria panelAveria;
	
	/** The panel cliente. */
	private PanelCliente panelCliente;
	
	/** The mascara. */
	private MaskFormatter mascara;
	
	/** The telefono. */
	private JFormattedTextField telefono;
	
	/** The averia 4. */
	private JCheckBox averia1, averia2, averia3, averia4;
	
	/** The etiqueta sistema. */
	private JLabel tituloPanelC, etiquetaGravedad,  tituloPanelA, etiquetaTelefono, etiquetaDetalles, etiquetaTextField, etiquetaDenominacion, etiquetaSistema;
	
	/** The detalles. */
	private JTextArea detalles;
	
	/** The codigo. */
	private JTextField codigo;
	
	/** The sistema. */
	private JComboBox<String> denominacion, sistema;
	
	/** The tipo 6. */
	private JRadioButton tipo1, tipo2, tipo3, tipo4, tipo5, tipo6;
	
	/** The gravedad. */
	private JSlider gravedad;
	
	/** The boton aceptar. */
	private JButton botonCancelar, botonAceptar;
	
	/**
	 * Instantiates a new ventana dialogo.
	 *
	 * @param miVentanaPrincipal the mi ventana principal
	 * @param modal              the modal
	 */
	public VentanaDialogo(VentanaPrincipal miVentanaPrincipal, boolean modal) 
	{
		super(miVentanaPrincipal, modal);
		iniciaComponentes();
		
		setTitle("Area de Datos");
		
		setSize(800, 600);
		
		setLocationRelativeTo(null);
	}

	/**
	 * Inicia componentes.
	 */
	private void iniciaComponentes() 
	{
		miPanelPrincipal = new JPanel();
		miPanelPrincipal.setLayout(null);
		
		componentesPanelComponente();
		
		componentesPanelAveria();
		
		componentesPanelCliente();
		
		botonCancelar = new JButton();
		botonCancelar.setText("Cancelar");
		botonCancelar.setBounds(400, 500, 90, 23);
		botonAceptar = new JButton();
		botonAceptar.setText("Aceptar");
		botonAceptar.setBounds(500, 500, 90, 23);
		
		miPanelPrincipal.add(panelComponentes);
		miPanelPrincipal.add(panelAveria);
		miPanelPrincipal.add(panelCliente);
		miPanelPrincipal.add(botonCancelar);
		miPanelPrincipal.add(botonAceptar);
		add(miPanelPrincipal);
	}
	
	/**
	 * Componentes panel componente.
	 */
	private void componentesPanelComponente() 
	{
		panelComponentes = new PanelComponentes();
		panelComponentes.setLayout(null);
		panelComponentes.setBounds(50, 100, 300, 200);
		panelComponentes.setBackground(Color.MAGENTA);
		
	}

	/**
	 * The Class PanelComponentes.
	 */
	private class PanelComponentes extends JPanel
	{
		
		/**
		 * Instantiates a new panel componentes.
		 */
		private PanelComponentes() 
		{
			setLayout(null);
			tituloPanelC = new JLabel();
			tituloPanelC.setText("Area de Datos del Componente");
			tituloPanelC.setBounds(40, 10, 190, 23);
			etiquetaTextField = new JLabel();
			etiquetaTextField.setText("Código: ");
			etiquetaTextField.setBounds(20, 40, 95, 23);
			codigo = new JTextField();
			codigo.setBounds(70, 40, 100, 30);
			etiquetaDenominacion = new JLabel();
			etiquetaDenominacion.setText("Denominacion: ");
			etiquetaDenominacion.setBounds(20, 80, 95, 23);
			String[]tipos = {"Ordenador", "Móvil", "IoT"};
			denominacion = new JComboBox<String>(tipos);
			denominacion.setBounds(120, 80, 80, 20);
			tipo1 = new JRadioButton();
			tipo1.setText("PC");
			tipo1.setBounds(20, 110, 80, 23);
			tipo2 = new JRadioButton();
			tipo2.setText("Mac");
			tipo2.setBounds(120, 110, 80, 23);
			tipo3 = new JRadioButton();
			tipo3.setText("Portátil");
			tipo3.setBounds(20, 140, 70, 23);
			tipo4 = new JRadioButton();
			tipo4.setText("Android");
			tipo4.setBounds(100, 140, 70, 23);
			tipo5 = new JRadioButton();
			tipo5.setText("Iphone");
			tipo5.setBounds(180, 140, 70, 23);
			tipo6 = new JRadioButton();
			tipo6.setText("IoT");
			tipo6.setBounds(20, 170, 70, 23);
			
			
			add(tituloPanelC);
			add(etiquetaTextField);
			add(codigo);
			add(etiquetaDenominacion);
			add(denominacion);
			add(tipo1);
			add(tipo2);
			add(tipo3);
			add(tipo4);
			add(tipo5);
			add(tipo6);
			
		}
	}
	
	/**
	 * The Class PanelAveria.
	 */
	private class PanelAveria extends JPanel
	{
		
		/**
		 * Instantiates a new panel averia.
		 */
		private PanelAveria() 
		{
			setLayout(null);
			tituloPanelA = new JLabel();
			tituloPanelA.setText("Area de Datos de la Averia");
			tituloPanelA.setBounds(40, 10, 200, 30);
			etiquetaSistema = new JLabel();
			etiquetaSistema.setText("Sistema Operativo: ");
			etiquetaSistema.setBounds(10, 40, 150, 23);
			String[]tipos = {"Windows", "Linux", "IOs"};
			sistema = new JComboBox<String>(tipos);
			sistema.setBounds(140, 40, 80, 20);
			averia1 = new JCheckBox();
			averia1.setText("Hardware");
			averia1.setBounds(20, 70, 90, 23);
			averia2 = new JCheckBox();
			averia2.setText("Software");
			averia2.setBounds(130, 70, 80, 23);
			averia3 = new JCheckBox();
			averia3.setText("Middleware");
			averia3.setBounds(20, 100, 100, 23);
			averia4 = new JCheckBox();
			averia4.setText("Presentación");
			averia4.setBounds(130, 100, 120, 23);
			etiquetaDetalles = new JLabel();
			etiquetaDetalles.setText("Detalles de la averia: ");
			etiquetaDetalles.setBounds(20, 130, 150, 23);
			detalles = new JTextArea();
			detalles.setBounds(150, 130, 120, 100);
			etiquetaGravedad = new JLabel();
			etiquetaGravedad.setText("Gravedad de la averia: ");
			etiquetaGravedad.setBounds(20, 240, 150, 23);
//			gravedad = new JSlider(SwingConstants.HORIZONTAL,0,10);
//			gravedad.setBounds(60, 240, 150, 70);
//			gravedad.setMajorTickSpacing(5);
//			gravedad.setPaintLabels(true);
			
			add(tituloPanelA);
			add(etiquetaSistema);
			add(sistema);
			add(averia1);
			add(averia2);
			add(averia3);
			add(averia4);
			add(etiquetaDetalles);
			add(detalles);
			add(etiquetaGravedad);
//			add(gravedad);
		}
	}
	
	/**
	 * Componentes panel averia.
	 */
	private void componentesPanelAveria() 
	{
		panelAveria = new PanelAveria();
		panelAveria.setLayout(null);
		panelAveria.setBounds(400, 100, 300, 290);
		panelAveria.setBackground(Color.LIGHT_GRAY);
	}
	
	/**
	 * The Class PanelCliente.
	 */
	private class PanelCliente extends JPanel
	{
		
		/**
		 * Instantiates a new panel cliente.
		 */
		private PanelCliente() 
		{
			setLayout(null);
			etiquetaTelefono = new JLabel();
			etiquetaTelefono.setText("Telefono de contacto: ");
			etiquetaTelefono.setBounds(10, 40, 130, 20);
			try 
			{
				mascara = new MaskFormatter("#########");
				telefono = new JFormattedTextField(mascara);
				telefono.setFocusLostBehavior(telefono.COMMIT);
				telefono.setBounds(150, 40, 80, 23);
				
			} catch (ParseException el) 
			{
				el.printStackTrace();
			}
			
			add(etiquetaTelefono);
			add(telefono);
		}
	}
	
	/**
	 * Componentes panel cliente.
	 */
	private void componentesPanelCliente() 
	{
		panelCliente = new PanelCliente();
		panelCliente.setLayout(null);
		panelCliente.setBounds(50, 330, 300, 200);
		panelCliente.setBackground(Color.CYAN);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
}
