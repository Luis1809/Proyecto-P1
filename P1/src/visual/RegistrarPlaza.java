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
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegistrarPlaza extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarPlaza dialog = new RegistrarPlaza();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarPlaza() {
		setResizable(false);
		setTitle("Registrar Empleo");
		setBounds(100, 100, 683, 711);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			panel.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 158, 305, 148);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JRadioButton radioButton = new JRadioButton("Hombre");
			radioButton.setBackground(new Color(255, 255, 255));
			buttonGroup.add(radioButton);
			radioButton.setBounds(125, 21, 71, 23);
			panel.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("Mujer");
			radioButton_1.setBackground(new Color(255, 255, 255));
			buttonGroup.add(radioButton_1);
			radioButton_1.setBounds(51, 21, 71, 23);
			panel.add(radioButton_1);
			
			JLabel label_7 = new JLabel("Sexo:");
			label_7.setBounds(10, 25, 46, 14);
			panel.add(label_7);
			
			JRadioButton rdbtnNa = new JRadioButton("N/A");
			rdbtnNa.setBackground(new Color(255, 255, 255));
			buttonGroup.add(rdbtnNa);
			rdbtnNa.setBounds(209, 21, 55, 23);
			panel.add(rdbtnNa);
			
			JLabel label = new JLabel("Cuidad:");
			label.setBounds(10, 53, 46, 14);
			panel.add(label);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBackground(new Color(211, 211, 211));
			comboBox.setBounds(104, 51, 177, 20);
			panel.add(comboBox);
			
			JLabel label_1 = new JLabel("Pais:");
			label_1.setBounds(10, 82, 46, 14);
			panel.add(label_1);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBackground(new Color(211, 211, 211));
			comboBox_1.setBounds(104, 80, 177, 20);
			panel.add(comboBox_1);
			
			JLabel label_2 = new JLabel("Estado Civil:");
			label_2.setBounds(10, 107, 101, 16);
			panel.add(label_2);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBackground(new Color(211, 211, 211));
			comboBox_2.setBounds(104, 107, 177, 20);
			panel.add(comboBox_2);
		}
		
		JPanel panelPlazaAreaDeExperiencia = new JPanel();
		panelPlazaAreaDeExperiencia.setBackground(new Color(255, 255, 255));
		panelPlazaAreaDeExperiencia.setBounds(10, 317, 283, 256);
		contentPanel.add(panelPlazaAreaDeExperiencia);
		panelPlazaAreaDeExperiencia.setBorder(new TitledBorder(null, "Solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPlazaAreaDeExperiencia.setLayout(null);
		
		JLabel lblPorcientoAceptable = new JLabel("Porciento aceptable:");
		lblPorcientoAceptable.setBounds(10, 34, 126, 14);
		panelPlazaAreaDeExperiencia.add(lblPorcientoAceptable);
		
		textField = new JTextField();
		textField.setBackground(new Color(211, 211, 211));
		textField.setBounds(136, 31, 126, 20);
		panelPlazaAreaDeExperiencia.add(textField);
		textField.setColumns(10);
		
		JLabel lblPlaza = new JLabel("Plazas:");
		lblPlaza.setBounds(10, 68, 46, 14);
		panelPlazaAreaDeExperiencia.add(lblPlaza);
		
		JSpinner spnPlaza = new JSpinner();
		spnPlaza.setForeground(new Color(255, 248, 220));
		spnPlaza.setBackground(new Color(255, 248, 220));
		spnPlaza.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spnPlaza.setBounds(136, 62, 126, 20);
		panelPlazaAreaDeExperiencia.add(spnPlaza);
		
		JLabel label_6 = new JLabel("Area de interes:");
		label_6.setBounds(10, 99, 126, 14);
		panelPlazaAreaDeExperiencia.add(label_6);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(new Color(211, 211, 211));
		comboBox_4.setBounds(136, 93, 126, 20);
		panelPlazaAreaDeExperiencia.add(comboBox_4);
		
		JLabel label_7 = new JLabel("Salario solicitado (Mensual):");
		label_7.setBounds(10, 135, 173, 14);
		panelPlazaAreaDeExperiencia.add(label_7);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBackground(new Color(255, 248, 220));
		spinner_1.setModel(new SpinnerNumberModel(10000, 10000, 1000000, 500));
		spinner_1.setBounds(10, 160, 126, 20);
		panelPlazaAreaDeExperiencia.add(spinner_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Experiencia Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(325, 237, 344, 122);
		contentPanel.add(panel);
		
		JLabel label_2 = new JLabel("Area de Trabajo:");
		label_2.setBounds(22, 36, 110, 16);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(211, 211, 211));
		comboBox.setBounds(152, 34, 165, 20);
		panel.add(comboBox);
		
		JLabel label_5 = new JLabel("Tiempo de experiencia:");
		label_5.setBounds(22, 76, 134, 14);
		panel.add(label_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(193, 73, 124, 20);
		panel.add(spinner);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(301, 370, 368, 256);
		contentPanel.add(panel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 49, 157, 12);
		panel_1.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(27, 104, 126, 12);
		panel_1.add(separator_2);
		
		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBackground(new Color(255, 255, 255));
		radioButton.setBounds(37, 58, 54, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBackground(new Color(255, 255, 255));
		radioButton_1.setBounds(93, 58, 54, 23);
		panel_1.add(radioButton_1);
		
		JLabel label_4 = new JLabel("Idioma:");
		label_4.setBounds(221, 34, 61, 16);
		panel_1.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(211, 211, 211));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(221, 54, 134, 20);
		panel_1.add(comboBox_1);
		
		JRadioButton radioButton_4 = new JRadioButton("No");
		radioButton_4.setBackground(new Color(255, 255, 255));
		radioButton_4.setBounds(93, 112, 54, 23);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Si");
		radioButton_5.setBackground(new Color(255, 255, 255));
		radioButton_5.setBounds(37, 112, 54, 23);
		panel_1.add(radioButton_5);
		
		JCheckBox checkBox = new JCheckBox("A\u00F1adir otro idioma");
		checkBox.setBackground(new Color(255, 255, 255));
		checkBox.setBounds(221, 81, 134, 23);
		panel_1.add(checkBox);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(new Color(211, 211, 211));
		comboBox_2.setEnabled(false);
		comboBox_2.setBounds(221, 111, 134, 20);
		panel_1.add(comboBox_2);
		
		JCheckBox checkBox_1 = new JCheckBox("A\u00F1adir otro idioma");
		checkBox_1.setBackground(new Color(255, 255, 255));
		checkBox_1.setBounds(221, 139, 134, 23);
		panel_1.add(checkBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(211, 211, 211));
		comboBox_3.setEnabled(false);
		comboBox_3.setBounds(221, 169, 134, 20);
		panel_1.add(comboBox_3);
		
		JLabel label_8 = new JLabel("Disponibilidad de viajar:");
		label_8.setBounds(27, 146, 173, 14);
		panel_1.add(label_8);
		
		JRadioButton radioButton_6 = new JRadioButton("Si");
		radioButton_6.setBackground(new Color(255, 255, 255));
		radioButton_6.setBounds(37, 164, 54, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("No");
		radioButton_7.setBackground(new Color(255, 255, 255));
		radioButton_7.setBounds(93, 164, 54, 23);
		panel_1.add(radioButton_7);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(27, 161, 134, 12);
		panel_1.add(separator_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(27, 205, 134, 12);
		panel_1.add(separator_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Medio Tiempo");
		radioButton_2.setBackground(new Color(255, 255, 255));
		radioButton_2.setBounds(33, 213, 120, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Tiempo Completo");
		radioButton_3.setBackground(new Color(255, 255, 255));
		radioButton_3.setBounds(167, 213, 126, 23);
		panel_1.add(radioButton_3);
		
		JLabel lblTipoDeJornada = new JLabel("Tipo de jornada laboral:");
		lblTipoDeJornada.setBounds(27, 190, 173, 14);
		panel_1.add(lblTipoDeJornada);
		
		JLabel lblLicenciaDeConducir = new JLabel("Licencia de conducir:");
		lblLicenciaDeConducir.setBounds(27, 90, 173, 14);
		panel_1.add(lblLicenciaDeConducir);
		
		JLabel lblDisponibilidadDeMudarse = new JLabel("Disponibilidad de mudarse:");
		lblDisponibilidadDeMudarse.setBounds(27, 35, 173, 14);
		panel_1.add(lblDisponibilidadDeMudarse);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 47, 677, 108);
		contentPanel.add(panel_2);
		
		JLabel lblIngreseRnc = new JLabel("Ingrese RNC :");
		lblIngreseRnc.setBackground(new Color(255, 255, 255));
		lblIngreseRnc.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIngreseRnc.setBounds(24, 11, 177, 28);
		panel_2.add(lblIngreseRnc);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setForeground(new Color(0, 0, 0));
		formattedTextField.setColumns(10);
		formattedTextField.setBackground(new Color(211, 211, 211));
		formattedTextField.setBounds(164, 18, 158, 20);
		panel_2.add(formattedTextField);
		
		JButton button = new JButton("Buscar");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setActionCommand("OK");
		button.setBounds(218, 42, 104, 27);
		panel_2.add(button);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(360, 20, 68, 14);
		panel_2.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBackground(new Color(211, 211, 211));
		textField_1.setBounds(438, 18, 177, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefono:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(360, 75, 81, 14);
		panel_2.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setBackground(new Color(211, 211, 211));
		textField_2.setBounds(438, 45, 177, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ciudad:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(360, 49, 93, 14);
		panel_2.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(211, 211, 211));
		textField_3.setBounds(438, 73, 177, 20);
		panel_2.add(textField_3);
		
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
				btncancel.setActionCommand("Cancel");
				buttonPane.add(btncancel);
			}
		}
	}
}
