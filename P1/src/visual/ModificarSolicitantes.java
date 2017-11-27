


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
//import javax.swing.JFormattedTextField$AbstractFormatter;

public class ModificarSolicitantes extends JDialog {
	private Bolsa bolsa = Bolsa.getIntance();
	ButtonGroup btnGroupSexo =new ButtonGroup();
	ButtonGroup btnGroupMudarse =new ButtonGroup();
	ButtonGroup btnGroupLicencia =new ButtonGroup();
	ButtonGroup btnGroupJornada =new ButtonGroup();
	ButtonGroup btnGroupNivelEducativo =new ButtonGroup();
	String h;
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
	private ArrayList<String> habi=new ArrayList<>();
	private final JPanel contentPanel = new JPanel();
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JFormattedTextField txtCedula;
    private JFormattedTextField txtTelefono;
    private JTextField txtDireccion;
    private JTextField txtEmail;
    private JTextField txtInstitucionTecnico;
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
	private JPanel pTecnico;
	private JPanel pObrero;
	private JPanel pUniversitario;
	private JComboBox cbxCarrera;
	private JComboBox<?> cbxHabilidad;
	private JComboBox cbxTecnico;
	private JRadioButton btnUniversitario;
	private JRadioButton btnTecnico;
	private JRadioButton btnObrero;
	private JRadioButton btnDispMudarseY;
	private JRadioButton btnDispMudarseN;
	private JComboBox<?> cbxIdioma1;
	private JComboBox<?> cbxIdioma2;
	private JComboBox<?> cbxIdioma3;
	private JRadioButton btnTiempoCompleto;
	private JRadioButton btnMedioTiempo;
	private JRadioButton btnLicenciaCY;
	private JRadioButton btnLicenciaCN;
	private JCheckBox chbIdioma2;
	private JCheckBox chbIdioma3;
	private JComboBox<?> cbxAreaInteres;
	private JComboBox<?> cbxAreaTrabajo;
	private JSpinner spnTiempoExperiencia;
	private JComboBox cbxInstitucionUni;
	private ArrayList<String> idioma = new ArrayList<>();
	private ArrayList<String> habilidad = new ArrayList<>();
	private final ButtonGroup btnGroupViajar = new ButtonGroup();
	private JRadioButton btnViajarN;
	private JRadioButton btnViajarY;
	private JSpinner spnSalarioSolicitado;
	private JCheckBox chckbxAadirOtro;
    private JComboBox<?> cbxHabilidad2;
    private JDateChooser txtFechaNacimiento;
    private static MaskFormatter formatoCedula;
	private static MaskFormatter formatoNumero;
	
