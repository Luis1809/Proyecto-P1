package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Solicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Solicitudes dialog = new Solicitudes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Solicitudes() {
		setResizable(false);
		setBounds(100, 100, 604, 632);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombres:");
			lblNombre.setBounds(6, 41, 61, 16);
			panel.add(lblNombre);
			
			textField = new JTextField();
			textField.setBounds(79, 36, 506, 26);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(439, 6, 146, 26);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblFecha = new JLabel("Fecha de Solicitud:");
			lblFecha.setBounds(318, 11, 123, 16);
			panel.add(lblFecha);
			
			JLabel lblApellido = new JLabel("Apellidos:");
			lblApellido.setBounds(6, 82, 73, 16);
			panel.add(lblApellido);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(79, 77, 506, 26);
			panel.add(textField_2);
			
			JLabel lblCedula = new JLabel("Cedula:");
			lblCedula.setBounds(6, 124, 61, 16);
			panel.add(lblCedula);
			
			textField_3 = new JTextField();
			textField_3.setBounds(79, 119, 208, 26);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(316, 124, 61, 16);
			panel.add(lblTelefono);
			
			textField_4 = new JTextField();
			textField_4.setBounds(393, 119, 192, 26);
			panel.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblSexo = new JLabel("Sexo:");
			lblSexo.setBounds(6, 169, 61, 16);
			panel.add(lblSexo);
			
			JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
			rdbtnMasculino.setBounds(79, 165, 103, 23);
			panel.add(rdbtnMasculino);
			
			JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
			rdbtnFemenino.setBounds(194, 165, 103, 23);
			panel.add(rdbtnFemenino);
			
			JLabel lblEstadoCivil = new JLabel("Estado Civil:");
			lblEstadoCivil.setBounds(316, 169, 84, 16);
			panel.add(lblEstadoCivil);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(393, 164, 192, 26);
			panel.add(textField_5);
			
			JLabel lblNacimiento = new JLabel("Nacimiento:");
			lblNacimiento.setBounds(6, 211, 84, 16);
			panel.add(lblNacimiento);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(79, 206, 208, 26);
			panel.add(textField_6);
			
			JLabel lblPais = new JLabel("Pais:");
			lblPais.setBounds(318, 211, 61, 16);
			panel.add(lblPais);
			
			textField_7 = new JTextField();
			textField_7.setBounds(393, 202, 192, 26);
			panel.add(textField_7);
			textField_7.setColumns(10);
			
			JLabel lblDisponibilidadDeMudarse = new JLabel("Disponibilidad de Mudarse:");
			lblDisponibilidadDeMudarse.setBounds(6, 256, 176, 16);
			panel.add(lblDisponibilidadDeMudarse);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(6, 270, 173, 12);
			panel.add(separator);
			
			JLabel lblJornada = new JLabel("Tipo de Jornada:");
			lblJornada.setBounds(318, 322, 148, 16);
			panel.add(lblJornada);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(318, 336, 103, 12);
			panel.add(separator_1);
			
			JRadioButton rdbtnSi = new JRadioButton("Si");
			rdbtnSi.setBounds(79, 284, 54, 23);
			panel.add(rdbtnSi);
			
			JRadioButton rdbtnNo = new JRadioButton("No");
			rdbtnNo.setBounds(194, 285, 54, 23);
			panel.add(rdbtnNo);
			
			JRadioButton rdbtnMedioTiempo = new JRadioButton("Medio Tiempo");
			rdbtnMedioTiempo.setBounds(318, 350, 123, 23);
			panel.add(rdbtnMedioTiempo);
			
			JRadioButton rdbtnTiempoCompleto = new JRadioButton("Tiempo Completo");
			rdbtnTiempoCompleto.setBounds(439, 350, 176, 23);
			panel.add(rdbtnTiempoCompleto);
			
			JLabel lblLicenciaDeConducior = new JLabel("Licencia de conducir:");
			lblLicenciaDeConducior.setBounds(6, 322, 160, 16);
			panel.add(lblLicenciaDeConducior);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBounds(6, 336, 134, 12);
			panel.add(separator_2);
			
			JRadioButton radioButton = new JRadioButton("Si");
			radioButton.setBounds(79, 350, 54, 23);
			panel.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("No");
			radioButton_1.setBounds(194, 350, 54, 23);
			panel.add(radioButton_1);
			
			JLabel lblExperienciaLaboral = new JLabel("Experiencia Laboral:");
			lblExperienciaLaboral.setBounds(6, 383, 134, 16);
			panel.add(lblExperienciaLaboral);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(6, 396, 134, 12);
			panel.add(separator_3);
			
			JLabel label = new JLabel("Nombres:");
			label.setBounds(6, 430, 61, 16);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Apellidos:");
			label_1.setBounds(6, 465, 73, 16);
			panel.add(label_1);
			
			JLabel lblNombresDeReferente = new JLabel("Referente:");
			lblNombresDeReferente.setBounds(6, 498, 146, 16);
			panel.add(lblNombresDeReferente);
			
			JLabel lblTelefono_1 = new JLabel("Telefono:");
			lblTelefono_1.setBounds(6, 531, 61, 16);
			panel.add(lblTelefono_1);
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(79, 425, 506, 26);
			panel.add(textField_8);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(79, 460, 506, 26);
			panel.add(textField_9);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(79, 493, 506, 26);
			panel.add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(79, 526, 506, 26);
			panel.add(textField_11);
			
			JLabel lblIdioma = new JLabel("Idioma:");
			lblIdioma.setBounds(318, 256, 61, 16);
			panel.add(lblIdioma);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(393, 251, 192, 26);
			panel.add(comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
