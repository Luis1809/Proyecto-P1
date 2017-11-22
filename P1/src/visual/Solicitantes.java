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

public class Solicitantes extends JDialog {
	ButtonGroup sexoMF =new ButtonGroup();
	ButtonGroup mudarse =new ButtonGroup();
	ButtonGroup conducir =new ButtonGroup();
	ButtonGroup jornada =new ButtonGroup();
	ButtonGroup nivelEducativo =new ButtonGroup();
	
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
	private JComboBox cbxNacionalidad;
	private JComboBox cbxEstadoCivil;
	private JComboBox cbxCiudad;
	private JComboBox cbxPais;
	private JPanel pTecnico;
	private JPanel pObrero;
	private JPanel pUniversitario;
	private JComboBox cbxCarrera;
	private JComboBox cbxHabilidad;
	private JComboBox cbxTecnico;
	private JRadioButton btnUniversitario;
	private JRadioButton btnTecnico;
	private JRadioButton btnObrero;
	private JRadioButton btnDispMudarseY;
	private JRadioButton btnDispMudarseN;
	private JComboBox cbxIdioma1;
	private JComboBox cbxIdioma2;
	private JComboBox cbxIdioma3;
	private JRadioButton btnTiempoCompleto;
	private JRadioButton btnMedioTiempo;
	private JRadioButton btnLicenciaCY;
	private JRadioButton btnLicenciaCN;
	private JCheckBox chbIdioma2;
	private JCheckBox chbIdioma3;
	private JComboBox cbxAreaInteres;
	private JComboBox cbxAreaTrabajo;
	private JSpinner spnTiempoExperiencia;
	private JComboBox cbxInstitucionUni;
	private ArrayList<String> idioma = new ArrayList<>();
	private ArrayList<String> habilidad = new ArrayList<>();
	private final ButtonGroup viajar = new ButtonGroup();
	private JRadioButton btnViajarN;
	private JRadioButton btnViajarY;
	private JSpinner spnSalarioSolicitado;
	private JCheckBox chckbxAadirOtro;
    private JComboBox cbxHabilidad2;
    private JDateChooser Jcaldate;
    private static MaskFormatter formatoCedula;
	private static MaskFormatter formatoNumero;
	
