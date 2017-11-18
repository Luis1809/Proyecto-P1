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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 414, 206);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblGradoAcademico = new JLabel("Grado Academico:");
				lblGradoAcademico.setBounds(10, 21, 106, 14);
				panel.add(lblGradoAcademico);
			}
			{
				JComboBox cbxGradoAcademico = new JComboBox();
				cbxGradoAcademico.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Universitario", "Tecnico", "Obrero"}));
				cbxGradoAcademico.setBounds(126, 18, 103, 20);
				panel.add(cbxGradoAcademico);
			}
			{
				JLabel lblSexo = new JLabel("Sexo:");
				lblSexo.setBounds(246, 21, 46, 14);
				panel.add(lblSexo);
			}
			{
				JComboBox cbxSexo = new JComboBox();
				cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Mujer", "Hombre"}));
				cbxSexo.setBounds(302, 18, 102, 20);
				panel.add(cbxSexo);
			}
			{
				JLabel lblAreaDeInteres = new JLabel("Area de interes:");
				lblAreaDeInteres.setBounds(10, 52, 95, 14);
				panel.add(lblAreaDeInteres);
			}
			{
				JComboBox cbxAreaDeInteres = new JComboBox();
				cbxAreaDeInteres.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicacion", "Publicidad", "Construccion", "Technologia", "Agricultura"}));
				cbxAreaDeInteres.setBounds(126, 49, 103, 20);
				panel.add(cbxAreaDeInteres);
			}
			{
				JLabel lblPais = new JLabel("Pais:");
				lblPais.setBounds(246, 52, 46, 14);
				panel.add(lblPais);
			}
			{
				JComboBox cbxPais = new JComboBox();
				cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Afganist\u00E1n", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiy\u00E1n", "Bahamas", "Banglad\u00E9s", "Barbados", "Bar\u00E9in", "B\u00E9lgica", "Belice", "Ben\u00EDn", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brun\u00E9i", "Bulgaria", "Burkina Faso", "Burundi", "But\u00E1n", "Cabo Verde", "Camboya", "Camer\u00FAn", "Canad\u00E1", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos \u00C1rabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "Espa\u00F1a", "Estados Unidos", "Estonia", "Etiop\u00EDa", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gab\u00F3n", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bis\u00E1u", "Hait\u00ED", "Honduras", "Hungr\u00EDa", "India", "Indonesia", "Irak", "Ir\u00E1n", "Irlanda", "Islandia", "Islas Marshall", "Islas Salom\u00F3n", "Israel", "Italia", "Jamaica", "Jap\u00F3n", "Jordania", "Kazajist\u00E1n", "Kenia", "Kirguist\u00E1n", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "L\u00EDbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Mal\u00ED", "Malta", "Marruecos", "Mauricio", "Mauritania", "M\u00E9xico", "Micronesia", "Moldavia", "M\u00F3naco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "N\u00EDger", "Nigeria", "Noruega", "Nueva Zelanda", "Om\u00E1n", "Pa\u00EDses Bajos", "Pakist\u00E1n", "Palaos", "Panam\u00E1", "Pap\u00FAa Nueva Guinea", "Paraguay", "Per\u00FA", "Polonia", "Portugal", "Reino Unido", "Rep\u00FAblica Centroafricana", "Rep\u00FAblica Checa", "Rep\u00FAblica de Macedonia", "Rep\u00FAblica del Congo", "Rep\u00FAblica Democr\u00E1tica del Congo", "Rep\u00FAblica Dominicana", "Rep\u00FAblica Sudafricana", "Ruanda", "Ruman\u00EDa", "Rusia", "Samoa", "San Crist\u00F3bal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Luc\u00EDa", "Santo Tom\u00E9 y Pr\u00EDncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sud\u00E1n", "Sud\u00E1n del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikist\u00E1n", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "T\u00FAnez", "Turkmenist\u00E1n", "Turqu\u00EDa", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekist\u00E1n", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"}));
				cbxPais.setBounds(302, 49, 102, 20);
				panel.add(cbxPais);
			}
			
			JLabel lblIdioma = new JLabel("Idioma:");
			lblIdioma.setBounds(246, 81, 66, 14);
			panel.add(lblIdioma);
			
			JComboBox cbxIdioma = new JComboBox();
			cbxIdioma.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Espanol", "Ingles", "Frances"}));
			cbxIdioma.setBounds(302, 76, 102, 20);
			panel.add(cbxIdioma);
			
			JLabel lblJornada = new JLabel("Jornada laboral:");
			lblJornada.setBounds(10, 81, 95, 14);
			panel.add(lblJornada);
			
			JComboBox cbxJornada = new JComboBox();
			cbxJornada.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Medio Tiempo", "Tiempo completo"}));
			cbxJornada.setBounds(126, 80, 103, 20);
			panel.add(cbxJornada);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(10, 112, 394, 83);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblConducir = new JLabel("Licencia de conducir:");
			lblConducir.setBounds(61, 12, 125, 14);
			panel_1.add(lblConducir);
			
			JLabel lblViajar = new JLabel("Disponiblidad de viajar:");
			lblViajar.setBounds(61, 37, 141, 14);
			panel_1.add(lblViajar);
			
			JLabel lblMudarse = new JLabel("Disponibilidad de mudarse:");
			lblMudarse.setBounds(61, 64, 165, 14);
			panel_1.add(lblMudarse);
			
			JCheckBox checkMudarse = new JCheckBox("Si");
			checkMudarse.setBounds(243, 60, 97, 23);
			panel_1.add(checkMudarse);
			
			JCheckBox checkViajar = new JCheckBox("Si");
			checkViajar.setBounds(243, 33, 97, 23);
			panel_1.add(checkViajar);
			
			JCheckBox checkLicencia = new JCheckBox("Si");
			checkLicencia.setBounds(243, 7, 97, 23);
			panel_1.add(checkLicencia);
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
