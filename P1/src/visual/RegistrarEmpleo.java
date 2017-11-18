package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class RegistrarEmpleo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarEmpleo dialog = new RegistrarEmpleo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarEmpleo() {
		setTitle("Registrar Empleo");
		setBounds(100, 100, 651, 520);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 615, 426);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JPanel panelObrero = new JPanel();
			panelObrero.setBounds(76, 159, 464, 142);
			panel.add(panelObrero);
			panelObrero.setLayout(null);
			
			JLabel lblHabilidad = new JLabel("Habilidad:");
			lblHabilidad.setBounds(195, 39, 66, 14);
			panelObrero.add(lblHabilidad);
			
			JComboBox cbxHsbilidad = new JComboBox();
			cbxHsbilidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Maestro Constructor", "Partero"}));
			cbxHsbilidad.setBounds(173, 64, 110, 20);
			panelObrero.add(cbxHsbilidad);
			
			JPanel panelTecnico = new JPanel();
			panelTecnico.setBounds(76, 159, 464, 142);
			panel.add(panelTecnico);
			panelTecnico.setLayout(null);
			
			JLabel lblGradoTecnico = new JLabel("Grado Tecnico:");
			lblGradoTecnico.setBounds(184, 11, 90, 14);
			panelTecnico.add(lblGradoTecnico);
			
			JLabel lblInstitucion_1 = new JLabel("Institucion:");
			lblInstitucion_1.setBounds(195, 67, 90, 14);
			panelTecnico.add(lblInstitucion_1);
			
			JComboBox cbxGradoTecnico = new JComboBox();
			cbxGradoTecnico.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Administraci\u00F3n de Empresa\u200B", "Concentraciones:", "Operaciones", "Finanzas", "Estrategia", "Creaci\u00F3n y Desarrollo de Nuevos Negocios", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "Concentraciones:", "\u200BAlimentos y Bebidas", "Mercadeo Hotelero\u200B\u200B", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "Concentraciones\u200B:\u200B\u200B", "Producci\u00F3n Audiovisual", "Comunicaci\u00F3n Corporativa", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "Orientaciones:", "El\u00E9ctrica"}));
			cbxGradoTecnico.setBounds(174, 36, 111, 20);
			panelTecnico.add(cbxGradoTecnico);
			
			JComboBox cbxInstitucionTecnico = new JComboBox();
			cbxInstitucionTecnico.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", " Universidad Aut\u00F3noma de Santo Domingo (UASD)", " Facultad Latinoamericana de Cs. Soc. (FLACSO)", " Barna Business School", " Universidad Nacional Tecnol\u00F3gica (UNNATEC)", " Pontificia Universidad Cat\u00F3lica Madre y Maestra (PUCMM)", " Universidad Abierta Para Adultos (UAPA)", " Universidad APEC (UNAPEC)", " Universidad Cat\u00F3lica de Santo Domingo (UCSD)", " Instituto Nacional de Ciencias Exactas (INCE)", " Instituto Superior de Tecnolog\u00EDa Universal (INSUTEC)", " Instituto T\u00E9cnico Superior Oscus San Valero", " Instituto Tecnol\u00F3gico de las Am\u00E9ricas (ITLA)", " Instituto Tecnol\u00F3gico de Santo Domingo (INTEC)", "Universidad Central del Este (UCE)", "Universidad Central Dominicana de Est. Prof. (UCDEP)", "Universidad del Caribe", "Universidad del I. Cultural Dom\u00EDnico-Americano (ICDA)", "Universidad Dominicana Org. y M\u00E9todo (UDOYM)", "Universidad Eugenio Maria de Hostos (UNIREMHOS)", "Universidad Experimental F\u00E9lix Adam (UNEFA)", "Universidad Federico Henr\u00EDquez y Carvajal (UFHEC) ", "Universidad Iberoamericana (UNIBE)", "Universidad Interamericana (UNICA)", "Universidad Nacional Evang\u00E9lica (UNEV)", "Universidad Nacional Pedro Henr\u00EDquez Ure\u00F1a (UNPHU)", "Universidad Odontol\u00F3gica Dominicana (UOD)", "Universidad Psicolog\u00EDa Ind. Dominicana (UPID)", "Universidad Tecnol\u00F3gica de Santiago (UTESA)"}));
			cbxInstitucionTecnico.setBounds(174, 97, 111, 20);
			panelTecnico.add(cbxInstitucionTecnico);
			{
				JLabel lblGradoAcademico = new JLabel("Grado Academico:");
				lblGradoAcademico.setBounds(76, 107, 106, 14);
				panel.add(lblGradoAcademico);
			}
			{
				JComboBox cbxGradoAcademico = new JComboBox();
				cbxGradoAcademico.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Universitario", "Tecnico", "Obrero"}));
				cbxGradoAcademico.setBounds(192, 104, 134, 20);
				panel.add(cbxGradoAcademico);
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(107, 312, 394, 103);
			panel.add(panel_1);
			
			JLabel label = new JLabel("Licencia de conducir:");
			label.setBounds(61, 12, 125, 14);
			panel_1.add(label);
			
			JLabel label_1 = new JLabel("Disponiblidad de viajar:");
			label_1.setBounds(61, 37, 141, 14);
			panel_1.add(label_1);
			
			JLabel label_2 = new JLabel("Disponibilidad de mudarse:");
			label_2.setBounds(61, 64, 165, 14);
			panel_1.add(label_2);
			
			JCheckBox chkDisponibilidadDeMudarse = new JCheckBox("Si");
			chkDisponibilidadDeMudarse.setBounds(243, 60, 97, 23);
			panel_1.add(chkDisponibilidadDeMudarse);
			
			JCheckBox chkDisponibilidadDeViajar = new JCheckBox("Si");
			chkDisponibilidadDeViajar.setBounds(243, 33, 97, 23);
			panel_1.add(chkDisponibilidadDeViajar);
			
			JCheckBox chkLicenciaDeConducir = new JCheckBox("Si");
			chkLicenciaDeConducir.setBounds(243, 8, 97, 23);
			panel_1.add(chkLicenciaDeConducir);
			
			JLabel label_3 = new JLabel("Jornada laboral:");
			label_3.setBounds(76, 82, 95, 14);
			panel.add(label_3);
			
			JComboBox cbxJornadaLaboral = new JComboBox();
			cbxJornadaLaboral.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Medio Tiempo", "Tiempo Completo"}));
			cbxJornadaLaboral.setBounds(192, 73, 134, 20);
			panel.add(cbxJornadaLaboral);
			
			JComboBox cbxAreaDeInteres = new JComboBox();
			cbxAreaDeInteres.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
			cbxAreaDeInteres.setBounds(192, 42, 134, 20);
			panel.add(cbxAreaDeInteres);
			
			JLabel label_4 = new JLabel("Pais:");
			label_4.setBounds(343, 45, 46, 14);
			panel.add(label_4);
			
			JLabel label_5 = new JLabel("Idioma:");
			label_5.setBounds(343, 74, 66, 14);
			panel.add(label_5);
			
			JComboBox cbxIdioma = new JComboBox();
			cbxIdioma.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Espanol", "Ingles", "frances"}));
			cbxIdioma.setBounds(399, 69, 141, 20);
			panel.add(cbxIdioma);
			
			JComboBox cbxPais = new JComboBox();
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Afganist\u00E1n", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiy\u00E1n", "Bahamas", "Banglad\u00E9s", "Barbados", "Bar\u00E9in", "B\u00E9lgica", "Belice", "Ben\u00EDn", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brun\u00E9i", "Bulgaria", "Burkina Faso", "Burundi", "But\u00E1n", "Cabo Verde", "Camboya", "Camer\u00FAn", "Canad\u00E1", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos \u00C1rabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "Espa\u00F1a", "Estados Unidos", "Estonia", "Etiop\u00EDa", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gab\u00F3n", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bis\u00E1u", "Hait\u00ED", "Honduras", "Hungr\u00EDa", "India", "Indonesia", "Irak", "Ir\u00E1n", "Irlanda", "Islandia", "Islas Marshall", "Islas Salom\u00F3n", "Israel", "Italia", "Jamaica", "Jap\u00F3n", "Jordania", "Kazajist\u00E1n", "Kenia", "Kirguist\u00E1n", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "L\u00EDbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Mal\u00ED", "Malta", "Marruecos", "Mauricio", "Mauritania", "M\u00E9xico", "Micronesia", "Moldavia", "M\u00F3naco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "N\u00EDger", "Nigeria", "Noruega", "Nueva Zelanda", "Om\u00E1n", "Pa\u00EDses Bajos", "Pakist\u00E1n", "Palaos", "Panam\u00E1", "Pap\u00FAa Nueva Guinea", "Paraguay", "Per\u00FA", "Polonia", "Portugal", "Reino Unido", "Rep\u00FAblica Centroafricana", "Rep\u00FAblica Checa", "Rep\u00FAblica de Macedonia", "Rep\u00FAblica del Congo", "Rep\u00FAblica Democr\u00E1tica del Congo", "Rep\u00FAblica Dominicana", "Rep\u00FAblica Sudafricana", "Ruanda", "Ruman\u00EDa", "Rusia", "Samoa", "San Crist\u00F3bal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Luc\u00EDa", "Santo Tom\u00E9 y Pr\u00EDncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sud\u00E1n", "Sud\u00E1n del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikist\u00E1n", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "T\u00FAnez", "Turkmenist\u00E1n", "Turqu\u00EDa", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekist\u00E1n", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"}));
			cbxPais.setBounds(399, 42, 141, 20);
			panel.add(cbxPais);
			
			JLabel label_6 = new JLabel("Area de interes:");
			label_6.setBounds(76, 45, 95, 14);
			panel.add(label_6);
			
			JRadioButton radioButton = new JRadioButton("Hombre");
			radioButton.setBounds(344, 12, 109, 23);
			panel.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("Mujer");
			radioButton_1.setBounds(232, 12, 109, 23);
			panel.add(radioButton_1);
			
			JLabel label_7 = new JLabel("Sexo:");
			label_7.setBounds(168, 17, 46, 14);
			panel.add(label_7);
			
			JPanel panelUniversitario = new JPanel();
			panelUniversitario.setBorder(new LineBorder(new Color(0, 0, 0)));
			panelUniversitario.setBounds(76, 159, 464, 142);
			panel.add(panelUniversitario);
			panelUniversitario.setLayout(null);
			
			JLabel lblInstitucionUniversitario = new JLabel("Institucion:");
			lblInstitucionUniversitario.setBounds(188, 75, 67, 14);
			panelUniversitario.add(lblInstitucionUniversitario);
			
			JLabel lblCarreraUniversitario = new JLabel("Carrera:");
			lblCarreraUniversitario.setBounds(198, 11, 57, 14);
			panelUniversitario.add(lblCarreraUniversitario);
			
			JComboBox cbxCarreraUniversitario = new JComboBox();
			cbxCarreraUniversitario.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Administraci\u00F3n de Empresa\u200B", "Concentraciones:", "Operaciones", "Finanzas", "Estrategia", "Creaci\u00F3n y Desarrollo de Nuevos Negocios", "Gesti\u00F3n Humana", "Negocios Internacionales", "Administraci\u00F3n Hotelera", "Concentraciones:", "\u200BAlimentos y Bebidas", "Mercadeo Hotelero\u200B\u200B", "\u200BArquitectura", "\u200BComunicaci\u00F3n Social", "Concentraciones\u200B:\u200B\u200B", "Producci\u00F3n Audiovisual", "Comunicaci\u00F3n Corporativa", "\u200BDerecho", "Dise\u00F1o e Interiorismo\u200B\u200B", "\u200BEcolog\u00EDa y Gesti\u00F3n Ambiental\u200B", "\u200BEconom\u00EDa", "\u200BEducaci\u00F3n", "\u200BEnfermer\u00EDa\u200B", "\u200B\u200BEstomatolog\u00EDa\u200B", "Filosof\u00EDa\u200B", "\u200BGesti\u00F3n Financiera y Auditor\u00EDa", "\u200BIngenier\u00EDa Civil", "\u200BIngenier\u00EDa Electromec\u00E1nica", "Orientaciones:", "El\u00E9ctrica", "Mec\u00E1nica\u200B", "\u200BIngenier\u00EDa Industrial", "\u200BIngenier\u00EDa de Sistemas y Computaci\u00F3n", "\u200BIngenier\u00EDa Electr\u00F3nica", "\u200BIngenier\u00EDa Telem\u00E1tica", "\u200BIngenier\u00EDa en Mecatr\u00F3nica\u200B\u200B", "\u200BMedicina", "\u200BMercadotecnia", "Nutrici\u00F3n y Diet\u00E9tica", "\u200B\u200BPsicolog\u00EDa", "\u200BTerapia F\u00EDsica\u200B"}));
			cbxCarreraUniversitario.setBounds(164, 38, 115, 20);
			panelUniversitario.add(cbxCarreraUniversitario);
			
			JComboBox cbxInstitucionUniversitario = new JComboBox();
			cbxInstitucionUniversitario.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", " Universidad Aut\u00F3noma de Santo Domingo (UASD)", " Facultad Latinoamericana de Cs. Soc. (FLACSO)", " Barna Business School", " Universidad Nacional Tecnol\u00F3gica (UNNATEC)", " Pontificia Universidad Cat\u00F3lica Madre y Maestra (PUCMM)", " Universidad Abierta Para Adultos (UAPA)", " Universidad APEC (UNAPEC)", " Universidad Cat\u00F3lica de Santo Domingo (UCSD)", " Instituto Nacional de Ciencias Exactas (INCE)", " Instituto Superior de Tecnolog\u00EDa Universal (INSUTEC)", " Instituto T\u00E9cnico Superior Oscus San Valero", " Instituto Tecnol\u00F3gico de las Am\u00E9ricas (ITLA)", " Instituto Tecnol\u00F3gico de Santo Domingo (INTEC)", "Universidad Central del Este (UCE)", "Universidad Central Dominicana de Est. Prof. (UCDEP)", "Universidad del Caribe", "Universidad del I. Cultural Dom\u00EDnico-Americano (ICDA)", "Universidad Dominicana Org. y M\u00E9todo (UDOYM)", "Universidad Eugenio Maria de Hostos (UNIREMHOS)", "Universidad Experimental F\u00E9lix Adam (UNEFA)", "Universidad Federico Henr\u00EDquez y Carvajal (UFHEC) ", "Universidad Iberoamericana (UNIBE)", "Universidad Interamericana (UNICA)", "Universidad Nacional Evang\u00E9lica (UNEV)", "Universidad Nacional Pedro Henr\u00EDquez Ure\u00F1a (UNPHU)", "Universidad Odontol\u00F3gica Dominicana (UOD)", "Universidad Psicolog\u00EDa Ind. Dominicana (UPID)", "Universidad Tecnol\u00F3gica de Santiago (UTESA)"}));
			cbxInstitucionUniversitario.setBounds(164, 100, 115, 20);
			panelUniversitario.add(cbxInstitucionUniversitario);
			
			JLabel lblDeseaAgregarUn = new JLabel("Desea agregar un nuevo idioma:");
			lblDeseaAgregarUn.setBounds(343, 107, 197, 14);
			panel.add(lblDeseaAgregarUn);
			
			JCheckBox chkDeseaAgregarNuevoIdioma = new JCheckBox("Si");
			chkDeseaAgregarNuevoIdioma.setBounds(338, 128, 46, 23);
			panel.add(chkDeseaAgregarNuevoIdioma);
			
			JComboBox cbxSegundoIdioma = new JComboBox();
			cbxSegundoIdioma.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Espanol", "Ingles", "frances"}));
			cbxSegundoIdioma.setBounds(399, 132, 141, 20);
			panel.add(cbxSegundoIdioma);
		}
		{
			JPanel buttonPane = new JPanel();
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
				btncancel.setActionCommand("Cancel");
				buttonPane.add(btncancel);
			}
		}
	}
}