	public Solicitantes() {
		setResizable(false);
		setBounds(100, 100, 810, 710);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			txtFechaSolicitud = new JTextField();
			txtFechaSolicitud.setEditable(false);
			txtFechaSolicitud.setText("  "+LocalDate.now().toString());
			txtFechaSolicitud.setBounds(634, 11, 146, 26);
			panel.add(txtFechaSolicitud);
			txtFechaSolicitud.setColumns(10);
			
			JLabel lblFecha = new JLabel("Fecha de Solicitud:");
			lblFecha.setBounds(501, 16, 123, 16);
			panel.add(lblFecha);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(198, 48, 582, 207);
			panel.add(panel_1);
			
			JLabel label = new JLabel("Nombres:");
			label.setBounds(30, 30, 61, 16);
			panel_1.add(label);
			
			txtNombre = new JTextField();
			txtNombre.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()>=65&&e.getKeyCode()<=90||e.getKeyChar()==8||e.getKeyCode()==32||e.getKeyCode()==16)
						System.out.println("");
					else {
						JOptionPane.showMessageDialog(null, "Solo caracteres de tipo letra", "Información", JOptionPane.WARNING_MESSAGE);
						cleanNombre();}
				}
			});
			txtNombre.setColumns(10);
			txtNombre.setBounds(101, 28, 177, 20);
			panel_1.add(txtNombre);
			
			JLabel label_1 = new JLabel("Apellidos:");
			label_1.setBounds(300, 30, 73, 16);
			panel_1.add(label_1);
			
			txtApellido = new JTextField();
			txtApellido.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()>=65&&e.getKeyCode()<=90||e.getKeyChar()==8||e.getKeyCode()==32||e.getKeyCode()==16)
						System.out.println("");
					else {
						JOptionPane.showMessageDialog(null, "Solo caracteres de tipo letra", "Información", JOptionPane.WARNING_MESSAGE);
						cleanApellido();}
				}
			});
			txtApellido.setColumns(10);
			txtApellido.setBounds(369, 28, 196, 20);
			panel_1.add(txtApellido);
			
			try{
				formatoCedula = new MaskFormatter("###-#######-#");//////////////////////////////////////
				formatoNumero = new MaskFormatter("###-###-####");//////////////////////////////////////
			}catch (Exception e){
				e.printStackTrace();
			}
			
			JLabel label_2 = new JLabel("Cedula:");
			label_2.setBounds(30, 59, 61, 16);
			panel_1.add(label_2);
			
			txtCedula = new JFormattedTextField(formatoCedula);
			txtCedula.setColumns(10);
			txtCedula.setBounds(101, 57, 177, 20);
			panel_1.add(txtCedula);
			
			JLabel label_3 = new JLabel("Sexo:");
			label_3.setBounds(300, 118, 61, 16);
			panel_1.add(label_3);
			
			JLabel label_4 = new JLabel("Telefono:");
			label_4.setBounds(300, 59, 61, 16);
			panel_1.add(label_4);
			
			txtTelefono = new JFormattedTextField(formatoNumero);
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(369, 59, 196, 20);
			panel_1.add(txtTelefono);
			
			btnMasculino = new JRadioButton("Masculino");
			sexoMF.add(btnMasculino);
			btnMasculino.setBounds(367, 115, 93, 23);
			panel_1.add(btnMasculino);
			
			btnFemenino = new JRadioButton("Femenino");
			sexoMF.add(btnFemenino);
			btnFemenino.setBounds(462, 115, 94, 23);
			panel_1.add(btnFemenino);
			
			JLabel label_5 = new JLabel("Estado Civil:");
			label_5.setBounds(30, 172, 84, 16);
			panel_1.add(label_5);
			
			JLabel label_6 = new JLabel("Direccion:");
			label_6.setBounds(30, 86, 84, 16);
			panel_1.add(label_6);
			
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(101, 86, 177, 20);
			panel_1.add(txtDireccion);
			
			JLabel lblPaisDeNacimiento = new JLabel("Pais de Nacimiento:");
			lblPaisDeNacimiento.setBounds(300, 172, 129, 16);
			panel_1.add(lblPaisDeNacimiento);
			
			cbxNacionalidad = new JComboBox();
			cbxNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\u00E1n\t", "Alemania\t", "Arabia Saudita\t", "Argentina\t", "Australia\t", "B\u00E9lgica\t", "Bolivia\t", "Brasil\t", "Camboya\t", "Canad\u00E1\t", "Chile\t", "China", "Colombia\t", "Corea\t", "Costa Rica", "Cuba\t", "Dinamarca\t", "Ecuador\t", "Egipto\t", "El Salvador\t", "Escocia\t", "Espa\u00F1a", "Estados Unidos\t", "Estonia\t", "Filipinas\t", "Francia\t", "Grecia", "Guatemala\t", "Hait\u00ED\t", "Holanda\t", "Honduras\t", "Indonesia\t", "Inglaterra\t", "Irak\t", "Ir\u00E1n", "Irlanda\t", "Israel\t", "Italia\t", "Jap\u00F3n\t", "Jordania\t", "Laos\t", "Letonia\t", "Lituania\t", "Malasia\t", "Marruecos\t", "M\u00E9xico\t", "Nicaragua\t", "Noruega\t", "Nueva Zelanda", "Panam\u00E1\t", "Paraguay\t", "Per\u00FA\t", "Polonia\t", "Portugal\t", "Puerto Rico", "Republica Dom.", "Rumania\t", "Rusia\t", "Suecia\t", "Suiza\t", "Tailandia\t", "Taiw\u00E1n\t", "Turqu\u00EDa\t", "Ucrania\t", "Uruguay\t", "Venezuela\t", "Vietnam"}));
			cbxNacionalidad.setBounds(428, 172, 137, 20);
			panel_1.add(cbxNacionalidad);
			
			cbxEstadoCivil = new JComboBox();
			cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
			cbxEstadoCivil.setBounds(101, 172, 177, 20);
			panel_1.add(cbxEstadoCivil);
			
			JLabel label_8 = new JLabel("Cuidad:");
			label_8.setBounds(30, 118, 46, 14);
			panel_1.add(label_8);
			
			cbxCiudad = new JComboBox();
			cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
			cbxCiudad.setBounds(101, 116, 177, 20);
			panel_1.add(cbxCiudad);
			
			JLabel label_9 = new JLabel("Pais:");
			label_9.setBounds(30, 147, 46, 14);
			panel_1.add(label_9);
			
			cbxPais = new JComboBox();
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
			cbxPais.setBounds(101, 145, 177, 20);
			panel_1.add(cbxPais);
			
			JLabel label_10 = new JLabel("Fecha Nacimiento:");
			label_10.setBounds(300, 147, 107, 14);
			panel_1.add(label_10);
			
			JLabel label_11 = new JLabel("Email:");
			label_11.setBounds(300, 86, 46, 14);
			panel_1.add(label_11);
			
			txtEmail = new JTextField();
			txtEmail.setColumns(10);
			txtEmail.setBounds(369, 86, 196, 20);
			panel_1.add(txtEmail);
			
			Jcaldate = new JDateChooser();
			Jcaldate.setBounds(428, 141, 137, 20);
			panel_1.add(Jcaldate);
			
			JPanel panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBorder(new TitledBorder(null, "Educacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(10, 266, 358, 154);
			panel.add(panel_2);
			
			pObrero = new JPanel();
			pObrero.setLayout(null);
			pObrero.setBounds(6, 64, 314, 79);
			panel_2.add(pObrero);
			
			JLabel label_16 = new JLabel("Habilidad:");
			label_16.setBounds(10, 11, 71, 16);
			pObrero.add(label_16);
			
			cbxHabilidad = new JComboBox();
			cbxHabilidad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxHabilidad.getSelectedItem().toString().equalsIgnoreCase("Seleccionar"))
						habilidad.add(0,cbxHabilidad.getSelectedItem().toString());
				}
			});
			cbxHabilidad.setBounds(78, 9, 226, 20);
			pObrero.add(cbxHabilidad);
			
			chckbxAadirOtro = new JCheckBox("Mas?");
			chckbxAadirOtro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxAadirOtro.isSelected())
						cbxHabilidad2.setEnabled(true);
					else
						cbxHabilidad2.setEnabled(false);
				}
			});
			chckbxAadirOtro.setBounds(10, 34, 63, 23);
			pObrero.add(chckbxAadirOtro);
			
			cbxHabilidad2 = new JComboBox();
			cbxHabilidad2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxHabilidad2.getSelectedItem().toString().equalsIgnoreCase("Seleccionar"))
						habilidad.add(1,cbxHabilidad2.getSelectedItem().toString());
				}
			});
			cbxHabilidad2.setEnabled(false);
			cbxHabilidad2.setBounds(78, 35, 226, 20);
			pObrero.add(cbxHabilidad2);
			pObrero.setVisible(false);
			
			pUniversitario = new JPanel();
			pUniversitario.setLayout(null);
			pUniversitario.setBounds(6, 64, 314, 79);
			panel_2.add(pUniversitario);
			
			JLabel label_12 = new JLabel("Institucion:");
			label_12.setBounds(6, 20, 84, 16);
			pUniversitario.add(label_12);
			
			JLabel label_13 = new JLabel("Carrera:");
			label_13.setBounds(6, 47, 61, 16);
			pUniversitario.add(label_13);
			
			cbxCarrera = new JComboBox();
			cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n de Empresa\u200B", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "\u200BIngenier\u00EDa Industrial", "\u200BIngenier\u00EDa de Sistemas ", "\u200BIngenier\u00EDa Electr\u00F3nica", "\u200BIngenier\u00EDa Telem\u00E1tica", "\u200BIngenier\u00EDa en Mecatr\u00F3nica\u200B\u200B", "\u200BMedicina", "\u200BMercadotecnia", "Nutrici\u00F3n y Diet\u00E9tica", "\u200B\u200BPsicolog\u00EDa", "\u200BTerapia F\u00EDsica\u200B"}));
			cbxCarrera.setBounds(82, 45, 222, 20);
			pUniversitario.add(cbxCarrera);
			
			cbxInstitucionUni = new JComboBox();
			cbxInstitucionUni.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", " Universidad Aut\u00F3noma de Santo Domingo (UASD)", " Facultad Latinoamericana de Cs. Soc. (FLACSO)", " Barna Business School", " Universidad Nacional Tecnol\u00F3gica (UNNATEC)", " Pontificia Universidad Cat\u00F3lica Madre y Maestra (PUCMM)", " Universidad Abierta Para Adultos (UAPA)", " Universidad APEC (UNAPEC)", " Universidad Cat\u00F3lica de Santo Domingo (UCSD)", " Instituto Nacional de Ciencias Exactas (INCE)", " Instituto Superior de Tecnolog\u00EDa Universal (INSUTEC)", " Instituto T\u00E9cnico Superior Oscus San Valero", " Instituto Tecnol\u00F3gico de las Am\u00E9ricas (ITLA)", " Instituto Tecnol\u00F3gico de Santo Domingo (INTEC)", "Universidad Central del Este (UCE)", "Universidad Central Dominicana de Est. Prof. (UCDEP)", "Universidad del Caribe", "Universidad del I. Cultural Dom\u00EDnico-Americano (ICDA)", "Universidad Dominicana Org. y M\u00E9todo (UDOYM)", "Universidad Eugenio Maria de Hostos (UNIREMHOS)", "Universidad Experimental F\u00E9lix Adam (UNEFA)", "Universidad Federico Henr\u00EDquez y Carvajal (UFHEC) ", "Universidad Iberoamericana (UNIBE)", "Universidad Interamericana (UNICA)", "Universidad Nacional Evang\u00E9lica (UNEV)", "Universidad Nacional Pedro Henr\u00EDquez Ure\u00F1a (UNPHU)", "Universidad Odontol\u00F3gica Dominicana (UOD)", "Universidad Psicolog\u00EDa Ind. Dominicana (UPID)", "Universidad Tecnol\u00F3gica de Santiago (UTESA)"}));
			cbxInstitucionUni.setBounds(82, 14, 222, 20);
			pUniversitario.add(cbxInstitucionUni);
			pUniversitario.setVisible(false);
			
			pTecnico = new JPanel();
			pTecnico.setLayout(null);
			pTecnico.setBounds(6, 64, 314, 79);
			panel_2.add(pTecnico);
			
			JLabel label_14 = new JLabel("Institucion:");
			label_14.setBounds(6, 20, 84, 16);
			pTecnico.add(label_14);
			
			txtInstitucionTecnico = new JTextField();
			txtInstitucionTecnico.setColumns(10);
			txtInstitucionTecnico.setBounds(82, 14, 222, 20);
			pTecnico.add(txtInstitucionTecnico);
			
			JLabel label_15 = new JLabel("Tecnico:");
			label_15.setBounds(6, 47, 61, 16);
			pTecnico.add(label_15);
			
			cbxTecnico = new JComboBox();
			cbxTecnico.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n de Empresa\u200B", "Concentraciones:", "Operaciones", "Finanzas", "Estrategia", "Creaci\u00F3n y Desarrollo de Nuevos Negocios", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "Concentraciones:", "\u200BAlimentos y Bebidas", "Mercadeo Hotelero\u200B\u200B", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "Concentraciones\u200B:\u200B\u200B", "Producci\u00F3n Audiovisual", "Comunicaci\u00F3n Corporativa", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "Electronica", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "Orientaciones:"}));
			cbxTecnico.setBounds(82, 45, 222, 20);
			pTecnico.add(cbxTecnico);
			
			pTecnico.setVisible(false);
			
			JLabel label_17 = new JLabel("Nivel educativo:");
			label_17.setFont(new Font("Dialog", Font.BOLD, 13));
			label_17.setBounds(103, 11, 115, 16);
			panel_2.add(label_17);
			
			btnUniversitario = new JRadioButton("Universitario");
			btnUniversitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pObrero.setVisible(false);
					pUniversitario.setVisible(true);
					pTecnico.setVisible(false);
				}
			});
			nivelEducativo.add(btnUniversitario);
			btnUniversitario.setBounds(32, 34, 115, 23);
			panel_2.add(btnUniversitario);
			
			btnTecnico = new JRadioButton("Tecnico");
			btnTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pObrero.setVisible(false);
					pUniversitario.setVisible(false);
					pTecnico.setVisible(true);
				}
			});
			nivelEducativo.add(btnTecnico);
			btnTecnico.setBounds(149, 34, 93, 23);
			panel_2.add(btnTecnico);
			
			btnObrero = new JRadioButton("Obrero");
			btnObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pObrero.setVisible(true);
					pUniversitario.setVisible(false);
					pTecnico.setVisible(false);
				}
			});
			nivelEducativo.add(btnObrero);
			btnObrero.setBounds(244, 34, 76, 23);
			panel_2.add(btnObrero);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(103, 25, 109, 12);
			panel_2.add(separator);
			
			JPanel panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_6.setBounds(378, 266, 402, 361);
			panel.add(panel_6);
			
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
			mudarse.add(btnDispMudarseY);
			btnDispMudarseY.setBounds(37, 58, 54, 23);
			panel_6.add(btnDispMudarseY);
			
			btnDispMudarseN = new JRadioButton("No");
			mudarse.add(btnDispMudarseN);
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
			cbxIdioma1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
			cbxIdioma1.setEditable(true);
			cbxIdioma1.setBounds(243, 165, 134, 20);
			panel_6.add(cbxIdioma1);
			
			btnTiempoCompleto = new JRadioButton("Tiempo Completo");
			jornada.add(btnTiempoCompleto);
			btnTiempoCompleto.setBounds(238, 87, 139, 23);
			panel_6.add(btnTiempoCompleto);
			
			btnMedioTiempo = new JRadioButton("Medio Tiempo");
			jornada.add(btnMedioTiempo);
			btnMedioTiempo.setBounds(239, 58, 138, 23);
			panel_6.add(btnMedioTiempo);
			
			btnLicenciaCN = new JRadioButton("No");
			conducir.add(btnLicenciaCN);
			btnLicenciaCN.setBounds(93, 112, 54, 23);
			panel_6.add(btnLicenciaCN);
			
			btnLicenciaCY = new JRadioButton("Si");
			conducir.add(btnLicenciaCY);
			btnLicenciaCY.setBounds(37, 112, 54, 23);
			panel_6.add(btnLicenciaCY);
			
			chbIdioma2 = new JCheckBox("A\u00F1adir otro idioma");
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
			cbxIdioma2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Patua", "Creoles", "Ruso"}));
			cbxIdioma2.setEnabled(false);
			cbxIdioma2.setBounds(243, 222, 134, 20);
			panel_6.add(cbxIdioma2);
			
			chbIdioma3 = new JCheckBox("A\u00F1adir otro idioma");
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
			cbxIdioma3.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
			cbxIdioma3.setEnabled(false);
			cbxIdioma3.setBounds(243, 280, 134, 20);
			panel_6.add(cbxIdioma3);
			
			JLabel label_22 = new JLabel("Area de interes:");
			label_22.setBounds(27, 196, 126, 14);
			panel_6.add(label_22);
			
			cbxAreaInteres = new JComboBox();
			cbxAreaInteres.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
			cbxAreaInteres.setBounds(27, 222, 126, 20);
			panel_6.add(cbxAreaInteres);
			
			JLabel lblSalarioSolicitado = new JLabel("Salario solicitado (Mensual):");
			lblSalarioSolicitado.setBounds(27, 254, 173, 14);
			panel_6.add(lblSalarioSolicitado);
			
			spnSalarioSolicitado = new JSpinner();
			spnSalarioSolicitado.setModel(new SpinnerNumberModel(10000, 10000, 1000000, 500));
			spnSalarioSolicitado.setBounds(27, 280, 126, 20);
			panel_6.add(spnSalarioSolicitado);
			
			JLabel lblDisponibilidadDeViajar = new JLabel("Disponibilidad de viajar:");
			lblDisponibilidadDeViajar.setBounds(27, 146, 173, 14);
			panel_6.add(lblDisponibilidadDeViajar);
			
			btnViajarY = new JRadioButton("Si");
			viajar.add(btnViajarY);
			btnViajarY.setBounds(37, 164, 54, 23);
			panel_6.add(btnViajarY);
			
			btnViajarN = new JRadioButton("No");
			viajar.add(btnViajarN);
			btnViajarN.setBounds(93, 164, 54, 23);
			panel_6.add(btnViajarN);
			
			JPanel panel_7 = new JPanel();
			panel_7.setLayout(null);
			panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_7.setBounds(10, 436, 358, 191);
			panel.add(panel_7);
			
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
			txtEmpresa.setColumns(10);
			txtEmpresa.setBounds(147, 45, 198, 20);
			panel_7.add(txtEmpresa);
			
			JLabel label_25 = new JLabel("Area de Trabajo:");
			label_25.setBounds(10, 101, 110, 16);
			panel_7.add(label_25);
			
			JLabel label_26 = new JLabel("Nombre de Referente:");
			label_26.setBounds(10, 130, 127, 16);
			panel_7.add(label_26);
			
			txtNombreReferente = new JTextField();
			txtNombreReferente.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()>=65&&e.getKeyCode()<=90||e.getKeyChar()==8||e.getKeyCode()==32||e.getKeyCode()==16)
						System.out.println("");
					else{
						JOptionPane.showMessageDialog(null, "Solo caracteres de tipo letra", "Información", JOptionPane.WARNING_MESSAGE);
						cleanNombreReferente();}
				}
			});
			txtNombreReferente.setColumns(10);
			txtNombreReferente.setBounds(147, 128, 198, 20);
			panel_7.add(txtNombreReferente);
			
			JLabel label_27 = new JLabel("Telefono de Referente:");
			label_27.setBounds(10, 159, 146, 21);
			panel_7.add(label_27);
			
			txtNumeroReferente = new JFormattedTextField(formatoNumero);
			txtNumeroReferente.setColumns(10);
			txtNumeroReferente.setBounds(147, 159, 198, 20);
			panel_7.add(txtNumeroReferente);
			
			cbxAreaTrabajo = new JComboBox();
			cbxAreaTrabajo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
			cbxAreaTrabajo.setBounds(147, 99, 198, 20);
			panel_7.add(cbxAreaTrabajo);
			
			JLabel label_28 = new JLabel("Tiempo de experiencia:");
			label_28.setBounds(10, 76, 134, 14);
			panel_7.add(label_28);
			
			spnTiempoExperiencia = new JSpinner();
			spnTiempoExperiencia.setModel(new SpinnerNumberModel(1, 1, 50, 1));
			spnTiempoExperiencia.setBounds(244, 74, 101, 20);
			panel_7.add(spnTiempoExperiencia);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
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
						if (sexoMF.getSelection()!=null){
							if(btnFemenino.isSelected())
								sexo= "Femenino";
							if(btnMasculino.isSelected())
								sexo= "Masculino";
						}
						
						
						
						//System.out.println(fechaNacimiento);
						//LocalDate fechaNacimiento = LocalDate.of(1998, Month.JANUARY, 6);
						
						//Datos de solicitud
						boolean dispMudarse=false;
						if (mudarse.getSelection()!=null){
							if(btnDispMudarseY.isSelected())
								dispMudarse= true;
							if(btnDispMudarseN.isSelected())
								dispMudarse= false;
						}
						boolean LicenciaConducir=false;
						if (conducir.getSelection()!=null){
							if(btnLicenciaCY.isSelected())
								LicenciaConducir= true;
							if(btnLicenciaCN.isSelected())
								LicenciaConducir= false;
						}
						String TipoJornada=null;
						if (jornada.getSelection()!=null){
							if(btnMedioTiempo.isSelected())
								TipoJornada= "Medio Tiempo";
							if(btnTiempoCompleto.isSelected())
								TipoJornada= "Tiempo Completo";
						}
						boolean dispViajar=false;
						if (viajar.getSelection()!=null){
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
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("")||txtEmail.getText().equalsIgnoreCase("")||sexoMF.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||Jcaldate.getDate()==null||mudarse.isSelected(null)||jornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										conducir.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||cbxInstitucionUni.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxCarrera.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
									JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Información", JOptionPane.WARNING_MESSAGE);}
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(Jcaldate.getDate().getTime());
									String carrera = cbxCarrera.getSelectedItem().toString();
									String institucion = cbxInstitucionUni.getSelectedItem().toString();
									Universitario s = new Universitario(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, TipoJornada, idioma, areaInteres, true, LicenciaConducir, LocalDate.now(), nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente, institucion, carrera);
									Bolsa.insertarSolicitante(s);
									JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Información", JOptionPane.INFORMATION_MESSAGE);
									//clean();
								}
							}
							if (tipo.equalsIgnoreCase("Obrero")){
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("")||txtEmail.getText().equalsIgnoreCase("")||sexoMF.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||Jcaldate.getDate()==null||mudarse.isSelected(null)||jornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										conducir.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||habilidad.get(0).equalsIgnoreCase("<Seleccionar>")){
									JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Información", JOptionPane.WARNING_MESSAGE);}
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(Jcaldate.getDate().getTime());
									//String habilidad = cbxHabilidad.getSelectedItem().toString();
									Obrero s = new Obrero(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, TipoJornada, idioma, areaInteres, true, LicenciaConducir, LocalDate.now(), nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente, habilidad);
									Bolsa.insertarSolicitante(s);
									JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Información", JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
							if (tipo.equalsIgnoreCase("Tecnico")){
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("")||txtEmail.getText().equalsIgnoreCase("")||sexoMF.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||Jcaldate.getDate()==null||mudarse.isSelected(null)||jornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										conducir.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||txtInstitucionTecnico.getText().equalsIgnoreCase("")||cbxTecnico.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
									JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Información", JOptionPane.WARNING_MESSAGE);}
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(Jcaldate.getDate().getTime());
									String tecnico = cbxTecnico.getSelectedItem().toString();
									String institucion = txtInstitucionTecnico.getText();	
									Tecnico s = new Tecnico(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, salirioSolicitado, dispMudarse, dispViajar, TipoJornada, idioma, areaInteres, true, LicenciaConducir, LocalDate.now(), nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente, institucion, tecnico);									
									Bolsa.insertarSolicitante(s);
									JOptionPane.showMessageDialog(null, "Operación satisfactoria", "Información", JOptionPane.INFORMATION_MESSAGE);	
								}
							}
						}
						else 
							JOptionPane.showMessageDialog(null, "Seleccione un nivel educativo", "Información", JOptionPane.WARNING_MESSAGE);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
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
