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

public class RegistrarPlaza extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setTitle("Registrar Empleo");
		setBounds(100, 100, 774, 626);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 368, 162);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JRadioButton radioButton = new JRadioButton("Hombre");
			buttonGroup.add(radioButton);
			radioButton.setBounds(125, 21, 71, 23);
			panel.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("Mujer");
			buttonGroup.add(radioButton_1);
			radioButton_1.setBounds(51, 21, 71, 23);
			panel.add(radioButton_1);
			
			JLabel label_7 = new JLabel("Sexo:");
			label_7.setBounds(10, 25, 46, 14);
			panel.add(label_7);
			
			JRadioButton rdbtnNa = new JRadioButton("N/A");
			buttonGroup.add(rdbtnNa);
			rdbtnNa.setBounds(209, 21, 55, 23);
			panel.add(rdbtnNa);
			
			JLabel label = new JLabel("Cuidad:");
			label.setBounds(10, 53, 46, 14);
			panel.add(label);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(81, 51, 177, 20);
			panel.add(comboBox);
			
			JLabel label_1 = new JLabel("Pais:");
			label_1.setBounds(10, 82, 46, 14);
			panel.add(label_1);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(81, 80, 177, 20);
			panel.add(comboBox_1);
			
			JLabel label_2 = new JLabel("Estado Civil:");
			label_2.setBounds(10, 107, 84, 16);
			panel.add(label_2);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(81, 107, 177, 20);
			panel.add(comboBox_2);
		}
		
		JPanel panelPlazaAreaDeExperiencia = new JPanel();
		panelPlazaAreaDeExperiencia.setBounds(466, 203, 242, 142);
		contentPanel.add(panelPlazaAreaDeExperiencia);
		panelPlazaAreaDeExperiencia.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlazaAreaDeExperiencia.setLayout(null);
		
		JLabel lblPlaza = new JLabel("Plaza:");
		lblPlaza.setBounds(23, 11, 46, 14);
		panelPlazaAreaDeExperiencia.add(lblPlaza);
		
		JSpinner spnPlaza = new JSpinner();
		spnPlaza.setBounds(23, 36, 29, 20);
		panelPlazaAreaDeExperiencia.add(spnPlaza);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Experiencia Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(385, 22, 358, 108);
		contentPanel.add(panel);
		
		JLabel label_2 = new JLabel("Area de Trabajo:");
		label_2.setBounds(10, 38, 110, 16);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 36, 198, 20);
		panel.add(comboBox);
		
		JLabel label_5 = new JLabel("Tiempo de experiencia:");
		label_5.setBounds(10, 67, 134, 14);
		panel.add(label_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(244, 65, 101, 20);
		panel.add(spinner);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Datos de solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 182, 402, 361);
		contentPanel.add(panel_1);
		
		JLabel label = new JLabel("Disponibilidad de Mudarse:");
		label.setFont(new Font("Dialog", Font.BOLD, 13));
		label.setBounds(27, 35, 192, 16);
		panel_1.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 49, 173, 12);
		panel_1.add(separator);
		
		JLabel label_1 = new JLabel("Tipo de Jornada:");
		label_1.setFont(new Font("Dialog", Font.BOLD, 13));
		label_1.setBounds(229, 35, 148, 16);
		panel_1.add(label_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(229, 49, 103, 12);
		panel_1.add(separator_1);
		
		JLabel label_3 = new JLabel("Licencia de conducir:");
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(27, 89, 160, 16);
		panel_1.add(label_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(27, 103, 134, 12);
		panel_1.add(separator_2);
		
		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBounds(37, 58, 54, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(93, 58, 54, 23);
		panel_1.add(radioButton_1);
		
		JLabel label_4 = new JLabel("Idioma:");
		label_4.setBounds(243, 146, 61, 16);
		panel_1.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(243, 165, 134, 20);
		panel_1.add(comboBox_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Tiempo Completo");
		radioButton_2.setBounds(238, 87, 139, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Medio Tiempo");
		radioButton_3.setBounds(239, 58, 138, 23);
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("No");
		radioButton_4.setBounds(93, 112, 54, 23);
		panel_1.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Si");
		radioButton_5.setBounds(37, 112, 54, 23);
		panel_1.add(radioButton_5);
		
		JCheckBox checkBox = new JCheckBox("A\u00F1adir otro idioma");
		checkBox.setBounds(243, 192, 134, 23);
		panel_1.add(checkBox);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEnabled(false);
		comboBox_2.setBounds(243, 222, 134, 20);
		panel_1.add(comboBox_2);
		
		JCheckBox checkBox_1 = new JCheckBox("A\u00F1adir otro idioma");
		checkBox_1.setBounds(243, 250, 134, 23);
		panel_1.add(checkBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEnabled(false);
		comboBox_3.setBounds(243, 280, 134, 20);
		panel_1.add(comboBox_3);
		
		JLabel label_6 = new JLabel("Area de interes:");
		label_6.setBounds(27, 196, 126, 14);
		panel_1.add(label_6);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(27, 222, 126, 20);
		panel_1.add(comboBox_4);
		
		JLabel label_7 = new JLabel("Salario solicitado (Mensual):");
		label_7.setBounds(27, 254, 173, 14);
		panel_1.add(label_7);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(27, 280, 126, 20);
		panel_1.add(spinner_1);
		
		JLabel label_8 = new JLabel("Disponibilidad de viajar:");
		label_8.setBounds(27, 146, 173, 14);
		panel_1.add(label_8);
		
		JRadioButton radioButton_6 = new JRadioButton("Si");
		radioButton_6.setBounds(37, 164, 54, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("No");
		radioButton_7.setBounds(93, 164, 54, 23);
		panel_1.add(radioButton_7);
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
