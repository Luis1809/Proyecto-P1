package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import logico.Bolsa;

import logico.EmpresaSolicitadora;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class RegistrarPlaza extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSpinner txtPocientoAceptable;
	private JTextField txtnombreEmpresa;
	private JTextField txtciudadEmpresa;
	private JFormattedTextField txttelefonoEmpresa;
	private JTextField txtFecha;
	private JPanel panel_principal;
	private JPanel panel_secundario;
	private JButton btnPag;
	private JButton btnPag_1;
	private final ButtonGroup btnGroupSexo = new ButtonGroup();
	private final ButtonGroup btnGroupNivelEducativo = new ButtonGroup();
	private static MaskFormatter formatoCedula;
    private static MaskFormatter formatoNumero;
	private static MaskFormatter formatoRNC;
	private JFormattedTextField txtRNC;
	private JSpinner spnPlaza;
	private JSpinner spnSalarioMensual;
	private JRadioButton btnMudarseY;
	private JRadioButton btnMudarseN;
	private JComboBox cbxIdioma1;
	private JComboBox cbxIdioma2;
	private JComboBox cbxIdioma3;
	private JRadioButton btnLicenciaN;
	private JRadioButton btnLicenciaY;
	private JRadioButton bntDispViajarY;
	private JRadioButton bntDispViajarN;
	private JRadioButton btnMedioTiempo;
	private JRadioButton btnTiempoCompleto;
	private JComboBox cbxHabilidad;
	private JComboBox cbxHabilidad2;
	private JComboBox cbxTecnico;
	private JComboBox cbxInstitucionUni;
	private JComboBox cbxCarreraUni;
	private JRadioButton btnUniversitario;
	private JRadioButton btnTecnico;
	private JRadioButton btnObrero;
	private JRadioButton btnMasculino;
	private JRadioButton btnFemenino;
	private JRadioButton btnNoAplica;
	private JComboBox cbxCuidadSolicitada;
	private JComboBox cbxPais;
	private JComboBox cbxEstadoCivil;
	private JComboBox cbxAreaTrabajo;
	private JSpinner snpTiempoExp;
	private JButton btnBuscar;
	private EmpresaSolicitadora miEmpresa;
	private JTextField txtAreaEmpresa;
	private final ButtonGroup btnGroupMudarse = new ButtonGroup();
	private final ButtonGroup btnGroupLicencia = new ButtonGroup();
	private final ButtonGroup btnGroupViajar = new ButtonGroup();
	private final ButtonGroup btnGroupJornada = new ButtonGroup();
	
	public RegistrarPlaza() {
		setResizable(false);
		setBounds(100, 100, 681, 598);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		try{
			formatoCedula = new MaskFormatter("###-#######-#");//////////////////////////////////////
			formatoNumero = new MaskFormatter("(###) -###-####");//////////////////////////////////////
			formatoRNC    = new MaskFormatter("#########");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		panel_secundario = new JPanel();
		panel_secundario.setBackground(new Color(255, 255, 255));
		panel_secundario.setBounds(0, 198, 675, 313);
		contentPanel.add(panel_secundario);
		panel_secundario.setLayout(null);
		panel_secundario.setVisible(false);
		
		
		JPanel panelPlazaAreaDeExperiencia = new JPanel();
		panelPlazaAreaDeExperiencia.setBounds(372, 21, 293, 256);
		panel_secundario.add(panelPlazaAreaDeExperiencia);
		panelPlazaAreaDeExperiencia.setBackground(new Color(255, 255, 255));
		panelPlazaAreaDeExperiencia.setBorder(new TitledBorder(null, "Solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPlazaAreaDeExperiencia.setLayout(null);
		
		JLabel lblPorcientoAceptable = new JLabel("Porciento aceptable:");
		lblPorcientoAceptable.setBounds(24, 34, 126, 14);
		panelPlazaAreaDeExperiencia.add(lblPorcientoAceptable);
		
		txtPocientoAceptable = new JSpinner();
		txtPocientoAceptable.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		txtPocientoAceptable.setBackground(new Color(211, 211, 211));
		txtPocientoAceptable.setBounds(157, 31, 126, 20);
		panelPlazaAreaDeExperiencia.add(txtPocientoAceptable);
		
		JLabel lblPlaza = new JLabel("Plazas:");
		lblPlaza.setBounds(24, 68, 46, 14);
		panelPlazaAreaDeExperiencia.add(lblPlaza);
		
		spnPlaza = new JSpinner();
		spnPlaza.setForeground(new Color(255, 248, 220));
		spnPlaza.setBackground(new Color(255, 248, 220));
		spnPlaza.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spnPlaza.setBounds(157, 62, 126, 20);
		panelPlazaAreaDeExperiencia.add(spnPlaza);
		
		JLabel label_6 = new JLabel("Area de interes:");
		label_6.setBounds(24, 99, 126, 14);
		panelPlazaAreaDeExperiencia.add(label_6);
		
		JLabel label_7 = new JLabel("Salario solicitado (Mensual):");
		label_7.setBounds(24, 135, 173, 14);
		panelPlazaAreaDeExperiencia.add(label_7);
		
		spnSalarioMensual = new JSpinner();
		spnSalarioMensual.setBackground(new Color(255, 248, 220));
		spnSalarioMensual.setModel(new SpinnerNumberModel(10000, 10000, 1000000, 500));
		spnSalarioMensual.setBounds(24, 160, 126, 20);
		panelPlazaAreaDeExperiencia.add(spnSalarioMensual);
		
		txtAreaEmpresa = new JTextField();
		txtAreaEmpresa.setEditable(false);
		txtAreaEmpresa.setBounds(157, 93, 126, 20);
		panelPlazaAreaDeExperiencia.add(txtAreaEmpresa);
		txtAreaEmpresa.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 21, 358, 256);
		panel_secundario.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 49, 157, 12);
		panel_1.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(27, 104, 126, 12);
		panel_1.add(separator_2);
		
		btnMudarseY = new JRadioButton("Si");
		btnGroupMudarse.add(btnMudarseY);
		btnMudarseY.setBackground(new Color(255, 255, 255));
		btnMudarseY.setBounds(37, 58, 54, 23);
		panel_1.add(btnMudarseY);
		
		btnMudarseN = new JRadioButton("No");
		btnGroupMudarse.add(btnMudarseN);
		btnMudarseN.setBackground(new Color(255, 255, 255));
		btnMudarseN.setBounds(93, 58, 54, 23);
		panel_1.add(btnMudarseN);
		
		JLabel label_4 = new JLabel("Idioma:");
		label_4.setBounds(210, 32, 61, 16);
		panel_1.add(label_4);
		
		cbxIdioma1 = new JComboBox();
		cbxIdioma1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
		cbxIdioma1.setBackground(new Color(211, 211, 211));
		cbxIdioma1.setEditable(true);
		cbxIdioma1.setBounds(210, 52, 134, 20);
		panel_1.add(cbxIdioma1);
		
		btnLicenciaN = new JRadioButton("No");
		btnGroupLicencia.add(btnLicenciaN);
		btnLicenciaN.setBackground(new Color(255, 255, 255));
		btnLicenciaN.setBounds(93, 112, 54, 23);
		panel_1.add(btnLicenciaN);
		
		btnLicenciaY = new JRadioButton("Si");
		btnGroupLicencia.add(btnLicenciaY);
		btnLicenciaY.setBackground(new Color(255, 255, 255));
		btnLicenciaY.setBounds(37, 112, 54, 23);
		panel_1.add(btnLicenciaY);
		
		JCheckBox chbAnadirIdioma2 = new JCheckBox("A\u00F1adir otro idioma");
		chbAnadirIdioma2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chbAnadirIdioma2.isSelected())
					cbxIdioma2.setEnabled(true);
				else 
					cbxIdioma2.setEnabled(false);
			}
		});
		chbAnadirIdioma2.setBackground(new Color(255, 255, 255));
		chbAnadirIdioma2.setBounds(210, 79, 134, 23);
		panel_1.add(chbAnadirIdioma2);
		
		cbxIdioma2 = new JComboBox();
		cbxIdioma2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
		cbxIdioma2.setBackground(new Color(211, 211, 211));
		cbxIdioma2.setEnabled(false);
		cbxIdioma2.setBounds(210, 109, 134, 20);
		panel_1.add(cbxIdioma2);
		
		JCheckBox chbAnadirIdioma3 = new JCheckBox("A\u00F1adir otro idioma");
		chbAnadirIdioma3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chbAnadirIdioma3.isSelected())
					cbxIdioma3.setEnabled(true);
				else 
					cbxIdioma3.setEnabled(false);
			}
		});
		chbAnadirIdioma3.setBackground(new Color(255, 255, 255));
		chbAnadirIdioma3.setBounds(210, 137, 134, 23);
		panel_1.add(chbAnadirIdioma3);
		
		cbxIdioma3 = new JComboBox();
		cbxIdioma3.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Ingles", "Espa\u00F1ol", "Frances", "Aleman", "Mandarin", "Italiano", "Japones", "Creoles", "Ruso"}));
		cbxIdioma3.setBackground(new Color(211, 211, 211));
		cbxIdioma3.setEnabled(false);
		cbxIdioma3.setBounds(210, 167, 134, 20);
		panel_1.add(cbxIdioma3);
		
		JLabel label_8 = new JLabel("Disponibilidad de viajar:");
		label_8.setBounds(27, 146, 173, 14);
		panel_1.add(label_8);
		
		bntDispViajarY = new JRadioButton("Si");
		btnGroupViajar.add(bntDispViajarY);
		bntDispViajarY.setBackground(new Color(255, 255, 255));
		bntDispViajarY.setBounds(37, 164, 54, 23);
		panel_1.add(bntDispViajarY);
		
		bntDispViajarN = new JRadioButton("No");
		btnGroupViajar.add(bntDispViajarN);
		bntDispViajarN.setBackground(new Color(255, 255, 255));
		bntDispViajarN.setBounds(93, 164, 54, 23);
		panel_1.add(bntDispViajarN);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(27, 161, 134, 12);
		panel_1.add(separator_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 205, 134, 12);
		panel_1.add(separator_1);
		
		btnMedioTiempo = new JRadioButton("Medio Tiempo");
		btnGroupJornada.add(btnMedioTiempo);
		btnMedioTiempo.setBackground(new Color(255, 255, 255));
		btnMedioTiempo.setBounds(33, 213, 120, 23);
		panel_1.add(btnMedioTiempo);
		
		btnTiempoCompleto = new JRadioButton("Tiempo Completo");
		btnGroupJornada.add(btnTiempoCompleto);
		btnTiempoCompleto.setBackground(new Color(255, 255, 255));
		btnTiempoCompleto.setBounds(167, 213, 126, 23);
		panel_1.add(btnTiempoCompleto);
		
		JLabel lblTipoDeJornada = new JLabel("Tipo de jornada laboral:");
		lblTipoDeJornada.setBounds(27, 190, 173, 14);
		panel_1.add(lblTipoDeJornada);
		
		JLabel lblLicenciaDeConducir = new JLabel("Licencia de conducir:");
		lblLicenciaDeConducir.setBounds(27, 90, 173, 14);
		panel_1.add(lblLicenciaDeConducir);
		
		JLabel lblDisponibilidadDeMudarse = new JLabel("Disponibilidad de mudarse:");
		lblDisponibilidadDeMudarse.setBounds(27, 35, 173, 14);
		panel_1.add(lblDisponibilidadDeMudarse);
		
		panel_principal = new JPanel();
		panel_principal.setBorder(new TitledBorder(null, "Formulario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_principal.setBackground(new Color(255, 255, 255));
		panel_principal.setBounds(10, 198, 655, 334);
		contentPanel.add(panel_principal);
		panel_principal.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(300, 170, 345, 148);
		panel_principal.add(panel_4);
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setLayout(null);
		
		JPanel pUniversitario = new JPanel();
		pUniversitario.setBackground(new Color(255, 255, 255));
		pUniversitario.setBounds(10, 64, 318, 73);
		panel_4.add(pUniversitario);
		pUniversitario.setLayout(null);
		
		JLabel label_3 = new JLabel("Institucion:");
		label_3.setBounds(10, 17, 84, 16);
		pUniversitario.add(label_3);
		
		cbxInstitucionUni = new JComboBox();
		cbxInstitucionUni.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", " N/A", " Universidad Aut\u00F3noma de Santo Domingo (UASD)", " Facultad Latinoamericana de Cs. Soc. (FLACSO)", " Barna Business School", " Universidad Nacional Tecnol\u00F3gica (UNNATEC)", " Pontificia Universidad Cat\u00F3lica Madre y Maestra (PUCMM)", " Universidad Abierta Para Adultos (UAPA)", " Universidad APEC (UNAPEC)", " Universidad Cat\u00F3lica de Santo Domingo (UCSD)", " Instituto Nacional de Ciencias Exactas (INCE)", " Instituto Superior de Tecnolog\u00EDa Universal (INSUTEC)", " Instituto T\u00E9cnico Superior Oscus San Valero", " Instituto Tecnol\u00F3gico de las Am\u00E9ricas (ITLA)", " Instituto Tecnol\u00F3gico de Santo Domingo (INTEC)", "Universidad Central del Este (UCE)", "Universidad Central Dominicana de Est. Prof. (UCDEP)", "Universidad del Caribe", "Universidad del I. Cultural Dom\u00EDnico-Americano (ICDA)", "Universidad Dominicana Org. y M\u00E9todo (UDOYM)", "Universidad Eugenio Maria de Hostos (UNIREMHOS)", "Universidad Experimental F\u00E9lix Adam (UNEFA)", "Universidad Federico Henr\u00EDquez y Carvajal (UFHEC) ", "Universidad Iberoamericana (UNIBE)", "Universidad Interamericana (UNICA)", "Universidad Nacional Evang\u00E9lica (UNEV)", "Universidad Nacional Pedro Henr\u00EDquez Ure\u00F1a (UNPHU)", "Universidad Odontol\u00F3gica Dominicana (UOD)", "Universidad Psicolog\u00EDa Ind. Dominicana (UPID)", "Universidad Tecnol\u00F3gica de Santiago (UTESA)"}));
		cbxInstitucionUni.setBackground(new Color(211, 211, 211));
		cbxInstitucionUni.setBounds(86, 11, 222, 20);
		pUniversitario.add(cbxInstitucionUni);
		
		JLabel label_9 = new JLabel("Carrera:");
		label_9.setBounds(10, 44, 61, 16);
		pUniversitario.add(label_9);
		
		cbxCarreraUni = new JComboBox();
		cbxCarreraUni.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n de Empresa\u200B", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "\u200BIngenier\u00EDa Industrial", "\u200BIngenier\u00EDa de Sistemas ", "\u200BIngenier\u00EDa Electr\u00F3nica", "\u200BIngenier\u00EDa Telem\u00E1tica", "\u200BIngenier\u00EDa en Mecatr\u00F3nica\u200B\u200B", "\u200BMedicina", "\u200BMercadotecnia", "Nutrici\u00F3n y Diet\u00E9tica", "\u200B\u200BPsicolog\u00EDa", "\u200BTerapia F\u00EDsica\u200B"}));
		cbxCarreraUni.setBackground(new Color(211, 211, 211));
		cbxCarreraUni.setBounds(86, 42, 222, 20);
		pUniversitario.add(cbxCarreraUni);
		
		JPanel pTecnico = new JPanel();
		pTecnico.setBackground(new Color(255, 255, 255));
		pTecnico.setBounds(10, 64, 318, 73);
		panel_4.add(pTecnico);
		pTecnico.setLayout(null);
		
		JLabel lblTecnico = new JLabel("Tecnico:");
		lblTecnico.setBounds(10, 27, 61, 16);
		pTecnico.add(lblTecnico);
		
		cbxTecnico = new JComboBox();
		cbxTecnico.setBackground(new Color(211, 211, 211));
		cbxTecnico.setBounds(86, 25, 222, 20);
		pTecnico.add(cbxTecnico);
		
		JLabel label = new JLabel("Nivel educativo:");
		label.setFont(new Font("Dialog", Font.BOLD, 13));
		label.setBounds(92, 11, 115, 16);
		panel_4.add(label);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(92, 25, 109, 12);
		panel_4.add(separator_4);
		
		btnUniversitario = new JRadioButton("Universitario");
		btnGroupNivelEducativo.add(btnUniversitario);
		btnUniversitario.setBackground(Color.WHITE);
		btnUniversitario.setBounds(21, 34, 115, 23);
		panel_4.add(btnUniversitario);
		
		btnTecnico = new JRadioButton("Tecnico");
		btnGroupNivelEducativo.add(btnTecnico);
		btnTecnico.setBackground(Color.WHITE);
		btnTecnico.setBounds(138, 34, 93, 23);
		panel_4.add(btnTecnico);
		
		btnObrero = new JRadioButton("Obrero");
		btnGroupNivelEducativo.add(btnObrero);
		btnObrero.setBackground(Color.WHITE);
		btnObrero.setBounds(233, 34, 76, 23);
		panel_4.add(btnObrero);
		
		JPanel pObrero = new JPanel();
		pObrero.setBackground(new Color(255, 255, 255));
		pObrero.setBounds(10, 64, 318, 73);
		panel_4.add(pObrero);
		pObrero.setLayout(null);
		
		JLabel label_1 = new JLabel("Habilidad:");
		label_1.setBounds(6, 17, 71, 16);
		pObrero.add(label_1);
		
		cbxHabilidad = new JComboBox();
		cbxHabilidad.setBackground(new Color(211, 211, 211));
		cbxHabilidad.setBounds(82, 11, 226, 20);
		pObrero.add(cbxHabilidad);
		
		JCheckBox chbOtroObrero = new JCheckBox("Otro?");
		chbOtroObrero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chbOtroObrero.isSelected())
					cbxHabilidad2.setEnabled(true);
				else
					cbxHabilidad2.setEnabled(false);
			}
		});
		chbOtroObrero.setBackground(Color.WHITE);
		chbOtroObrero.setBounds(6, 44, 63, 23);
		pObrero.add(chbOtroObrero);
		
		cbxHabilidad2 = new JComboBox();
		cbxHabilidad2.setEnabled(false);
		cbxHabilidad2.setBackground(new Color(211, 211, 211));
		cbxHabilidad2.setBounds(82, 42, 226, 20);
		pObrero.add(cbxHabilidad2);
		{
			JPanel panelinfo = new JPanel();
			panelinfo.setBounds(313, 11, 329, 148);
			panel_principal.add(panelinfo);
			panelinfo.setBackground(new Color(255, 255, 255));
			panelinfo.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelinfo.setLayout(null);
			
			btnMasculino = new JRadioButton("Masculino");
			btnGroupSexo.add(btnMasculino);
			btnMasculino.setBackground(new Color(255, 255, 255));
			btnMasculino.setBounds(181, 25, 85, 23);
			panelinfo.add(btnMasculino);
			
			btnFemenino = new JRadioButton("Femenino");
			btnGroupSexo.add(btnFemenino);
			btnFemenino.setBackground(new Color(255, 255, 255));
			btnFemenino.setBounds(100, 25, 85, 23);
			panelinfo.add(btnFemenino);
			
			JLabel label_7_1 = new JLabel("Sexo:");
			label_7_1.setBounds(10, 25, 46, 14);
			panelinfo.add(label_7_1);
			
			btnNoAplica = new JRadioButton("N/A");
			btnGroupSexo.add(btnNoAplica);
			btnNoAplica.setBackground(new Color(255, 255, 255));
			btnNoAplica.setBounds(268, 25, 55, 23);
			panelinfo.add(btnNoAplica);
			
			JLabel label_12 = new JLabel("Cuidad:");
			label_12.setBounds(10, 53, 46, 14);
			panelinfo.add(label_12);
			
			cbxCuidadSolicitada = new JComboBox();
			cbxCuidadSolicitada.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
			cbxCuidadSolicitada.setBackground(new Color(211, 211, 211));
			cbxCuidadSolicitada.setBounds(104, 51, 207, 20);
			panelinfo.add(cbxCuidadSolicitada);
			
			JLabel label_1_1 = new JLabel("Pais:");
			label_1_1.setBounds(10, 82, 46, 14);
			panelinfo.add(label_1_1);
			
			cbxPais = new JComboBox();
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
			cbxPais.setBackground(new Color(211, 211, 211));
			cbxPais.setBounds(104, 80, 207, 20);
			panelinfo.add(cbxPais);
			
			JLabel label_2_1 = new JLabel("Estado Civil:");
			label_2_1.setBounds(10, 107, 101, 16);
			panelinfo.add(label_2_1);
			
			cbxEstadoCivil = new JComboBox();
			cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Soltero", "Casado", "Viudo", "Divorciado", "Union Libre"}));
			cbxEstadoCivil.setBackground(new Color(211, 211, 211));
			cbxEstadoCivil.setBounds(104, 107, 207, 20);
			panelinfo.add(cbxEstadoCivil);
		}
		
		JPanel panellaborlal = new JPanel();
		panellaborlal.setBounds(5, 164, 290, 154);
		panel_principal.add(panellaborlal);
		panellaborlal.setBackground(new Color(255, 255, 255));
		panellaborlal.setLayout(null);
		panellaborlal.setBorder(new TitledBorder(null, "Experiencia Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel label_2 = new JLabel("Area de Trabajo:");
		label_2.setBounds(10, 36, 110, 16);
		panellaborlal.add(label_2);
		
		cbxAreaTrabajo = new JComboBox();
		cbxAreaTrabajo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
		cbxAreaTrabajo.setBackground(new Color(211, 211, 211));
		cbxAreaTrabajo.setBounds(127, 34, 142, 20);
		panellaborlal.add(cbxAreaTrabajo);
		
		JLabel label_5 = new JLabel("Tiempo de experiencia:");
		label_5.setBounds(10, 76, 134, 14);
		panellaborlal.add(label_5);
		
		snpTiempoExp = new JSpinner();
		snpTiempoExp.setModel(new SpinnerNumberModel(1, 1, 50, 1));
		snpTiempoExp.setBounds(159, 73, 110, 20);
		panellaborlal.add(snpTiempoExp);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 47, 677, 108);
		contentPanel.add(panel_2);
		
		JLabel lblIngreseRnc = new JLabel("Ingrese el RNC :");
		lblIngreseRnc.setBackground(new Color(255, 255, 255));
		lblIngreseRnc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIngreseRnc.setBounds(10, 11, 191, 28);
		panel_2.add(lblIngreseRnc);
		
		txtRNC = new JFormattedTextField(formatoRNC);
		txtRNC.setForeground(new Color(0, 0, 0));
		txtRNC.setColumns(10);
		txtRNC.setBackground(new Color(211, 211, 211));
		txtRNC.setBounds(164, 18, 158, 20);
		panel_2.add(txtRNC);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtRNC.getText().toString().equalsIgnoreCase("")||Bolsa.buscarEmpresa(txtRNC.getText().toString())==null){
					JOptionPane.showMessageDialog(null, "No se ha encontrado la empresa", "Información", JOptionPane.WARNING_MESSAGE);
				}
				else{
				miEmpresa = Bolsa.buscarEmpresa(txtRNC.getText().toString());
				txtnombreEmpresa.setText(miEmpresa.getNombreEmpresa());
				txtciudadEmpresa.setText(miEmpresa.getCiudad());
				txttelefonoEmpresa.setText(miEmpresa.getTelefonoEmpresa());
				txtAreaEmpresa.setText(miEmpresa.getAreaTrabajo());
				
				
			
				
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setActionCommand("OK");
		btnBuscar.setBounds(218, 42, 104, 27);
		panel_2.add(btnBuscar);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(360, 20, 68, 14);
		panel_2.add(lblNewLabel);
		
		txtnombreEmpresa = new JTextField();
		txtnombreEmpresa.setEditable(false);
		txtnombreEmpresa.setForeground(new Color(0, 0, 0));
		txtnombreEmpresa.setBackground(new Color(211, 211, 211));
		txtnombreEmpresa.setBounds(438, 18, 177, 20);
		panel_2.add(txtnombreEmpresa);
		txtnombreEmpresa.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefono:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(360, 75, 81, 14);
		panel_2.add(lblNewLabel_1);
		
		txtciudadEmpresa = new JTextField();
		txtciudadEmpresa.setEditable(false);
		txtciudadEmpresa.setForeground(new Color(0, 0, 0));
		txtciudadEmpresa.setBackground(new Color(211, 211, 211));
		txtciudadEmpresa.setBounds(438, 45, 177, 20);
		panel_2.add(txtciudadEmpresa);
		txtciudadEmpresa.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ciudad:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(360, 49, 93, 14);
		panel_2.add(lblNewLabel_2);
		
		txttelefonoEmpresa = new JFormattedTextField();
		txttelefonoEmpresa.setEditable(false);
		txttelefonoEmpresa.setForeground(Color.BLACK);
		txttelefonoEmpresa.setColumns(10);
		txttelefonoEmpresa.setBackground(new Color(211, 211, 211));
		txttelefonoEmpresa.setBounds(438, 73, 177, 20);
		panel_2.add(txttelefonoEmpresa);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(220, 20, 60));
		panel_3.setBounds(0, 0, 677, 48);
		contentPanel.add(panel_3);
		
		JLabel lblIngresarSolicitud = new JLabel("Ingresar solicitud");
		lblIngresarSolicitud.setForeground(Color.WHITE);
		lblIngresarSolicitud.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblIngresarSolicitud.setBounds(234, 0, 316, 46);
		panel_3.add(lblIngresarSolicitud);
		
		JLabel label_12 = new JLabel("Fecha de Solicitud:");
		label_12.setBounds(356, 171, 123, 16);
		contentPanel.add(label_12);
		
		txtFecha = new JTextField();
		txtFecha.setText("  "+LocalDate.now().toString());
		txtFecha.setEditable(false);
		txtFecha.setColumns(10);
		txtFecha.setBounds(470, 166, 146, 26);
		contentPanel.add(txtFecha);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btncancel = new JButton("Cancel");
				btncancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				
				btnPag = new JButton("Pagina Anterior <");
				btnPag.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel_principal.setVisible(true);
						panel_secundario.setVisible(false);
						btnPag.setEnabled(false);
						btnPag_1.setEnabled(true);
					}
				});
				btnPag.setEnabled(false);
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
				btncancel.setActionCommand("Cancel");
				buttonPane.add(btncancel);
			}
		}
	}
}