	private JPanel panel_principal;
	private JPanel panel_secundario;
	private JPanel panel_3;
	private JLabel lblIngresarSolicitante;
	private JPanel panel_4;
	private JButton btnPag;
	private JButton btnPag_1;
	private JPanel panelHombre;
	private JPanel panelMujer;
	private JLabel mujer;
	private JPanel panel_5;
	private JFormattedTextField txtBuscarCedula;
	
	
	public ModificarSolicitantes() {
		setTitle("Modificar/Eliminar Solicitante");
		
		
		setResizable(false);
		setBounds(100, 100, 794, 594);
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
			panel_secundario.setBounds(10, 147, 774, 329);
			panel.add(panel_secundario);
			panel_secundario.setLayout(null);
			
			JPanel panel_6 = new JPanel();
			panel_6.setBackground(new Color(255, 255, 255));
			panel_6.setBounds(2, 2, 402, 322);
			panel_secundario.add(panel_6);
			panel_6.setLayout(null);
			panel_6.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
			JLabel label_18 = new JLabel("Disponibilidad de Mudarse:");
			label_18.setFont(new Font("Dialog", Font.BOLD, 13));
			label_18.setBounds(27, 35, 192, 16);
			panel_6.add(label_18);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(27, 49, 173, 12);
			panel_6.add(separator_1);
			
			JLabel label_19 = new JLabel("Tipo de Jornada:");
			label_19.setFont(new Font("Dialog", Font.BOLD, 13));
			label_19.setBounds(229, 35, 148, 16);
			panel_6.add(label_19);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBounds(229, 49, 103, 12);
			panel_6.add(separator_2);
			
			JLabel label_20 = new JLabel("Licencia de conducir:");
			label_20.setFont(new Font("Dialog", Font.BOLD, 13));
			label_20.setBounds(27, 89, 160, 16);
			panel_6.add(label_20);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(27, 103, 134, 12);
			panel_6.add(separator_3);
			
			btnDispMudarseY = new JRadioButton("Si");
			btnDispMudarseY.setBackground(new Color(255, 255, 255));
			btnGroupMudarse.add(btnDispMudarseY);
			btnDispMudarseY.setBounds(37, 58, 54, 23);
			panel_6.add(btnDispMudarseY);
			
			btnDispMudarseN = new JRadioButton("No");
			btnDispMudarseN.setBackground(new Color(255, 255, 255));
			btnGroupMudarse.add(btnDispMudarseN);
			btnDispMudarseN.setBounds(93, 58, 54, 23);
			panel_6.add(btnDispMudarseN);
			
			JLabel label_21 = new JLabel("Idioma:");
			label_21.setBounds(243, 146, 61, 16);
			panel_6.add(label_21);
			
			cbxIdioma1 = new JComboBox();
			cbxIdioma1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					if(!cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase("Seleccionar")){
						idioma.add(0, cbxIdioma1.getSelectedItem().toString());
					}
				}
			});
			String[] idioma1= {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Patua", "Creoles", "Ruso"};
			
			cbxIdioma1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
			cbxIdioma1.setBounds(243, 165, 134, 23);
			panel_6.add(cbxIdioma1);
			
			btnTiempoCompleto = new JRadioButton("Tiempo Completo");
			btnTiempoCompleto.setBackground(new Color(255, 255, 255));
			btnGroupJornada.add(btnTiempoCompleto);
			btnTiempoCompleto.setBounds(238, 87, 139, 23);
			panel_6.add(btnTiempoCompleto);
			
			btnMedioTiempo = new JRadioButton("Medio Tiempo");
			btnMedioTiempo.setBackground(new Color(255, 255, 255));
			btnGroupJornada.add(btnMedioTiempo);
			btnMedioTiempo.setBounds(239, 58, 138, 23);
			panel_6.add(btnMedioTiempo);
			
			btnLicenciaCN = new JRadioButton("No");
			btnLicenciaCN.setBackground(new Color(255, 255, 255));
			btnGroupLicencia.add(btnLicenciaCN);
			btnLicenciaCN.setBounds(93, 112, 54, 23);
			panel_6.add(btnLicenciaCN);
			
			btnLicenciaCY = new JRadioButton("Si");
			btnLicenciaCY.setBackground(new Color(255, 255, 255));
			btnGroupLicencia.add(btnLicenciaCY);
			btnLicenciaCY.setBounds(37, 112, 54, 23);
			panel_6.add(btnLicenciaCY);
			
			chbIdioma2 = new JCheckBox("A\u00F1adir otro idioma");
			chbIdioma2.setBackground(new Color(255, 255, 255));
			chbIdioma2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chbIdioma2.isSelected())
						cbxIdioma2.setEnabled(true);
					else 
						cbxIdioma2.setEnabled(false);
				}	
			});
			chbIdioma2.setBounds(243, 192, 134, 23);
			panel_6.add(chbIdioma2);
			
			cbxIdioma2 = new JComboBox();
			cbxIdioma2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("Seleccionar")){
						idioma.add(1, cbxIdioma2.getSelectedItem().toString());
					}
				}
			});
			
			
			String[] idioma2={"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Patua", "Creoles", "Ruso"};
			
			cbxIdioma2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Patua", "Creoles", "Ruso"}));
			cbxIdioma2.setEnabled(false);
			cbxIdioma2.setBounds(243, 222, 134, 23);
			panel_6.add(cbxIdioma2);
			
			chbIdioma3 = new JCheckBox("A\u00F1adir otro idioma");
			chbIdioma3.setBackground(new Color(255, 255, 255));
			chbIdioma3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chbIdioma3.isSelected())
						cbxIdioma3.setEnabled(true);
					else 
						cbxIdioma3.setEnabled(false);
				}
			});
			chbIdioma3.setBounds(243, 250, 134, 23);
			panel_6.add(chbIdioma3);
			
			cbxIdioma3 = new JComboBox();
			cbxIdioma3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("Seleccionar")){
						idioma.add(2, cbxIdioma1.getSelectedItem().toString());
					}
				}
			});
			
			String[] idioma3={"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"};
			cbxIdioma3.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
			cbxIdioma3.setEnabled(false);
			cbxIdioma3.setBounds(243, 281, 134, 23);
			panel_6.add(cbxIdioma3);
			
			JLabel label_22 = new JLabel("Area de interes:");
			label_22.setBounds(27, 196, 126, 14);
			panel_6.add(label_22);
			
			cbxAreaInteres = new JComboBox();
			cbxAreaInteres.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			
			String[] areaInteres={"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"};
			
			cbxAreaInteres.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
			cbxAreaInteres.setBounds(27, 222, 126, 23);
			panel_6.add(cbxAreaInteres);
			
			JLabel lblSalarioSolicitado = new JLabel("Salario solicitado (Mensual):");
			lblSalarioSolicitado.setBounds(27, 254, 173, 14);
			panel_6.add(lblSalarioSolicitado);
			
			spnSalarioSolicitado = new JSpinner();
			spnSalarioSolicitado.setModel(new SpinnerNumberModel(10000, 10000, 1000000, 500));
			spnSalarioSolicitado.setBounds(27, 280, 126, 22);
			panel_6.add(spnSalarioSolicitado);
			
			JLabel lblDisponibilidadDeViajar = new JLabel("Disponibilidad de viajar:");
			lblDisponibilidadDeViajar.setBounds(27, 146, 173, 14);
			panel_6.add(lblDisponibilidadDeViajar);
			
			btnViajarY = new JRadioButton("Si");
			btnViajarY.setBackground(new Color(255, 255, 255));
			btnGroupViajar.add(btnViajarY);
			btnViajarY.setBounds(37, 164, 54, 23);
			panel_6.add(btnViajarY);
			
			btnViajarN = new JRadioButton("No");
			btnViajarN.setBackground(new Color(255, 255, 255));
			btnGroupViajar.add(btnViajarN);
			btnViajarN.setBounds(93, 164, 54, 23);
			panel_6.add(btnViajarN);
			
			JPanel panel_7 = new JPanel();
			panel_7.setBackground(new Color(255, 255, 255));
			panel_7.setBounds(414, 10, 353, 196);
			panel_secundario.add(panel_7);
			panel_7.setLayout(null);
			panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
			
			JLabel label_23 = new JLabel("Experiencia Laboral (Ultimo empleo):");
			label_23.setFont(new Font("Dialog", Font.BOLD, 13));
			label_23.setBounds(10, 11, 281, 16);
			panel_7.add(label_23);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBounds(10, 25, 240, 12);
			panel_7.add(separator_4);
			
			JLabel label_24 = new JLabel("Nombre de Empresa:");
			label_24.setBounds(10, 47, 134, 16);
			panel_7.add(label_24);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setBackground(new Color(211, 211, 211));
			txtEmpresa.setColumns(10);
			txtEmpresa.setBounds(147, 45, 198, 24);
			panel_7.add(txtEmpresa);
			
			JLabel label_25 = new JLabel("Area de Trabajo:");
			label_25.setBounds(10, 101, 110, 16);
			panel_7.add(label_25);
			
			JLabel label_26 = new JLabel("Nombre de Referente:");
			label_26.setBounds(10, 130, 127, 16);
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
			txtNombreReferente.setBounds(147, 128, 198, 24);
			panel_7.add(txtNombreReferente);
			
			JLabel label_27 = new JLabel("Telefono de Referente:");
			label_27.setBounds(10, 159, 146, 21);
			panel_7.add(label_27);
			
			txtNumeroReferente = new JFormattedTextField(formatoNumero);
			txtNumeroReferente.setBackground(new Color(211, 211, 211));
			txtNumeroReferente.setColumns(10);
			txtNumeroReferente.setBounds(147, 159, 198, 24);
			panel_7.add(txtNumeroReferente);
			
			cbxAreaTrabajo = new JComboBox();
			cbxAreaTrabajo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			String[] area={"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"};
			
			cbxAreaTrabajo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
			cbxAreaTrabajo.setBounds(147, 99, 198, 23);
			panel_7.add(cbxAreaTrabajo);
			
			JLabel label_28 = new JLabel("Tiempo de experiencia:");
			label_28.setBounds(10, 76, 134, 14);
			panel_7.add(label_28);
			
			spnTiempoExperiencia = new JSpinner();
			spnTiempoExperiencia.setModel(new SpinnerNumberModel(1, 1, 50, 1));
			spnTiempoExperiencia.setBounds(244, 74, 101, 22);
			panel_7.add(spnTiempoExperiencia);
			
			panel_secundario.setVisible(false);
			
			panel_principal = new JPanel();
			panel_principal.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Formulario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_principal.setBackground(new Color(255, 255, 255));
			panel_principal.setBounds(10, 147, 774, 366);
			panel.add(panel_principal);
			panel_principal.setLayout(null);
			
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
			txtNombre.setBounds(101, 28, 177, 24);
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
			txtApellido.setBounds(370, 30, 196, 24);
			panel_1.add(txtApellido);
			
			JLabel label_2 = new JLabel("Cedula:");
			label_2.setBounds(30, 59, 61, 16);
			panel_1.add(label_2);
			
			txtCedula = new JFormattedTextField(formatoCedula);
			txtCedula.setBackground(new Color(211, 211, 211));
			txtCedula.setColumns(10);
			txtCedula.setBounds(101, 57, 177, 24);
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
			txtTelefono.setBounds(370, 59, 196, 24);
			panel_1.add(txtTelefono);
			
			btnMasculino = new JRadioButton("Masculino");
			btnMasculino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					if(btnMasculino.isSelected()){
						panelHombre.setVisible(true);
						
						panelMujer.setVisible(false);
						
						
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
			txtDireccion.setBounds(101, 86, 177, 24);
			panel_1.add(txtDireccion);
			
			JLabel label_11 = new JLabel("Email:");
			label_11.setBounds(300, 91, 46, 14);
			panel_1.add(label_11);
			
			txtEmail = new JTextField();
			txtEmail.setBackground(new Color(211, 211, 211));
			txtEmail.setColumns(10);
			txtEmail.setBounds(370, 86, 196, 24);
			panel_1.add(txtEmail);
			
			JLabel label_10 = new JLabel("Fecha Nacimiento:");
			label_10.setBounds(300, 117, 107, 14);
			panel_1.add(label_10);
			
			txtFechaNacimiento = new JDateChooser();
			txtFechaNacimiento.setBounds(428, 116, 137, 22);
			panel_1.add(txtFechaNacimiento);
			
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
			String[] nacionalidad={"<Seleccionar>", "Afganist\u00E1n\t", "Alemania\t", "Arabia Saudita\t", "Argentina\t", "Australia\t", "B\u00E9lgica\t", "Bolivia\t", "Brasil\t", "Camboya\t", "Canad\u00E1\t", "Chile\t", "China", "Colombia\t", "Corea\t", "Costa Rica", "Cuba\t", "Dinamarca\t", "Ecuador\t", "Egipto\t", "El Salvador\t", "Escocia\t", "Espa\u00F1a", "Estados Unidos\t", "Estonia\t", "Filipinas\t", "Francia\t", "Grecia", "Guatemala\t", "Hait\u00ED\t", "Holanda\t", "Honduras\t", "Indonesia\t", "Inglaterra\t", "Irak\t", "Ir\u00E1n", "Irlanda\t", "Israel\t", "Italia\t", "Jap\u00F3n\t", "Jordania\t", "Laos\t", "Letonia\t", "Lituania\t", "Malasia\t", "Marruecos\t", "M\u00E9xico\t", "Nicaragua\t", "Noruega\t", "Nueva Zelanda", "Panam\u00E1\t", "Paraguay\t", "Per\u00FA\t", "Polonia\t", "Portugal\t", "Puerto Rico", "Republica Dom.", "Rumania\t", "Rusia\t", "Suecia\t", "Suiza\t", "Tailandia\t", "Taiw\u00E1n\t", "Turqu\u00EDa\t", "Ucrania\t", "Uruguay\t", "Venezuela\t", "Vietnam"};
			cbxNacionalidad.setBackground(new Color(211, 211, 211));
			cbxNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\u00E1n\t", "Alemania\t", "Arabia Saudita\t", "Argentina\t", "Australia\t", "B\u00E9lgica\t", "Bolivia\t", "Brasil\t", "Camboya\t", "Canad\u00E1\t", "Chile\t", "China", "Colombia\t", "Corea\t", "Costa Rica", "Cuba\t", "Dinamarca\t", "Ecuador\t", "Egipto\t", "El Salvador\t", "Escocia\t", "Espa\u00F1a", "Estados Unidos\t", "Estonia\t", "Filipinas\t", "Francia\t", "Grecia", "Guatemala\t", "Hait\u00ED\t", "Holanda\t", "Honduras\t", "Indonesia\t", "Inglaterra\t", "Irak\t", "Ir\u00E1n", "Irlanda\t", "Israel\t", "Italia\t", "Jap\u00F3n\t", "Jordania\t", "Laos\t", "Letonia\t", "Lituania\t", "Malasia\t", "Marruecos\t", "M\u00E9xico\t", "Nicaragua\t", "Noruega\t", "Nueva Zelanda", "Panam\u00E1\t", "Paraguay\t", "Per\u00FA\t", "Polonia\t", "Portugal\t", "Puerto Rico", "Republica Dom.", "Rumania\t", "Rusia\t", "Suecia\t", "Suiza\t", "Tailandia\t", "Taiw\u00E1n\t", "Turqu\u00EDa\t", "Ucrania\t", "Uruguay\t", "Venezuela\t", "Vietnam"}));
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(255, 255, 255));
			panel_2.setBounds(10, 197, 358, 154);
			panel_principal.add(panel_2);
			panel_2.setLayout(null);
			panel_2.setBorder(new TitledBorder(null, "Educacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
			pObrero = new JPanel();
			pObrero.setBackground(new Color(255, 255, 255));
			pObrero.setLayout(null);
			pObrero.setBounds(6, 64, 314, 79);
			panel_2.add(pObrero);
			
			JLabel label_16 = new JLabel("Habilidad:");
			label_16.setBounds(6, 20, 71, 16);
			pObrero.add(label_16);
			String[] habilidad1= {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"};
			
			cbxHabilidad = new JComboBox();
			cbxHabilidad.setBackground(new Color(211, 211, 211));
			cbxHabilidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
			cbxHabilidad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
					if(!cbxHabilidad.getSelectedItem().toString().equalsIgnoreCase("Seleccionar"))
						h=cbxHabilidad.getSelectedItem().toString();
						habilidad.add(0,cbxHabilidad.getSelectedItem().toString());
					
					
					
				}
			});
			cbxHabilidad.setBounds(82, 14, 226, 23);
			pObrero.add(cbxHabilidad);
			
			chckbxAadirOtro = new JCheckBox("Otro?");
			chckbxAadirOtro.setBackground(new Color(255, 255, 255));
			chckbxAadirOtro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					verificarHabilidad();
					if(chckbxAadirOtro.isSelected()){
						cbxHabilidad2.setEnabled(true);
					}else if(!chckbxAadirOtro.isSelected()){
						cbxHabilidad2.setEnabled(false);
						
					}
				}

				private void verificarHabilidad() {
				if(cbxHabilidad2.getSelectedItem().toString().equalsIgnoreCase(h)){
					
					JOptionPane.showMessageDialog(null,"No Puede Selecionar la misma Habilidad");
					
					
					
					
				}
					
				}
			});
			chckbxAadirOtro.setBounds(6, 47, 63, 23);
			pObrero.add(chckbxAadirOtro);
			String[] habilidad2= {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"};
			
			cbxHabilidad2 = new JComboBox();
			cbxHabilidad2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
			cbxHabilidad2.setBackground(new Color(211, 211, 211));
			cbxHabilidad2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxHabilidad2.getSelectedItem().toString().equalsIgnoreCase("Seleccionar"))
						habilidad.add(1,cbxHabilidad2.getSelectedItem().toString());
				}
			});
			cbxHabilidad2.setEnabled(false);
			cbxHabilidad2.setBounds(82, 45, 226, 23);
			pObrero.add(cbxHabilidad2);
			pObrero.setVisible(false);
			
			pUniversitario = new JPanel();
			pUniversitario.setBackground(new Color(255, 255, 255));
			pUniversitario.setLayout(null);
			pUniversitario.setBounds(6, 64, 314, 79);
			panel_2.add(pUniversitario);
			
			JLabel label_12 = new JLabel("Institucion:");
			label_12.setBounds(6, 20, 84, 16);
			pUniversitario.add(label_12);
			
			JLabel label_13 = new JLabel("Carrera:");
			label_13.setBounds(6, 47, 61, 16);
			pUniversitario.add(label_13);
			String[] carrera={"<Seleccionar>", "Administraci\u00F3n de Empresa\u200B", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "\u200BIngenier\u00EDa Industrial", "\u200BIngenier\u00EDa de Sistemas ", "\u200BIngenier\u00EDa Electr\u00F3nica", "\u200BIngenier\u00EDa Telem\u00E1tica", "\u200BIngenier\u00EDa en Mecatr\u00F3nica\u200B\u200B", "\u200BMedicina", "\u200BMercadotecnia", "Nutrici\u00F3n y Diet\u00E9tica", "\u200B\u200BPsicolog\u00EDa", "\u200BTerapia F\u00EDsica\u200B"};
			cbxCarrera = new JComboBox();
			cbxCarrera.setBackground(new Color(211, 211, 211));
			cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n de Empresa\u200B", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "\u200BIngenier\u00EDa Industrial", "\u200BIngenier\u00EDa de Sistemas ", "\u200BIngenier\u00EDa Electr\u00F3nica", "\u200BIngenier\u00EDa Telem\u00E1tica", "\u200BIngenier\u00EDa en Mecatr\u00F3nica\u200B\u200B", "\u200BMedicina", "\u200BMercadotecnia", "Nutrici\u00F3n y Diet\u00E9tica", "\u200B\u200BPsicolog\u00EDa", "\u200BTerapia F\u00EDsica\u200B"}));
			cbxCarrera.setBounds(82, 45, 222, 20);
			pUniversitario.add(cbxCarrera);
			
			String[] isntitucion= {"<Seleccionar>", " Universidad Aut\u00F3noma de Santo Domingo (UASD)", " Facultad Latinoamericana de Cs. Soc. (FLACSO)", " Barna Business School", " Universidad Nacional Tecnol\u00F3gica (UNNATEC)", " Pontificia Universidad Cat\u00F3lica Madre y Maestra (PUCMM)", " Universidad Abierta Para Adultos (UAPA)", " Universidad APEC (UNAPEC)", " Universidad Cat\u00F3lica de Santo Domingo (UCSD)", " Instituto Nacional de Ciencias Exactas (INCE)", " Instituto Superior de Tecnolog\u00EDa Universal (INSUTEC)", " Instituto T\u00E9cnico Superior Oscus San Valero", " Instituto Tecnol\u00F3gico de las Am\u00E9ricas (ITLA)", " Instituto Tecnol\u00F3gico de Santo Domingo (INTEC)", "Universidad Central del Este (UCE)", "Universidad Central Dominicana de Est. Prof. (UCDEP)", "Universidad del Caribe", "Universidad del I. Cultural Dom\u00EDnico-Americano (ICDA)", "Universidad Dominicana Org. y M\u00E9todo (UDOYM)", "Universidad Eugenio Maria de Hostos (UNIREMHOS)", "Universidad Experimental F\u00E9lix Adam (UNEFA)", "Universidad Federico Henr\u00EDquez y Carvajal (UFHEC) ", "Universidad Iberoamericana (UNIBE)", "Universidad Interamericana (UNICA)", "Universidad Nacional Evang\u00E9lica (UNEV)", "Universidad Nacional Pedro Henr\u00EDquez Ure\u00F1a (UNPHU)", "Universidad Odontol\u00F3gica Dominicana (UOD)", "Universidad Psicolog\u00EDa Ind. Dominicana (UPID)", "Universidad Tecnol\u00F3gica de Santiago (UTESA)"};
			cbxInstitucionUni = new JComboBox();
			cbxInstitucionUni.setBackground(new Color(211, 211, 211));
			cbxInstitucionUni.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", " Universidad Aut\u00F3noma de Santo Domingo (UASD)", " Facultad Latinoamericana de Cs. Soc. (FLACSO)", " Barna Business School", " Universidad Nacional Tecnol\u00F3gica (UNNATEC)", " Pontificia Universidad Cat\u00F3lica Madre y Maestra (PUCMM)", " Universidad Abierta Para Adultos (UAPA)", " Universidad APEC (UNAPEC)", " Universidad Cat\u00F3lica de Santo Domingo (UCSD)", " Instituto Nacional de Ciencias Exactas (INCE)", " Instituto Superior de Tecnolog\u00EDa Universal (INSUTEC)", " Instituto T\u00E9cnico Superior Oscus San Valero", " Instituto Tecnol\u00F3gico de las Am\u00E9ricas (ITLA)", " Instituto Tecnol\u00F3gico de Santo Domingo (INTEC)", "Universidad Central del Este (UCE)", "Universidad Central Dominicana de Est. Prof. (UCDEP)", "Universidad del Caribe", "Universidad del I. Cultural Dom\u00EDnico-Americano (ICDA)", "Universidad Dominicana Org. y M\u00E9todo (UDOYM)", "Universidad Eugenio Maria de Hostos (UNIREMHOS)", "Universidad Experimental F\u00E9lix Adam (UNEFA)", "Universidad Federico Henr\u00EDquez y Carvajal (UFHEC) ", "Universidad Iberoamericana (UNIBE)", "Universidad Interamericana (UNICA)", "Universidad Nacional Evang\u00E9lica (UNEV)", "Universidad Nacional Pedro Henr\u00EDquez Ure\u00F1a (UNPHU)", "Universidad Odontol\u00F3gica Dominicana (UOD)", "Universidad Psicolog\u00EDa Ind. Dominicana (UPID)", "Universidad Tecnol\u00F3gica de Santiago (UTESA)"}));
			cbxInstitucionUni.setBounds(82, 14, 222, 20);
			pUniversitario.add(cbxInstitucionUni);
			pUniversitario.setVisible(false);
			
			pTecnico = new JPanel();
			pTecnico.setBackground(new Color(255, 255, 255));
			pTecnico.setLayout(null);
			pTecnico.setBounds(6, 64, 314, 79);
			panel_2.add(pTecnico);
			
			JLabel label_14 = new JLabel("Institucion:");
			label_14.setBounds(6, 20, 84, 16);
			pTecnico.add(label_14);
			
			txtInstitucionTecnico = new JTextField();
			txtInstitucionTecnico.setBackground(new Color(211, 211, 211));
			txtInstitucionTecnico.setColumns(10);
			txtInstitucionTecnico.setBounds(82, 14, 222, 20);
			pTecnico.add(txtInstitucionTecnico);
			
			JLabel label_15 = new JLabel("Tecnico:");
			label_15.setBounds(6, 47, 61, 16);
			pTecnico.add(label_15);
			String[] tecnico= {"<Seleccione>", "Electronica", "Informatica", "Telecomunicaciones", "Contabilidad", "Auditoria", "Mercadeo", "Software"};
			
			cbxTecnico = new JComboBox();
			cbxTecnico.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Electronica", "Informatica", "Telecomunicaciones", "Contabilidad", "Auditoria", "Mercadeo", "Software"}));
			cbxTecnico.setBackground(new Color(211, 211, 211));
			cbxTecnico.setBounds(82, 45, 222, 20);
			pTecnico.add(cbxTecnico);
			
			pTecnico.setVisible(false);
			
			JLabel label_17 = new JLabel("Nivel educativo:");
			label_17.setFont(new Font("Dialog", Font.BOLD, 13));
			label_17.setBounds(103, 11, 115, 16);
			panel_2.add(label_17);
			
			btnUniversitario = new JRadioButton("Universitario");
			btnUniversitario.setBackground(new Color(255, 255, 255));
			btnUniversitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pObrero.setVisible(false);
					pUniversitario.setVisible(true);
					pTecnico.setVisible(false);
				}
			});
			btnGroupNivelEducativo.add(btnUniversitario);
			btnUniversitario.setBounds(32, 34, 115, 23);
			panel_2.add(btnUniversitario);
			
			btnTecnico = new JRadioButton("Tecnico");
			btnTecnico.setBackground(new Color(255, 255, 255));
			btnTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pObrero.setVisible(false);
					pUniversitario.setVisible(false);
					pTecnico.setVisible(true);
				}
			});
			btnGroupNivelEducativo.add(btnTecnico);
			btnTecnico.setBounds(149, 34, 93, 23);
			panel_2.add(btnTecnico);
			
			btnObrero = new JRadioButton("Obrero");
			btnObrero.setBackground(new Color(255, 255, 255));
			btnObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pObrero.setVisible(true);
					pUniversitario.setVisible(false);
					pTecnico.setVisible(false);
				}
			});
			btnGroupNivelEducativo.add(btnObrero);
			btnObrero.setBounds(244, 34, 76, 23);
			panel_2.add(btnObrero);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(103, 25, 109, 12);
			panel_2.add(separator);
			
			panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_4.setBackground(new Color(255, 255, 255));
			panel_4.setBounds(378, 203, 275, 146);
			panel_principal.add(panel_4);
			panel_4.setLayout(null);
			
			JLabel label_8 = new JLabel("Cuidad:");
			label_8.setBounds(10, 13, 46, 14);
			panel_4.add(label_8);
			
			cbxCiudad = new JComboBox();
			cbxCiudad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxCiudad.setBounds(81, 11, 177, 23);
			panel_4.add(cbxCiudad);
			 String[] Ciudad= {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"};
			cbxCiudad.setBackground(new Color(211, 211, 211));
			cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
			
			JLabel label_9 = new JLabel("Pais:");
			label_9.setBounds(10, 50, 46, 14);
			panel_4.add(label_9);
			
			cbxPais = new JComboBox();
			cbxPais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxPais.setBounds(81, 47, 177, 23);
			panel_4.add(cbxPais);
			String[] pais= {"<Seleccionar>", "Republica Dominicana"};
			cbxPais.setBackground(new Color(211, 211, 211));
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
			
			JLabel label_5 = new JLabel("Estado Civil:");
			label_5.setBounds(10, 87, 84, 16);
			panel_4.add(label_5);
			
			cbxEstadoCivil = new JComboBox();
			cbxEstadoCivil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxEstadoCivil.setBounds(81, 83, 177, 23);
			panel_4.add(cbxEstadoCivil);
			String[] estadoVicil={"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"};
			cbxEstadoCivil.setBackground(new Color(211, 211, 211));
			cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
			
			panelHombre = new JPanel();
			panelHombre.setBounds(15, 20, 152, 159);
			panel_principal.add(panelHombre);
			panelHombre.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/hombre.png")));
			lblNewLabel_1.setBounds(6, 6, 137, 136);
			panelHombre.add(lblNewLabel_1);
			
			panelMujer = new JPanel();
			panelMujer.setLayout(null);
			panelMujer.setBounds(15, 20, 152, 158);
			panel_principal.add(panelMujer);
			
			mujer = new JLabel("");
			mujer.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/mujer.png")));
			mujer.setBounds(6, 6, 146, 124);
			panelMujer.add(mujer);
			
			txtFechaSolicitud = new JTextField();
			txtFechaSolicitud.setBounds(637, 56, 146, 26);
			panel.add(txtFechaSolicitud);
			txtFechaSolicitud.setEditable(false);
			txtFechaSolicitud.setText("  "+LocalDate.now().toString());
			txtFechaSolicitud.setColumns(10);
			
			JLabel lblFecha = new JLabel("Fecha de Solicitud:");
			lblFecha.setBounds(523, 61, 123, 16);
			panel.add(lblFecha);
			
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.setBackground(new Color(220, 20, 60));
			panel_3.setBounds(0, 0, 804, 50);
			panel.add(panel_3);
			
			lblIngresarSolicitante = new JLabel("Modificar/Eliminar Solicitante");
			lblIngresarSolicitante.setForeground(Color.WHITE);
			lblIngresarSolicitante.setFont(new Font("Cambria", Font.PLAIN, 27));
			lblIngresarSolicitante.setBounds(213, 0, 367, 46);
			panel_3.add(lblIngresarSolicitante);
			
			panel_5 = new JPanel();
			panel_5.setBackground(Color.WHITE);
			panel_5.setBounds(10, 73, 455, 55);
			panel.add(panel_5);
			panel_5.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Cedula:");
			lblNewLabel.setBounds(10, 19, 61, 16);
			panel_5.add(lblNewLabel);
			
			txtBuscarCedula = new JFormattedTextField(formatoCedula);
			txtBuscarCedula.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			txtBuscarCedula.setColumns(10);
			txtBuscarCedula.setBackground(new Color(211, 211, 211));
			txtBuscarCedula.setBounds(68, 15, 215, 24);
			panel_5.add(txtBuscarCedula);
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					Solicitantes s = null;
					btnPag.setEnabled(false);
					btnPag_1.setEnabled(true);
					panel_principal.setVisible(true);	
					panel_secundario.setVisible(false);
					
				    s=bolsa.buscarSolicitante(txtBuscarCedula.getText());
					if(s!=null){
						
						
					
					
					txtCedula.setText(s.getCedula());
					txtApellido.setText(s.getApellido());	
					txtDireccion.setText(s.getDireccion());
					txtEmail.setText(s.getEmail());
					txtEmpresa.setText(s.getNombreEmpresa());
					txtFechaSolicitud.setText(s.getFecha().toString());
					spnSalarioSolicitado.setValue(s.getSalirioSolicitado());
					spnTiempoExperiencia.setValue(s.getTiempotrabajoRealizado1());
					txtNumeroReferente.setText(s.getNumeroReferente());
					txtNombreReferente.setText(s.getNombreReferente());
					txtFechaNacimiento.setDate(s.getFechaNacimiento());
					
					
						if (s instanceof Obrero) {
							
							///atributas de obrero
							for (String string : ((Obrero) s).getListaHabilidades()) {
								
								for (int i = 0; i < habilidad1.length; i++) {
									if (string==habilidad1[i]) {
									string = habilidad1[i];
									cbxHabilidad.setSelectedIndex(i);
										
									}
										
								}
								
								for (int i = 0; i < habilidad2.length; i++) {
									if (string==habilidad2[i]) {
									string = habilidad2[i];
									cbxHabilidad2.setSelectedIndex(i);
									
									if(habilidad2[i]==null){
										
										///	validar que este activa la segunda habilidad		
												chckbxAadirOtro.setSelected(false);
												}
													
									} 
								}
								
								
							}	
							
						}
						else if (s instanceof Universitario) {
							
							///atributas de universitario
							
	                    	for (int i = 0; i < isntitucion.length; i++) {
	    						String string = isntitucion[i];
	    						if(((Universitario) s).getInstitucion().equalsIgnoreCase(string))
	    						cbxInstitucionUni.setSelectedIndex(i);
	    					}
	                    	for (int i = 0; i < carrera.length; i++) {
	    						String string = carrera[i];
	    						if(((Universitario) s).getCarrera().equalsIgnoreCase(string))
	    						cbxCarrera.setSelectedIndex(i);
	    					}
							
							
						}
						else if (s instanceof Tecnico) {
							
							///atributas de tecnico
							

	                    	for (int i = 0; i < tecnico.length; i++) {
	    						String string = tecnico[i];
	    						if(((Tecnico) s).getTecnico().equalsIgnoreCase(string))
	    						cbxTecnico.setSelectedIndex(i);
	    					}
	                    	for (int i = 0; i < carrera.length; i++) {
	    						String string = carrera[i];
	    						if(((Tecnico) s).getInstitucion().equalsIgnoreCase(string))
	    						cbxInstitucionUni.setSelectedIndex(i);
	    					}
	                    	
	                    	
							
							
							
						}
						
					
					
					
					for (int i = 0; i < area.length; i++) {
						String string = area[i];
						if(s.getAreaTrabajo1().equalsIgnoreCase(string))
						cbxAreaTrabajo.setSelectedIndex(i);
					}for (int i = 0; i < estadoVicil.length; i++) {
						String string = estadoVicil[i];
						if(s.getEstadoCivil().equalsIgnoreCase(string))
					    cbxEstadoCivil.setSelectedIndex(i);;
					}
						
					}for (int i = 0; i < areaInteres.length; i++) {
						String string = areaInteres[i];
						if(s.getAreaInteres().equalsIgnoreCase(string))
						cbxAreaInteres.setSelectedIndex(i);
					}for (int i = 0; i < nacionalidad.length; i++) {
						
						String string = nacionalidad[i];
						if(s.getNacionalidad().equalsIgnoreCase(string))
						cbxNacionalidad.setSelectedIndex(i);
					}
				
					for (int i = 0; i < Ciudad.length; i++) {
						String string = Ciudad[i];
						if(s.getCuidad().equalsIgnoreCase(string))
						cbxCiudad.setSelectedIndex(i);
						
					}for (int i = 0; i < pais.length; i++) {
						String string = pais[i];
						if(s.getPais().equalsIgnoreCase(string))
						cbxPais.setSelectedIndex(i);
						
					}for (String idioma : s.getIdioma()) {
						
						for (int i = 0; i < idioma1.length; i++) {
							if (idioma==idioma1[i]) {
								idioma = idioma1[i];
							    cbxIdioma1.setSelectedIndex(i);
								
							    
							    
							    
							    
							}
						}
                       for (int j = 0; j < idioma2.length; j++) {
                        	if (idioma==idioma2[j]) {
								idioma = idioma2[j];
								cbxIdioma2.setSelectedIndex(j);
								
								if(idioma2[j]==null){
									
									///	validar que este activo el segundo idioma	
											chbIdioma2.setSelected(false);
											}
								
								
							}
                       }
                       for (int k = 0; k < idioma3.length; k++) {
	                        if (idioma==idioma3[k]) {
								idioma = idioma3[k];
								cbxIdioma3.setSelectedIndex(k);
								

								if(idioma3[k]==null){
									
									///	validar que este activo el tercer idioma		
											chbIdioma3.setSelected(false);
											}
								
									
								                     }
                        	
			                                                    }	
							
							
						}
					
						
						
						
						
							
			}
					
			});
			btnNewButton.setIcon(new ImageIcon(ModificarSolicitantes.class.getResource("/imagenes/buscador-de-lupa (1).png")));
			btnNewButton.setBounds(286, 12, 117, 29);
			panel_5.add(btnNewButton);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Modificar");
				okButton.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/ok-appproval-aceptacion.png")));
				okButton.addActionListener(new ActionListener() {
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
						
						
						//System.out.println(fechaNacimiento);
						//LocalDate fechaNacimiento = LocalDate.of(1998, Month.JANUARY, 6);
						
						//Datos de solicitud
						boolean dispMudarse=false;
						if (btnGroupMudarse.getSelection()!=null){
							if(btnDispMudarseY.isSelected())
								dispMudarse= true;
							if(btnDispMudarseN.isSelected())
								dispMudarse= false;
						}
						boolean LicenciaConducir=false;
						if (btnGroupLicencia.getSelection()!=null){
							if(btnLicenciaCY.isSelected())
								LicenciaConducir= true;
							if(btnLicenciaCN.isSelected())
								LicenciaConducir= false;
						}
						String TipoJornada=null;
						if (btnGroupJornada.getSelection()!=null){
							if(btnMedioTiempo.isSelected())
								TipoJornada= "Medio Tiempo";
							if(btnTiempoCompleto.isSelected())
								TipoJornada= "Tiempo Completo";
						}
						boolean dispViajar=false;
						if (btnGroupViajar.getSelection()!=null){
							if(btnViajarY.isSelected())
								dispViajar= true;
							if(btnViajarN.isSelected())
								dispViajar= false;
						}
						int salirioSolicitado = (int) spnSalarioSolicitado.getValue();
						//ArrayList<String> idioma = new ArrayList<>();
						//String idioma1 = cbxIdioma1.getSelectedItem().toString();
						//String idioma2 = cbxIdioma2.getSelectedItem().toString();
						//String idioma3 = cbxIdioma3.getSelectedItem().toString();
						
						String areaInteres = cbxAreaInteres.getSelectedItem().toString();
						
						//Experiencia Labora
						String nombreEmpresa = txtEmpresa.getText();
						int tiempoExp = (int) spnTiempoExperiencia.getValue();
						String areaTrabajo = cbxAreaTrabajo.getSelectedItem().toString();
						String nombreReferente = txtNombreReferente.getText();
						String telefonoReferente = txtNumeroReferente.getText();
						
						//Nivel Educativo
						String tipo = null;
						if (btnUniversitario.isSelected())
							tipo = "Universitario";
						if (btnObrero.isSelected())
							tipo = "Obrero";
						if (btnTecnico.isSelected())
							tipo = "Tecnico";
						
						if(btnUniversitario.isSelected()||btnObrero.isSelected()||btnTecnico.isSelected()){
							if (tipo.equalsIgnoreCase("Universitario")){
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("   -       - ")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("(   ) -   -    ")||txtEmail.getText().equalsIgnoreCase("")||btnGroupSexo.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtFechaNacimiento.getDate()==null||btnGroupMudarse.isSelected(null)||btnGroupJornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma2.isSelected()
										||cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma3.isSelected()||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										btnGroupLicencia.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||cbxInstitucionUni.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxCarrera.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||
										bolsa.SolicitanteRepetido(cedula)==true){
									if (bolsa.SolicitanteRepetido(cedula)==true)
										JOptionPane.showMessageDialog(null, "El solicitante ya esta ingresado, verifique su cedula", "Informaci�n", JOptionPane.WARNING_MESSAGE);
									else
										JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Informaci�n", JOptionPane.WARNING_MESSAGE);}
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(txtFechaNacimiento.getDate().getTime());
									String carrera = cbxCarrera.getSelectedItem().toString();
									String institucion = cbxInstitucionUni.getSelectedItem().toString();
									Universitario s = new Universitario(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, TipoJornada, idioma, areaInteres, true, LicenciaConducir, LocalDate.now(), nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente, institucion, carrera);
									bolsa.insertarSolicitante(s);
									JOptionPane.showMessageDialog(null, "Operaci�n satisfactoria", "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
									//clean();
									limpiar();
									
								}
							}
							if (tipo.equalsIgnoreCase("Obrero")){
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("   -       - ")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("(   ) -   -    ")||txtEmail.getText().equalsIgnoreCase("")||btnGroupSexo.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtFechaNacimiento.getDate()==null||btnGroupMudarse.isSelected(null)||btnGroupJornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										btnGroupLicencia.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||habilidad.get(0).equalsIgnoreCase("<Seleccionar>")||cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma2.isSelected()||
										cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma3.isSelected()||cbxHabilidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxHabilidad2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chckbxAadirOtro.isSelected()){
									JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Informaci�n", JOptionPane.WARNING_MESSAGE);}
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(txtFechaNacimiento.getDate().getTime());
									//String habilidad = cbxHabilidad.getSelectedItem().toString();
									Obrero s = new Obrero(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, TipoJornada, idioma, areaInteres, true, LicenciaConducir, LocalDate.now(), nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente, habilidad);
									bolsa.insertarSolicitante(s);
									JOptionPane.showMessageDialog(null, "Operaci�n satisfactoria", "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
									limpiar();
									
								}
								
							}
							if (tipo.equalsIgnoreCase("Tecnico")){
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("   -       - ")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("(   ) -   -    ")||txtEmail.getText().equalsIgnoreCase("")||btnGroupSexo.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtFechaNacimiento.getDate()==null||btnGroupMudarse.isSelected(null)||btnGroupJornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										btnGroupLicencia.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||txtInstitucionTecnico.getText().equalsIgnoreCase("")||cbxTecnico.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma2.isSelected()||
										cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma3.isSelected()){
									JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Informaci�n", JOptionPane.WARNING_MESSAGE);}
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(txtFechaNacimiento.getDate().getTime());
									String tecnico = cbxTecnico.getSelectedItem().toString();
									String institucion = txtInstitucionTecnico.getText();	
									Tecnico s = new Tecnico(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, TipoJornada, idioma, areaInteres, true, LicenciaConducir, LocalDate.now(), nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente, institucion, tecnico);									
									bolsa.insertarSolicitante(s);
									JOptionPane.showMessageDialog(null, "Operaci�n satisfactoria", "Informaci�n", JOptionPane.INFORMATION_MESSAGE);	
									limpiar();
									
								}
							}
						}
						else 
							JOptionPane.showMessageDialog(null, "Seleccione un nivel educativo", "Informaci�n", JOptionPane.WARNING_MESSAGE);
					}

					private void limpiar() {
					     txtEmpresa.setText("");
						 txtInstitucionTecnico.setText("");
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
						 cbxHabilidad2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
						 cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
						 cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
						 cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
						 cbxAreaTrabajo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));	
						 cbxNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\u00E1n\t", "Alemania\t", "Arabia Saudita\t", "Argentina\t", "Australia\t", "B\u00E9lgica\t", "Bolivia\t", "Brasil\t", "Camboya\t", "Canad\u00E1\t", "Chile\t", "China", "Colombia\t", "Corea\t", "Costa Rica", "Cuba\t", "Dinamarca\t", "Ecuador\t", "Egipto\t", "El Salvador\t", "Escocia\t", "Espa\u00F1a", "Estados Unidos\t", "Estonia\t", "Filipinas\t", "Francia\t", "Grecia", "Guatemala\t", "Hait\u00ED\t", "Holanda\t", "Honduras\t", "Indonesia\t", "Inglaterra\t", "Irak\t", "Ir\u00E1n", "Irlanda\t", "Israel\t", "Italia\t", "Jap\u00F3n\t", "Jordania\t", "Laos\t", "Letonia\t", "Lituania\t", "Malasia\t", "Marruecos\t", "M\u00E9xico\t", "Nicaragua\t", "Noruega\t", "Nueva Zelanda", "Panam\u00E1\t", "Paraguay\t", "Per\u00FA\t", "Polonia\t", "Portugal\t", "Puerto Rico", "Republica Dom.", "Rumania\t", "Rusia\t", "Suecia\t", "Suiza\t", "Tailandia\t", "Taiw\u00E1n\t", "Turqu\u00EDa\t", "Ucrania\t", "Uruguay\t", "Venezuela\t", "Vietnam"}));
						 cbxHabilidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
						 cbxAreaInteres.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));	
						 
						 panel_principal.setVisible(true);
						 panel_secundario.setVisible(false);
						
						 btnGroupJornada.clearSelection();
						 btnGroupLicencia.clearSelection();
						 btnGroupMudarse.clearSelection();
						 btnGroupNivelEducativo.clearSelection();
						 btnGroupSexo.clearSelection();
						 btnGroupViajar.clearSelection();
						
					}
				});
				
				JButton btnEliminar = new JButton("Eliminar");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
				
						
						
						
						Solicitantes s;
						s=bolsa.buscarSolicitante(txtBuscarCedula.getText().toString());
						if(s!=null){
						
						bolsa.eliminarSolicitante(s);
						JOptionPane.showMessageDialog(null, "Solicitante Eliminado Correctamente");
						limpiar();
						}else{
							
							JOptionPane.showMessageDialog(null,"No Se pudo Eliminar El solicitante");
							
							
							
						}
						
						
					}

					private void limpiar() {
					     txtEmpresa.setText("");
						 txtInstitucionTecnico.setText("");
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
						 cbxHabilidad2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
						 cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
						 cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
						 cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
						 cbxAreaTrabajo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));	
						 cbxNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\u00E1n\t", "Alemania\t", "Arabia Saudita\t", "Argentina\t", "Australia\t", "B\u00E9lgica\t", "Bolivia\t", "Brasil\t", "Camboya\t", "Canad\u00E1\t", "Chile\t", "China", "Colombia\t", "Corea\t", "Costa Rica", "Cuba\t", "Dinamarca\t", "Ecuador\t", "Egipto\t", "El Salvador\t", "Escocia\t", "Espa\u00F1a", "Estados Unidos\t", "Estonia\t", "Filipinas\t", "Francia\t", "Grecia", "Guatemala\t", "Hait\u00ED\t", "Holanda\t", "Honduras\t", "Indonesia\t", "Inglaterra\t", "Irak\t", "Ir\u00E1n", "Irlanda\t", "Israel\t", "Italia\t", "Jap\u00F3n\t", "Jordania\t", "Laos\t", "Letonia\t", "Lituania\t", "Malasia\t", "Marruecos\t", "M\u00E9xico\t", "Nicaragua\t", "Noruega\t", "Nueva Zelanda", "Panam\u00E1\t", "Paraguay\t", "Per\u00FA\t", "Polonia\t", "Portugal\t", "Puerto Rico", "Republica Dom.", "Rumania\t", "Rusia\t", "Suecia\t", "Suiza\t", "Tailandia\t", "Taiw\u00E1n\t", "Turqu\u00EDa\t", "Ucrania\t", "Uruguay\t", "Venezuela\t", "Vietnam"}));
						 cbxHabilidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
						 cbxAreaInteres.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));	
						 
						 panel_principal.setVisible(true);
						 panel_secundario.setVisible(false);
						
						 btnGroupJornada.clearSelection();
						 btnGroupLicencia.clearSelection();
						 btnGroupMudarse.clearSelection();
						 btnGroupNivelEducativo.clearSelection();
						 btnGroupSexo.clearSelection();
						 btnGroupViajar.clearSelection();
						panel_principal.setEnabled(false);
						panel_secundario.setEnabled(true);
					}
				});
				btnEliminar.setIcon(new ImageIcon(ModificarSolicitantes.class.getResource("/imagenes/cubo-de-basura (1).png")));
				buttonPane.add(btnEliminar);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/boton-cancelar.png")));
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
}
