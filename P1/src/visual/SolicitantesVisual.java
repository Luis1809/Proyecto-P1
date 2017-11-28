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

public class SolicitantesVisual extends JDialog {
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
	private Bolsa bolsa = Bolsa.getIntance();
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
    private JDateChooser Jcaldate;
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
	private JPanel panel_Todos;
	private JFormattedTextField txtCedulaClienteAntiguo;
	private JCheckBox chxCuentaCreada;
	private JLabel IngresarCedula;
	private JButton btnBuscar;
	private Solicitantes soli=null;
	private JButton okButton;
	
	
	public SolicitantesVisual() {
		
		
		setResizable(false);
		setBounds(100, 100, 794, 616);
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
			panel_secundario.setBounds(9, 175, 774, 329);
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
					if(chbIdioma2.isSelected()&&soli==null)
						cbxIdioma2.setEnabled(true);
					else {
						if(soli==null){
						cbxIdioma2.setEnabled(false);
						cbxIdioma2.setSelectedIndex(0);}
					}
				}	
			});
			chbIdioma2.setBounds(243, 192, 134, 23);
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
			cbxIdioma2.setBounds(243, 222, 134, 23);
			panel_6.add(cbxIdioma2);
			
			chbIdioma3 = new JCheckBox("A\u00F1adir otro idioma");
			chbIdioma3.setBackground(new Color(255, 255, 255));
			chbIdioma3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chbIdioma3.isSelected()&&soli==null)
						cbxIdioma3.setEnabled(true);
					else {
						if(soli==null){
						cbxIdioma3.setEnabled(false);
						cbxIdioma3.setSelectedIndex(0);}
						
					}
					
				}
			});
			chbIdioma3.setBounds(243, 250, 134, 23);
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
						idioma.add(2, cbxIdioma3.getSelectedItem().toString());
					}
				}
			});
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
			panel_7.setBounds(406, 2, 361, 214);
			panel_secundario.add(panel_7);
			panel_7.setLayout(null);
			panel_7.setBorder(new TitledBorder(null, "Ocupacion anterior", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
			JLabel label_23 = new JLabel("Experiencia Laboral (Ultimo empleo):");
			label_23.setFont(new Font("Dialog", Font.BOLD, 13));
			label_23.setBounds(10, 22, 281, 16);
			panel_7.add(label_23);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBounds(10, 37, 240, 12);
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
			panel_principal.setBounds(9, 175, 774, 366);
			panel.add(panel_principal);
			panel_principal.setLayout(null);
			
			panel_Todos = new JPanel();
			panel_Todos.setLayout(null);
			panel_Todos.setBounds(15, 20, 152, 158);
			panel_principal.add(panel_Todos);
			
			JLabel label_7 = new JLabel("");
			label_7.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/red.png")));
			label_7.setBounds(10, 11, 132, 128);
			panel_Todos.add(label_7);
			
			panelMujer = new JPanel();
			panelMujer.setLayout(null);
			panelMujer.setBounds(15, 20, 152, 158);
			panel_principal.add(panelMujer);
			
			mujer = new JLabel("");
			mujer.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/mujer.png")));
			mujer.setBounds(10, 6, 142, 141);
			panelMujer.add(mujer);
			
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
						panel_Todos.setVisible(false);
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
						panel_Todos.setVisible(false);
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
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(255, 255, 255));
			panel_2.setBounds(10, 197, 358, 154);
			panel_principal.add(panel_2);
			panel_2.setLayout(null);
			panel_2.setBorder(new TitledBorder(null, "Educacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
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
			txtInstitucionTecnico.setBounds(82, 14, 222, 23);
			pTecnico.add(txtInstitucionTecnico);
			
			JLabel label_15 = new JLabel("Tecnico:");
			label_15.setBounds(6, 47, 61, 16);
			pTecnico.add(label_15);
			
			cbxTecnico = new JComboBox();
			cbxTecnico.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Electronica", "Informatica", "Telecomunicaciones", "Contabilidad", "Auditoria", "Mercadeo", "Software"}));
			cbxTecnico.setBackground(new Color(211, 211, 211));
			cbxTecnico.setBounds(82, 45, 222, 20);
			pTecnico.add(cbxTecnico);
			
			pTecnico.setVisible(false);
			
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
			
			cbxCarrera = new JComboBox();
			cbxCarrera.setBackground(new Color(211, 211, 211));
			cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n de Empresa\u200B", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "\u200BIngenier\u00EDa Industrial", "\u200BIngenier\u00EDa de Sistemas ", "\u200BIngenier\u00EDa Electr\u00F3nica", "\u200BIngenier\u00EDa Telem\u00E1tica", "\u200BIngenier\u00EDa en Mecatr\u00F3nica\u200B\u200B", "\u200BMedicina", "\u200BMercadotecnia", "Nutrici\u00F3n y Diet\u00E9tica", "\u200B\u200BPsicolog\u00EDa", "\u200BTerapia F\u00EDsica\u200B"}));
			cbxCarrera.setBounds(82, 45, 222, 20);
			pUniversitario.add(cbxCarrera);
			
			cbxInstitucionUni = new JComboBox();
			cbxInstitucionUni.setBackground(new Color(211, 211, 211));
			cbxInstitucionUni.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", " Universidad Aut\u00F3noma de Santo Domingo (UASD)", " Facultad Latinoamericana de Cs. Soc. (FLACSO)", " Barna Business School", " Universidad Nacional Tecnol\u00F3gica (UNNATEC)", " Pontificia Universidad Cat\u00F3lica Madre y Maestra (PUCMM)", " Universidad Abierta Para Adultos (UAPA)", " Universidad APEC (UNAPEC)", " Universidad Cat\u00F3lica de Santo Domingo (UCSD)", " Instituto Nacional de Ciencias Exactas (INCE)", " Instituto Superior de Tecnolog\u00EDa Universal (INSUTEC)", " Instituto T\u00E9cnico Superior Oscus San Valero", " Instituto Tecnol\u00F3gico de las Am\u00E9ricas (ITLA)", " Instituto Tecnol\u00F3gico de Santo Domingo (INTEC)", "Universidad Central del Este (UCE)", "Universidad Central Dominicana de Est. Prof. (UCDEP)", "Universidad del Caribe", "Universidad del I. Cultural Dom\u00EDnico-Americano (ICDA)", "Universidad Dominicana Org. y M\u00E9todo (UDOYM)", "Universidad Eugenio Maria de Hostos (UNIREMHOS)", "Universidad Experimental F\u00E9lix Adam (UNEFA)", "Universidad Federico Henr\u00EDquez y Carvajal (UFHEC) ", "Universidad Iberoamericana (UNIBE)", "Universidad Interamericana (UNICA)", "Universidad Nacional Evang\u00E9lica (UNEV)", "Universidad Nacional Pedro Henr\u00EDquez Ure\u00F1a (UNPHU)", "Universidad Odontol\u00F3gica Dominicana (UOD)", "Universidad Psicolog\u00EDa Ind. Dominicana (UPID)", "Universidad Tecnol\u00F3gica de Santiago (UTESA)"}));
			cbxInstitucionUni.setBounds(82, 14, 222, 20);
			pUniversitario.add(cbxInstitucionUni);
			pUniversitario.setVisible(false);
			
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
			
			pObrero = new JPanel();
			pObrero.setBackground(new Color(255, 255, 255));
			pObrero.setLayout(null);
			pObrero.setBounds(6, 64, 314, 79);
			panel_2.add(pObrero);
			
			JLabel label_16 = new JLabel("Habilidad:");
			label_16.setBounds(6, 20, 71, 16);
			pObrero.add(label_16);
			
			cbxHabilidad = new JComboBox();
			cbxHabilidad.setBackground(new Color(211, 211, 211));
			cbxHabilidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
			cbxHabilidad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
					if(!cbxHabilidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
						if(cbxHabilidad.getSelectedItem().toString().equalsIgnoreCase(cbxHabilidad2.getSelectedItem().toString())){
							cbxHabilidad.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "La habilidad ya ha sido agregada", "Informacion", JOptionPane.WARNING_MESSAGE);}
				
						else
							habilidad.add(0,cbxHabilidad.getSelectedItem().toString());
						
					}
				}
			});
			cbxHabilidad.setBounds(82, 14, 226, 23);
			pObrero.add(cbxHabilidad);
			
			chckbxAadirOtro = new JCheckBox("Otro?");
			chckbxAadirOtro.setBackground(new Color(255, 255, 255));
			chckbxAadirOtro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxAadirOtro.isSelected()){
						cbxHabilidad2.setEnabled(true);
					}else if(!chckbxAadirOtro.isSelected()){
						cbxHabilidad2.setEnabled(false);
						cbxHabilidad2.setSelectedIndex(0);
						
					}
				}

			});
			chckbxAadirOtro.setBounds(6, 47, 63, 23);
			pObrero.add(chckbxAadirOtro);
			
			cbxHabilidad2 = new JComboBox();
			cbxHabilidad2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Artista", "Audiovisuales", "Cajero", "Carpintero", "Chofer", "Cocinero", "Contructor", "Delivery", "Ebanista", "Electricista", "Empacador", "Gu\u00E1", "Humorista", "Jardinero", "Mec\u00E1nico", "Mucama", "Pintor", "Plomero", "Rescatista", "Salva Vida", "Sastre", "Seguridad", "Vendedor"}));
			cbxHabilidad2.setBackground(new Color(211, 211, 211));
			cbxHabilidad2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!cbxHabilidad2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>"))
						if(cbxHabilidad2.getSelectedItem().toString().equalsIgnoreCase(cbxHabilidad.getSelectedItem().toString())){
							cbxHabilidad2.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "La habilidad ya ha sido agregada", "Informacion", JOptionPane.WARNING_MESSAGE);}
				
						else
						habilidad.add(1,cbxHabilidad2.getSelectedItem().toString());
				}
			});
			cbxHabilidad2.setEnabled(false);
			cbxHabilidad2.setBounds(82, 45, 226, 23);
			pObrero.add(cbxHabilidad2);
			pObrero.setVisible(false);
			
			panel_4 = new JPanel();
			panel_4.setBorder(new TitledBorder(null, "Datos Vivienda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_4.setBackground(new Color(255, 255, 255));
			panel_4.setBounds(378, 197, 386, 152);
			panel_principal.add(panel_4);
			panel_4.setLayout(null);
			
			JLabel label_8 = new JLabel("Cuidad:");
			label_8.setBounds(50, 28, 67, 14);
			panel_4.add(label_8);
			
			cbxCiudad = new JComboBox();
			cbxCiudad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxCiudad.setBounds(121, 26, 190, 23);
			panel_4.add(cbxCiudad);
			cbxCiudad.setBackground(new Color(211, 211, 211));
			cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
			
			JLabel label_9 = new JLabel("Pais:");
			label_9.setBounds(50, 65, 67, 14);
			panel_4.add(label_9);
			
			cbxPais = new JComboBox();
			cbxPais.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxPais.setBounds(121, 62, 190, 23);
			panel_4.add(cbxPais);
			cbxPais.setBackground(new Color(211, 211, 211));
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
			
			JLabel label_5 = new JLabel("Estado Civil:");
			label_5.setBounds(50, 102, 86, 16);
			panel_4.add(label_5);
			
			cbxEstadoCivil = new JComboBox();
			cbxEstadoCivil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cbxEstadoCivil.setBounds(121, 98, 190, 23);
			panel_4.add(cbxEstadoCivil);
			cbxEstadoCivil.setBackground(new Color(211, 211, 211));
			cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
			
			panelHombre = new JPanel();
			panelHombre.setBounds(15, 20, 152, 158);
			panel_principal.add(panelHombre);
			panelHombre.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(SolicitantesVisual.class.getResource("/imagenes/hombre.png")));
			lblNewLabel_1.setBounds(10, 6, 142, 142);
			panelHombre.add(lblNewLabel_1);
			
			 panelMujer.setVisible(false);
			 panelHombre.setVisible(false);
			 panel_Todos.setVisible(true);
			
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
			panel_3.setBackground(new Color(0, 0, 139));
			panel_3.setBounds(0, 0, 804, 50);
			panel.add(panel_3);
			
			lblIngresarSolicitante = new JLabel("Ingresar Solicitante");
			lblIngresarSolicitante.setForeground(Color.WHITE);
			lblIngresarSolicitante.setFont(new Font("Cambria", Font.PLAIN, 27));
			lblIngresarSolicitante.setBounds(285, 0, 231, 46);
			panel_3.add(lblIngresarSolicitante);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(Color.WHITE);
			panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_5.setBounds(9, 90, 774, 76);
			panel.add(panel_5);
			panel_5.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("\u00BFYa posees una cuenta con nosotros?");
			lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			lblNewLabel.setBounds(63, 5, 311, 31);
			panel_5.add(lblNewLabel);
			
			chxCuentaCreada = new JCheckBox("");
			chxCuentaCreada.setBackground(Color.WHITE);
			chxCuentaCreada.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chxCuentaCreada.isSelected()){
						txtCedulaClienteAntiguo.setEnabled(true);
						btnBuscar.setEnabled(true);
						
						//okButton.setEnabled(false);
						}
					else{
						txtCedulaClienteAntiguo.setEnabled(false);
						btnBuscar.setEnabled(false);
						//okButton.setEnabled(true);
						limpiar();
						}	
				}
			});
			chxCuentaCreada.setBounds(380, 13, 35, 23);
			panel_5.add(chxCuentaCreada);
			
			txtCedulaClienteAntiguo = new JFormattedTextField(formatoCedula);
			txtCedulaClienteAntiguo.setBounds(184, 42, 123, 23);
			panel_5.add(txtCedulaClienteAntiguo);
			txtCedulaClienteAntiguo.setColumns(10);
			
			IngresarCedula = new JLabel("Ingrese su cedula:");
			IngresarCedula.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			IngresarCedula.setBounds(50, 40, 124, 20);
			panel_5.add(IngresarCedula);
			
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (txtCedulaClienteAntiguo.getText().toString().equalsIgnoreCase("")||bolsa.buscarSolicitante(txtCedulaClienteAntiguo.getText().toString())==null)
						JOptionPane.showMessageDialog(null, "No se ha encontrado el cliente", "Informacion", JOptionPane.WARNING_MESSAGE);
					else{
					soli = Bolsa.buscarSolicitante(txtCedulaClienteAntiguo.getText());
					//System.out.println(soli.isHabilitado());
					//System.out.println(soli.getMiSolicitud().get(0).toString());
					System.out.println("Tamano de la solicitudsol: "+ soli.getMiSolicitud().size());
					//System.out.println(soli.getMiSolicitud().get(1).toString());
					//System.out.println(soli.getMiSolicitud().get(2).toString());
					
					//Cedula
					txtCedula.setText(soli.getCedula());
					txtCedula.setEnabled(false);
					//Nombre
					txtNombre.setText(soli.getNombre());
					txtNombre.setEnabled(false);
					//Apellido
					txtApellido.setText(soli.getApellido());
					txtApellido.setEnabled(false);
					//Telefono
					txtTelefono.setText(soli.getTelefono());
					txtTelefono.setEnabled(false);
					//Email
					txtEmail.setText(soli.getEmail());
					txtEmail.setEnabled(false);
					//Sexo
					if(soli.getSexo().equalsIgnoreCase("Masculino"))
						btnMasculino.setSelected(true);
					else
						btnFemenino.setSelected(true);
					btnMasculino.setEnabled(false);
					btnFemenino.setEnabled(false);
					//Nacionalidad
					for(int u=0; u<cbxNacionalidad.getItemCount();u++){
						if(cbxNacionalidad.getItemAt(u).toString().equalsIgnoreCase(soli.getNacionalidad()))
						cbxNacionalidad.setSelectedIndex(u);
					}
					cbxNacionalidad.setEnabled(false);
					//EstadoCivil
					for(int u=0; u<cbxEstadoCivil.getItemCount();u++){
						if(cbxEstadoCivil.getItemAt(u).toString().equalsIgnoreCase(soli.getEstadoCivil()))
						cbxEstadoCivil.setSelectedIndex(u);
					}
					cbxEstadoCivil.setEnabled(false);
					//Direccion
					txtDireccion.setText(soli.getDireccion());
					txtDireccion.setEnabled(false);
					//Cuidad
					for(int u=0; u<cbxCiudad.getItemCount();u++){
						if(cbxCiudad.getItemAt(u).toString().equalsIgnoreCase(soli.getCuidad()))
						cbxCiudad.setSelectedIndex(u);
					}
					cbxCiudad.setEnabled(false); 
					//Pais
					for(int u=0; u<cbxPais.getItemCount();u++){
						if(cbxPais.getItemAt(u).toString().equalsIgnoreCase(soli.getPais()))
						cbxPais.setSelectedIndex(u);
					}
					cbxPais.setEnabled(false);
					//Fecha Nacimiento
					Jcaldate.setDate(soli.getFechaNacimiento());
					Jcaldate.setEnabled(false);
					//Idioma
				
					int a=0;
					for(int u=0; u<cbxIdioma1.getItemCount();u++){
						if(cbxIdioma1.getItemAt(u).toString().equalsIgnoreCase(soli.getIdioma().get(0))){
							cbxIdioma1.setSelectedIndex(u);
							a=u;
						}
					}
						
					for(int u=0; u<cbxIdioma2.getItemCount();u++){
						if(u!=a){
							if(cbxIdioma2.getItemAt(u).toString().equalsIgnoreCase(soli.getIdioma().get(1))){
								cbxIdioma2.setSelectedIndex(u);
								a=u; 
							}
						}
					}
						
					for(int u=0; u<cbxIdioma3.getItemCount();u++){
						if(u!=a){
						if(cbxIdioma3.getItemAt(u).toString().equalsIgnoreCase(soli.getIdioma().get(2)))
						cbxIdioma3.setSelectedIndex(u);}
					}
						
					cbxIdioma1.setEnabled(false);
					cbxIdioma2.setEnabled(false);
					cbxIdioma3.setEnabled(false);
						
					//Licencia
					if(soli.isLicencia()==true)
						btnLicenciaCY.setSelected(true);
					else
						btnLicenciaCN.setSelected(true);
					btnLicenciaCN.setEnabled(false);
					btnLicenciaCY.setEnabled(false);
					
					//NombreEmpresa
					txtEmpresa.setText(soli.getNombreEmpresa());
					txtEmpresa.setEnabled(false);
					
					//AreaTrabajo 
					for(int u=0; u<cbxAreaTrabajo.getItemCount();u++){
						if(cbxAreaTrabajo.getItemAt(u).toString().equalsIgnoreCase(soli.getAreaTrabajo1()))
						cbxAreaTrabajo.setSelectedIndex(u);
					}
					cbxAreaTrabajo.setEnabled(false);
							
					//TiempoTrabajo
					spnTiempoExperiencia.setValue(soli.getTiempotrabajoRealizado1());
					spnTiempoExperiencia.setEnabled(false);
					
					//NombreReferente
					txtNombreReferente.setText(soli.getNombreReferente());
					txtNombreReferente.setEnabled(false);
					//NumeroReferente
					txtNumeroReferente.setText(soli.getNumeroReferente());
					txtNumeroReferente.setEnabled(false);		
				}}
			});
			btnBuscar.setBounds(317, 41, 89, 26);
			panel_5.add(btnBuscar);
			
			txtCedulaClienteAntiguo.setEnabled(false);
			//IngresarCedula.setEnabled(false);
			btnBuscar.setEnabled(false);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setForeground(new Color(0, 0, 139));
			buttonPane.setBackground(new Color(0, 0, 139));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Registrar");
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
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||Jcaldate.getDate()==null||btnGroupMudarse.isSelected(null)||btnGroupJornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma2.isSelected()&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")
										||cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma3.isSelected()&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										btnGroupLicencia.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||cbxInstitucionUni.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxCarrera.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||
										Bolsa.SolicitanteRepetido(cedula)==true&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")||mayorEdad()==false){
									if (Bolsa.SolicitanteRepetido(cedula)==true)
										JOptionPane.showMessageDialog(null, "El solicitante ya esta ingresado, verifique su cedula", "Informacion", JOptionPane.WARNING_MESSAGE);
									else
										if(mayorEdad()==false)
											JOptionPane.showMessageDialog(null, "Debe ser mayor de 18", "Informacion", JOptionPane.WARNING_MESSAGE);
										else
											JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Informacion", JOptionPane.WARNING_MESSAGE);}
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(Jcaldate.getDate().getTime());
									String carrera = cbxCarrera.getSelectedItem().toString();
									String institucion = cbxInstitucionUni.getSelectedItem().toString();
									Solicitantes s= new Solicitantes(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, idioma, true, LicenciaConducir, nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente);
									Universitario u = new Universitario(salirioSolicitado, dispMudarse, dispViajar, TipoJornada, areaInteres, LocalDate.now(), institucion, carrera);
									if(soli==null){
										Bolsa.insertarSolicitante(s);
										s.getMiSolicitud().add(u);}
									if(!txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")){
										soli.getMiSolicitud().add(u);}
									//for(int h=0; h<idioma.size();h++)
										//System.out.println(idioma.get(h)+" El numero"+h);
									JOptionPane.showMessageDialog(null, "Operacion satisfactoria", "Informacion", JOptionPane.INFORMATION_MESSAGE);
									//clean();
									limpiar();
									
								}
							}
							if (tipo.equalsIgnoreCase("Obrero")){
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("   -       - ")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("(   ) -   -    ")||txtEmail.getText().equalsIgnoreCase("")||btnGroupSexo.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||Jcaldate.getDate()==null||btnGroupMudarse.isSelected(null)||btnGroupJornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										btnGroupLicencia.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||habilidad.get(0).equalsIgnoreCase("<Seleccionar>")||cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma2.isSelected()&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")||
										cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma3.isSelected()&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")||cbxHabilidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxHabilidad2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chckbxAadirOtro.isSelected()||mayorEdad()==false||Bolsa.SolicitanteRepetido(cedula)==true&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")){
									if (Bolsa.SolicitanteRepetido(cedula)==true&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - "))
										JOptionPane.showMessageDialog(null, "El solicitante ya esta ingresado, verifique su cedula", "Informacion", JOptionPane.WARNING_MESSAGE);
									else
										if(mayorEdad()==false)
											JOptionPane.showMessageDialog(null, "Debe ser mayor de 18", "Informacion", JOptionPane.WARNING_MESSAGE);
										else
											JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Informacion", JOptionPane.WARNING_MESSAGE);}
								
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(Jcaldate.getDate().getTime());
									//String habilidad = cbxHabilidad.getSelectedItem().toString();
									Solicitantes s= new Solicitantes(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, idioma, true, LicenciaConducir, nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente);
									Obrero o = new Obrero(salirioSolicitado, dispMudarse, dispViajar, TipoJornada, areaInteres, LocalDate.now(), habilidad);
									if(soli==null){
										Bolsa.insertarSolicitante(s);
										s.getMiSolicitud().add(o);}
									if(!txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")){
										soli.getMiSolicitud().add(o);}
									JOptionPane.showMessageDialog(null, "Operacion satisfactoria", "Informacion", JOptionPane.INFORMATION_MESSAGE);
									limpiar();
									
								}
								
							}
							if (tipo.equalsIgnoreCase("Tecnico")){
								if (txtNombre.getText().equalsIgnoreCase("")||txtCedula.getText().equalsIgnoreCase("   -       - ")||txtApellido.getText().equalsIgnoreCase("")||txtTelefono.getText().equalsIgnoreCase("(   ) -   -    ")||txtEmail.getText().equalsIgnoreCase("")||btnGroupSexo.isSelected(null)||cbxNacionalidad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")
										||txtDireccion.getText().equalsIgnoreCase("")||cbxCiudad.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxPais.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||Jcaldate.getDate()==null||btnGroupMudarse.isSelected(null)||btnGroupJornada.isSelected(null)||idioma.get(0).equalsIgnoreCase("<Seleccionar>")||areaInteres.equalsIgnoreCase("<Seleccionar>")||
										btnGroupLicencia.isSelected(null)||txtEmpresa.getText().equalsIgnoreCase("")||cbxAreaTrabajo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||txtNombreReferente.getText().equalsIgnoreCase("")||txtNumeroReferente.getText().equalsIgnoreCase("")||txtInstitucionTecnico.getText().equalsIgnoreCase("")||cbxTecnico.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxIdioma1.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")||cbxIdioma2.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma2.isSelected()&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")||
										cbxIdioma3.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")&&chbIdioma3.isSelected()&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")||mayorEdad()==false||Bolsa.SolicitanteRepetido(cedula)==true&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")){
									if (Bolsa.SolicitanteRepetido(cedula)==true&&txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - "))
										JOptionPane.showMessageDialog(null, "El solicitante ya esta ingresado, verifique su cedula", "Informacion", JOptionPane.WARNING_MESSAGE);
									else
										if(mayorEdad()==false)
											JOptionPane.showMessageDialog(null, "Debe ser mayor de 18", "Informacion", JOptionPane.WARNING_MESSAGE);
										else
											JOptionPane.showMessageDialog(null, "Completar todas las casillas con valores aceptables", "Informacion", JOptionPane.WARNING_MESSAGE);}
								
								else{
									java.sql.Date fechaNacimiento = new java.sql.Date(Jcaldate.getDate().getTime());
									String tecnico = cbxTecnico.getSelectedItem().toString();
									String institucion = txtInstitucionTecnico.getText();	
									Solicitantes s= new Solicitantes(cedula, nombre, apellido, telefono, email, sexo, nacionalidad, estadoCivil, direccion, cuidad, pais, fechaNacimiento, idioma, true, LicenciaConducir, nombreEmpresa, areaTrabajo, tiempoExp, nombreReferente, telefonoReferente);
									Tecnico t = new Tecnico(salirioSolicitado, dispMudarse, dispViajar, TipoJornada, areaInteres, LocalDate.now(), institucion, tecnico);							
									if(soli==null){
										Bolsa.insertarSolicitante(s);
										s.getMiSolicitud().add(t);}
									if(!txtCedulaClienteAntiguo.getText().equalsIgnoreCase("   -       - ")){
										soli.getMiSolicitud().add(t);}
									JOptionPane.showMessageDialog(null, "Operacion satisfactoria", "Informacion", JOptionPane.INFORMATION_MESSAGE);	
									limpiar();
									
								}
							}
						}
						else 
							JOptionPane.showMessageDialog(null, "Seleccione un nivel educativo", "Informacion", JOptionPane.WARNING_MESSAGE);
					}
				});
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
	public void limpiar() {
		txtCedula.setEnabled(true);
		txtNombre.setEnabled(true);						
		txtApellido.setEnabled(true);						
		txtTelefono.setEnabled(true);						
		txtEmail.setEnabled(true);						
		btnMasculino.setEnabled(true);
		btnFemenino.setEnabled(true);							
		cbxNacionalidad.setEnabled(true);						
		cbxEstadoCivil.setEnabled(true);
		txtDireccion.setEnabled(true);
		cbxCiudad.setEnabled(true); 
		cbxPais.setEnabled(true);						
		Jcaldate.setEnabled(true);							
		cbxIdioma1.setEnabled(true);
		cbxIdioma2.setEnabled(true);
		cbxIdioma3.setEnabled(true);
		btnLicenciaCN.setEnabled(true);
		btnLicenciaCY.setEnabled(true);
		txtEmpresa.setEnabled(true);
		cbxAreaTrabajo.setEnabled(true);
		spnTiempoExperiencia.setEnabled(true);
		txtNombreReferente.setEnabled(true);
		
		txtNumeroReferente.setEnabled(true);
		Jcaldate.setDate(null);
		txtCedulaClienteAntiguo.setValue(null);
		txtNumeroReferente.setValue(null);
		txtCedula.setValue(null);
		txtTelefono.setValue(null);
		//txtTelefono.getFormatter();
	     txtEmpresa.setText("");
		 txtInstitucionTecnico.setText("");
		 cbxAreaTrabajo.removeAll();
		 txtNombreReferente.setText("");

		 txtNombre.setText("");
	     txtApellido.setText("");
	     //txtCedula.getFormatterFactory();
		 //txtTelefono.getFormatterFactory();
		 txtEmail.setText("");
	
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
		 cbxCarrera.setSelectedIndex(0);
		 cbxInstitucionUni.setSelectedIndex(0);
		 cbxTecnico.setSelectedIndex(0);
		 
		 
		 panel_principal.setVisible(true);
		 panel_secundario.setVisible(false);
		
		 btnGroupJornada.clearSelection();
		 btnGroupLicencia.clearSelection();
		 btnGroupMudarse.clearSelection();
		 btnGroupNivelEducativo.clearSelection();
		 btnGroupSexo.clearSelection();
		 btnGroupViajar.clearSelection();
		 btnPag.setEnabled(false);
		 btnPag_1.setEnabled(true);
		 txtCedulaClienteAntiguo.setEnabled(false);
		 //IngresarCedula.setEnabled(false);
		 btnBuscar.setEnabled(false);
		 chxCuentaCreada.setSelected(false);
		 soli=null;	
	}
}
