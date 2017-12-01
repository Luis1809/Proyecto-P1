


package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import logico.Bolsa;

import logico.Obrero;
import logico.Solicitantes;
import logico.Tecnico;
import logico.Universitario;

import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class ModificarSolicitantes extends JDialog {
	ButtonGroup btnGroupSexo =new ButtonGroup();
	ButtonGroup btnGroupLicencia =new ButtonGroup();
	String h;
	
	private Solicitantes s=null;
	/*//_____Solicitante_______________________//
	private String nombreSolicitante;
	private String apellidoSolicitante;
	private String cedulaSolicitante;
	private String telefonoSolicitante;
    private String sexoSolicitante;
    private String estadoCivilSolicitante;
    private String direccionSolicitante;
    private String paisSolicitante;
  //_______Experiencia laboral_______________//
    private String nombreEmpresa;
    private String areTrabajo;
    private String nombreReferente;
    private String telReferente;*/
	private Bolsa bolsa = Bolsa.getIntance();
	private ArrayList<String> habi=new ArrayList<>();
	private final JPanel contentPanel = new JPanel();
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JFormattedTextField txtCedula;
    private JFormattedTextField txtTelefono;
    private JTextField txtDireccion;
    private JTextField txtEmail;
    private JTextField txtEmpresa;
    private JTextField txtNombreReferente;
    private JFormattedTextField txtNumeroReferente;
	private JTextField txtFechaSolicitud;
	private JRadioButton btnMasculino;
	private JRadioButton btnFemenino;
	private JComboBox<?> cbxNacionalidad;
	private JComboBox<?> cbxEstadoCivil;
	private JComboBox<?> cbxCiudad;
	private JComboBox<?> cbxPais;
	private JComboBox<?> cbxIdioma1;
	private JComboBox<?> cbxIdioma2;
	private JComboBox<?> cbxIdioma3;
	private JRadioButton btnLicenciaCY;
	private JRadioButton btnLicenciaCN;
	private JCheckBox chbIdioma2;
	private JCheckBox chbIdioma3;
	private JComboBox<?> cbxAreaTrabajo;
	private JSpinner spnTiempoExperiencia;
	private ArrayList<String> idioma = new ArrayList<>();
	private ArrayList<String> habilidad = new ArrayList<>();
	private final ButtonGroup btnGroupViajar = new ButtonGroup();
    private JDateChooser Jcaldate;
    private static MaskFormatter formatoCedula;
	private static MaskFormatter formatoNumero;
	
	private JPanel panel_principal;
	private JPanel panel_secundario;
	private JPanel panel_3;
	private JLabel lblIngresarSolicitante;
	private JButton btnPag;
	private JButton btnPag_1;
	private JPanel panelHombre;
	private JPanel panelMujer;
	private JLabel mujer;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JFormattedTextField txtBuscarCedula;
	private JButton btnBuscar;
	private JPanel PanelTodos;
	
	public ModificarSolicitantes() {
		setResizable(false);
		setBounds(100, 100, 794, 386);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			

			try{
				formatoCedula = new MaskFormatter("###-#######-#");//////////////////////////////////////
				formatoNumero = new MaskFormatter("(###) -###-####");//////////////////////////////////////
			}catch (Exception e){
				e.printStackTrace();
			}
			
			panel_secundario = new JPanel();
			panel_secundario.setBackground(new Color(255, 255, 255));
			panel_secundario.setBounds(10, 101, 774, 214);
			panel.add(panel_secundario);
			panel_secundario.setLayout(null);
			
			JPanel panel_6 = new JPanel();
			panel_6.setBackground(new Color(255, 255, 255));
			panel_6.setBounds(2, 2, 412, 210);
			panel_secundario.add(panel_6);
			panel_6.setLayout(null);
			panel_6.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
			JLabel label_20 = new JLabel("Licencia de conducir:");
			label_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label_20.setBounds(172, 29, 160, 16);
			panel_6.add(label_20);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(172, 43, 107, 12);
			panel_6.add(separator_3);
			
			JLabel label_21 = new JLabel("Idioma:");
			label_21.setBounds(10, 29, 61, 16);
			panel_6.add(label_21);
			
			cbxIdioma1 = new JComboBox();
			cbxIdioma1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					if(!cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
						if(cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase(cbxIdioma2.getSelectedItem().toString())||
								cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase(cbxIdioma3.getSelectedItem().toString())){
							cbxIdioma1.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "El idioma ya ha sido agregado", "Informacion", JOptionPane.WARNING_MESSAGE);}
						
							
						else
						idioma.add(0, cbxIdioma1.getSelectedItem().toString());
					}
				}
			});
			cbxIdioma1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
			cbxIdioma1.setBounds(10, 48, 134, 23);
			panel_6.add(cbxIdioma1);
			
			btnLicenciaCN = new JRadioButton("No");
			btnLicenciaCN.setBackground(new Color(255, 255, 255));
			btnGroupLicencia.add(btnLicenciaCN);
			btnLicenciaCN.setBounds(238, 52, 54, 23);
			panel_6.add(btnLicenciaCN);
			
			btnLicenciaCY = new JRadioButton("Si");
			btnLicenciaCY.setBackground(new Color(255, 255, 255));
			btnGroupLicencia.add(btnLicenciaCY);
			btnLicenciaCY.setBounds(182, 52, 54, 23);
			panel_6.add(btnLicenciaCY);
			
			chbIdioma2 = new JCheckBox("A\u00F1adir otro idioma");
			chbIdioma2.setBackground(new Color(255, 255, 255));
			chbIdioma2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chbIdioma2.isSelected())
						cbxIdioma2.setEnabled(true);
					else {
						cbxIdioma2.setEnabled(false);
						cbxIdioma2.setSelectedIndex(0);
					}
				}	
			});
			chbIdioma2.setBounds(10, 75, 134, 23);
			panel_6.add(chbIdioma2);
			
			cbxIdioma2 = new JComboBox();
			cbxIdioma2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
						if(cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase(cbxIdioma1.getSelectedItem().toString())||
								cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase(cbxIdioma3.getSelectedItem().toString())){
							cbxIdioma2.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "El idioma ya ha sido agregado", "Informacion", JOptionPane.WARNING_MESSAGE);}
						
							
						else
							idioma.add(1, cbxIdioma2.getSelectedItem().toString());
					}
				}
			});
			cbxIdioma2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Patua", "Creoles", "Ruso"}));
			cbxIdioma2.setEnabled(false);
			cbxIdioma2.setBounds(10, 105, 134, 23);
			panel_6.add(cbxIdioma2);
			
			chbIdioma3 = new JCheckBox("A\u00F1adir otro idioma");
			chbIdioma3.setBackground(new Color(255, 255, 255));
			chbIdioma3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chbIdioma3.isSelected())
						cbxIdioma3.setEnabled(true);
					else {
						cbxIdioma3.setEnabled(false);
						cbxIdioma3.setSelectedIndex(0);
						
					}
					
				}
			});
			chbIdioma3.setBounds(10, 133, 134, 23);
			panel_6.add(chbIdioma3);
			
			cbxIdioma3 = new JComboBox();
			cbxIdioma3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
						if(cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase(cbxIdioma1.getSelectedItem().toString())||
								cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase(cbxIdioma2.getSelectedItem().toString())){
							cbxIdioma3.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "El idioma ya ha sido agregado", "Informacion", JOptionPane.WARNING_MESSAGE);}
						
							
						else
						idioma.add(2, cbxIdioma1.getSelectedItem().toString());
					}
				}
			});
			cbxIdioma3.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
			cbxIdioma3.setEnabled(false);
			cbxIdioma3.setBounds(10, 164, 134, 23);
			panel_6.add(cbxIdioma3);
			
			JLabel label_8 = new JLabel("Cuidad:");
			label_8.setBounds(172, 89, 53, 14);
			panel_6.add(label_8);
			
			cbxCiudad = new JComboBox();
			cbxCiudad.setBounds(222, 85, 180, 23);
			panel_6.add(cbxCiudad);
			cbxCiudad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxCiudad.setBackground(new Color(211, 211, 211));
			cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
			
			JLabel label_9 = new JLabel("Pais:");
			label_9.setBounds(172, 127, 61, 14);
			panel_6.add(label_9);
			
			cbxPais = new JComboBox();
			cbxPais.setBounds(222, 123, 180, 23);
			panel_6.add(cbxPais);
			cbxPais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxPais.setBackground(new Color(211, 211, 211));
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
			
			JLabel label_5 = new JLabel("Estado Civil:");
			label_5.setBounds(172, 165, 68, 16);
			panel_6.add(label_5);
			
			cbxEstadoCivil = new JComboBox();
			cbxEstadoCivil.setBounds(257, 161, 145, 23);
			panel_6.add(cbxEstadoCivil);
			cbxEstadoCivil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxEstadoCivil.setBackground(new Color(211, 211, 211));
			cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
			
			JPanel panel_7 = new JPanel();
			panel_7.setBackground(new Color(255, 255, 255));
			panel_7.setBounds(414, 2, 353, 210);
			panel_secundario.add(panel_7);
			panel_7.setLayout(null);
			panel_7.setBorder(new TitledBorder(null, "Ocupacion anterior", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
			JLabel label_23 = new JLabel("Experiencia Laboral (Ultimo empleo):");
			label_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
			label_23.setBounds(10, 22, 281, 16);
			panel_7.add(label_23);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBounds(10, 37, 184, 12);
			panel_7.add(separator_4);
			
			JLabel label_24 = new JLabel("Nombre de Empresa:");
			label_24.setBounds(10, 58, 134, 16);
			panel_7.add(label_24);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setBackground(new Color(211, 211, 211));
			txtEmpresa.setColumns(10);
			txtEmpresa.setBounds(147, 56, 198, 23);
			panel_7.add(txtEmpresa);
			
			JLabel label_25 = new JLabel("Area de Trabajo:");
			label_25.setBounds(10, 112, 110, 16);
			panel_7.add(label_25);
			
			JLabel label_26 = new JLabel("Nombre de Referente:");
			label_26.setBounds(10, 141, 127, 16);
			panel_7.add(label_26);
			
			txtNombreReferente = new JTextField();
			txtNombreReferente.setBackground(new Color(211, 211, 211));
			txtNombreReferente.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()>=65&&e.getKeyCode()<=90||e.getKeyChar()==8||e.getKeyCode()==32||e.getKeyCode()==16)
						System.out.println("");
					else{
						JOptionPane.showMessageDialog(null, "Solo caracteres de tipo letra", "Informaci�n", JOptionPane.WARNING_MESSAGE);
						cleanNombreReferente();}
				}
			});
			txtNombreReferente.setColumns(10);
			txtNombreReferente.setBounds(147, 139, 198, 23);
			panel_7.add(txtNombreReferente);
			
			JLabel label_27 = new JLabel("Telefono de Referente:");
			label_27.setBounds(10, 170, 146, 21);
			panel_7.add(label_27);
			
			txtNumeroReferente = new JFormattedTextField(formatoNumero);
			txtNumeroReferente.setBackground(new Color(211, 211, 211));
			txtNumeroReferente.setColumns(10);
			txtNumeroReferente.setBounds(147, 170, 198, 23);
			panel_7.add(txtNumeroReferente);
			
			cbxAreaTrabajo = new JComboBox();
			cbxAreaTrabajo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxAreaTrabajo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
			cbxAreaTrabajo.setBounds(147, 110, 198, 23);
			panel_7.add(cbxAreaTrabajo);
			
			JLabel label_28 = new JLabel("Tiempo de experiencia:");
			label_28.setBounds(10, 87, 134, 14);
			panel_7.add(label_28);
			
			spnTiempoExperiencia = new JSpinner();
			spnTiempoExperiencia.setModel(new SpinnerNumberModel(1, 1, 50, 1));
			spnTiempoExperiencia.setBounds(244, 85, 101, 22);
			panel_7.add(spnTiempoExperiencia);
			
			panel_secundario.setVisible(false);
			
			panel_principal = new JPanel();
			panel_principal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Formulario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_principal.setBackground(new Color(255, 255, 255));
			panel_principal.setBounds(10, 110, 774, 201);
			panel.add(panel_principal);
			panel_principal.setLayout(null);
			
			panelHombre = new JPanel();
			panelHombre.setBounds(15, 20, 152, 159);
			panel_principal.add(panelHombre);
			panelHombre.setLayout(null);
			
			panelHombre.setVisible(false);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/hombre.png")));
			lblNewLabel_1.setBounds(10, 11, 132, 137);
			panelHombre.add(lblNewLabel_1);
			
			panelMujer = new JPanel();
			panelMujer.setLayout(null);
			panelMujer.setBounds(15, 20, 152, 158);
			panel_principal.add(panelMujer);
			
			mujer = new JLabel("");
			mujer.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/mujer.png")));
			mujer.setBounds(10, 6, 142, 141);
			panelMujer.add(mujer);
			panelMujer.setVisible(false);
			
			PanelTodos = new JPanel();
			PanelTodos.setBounds(15, 20, 152, 158);
			panel_principal.add(PanelTodos);
			PanelTodos.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(ModificarSolicitantes.class.getResource("/imagenes/red.png")));
			lblNewLabel.setBounds(15, 11, 122, 136);
			PanelTodos.add(lblNewLabel);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 255, 255));
			panel_1.setBounds(182, 11, 582, 175);
			panel_principal.add(panel_1);
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
			JLabel label = new JLabel("Nombres:");
			label.setBounds(30, 30, 61, 16);
			panel_1.add(label);
			
			txtNombre = new JTextField();
			txtNombre.setBackground(new Color(211, 211, 211));
			txtNombre.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()>=65&&e.getKeyCode()<=90||e.getKeyChar()==8||e.getKeyCode()==32||e.getKeyCode()==16)
						System.out.println("");
					else {
						JOptionPane.showMessageDialog(null, "Solo caracteres de tipo letra", "Informaci�n", JOptionPane.WARNING_MESSAGE);
						cleanNombre();}
				}
			});
			txtNombre.setColumns(10);
			txtNombre.setBounds(101, 28, 177, 23);
			panel_1.add(txtNombre);
			
			JLabel label_1 = new JLabel("Apellidos:");
			label_1.setBounds(300, 30, 73, 16);
			panel_1.add(label_1);
			
			txtApellido = new JTextField();
			txtApellido.setBackground(new Color(211, 211, 211));
			txtApellido.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()>=65&&e.getKeyCode()<=90||e.getKeyChar()==8||e.getKeyCode()==32||e.getKeyCode()==16)
						System.out.println("");
					else {
						JOptionPane.showMessageDialog(null, "Solo caracteres de tipo letra", "Informaci�n", JOptionPane.WARNING_MESSAGE);
						cleanApellido();}
				}
			});
			txtApellido.setColumns(10);
			txtApellido.setBounds(369, 28, 196, 23);
			panel_1.add(txtApellido);
			
			JLabel label_2 = new JLabel("Cedula:");
			label_2.setBounds(30, 59, 61, 16);
			panel_1.add(label_2);
			
			txtCedula = new JFormattedTextField(formatoCedula);
			txtCedula.setBackground(new Color(211, 211, 211));
			txtCedula.setColumns(10);
			txtCedula.setBounds(101, 57, 177, 23);
			panel_1.add(txtCedula);
			
			JLabel label_3 = new JLabel("Sexo:");
			label_3.setBounds(30, 116, 61, 16);
			panel_1.add(label_3);
			
			JLabel label_4 = new JLabel("Telefono:");
			label_4.setBounds(300, 59, 61, 16);
			panel_1.add(label_4);
			
			txtTelefono = new JFormattedTextField(formatoNumero);
			txtTelefono.setBackground(new Color(211, 211, 211));
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(369, 59, 196, 23);
			panel_1.add(txtTelefono);
			
			btnMasculino = new JRadioButton("Masculino");
			btnMasculino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(btnMasculino.isSelected()){
						panelHombre.setVisible(true);
						panelMujer.setVisible(false);
						PanelTodos.setVisible(false);
						
					}
				}
			});
			btnMasculino.setBackground(new Color(255, 255, 255));
			btnGroupSexo.add(btnMasculino);
			btnMasculino.setBounds(97, 113, 93, 23);
			panel_1.add(btnMasculino);
			
			btnFemenino = new JRadioButton("Femenino");
			btnFemenino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(btnFemenino.isSelected()){
						panelMujer.setVisible(true);
						panelHombre.setVisible(false);	
						PanelTodos.setVisible(false);
					}
				}
			});
			btnFemenino.setBackground(new Color(255, 255, 255));
			btnGroupSexo.add(btnFemenino);
			btnFemenino.setBounds(192, 113, 94, 23);
			panel_1.add(btnFemenino);
			
			JLabel label_6 = new JLabel("Direccion:");
			label_6.setBounds(30, 91, 84, 16);
			panel_1.add(label_6);
			
			txtDireccion = new JTextField();
			txtDireccion.setBackground(new Color(211, 211, 211));
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(101, 86, 177, 23);
			panel_1.add(txtDireccion);
			
			JLabel label_11 = new JLabel("Email:");
			label_11.setBounds(300, 91, 46, 14);
			panel_1.add(label_11);
			
			txtEmail = new JTextField();
			txtEmail.setBackground(new Color(211, 211, 211));
			txtEmail.setColumns(10);
			txtEmail.setBounds(369, 86, 196, 24);
			panel_1.add(txtEmail);
			
			JLabel label_10 = new JLabel("Fecha Nacimiento:");
			label_10.setBounds(300, 117, 107, 14);
			panel_1.add(label_10);
			
			Jcaldate = new JDateChooser();
			Jcaldate.setBounds(428, 116, 137, 22);
			panel_1.add(Jcaldate);
			
			JLabel lblPaisDeNacimiento = new JLabel("Pais de Nacimiento:");
			lblPaisDeNacimiento.setBounds(30, 145, 129, 16);
			panel_1.add(lblPaisDeNacimiento);
			
			cbxNacionalidad = new JComboBox();
			cbxNacionalidad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxNacionalidad.setBounds(147, 143, 137, 23);
			panel_1.add(cbxNacionalidad);
			cbxNacionalidad.setBackground(new Color(211, 211, 211));
			cbxNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\u00E1n\t", "Alemania\t", "Arabia Saudita\t", "Argentina\t", "Australia\t", "B\u00E9lgica\t", "Bolivia\t", "Brasil\t", "Camboya\t", "Canad\u00E1\t", "Chile\t", "China", "Colombia\t", "Corea\t", "Costa Rica", "Cuba\t", "Dinamarca\t", "Ecuador\t", "Egipto\t", "El Salvador\t", "Escocia\t", "Espa\u00F1a", "Estados Unidos\t", "Estonia\t", "Filipinas\t", "Francia\t", "Grecia", "Guatemala\t", "Hait\u00ED\t", "Holanda\t", "Honduras\t", "Indonesia\t", "Inglaterra\t", "Irak\t", "Ir\u00E1n", "Irlanda\t", "Israel\t", "Italia\t", "Jap\u00F3n\t", "Jordania\t", "Laos\t", "Letonia\t", "Lituania\t", "Malasia\t", "Marruecos\t", "M\u00E9xico\t", "Nicaragua\t", "Noruega\t", "Nueva Zelanda", "Panam\u00E1\t", "Paraguay\t", "Per\u00FA\t", "Polonia\t", "Portugal\t", "Puerto Rico", "Republica Dom.", "Rumania\t", "Rusia\t", "Suecia\t", "Suiza\t", "Tailandia\t", "Taiw\u00E1n\t", "Turqu\u00EDa\t", "Ucrania\t", "Uruguay\t", "Venezuela\t", "Vietnam"}));
			PanelTodos.setVisible(true);
			
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.setBackground(new Color(0, 0, 139));
			panel_3.setBounds(0, 0, 804, 50);
			panel.add(panel_3);
			
			lblIngresarSolicitante = new JLabel("Modificar/Eliminar Solicitante");
			lblIngresarSolicitante.setForeground(Color.WHITE);
			lblIngresarSolicitante.setFont(new Font("Cambria", Font.PLAIN, 27));
			lblIngresarSolicitante.setBounds(205, 0, 461, 46);
			panel_3.add(lblIngresarSolicitante);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(Color.WHITE);
			panel_5.setBounds(10, 61, 774, 28);
			panel.add(panel_5);
			panel_5.setLayout(null);
			
			JLabel lblFecha = new JLabel("Fecha de Solicitud:");
			lblFecha.setBounds(502, 6, 123, 16);
			panel_5.add(lblFecha);
			
			txtFechaSolicitud = new JTextField();
			txtFechaSolicitud.setBounds(622, 1, 146, 26);
			panel_5.add(txtFechaSolicitud);
			txtFechaSolicitud.setEditable(false);
			txtFechaSolicitud.setText("  "+LocalDate.now().toString());
			txtFechaSolicitud.setColumns(10);
			
			JLabel lblCedula = new JLabel("Cedula :");
			lblCedula.setBounds(14, 6, 61, 16);
			panel_5.add(lblCedula);
			
			txtBuscarCedula = new JFormattedTextField(formatoCedula);
			txtBuscarCedula.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			txtBuscarCedula.setBounds(76, 1, 210, 26);
			panel_5.add(txtBuscarCedula);
			txtBuscarCedula.setColumns(10);
			
			btnBuscar = new JButton("Buscar");
			btnBuscar.setIcon(new ImageIcon(ModificarSolicitantes.class.getResource("/imagenes/busqueda-de-usuario.png")));
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (txtBuscarCedula.getText().toString().equalsIgnoreCase("")||bolsa.buscarSolicitante(txtBuscarCedula.getText().toString())==null)
						JOptionPane.showMessageDialog(null, "No se ha encontrado el cliente", "Informacion", JOptionPane.WARNING_MESSAGE);
					else{
					s = Bolsa.buscarSolicitante(txtBuscarCedula.getText());
					
					//Cedula
					txtCedula.setText(s.getCedula());
					//Nombre
					txtNombre.setText(s.getNombre());
					//Apellido
					txtApellido.setText(s.getApellido());
					//Telefono
					txtTelefono.setText(s.getTelefono());
					//Email
					txtEmail.setText(s.getEmail());
					//Sexo
					if(s.getSexo().equalsIgnoreCase("Masculino")){
						btnMasculino.setSelected(true);
						PanelTodos.setVisible(false);
						panelMujer.setVisible(false);
						panelHombre.setVisible(true);}
					if(s.getSexo().equalsIgnoreCase("Femenino")){
						btnFemenino.setSelected(true);
						PanelTodos.setVisible(false);
						panelMujer.setVisible(true);
						panelHombre.setVisible(false);}

					//Nacionalidad
					for(int u=0; u<cbxNacionalidad.getItemCount();u++){
						if(cbxNacionalidad.getItemAt(u).toString().equalsIgnoreCase(s.getNacionalidad()))
						cbxNacionalidad.setSelectedIndex(u);
					}
					cbxNacionalidad.setEnabled(true);
					//EstadoCivil
					for(int u=0; u<cbxEstadoCivil.getItemCount();u++){
						if(cbxEstadoCivil.getItemAt(u).toString().equalsIgnoreCase(s.getEstadoCivil()))
						cbxEstadoCivil.setSelectedIndex(u);
					}
					cbxEstadoCivil.setEnabled(true);
					//Direccion
					txtDireccion.setText(s.getDireccion());
					txtDireccion.setEnabled(true);
					//Cuidad
					for(int u=0; u<cbxCiudad.getItemCount();u++){
						if(cbxCiudad.getItemAt(u).toString().equalsIgnoreCase(s.getCuidad()))
						cbxCiudad.setSelectedIndex(u);
					}
					cbxCiudad.setEnabled(true); 
					//Pais
					for(int u=0; u<cbxPais.getItemCount();u++){
						if(cbxPais.getItemAt(u).toString().equalsIgnoreCase(s.getPais()))
						cbxPais.setSelectedIndex(u);
					}
					cbxPais.setEnabled(true);
					//Fecha Nacimiento
					Jcaldate.setDate(s.getFechaNacimiento());
					Jcaldate.setEnabled(true);
					//Idioma
				
					int a=0;
					
					for(int u=0; u<cbxIdioma1.getItemCount();u++){
						if(cbxIdioma1.getItemAt(u).toString().equalsIgnoreCase(s.getIdioma().get(0))){
							cbxIdioma1.setSelectedIndex(u);
							a=u;
						}
					}
	
					if(s.getIdioma().size()==2){
						for(int u=0; u<cbxIdioma2.getItemCount();u++){
							if(u!=a){
								if(cbxIdioma2.getItemAt(u).toString().equalsIgnoreCase(s.getIdioma().get(1))){
									cbxIdioma2.setSelectedIndex(u);
									a=u; 
								}
							}
						}
					}
					
					if(s.getIdioma().size()==3){
					for(int u=0; u<cbxIdioma3.getItemCount();u++){
						if(u!=a){
						if(cbxIdioma3.getItemAt(u).toString().equalsIgnoreCase(s.getIdioma().get(2)))
						cbxIdioma3.setSelectedIndex(u);}
					}}
						
					cbxIdioma1.setEnabled(true);
					cbxIdioma2.setEnabled(true);
					cbxIdioma3.setEnabled(true);
						
					//Licencia
					if(s.isLicencia()==true)
						btnLicenciaCY.setSelected(true);
					else
						btnLicenciaCN.setSelected(true);
					
					//NombreEmpresa
					txtEmpresa.setText(s.getNombreEmpresa());
					txtEmpresa.setEnabled(true);
					
					//AreaTrabajo 
					for(int u=0; u<cbxAreaTrabajo.getItemCount();u++){
						if(cbxAreaTrabajo.getItemAt(u).toString().equalsIgnoreCase(s.getAreaTrabajo1()))
						cbxAreaTrabajo.setSelectedIndex(u);
					}
					cbxAreaTrabajo.setEnabled(true);
							
					//TiempoTrabajo
					spnTiempoExperiencia.setValue(s.getTiempotrabajoRealizado1());
					spnTiempoExperiencia.setEnabled(true);
					
					//NombreReferente
					txtNombreReferente.setText(s.getNombreReferente());
					txtNombreReferente.setEnabled(true);
					//NumeroReferente
					txtNumeroReferente.setText(s.getNumeroReferente());
					txtNumeroReferente.setEnabled(true);		
					}	
				}
			});
			
			btnBuscar.setBounds(290, 1, 117, 29);
			panel_5.add(btnBuscar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setForeground(new Color(0, 0, 139));
			buttonPane.setBackground(new Color(0, 0, 139));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnModificar = new JButton("Modificar");
				btnModificar.setIcon(new ImageIcon(ModificarSolicitantes.class.getResource("/imagenes/cambiar.png")));
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Datos Personales
						String nombre= txtNombre.getText();
						String apellido = txtApellido.getText();
						String telefono = txtTelefono.getText();
						String email = txtEmail.getText();
						String cedula = txtCedula.getText();
						String direccion = txtDireccion.getText();
						String cuidad = cbxCiudad.getSelectedItem().toString();
						String pais = cbxPais.getSelectedItem().toString();
						String estadoCivil = cbxEstadoCivil.getSelectedItem().toString();
						String nacionalidad = cbxNacionalidad.getSelectedItem().toString();
						String sexo=null;
						if (btnGroupSexo.getSelection()!=null){
							if(btnFemenino.isSelected())
								sexo= "Femenino";
							if(btnMasculino.isSelected())
								sexo= "Masculino";
						}
						
						boolean LicenciaConducir=false;
						if (btnGroupLicencia.getSelection()!=null){
							if(btnLicenciaCY.isSelected())
								LicenciaConducir= true;
							if(btnLicenciaCN.isSelected())
								LicenciaConducir= false;
						}
						
						//Experiencia Labora
						String nombreEmpresa = txtEmpresa.getText();
						int tiempoExp = (int) spnTiempoExperiencia.getValue();
						String areaTrabajo = cbxAreaTrabajo.getSelectedItem().toString();
						String nombreReferente = txtNombreReferente.getText();
						String telefonoReferente = txtNumeroReferente.getText();
						

							if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("   -       - ")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("(   ) -   -    ")||txtEmail.getText().equalsIgnoreCase("")||btnGroupSexo.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
									||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||Jcaldate.getDate()==null||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma2.isSelected()
									||cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma3.isSelected()||
									btnGroupLicencia.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||mayorEdad()==false){
									if(mayorEdad()==false)
										JOptionPane.showMessageDialog(null, "Debe ser mayor de 18", "Informacion", JOptionPane.WARNING_MESSAGE);
									else
										JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Informacion", JOptionPane.WARNING_MESSAGE);}
							else{
								java.sql.Date fechaNacimiento = new java.sql.Date(Jcaldate.getDate().getTime());
								//Solicitantes s= new Solicitantes(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, idioma, true, LicenciaConducir, nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente);
								s.setCedula(txtCedula.getText());
								s.setNombre(txtNombre.getText());
								s.setApellido(txtApellido.getText());
								s.setTelefono(txtTelefono.getText());
								s.setEmail(txtEmail.getText());
								String sexol = "";
								if (btnGroupSexo.getSelection()!=null){
									if(btnFemenino.isSelected())
										sexol= "Femenino";
									if(btnMasculino.isSelected())
										sexol= "Masculino";	
								}
								s.setSexo(sexol);
								s.setNacionalidad(cbxNacionalidad.getSelectedItem().toString());
								s.setEstadoCivil(cbxEstadoCivil.getSelectedItem().toString());
								s.setDireccion(txtDireccion.getText());
								s.setCuidad(cbxCiudad.getSelectedItem().toString());
								s.setPais(cbxPais.getSelectedItem().toString());
								s.setFechaNacimiento(fechaNacimiento);
								//Idioma
								s.setIdioma(idioma);
								//Licencia
								boolean licencia = false;
								if (btnGroupLicencia.getSelection()!=null){
									if(btnLicenciaCY.isSelected())
										licencia= true;
									if(btnMasculino.isSelected())
										licencia= false;	
								}
								s.setLicencia(licencia);
								s.setNombreEmpresa(txtNombre.getText());
								s.setAreaTrabajo1(cbxAreaTrabajo.getSelectedItem().toString());
								s.setTiempotrabajoRealizado1((int) spnTiempoExperiencia.getValue());
								s.setNombreReferente(txtNombreReferente.getText());
								s.setTelefono(txtNumeroReferente.getText());
								JOptionPane.showMessageDialog(null, "Operacion satisfactoria", "Informacion", JOptionPane.INFORMATION_MESSAGE);
								limpiar();					
							}
						}

					private void limpiar() {
					     txtEmpresa.setText("");
						 cbxAreaTrabajo.removeAll();
						 txtNombreReferente.setText("");
						 txtNombreReferente.setText("");
						 txtNombre.setText("");
					     txtApellido.setText("");
						 txtTelefono.setText("");;
						 txtEmail.setText("");
						 txtCedula.setText("");
						 txtDireccion.setText("");
						 cbxIdioma1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
				         cbxIdioma3.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
						 cbxIdioma2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Patua", "Creoles", "Ruso"}));
						 cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
						 cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
						 cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
						 cbxAreaTrabajo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));	
						 cbxNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\u00E1n\t", "Alemania\t", "Arabia Saudita\t", "Argentina\t", "Australia\t", "B\u00E9lgica\t", "Bolivia\t", "Brasil\t", "Camboya\t", "Canad\u00E1\t", "Chile\t", "China", "Colombia\t", "Corea\t", "Costa Rica", "Cuba\t", "Dinamarca\t", "Ecuador\t", "Egipto\t", "El Salvador\t", "Escocia\t", "Espa\u00F1a", "Estados Unidos\t", "Estonia\t", "Filipinas\t", "Francia\t", "Grecia", "Guatemala\t", "Hait\u00ED\t", "Holanda\t", "Honduras\t", "Indonesia\t", "Inglaterra\t", "Irak\t", "Ir\u00E1n", "Irlanda\t", "Israel\t", "Italia\t", "Jap\u00F3n\t", "Jordania\t", "Laos\t", "Letonia\t", "Lituania\t", "Malasia\t", "Marruecos\t", "M\u00E9xico\t", "Nicaragua\t", "Noruega\t", "Nueva Zelanda", "Panam\u00E1\t", "Paraguay\t", "Per\u00FA\t", "Polonia\t", "Portugal\t", "Puerto Rico", "Republica Dom.", "Rumania\t", "Rusia\t", "Suecia\t", "Suiza\t", "Tailandia\t", "Taiw\u00E1n\t", "Turqu\u00EDa\t", "Ucrania\t", "Uruguay\t", "Venezuela\t", "Vietnam"})); 
						 panel_principal.setVisible(true);
						 panel_secundario.setVisible(false);
						 btnGroupLicencia.clearSelection();
						 btnGroupSexo.clearSelection();
						 btnGroupViajar.clearSelection();
						 btnPag.setEnabled(false);
						 btnPag_1.setEnabled(true);
						 panelHombre.setVisible(false);
						 panelMujer.setVisible(false);
						 PanelTodos.setVisible(true);
					}
				});
				
				btnEliminar = new JButton("Eliminar");
				btnEliminar.setIcon(new ImageIcon(ModificarSolicitantes.class.getResource("/imagenes/cubo-de-basurap.png")));
				btnEliminar.setActionCommand("OK");
				buttonPane.add(btnEliminar);
				btnModificar.setActionCommand("OK");
				buttonPane.add(btnModificar);
				getRootPane().setDefaultButton(btnModificar);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setIcon(new ImageIcon(ModificarSolicitantes.class.getResource("/imagenes/creuz.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				
				btnPag = new JButton("Pagina Anterior <");
				btnPag.setEnabled(false);
				btnPag.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_principal.setVisible(true);
						panel_secundario.setVisible(false);
						btnPag.setEnabled(false);
						btnPag_1.setEnabled(true);
					}
				});
				btnPag.setActionCommand("Cancel");
				buttonPane.add(btnPag);
				
				btnPag_1 = new JButton("> Pagina Siguiente ");
				btnPag_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_principal.setVisible(false);
						panel_secundario.setVisible(true);
						btnPag.setEnabled(true);
						btnPag_1.setEnabled(false);
					}
				});
				btnPag_1.setActionCommand("Cancel");
				buttonPane.add(btnPag_1);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void cleanNombre(){
		txtNombre.setText(""+txtNombre.getText().substring(0, txtNombre.getText().length()-1));
	}
	public void cleanApellido(){
		txtApellido.setText(""+txtApellido.getText().substring(0, txtApellido.getText().length()-1));
	}
	public void cleanNombreReferente(){
		txtNombreReferente.setText(""+txtNombreReferente.getText().substring(0, txtNombreReferente.getText().length()-1));
	}
	
	public boolean mayorEdad(){
		 Calendar today = Calendar.getInstance();
		    Calendar birthDate = Calendar.getInstance();
		    boolean mayor=false;
		    int age = 0;

		    birthDate.setTime(Jcaldate.getDate());
//		    if (birthDate.after(today)) {
//		        throw new IllegalArgumentException("Verifique su fecha de nacimiento");
//		    }

		    age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		    // If birth date is greater than todays date (after 2 days adjustment of leap year) then decrement age one year   
		    if ( (birthDate.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) > 3) ||
		            (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH ))){
		        age--;

		     // If birth date and todays date are of same month and birth day of month is greater than todays day of month then decrement age
		    }else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH )) &&
		              (birthDate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH ))){
		        age--;
		    }
		    
		    if(age>=18)
		    	mayor=true;
		 
		    return mayor;
	}
}
