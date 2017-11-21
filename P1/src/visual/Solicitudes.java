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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;

public class Solicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFechaSolicitud;
	
	ButtonGroup sexo =new ButtonGroup();
	ButtonGroup mudarse =new ButtonGroup();
	ButtonGroup conducir =new ButtonGroup();
	ButtonGroup jornada =new ButtonGroup();
	ButtonGroup nivelEducativo =new ButtonGroup();
	
	//_____Solicitante_______________________//
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
    private String telReferente;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_4;
    private JTextField textField_12;
    
   
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
		setBounds(100, 100, 1045, 696);
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
			txtFechaSolicitud.setBounds(860, 6, 146, 26);
			panel.add(txtFechaSolicitud);
			txtFechaSolicitud.setColumns(10);
			
			JLabel lblFecha = new JLabel("Fecha de Solicitud:");
			lblFecha.setBounds(727, 11, 123, 16);
			panel.add(lblFecha);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(368, 43, 582, 234);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JLabel label_1 = new JLabel("Nombres:");
			label_1.setBounds(30, 30, 61, 16);
			panel_2.add(label_1);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(101, 28, 464, 20);
			panel_2.add(textField);
			
			JLabel label_2 = new JLabel("Apellidos:");
			label_2.setBounds(30, 57, 73, 16);
			panel_2.add(label_2);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(101, 55, 464, 20);
			panel_2.add(textField_1);
			
			JLabel label_3 = new JLabel("Cedula:");
			label_3.setBounds(30, 86, 61, 16);
			panel_2.add(label_3);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(101, 84, 177, 20);
			panel_2.add(textField_2);
			
			JLabel label_4 = new JLabel("Sexo:");
			label_4.setBounds(300, 145, 61, 16);
			panel_2.add(label_4);
			
			JLabel label_5 = new JLabel("Telefono:");
			label_5.setBounds(300, 86, 61, 16);
			panel_2.add(label_5);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(369, 86, 196, 20);
			panel_2.add(textField_3);
			
			JRadioButton radioButton = new JRadioButton("Masculino");
			radioButton.setBounds(367, 142, 93, 23);
			panel_2.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("Femenino");
			radioButton_1.setBounds(462, 142, 94, 23);
			panel_2.add(radioButton_1);
			
			JLabel label_6 = new JLabel("Estado Civil:");
			label_6.setBounds(30, 199, 84, 16);
			panel_2.add(label_6);
			
			JLabel lblNacionalidad = new JLabel("Direccion:");
			lblNacionalidad.setBounds(30, 113, 84, 16);
			panel_2.add(lblNacionalidad);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(101, 113, 177, 20);
			panel_2.add(textField_5);
			
			JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
			lblNacionalidad_1.setBounds(300, 199, 84, 16);
			panel_2.add(lblNacionalidad_1);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(395, 199, 170, 20);
			panel_2.add(comboBox);
			
			JComboBox comboBox_5 = new JComboBox();
			comboBox_5.setBounds(101, 199, 177, 20);
			panel_2.add(comboBox_5);
			
			JLabel lblNewLabel_1 = new JLabel("Cuidad:");
			lblNewLabel_1.setBounds(30, 145, 46, 14);
			panel_2.add(lblNewLabel_1);
			
			JComboBox comboBox_6 = new JComboBox();
			comboBox_6.setBounds(101, 143, 177, 20);
			panel_2.add(comboBox_6);
			
			JLabel lblPais = new JLabel("Pais:");
			lblPais.setBounds(30, 174, 46, 14);
			panel_2.add(lblPais);
			
			JComboBox comboBox_7 = new JComboBox();
			comboBox_7.setBounds(101, 172, 177, 20);
			panel_2.add(comboBox_7);
			
			JLabel lblNewLabel = new JLabel("Fecha Nacimiento:");
			lblNewLabel.setBounds(300, 174, 107, 14);
			panel_2.add(lblNewLabel);
			
			textField_4 = new JTextField();
			textField_4.setBounds(412, 172, 153, 20);
			panel_2.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Email:");
			lblNewLabel_2.setBounds(300, 113, 46, 14);
			panel_2.add(lblNewLabel_2);
			
			textField_12 = new JTextField();
			textField_12.setBounds(369, 113, 196, 20);
			panel_2.add(textField_12);
			textField_12.setColumns(10);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBounds(20, 436, 576, 177);
			panel.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel label_9 = new JLabel("Experiencia Laboral:");
			label_9.setFont(new Font("Dialog", Font.BOLD, 13));
			label_9.setBounds(10, 11, 146, 16);
			panel_3.add(label_9);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(10, 24, 134, 12);
			panel_3.add(separator_3);
			
			JLabel label_10 = new JLabel("Nombre de Empresa:");
			label_10.setBounds(10, 47, 134, 16);
			panel_3.add(label_10);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(144, 42, 435, 20);
			panel_3.add(textField_6);
			
			JLabel label_11 = new JLabel("Area de Trabajo:");
			label_11.setBounds(10, 82, 127, 16);
			panel_3.add(label_11);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(144, 77, 435, 20);
			panel_3.add(textField_7);
			
			JLabel label_12 = new JLabel("Nombre de Referente:");
			label_12.setBounds(10, 115, 146, 16);
			panel_3.add(label_12);
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(144, 110, 435, 20);
			panel_3.add(textField_8);
			
			JLabel label_13 = new JLabel("Telefono de Referente:");
			label_13.setBounds(10, 148, 146, 21);
			panel_3.add(label_13);
			
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(144, 143, 435, 20);
			panel_3.add(textField_9);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBounds(20, 263, 335, 170);
			panel.add(panel_4);
			panel_4.setLayout(null);
			
			JPanel panel_5 = new JPanel();
			panel_5.setLayout(null);
			panel_5.setBounds(6, 64, 314, 100);
			panel_4.add(panel_5);
			
			JLabel label = new JLabel("Institucion:");
			label.setBounds(6, 6, 84, 16);
			panel_5.add(label);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(82, 5, 226, 20);
			panel_5.add(textField_10);
			
			JLabel label_14 = new JLabel("Carrera:");
			label_14.setBounds(6, 47, 61, 16);
			panel_5.add(label_14);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(82, 45, 135, 20);
			panel_5.add(comboBox_1);
			
			JPanel panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.setBounds(6, 64, 314, 100);
			panel_4.add(panel_6);
			
			JLabel label_15 = new JLabel("Institucion:");
			label_15.setBounds(6, 6, 84, 16);
			panel_6.add(label_15);
			
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(82, 1, 226, 20);
			panel_6.add(textField_11);
			
			JLabel label_16 = new JLabel("Tecnico:");
			label_16.setBounds(6, 47, 61, 16);
			panel_6.add(label_16);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(82, 39, 226, 20);
			panel_6.add(comboBox_2);
			
			JPanel panel_7 = new JPanel();
			panel_7.setLayout(null);
			panel_7.setBounds(6, 64, 314, 100);
			panel_4.add(panel_7);
			
			JLabel label_17 = new JLabel("Habilidad:");
			label_17.setBounds(10, 41, 71, 16);
			panel_7.add(label_17);
			
			JComboBox comboBox_3 = new JComboBox();
			comboBox_3.setBounds(82, 39, 226, 20);
			panel_7.add(comboBox_3);
			
			JLabel label_18 = new JLabel("Nivel educativo:");
			label_18.setFont(new Font("Dialog", Font.BOLD, 13));
			label_18.setBounds(103, 11, 115, 16);
			panel_4.add(label_18);
			
			JRadioButton radioButton_2 = new JRadioButton("Profesional");
			radioButton_2.setBounds(6, 34, 115, 23);
			panel_4.add(radioButton_2);
			
			JRadioButton radioButton_3 = new JRadioButton("Tecnico");
			radioButton_3.setBounds(123, 34, 93, 23);
			panel_4.add(radioButton_3);
			
			JRadioButton radioButton_4 = new JRadioButton("Obrero");
			radioButton_4.setBounds(218, 34, 76, 23);
			panel_4.add(radioButton_4);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBounds(103, 25, 109, 12);
			panel_4.add(separator_4);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(602, 281, 348, 295);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel label_19 = new JLabel("Disponibilidad de Mudarse:");
			label_19.setFont(new Font("Dialog", Font.BOLD, 13));
			label_19.setBounds(10, 16, 192, 16);
			panel_1.add(label_19);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 30, 173, 12);
			panel_1.add(separator);
			
			JLabel label_20 = new JLabel("Tipo de Jornada:");
			label_20.setFont(new Font("Dialog", Font.BOLD, 13));
			label_20.setBounds(212, 16, 148, 16);
			panel_1.add(label_20);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(212, 30, 103, 12);
			panel_1.add(separator_1);
			
			JLabel label_21 = new JLabel("Licencia de conducir:");
			label_21.setFont(new Font("Dialog", Font.BOLD, 13));
			label_21.setBounds(10, 70, 160, 16);
			panel_1.add(label_21);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBounds(10, 84, 134, 12);
			panel_1.add(separator_2);
			
			JRadioButton radioButton_5 = new JRadioButton("Si");
			radioButton_5.setBounds(20, 39, 54, 23);
			panel_1.add(radioButton_5);
			
			JRadioButton radioButton_6 = new JRadioButton("No");
			radioButton_6.setBounds(76, 39, 54, 23);
			panel_1.add(radioButton_6);
			
			JLabel label_22 = new JLabel("Idioma:");
			label_22.setBounds(10, 123, 61, 16);
			panel_1.add(label_22);
			
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4.setEditable(true);
			comboBox_4.setBounds(10, 142, 134, 20);
			panel_1.add(comboBox_4);
			
			JRadioButton radioButton_7 = new JRadioButton("Tiempo Completo");
			radioButton_7.setBounds(221, 68, 117, 23);
			panel_1.add(radioButton_7);
			
			JRadioButton radioButton_8 = new JRadioButton("Medio Tiempo");
			radioButton_8.setBounds(222, 39, 123, 23);
			panel_1.add(radioButton_8);
			
			JRadioButton radioButton_9 = new JRadioButton("No");
			radioButton_9.setBounds(76, 93, 54, 23);
			panel_1.add(radioButton_9);
			
			JRadioButton radioButton_10 = new JRadioButton("Si");
			radioButton_10.setBounds(20, 93, 54, 23);
			panel_1.add(radioButton_10);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("A\u00F1adir otro idioma");
			chckbxNewCheckBox.setBounds(10, 169, 134, 23);
			panel_1.add(chckbxNewCheckBox);
			
			JComboBox comboBox_8 = new JComboBox();
			comboBox_8.setBounds(10, 199, 134, 20);
			panel_1.add(comboBox_8);
			
			JCheckBox checkBox = new JCheckBox("A\u00F1adir otro idioma");
			checkBox.setBounds(10, 227, 134, 23);
			panel_1.add(checkBox);
			
			JComboBox comboBox_9 = new JComboBox();
			comboBox_9.setBounds(10, 257, 134, 20);
			panel_1.add(comboBox_9);
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
}
