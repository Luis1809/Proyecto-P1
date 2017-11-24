package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JSeparator;

public class Macheo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Macheo dialog = new Macheo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Macheo() {
		setTitle("Datos");
		setResizable(false);
		setBounds(100, 100, 678, 543);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 150, 652, 20);
		contentPanel.add(separator);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 675, 48);
		contentPanel.add(panel);
		
		JLabel lblRealizarMacheo = new JLabel("Matching de datos");
		lblRealizarMacheo.setForeground(Color.WHITE);
		lblRealizarMacheo.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblRealizarMacheo.setBounds(237, 0, 311, 46);
		panel.add(lblRealizarMacheo);
		{
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(0, 48, 675, 100);
			contentPanel.add(panel_1);
			{
				JLabel label = new JLabel("Ingrese el RNC :");
				label.setFont(new Font("Tahoma", Font.BOLD, 18));
				label.setBackground(Color.WHITE);
				label.setBounds(10, 11, 191, 28);
				panel_1.add(label);
			}
			{
				JFormattedTextField formattedTextField = new JFormattedTextField();
				formattedTextField.setForeground(Color.BLACK);
				formattedTextField.setColumns(10);
				formattedTextField.setBackground(new Color(211, 211, 211));
				formattedTextField.setBounds(164, 18, 158, 20);
				panel_1.add(formattedTextField);
			}
			{
				JButton button = new JButton("Buscar");
				button.setFont(new Font("Tahoma", Font.PLAIN, 14));
				button.setActionCommand("OK");
				button.setBounds(218, 42, 104, 27);
				panel_1.add(button);
			}
			{
				JLabel label = new JLabel("Nombre:");
				label.setFont(new Font("Tahoma", Font.BOLD, 13));
				label.setBounds(360, 20, 68, 14);
				panel_1.add(label);
			}
			{
				textField = new JTextField();
				textField.setForeground(Color.BLACK);
				textField.setEditable(false);
				textField.setColumns(10);
				textField.setBackground(new Color(211, 211, 211));
				textField.setBounds(438, 18, 177, 20);
				panel_1.add(textField);
			}
			{
				JLabel label = new JLabel("Telefono:");
				label.setFont(new Font("Tahoma", Font.BOLD, 13));
				label.setBounds(360, 75, 81, 14);
				panel_1.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setForeground(Color.BLACK);
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				textField_1.setBackground(new Color(211, 211, 211));
				textField_1.setBounds(438, 45, 177, 20);
				panel_1.add(textField_1);
			}
			{
				JLabel label = new JLabel("Ciudad:");
				label.setFont(new Font("Tahoma", Font.BOLD, 13));
				label.setBounds(360, 49, 93, 14);
				panel_1.add(label);
			}
			{
				JFormattedTextField formattedTextField = new JFormattedTextField();
				formattedTextField.setForeground(Color.BLACK);
				formattedTextField.setEditable(false);
				formattedTextField.setColumns(10);
				formattedTextField.setBackground(new Color(211, 211, 211));
				formattedTextField.setBounds(438, 73, 177, 20);
				panel_1.add(formattedTextField);
			}
		}
		{
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nuevos empleados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(6, 285, 656, 186);
			contentPanel.add(panel_1);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
				scrollPane.setBounds(7, 18, 641, 157);
				panel_1.add(scrollPane);
				{
					table = new JTable();
					scrollPane.setViewportView(table);
				}
			}
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos de Solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(6, 159, 656, 124);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(506, 93, 140, 20);
		panel_1.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 0, 0));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setBounds(130, 93, 188, 20);
		panel_1.add(textField_4);
		
		JLabel lblSolicitudDe = new JLabel("Solicitud de:");
		lblSolicitudDe.setBounds(13, 34, 110, 14);
		panel_1.add(lblSolicitudDe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 31, 188, 20);
		panel_1.add(comboBox);
		
		JLabel label_5 = new JLabel("Fecha:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(494, 13, 46, 14);
		panel_1.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setText("  "+LocalDate.now());
		textField_6.setForeground(new Color(0, 0, 0));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setBounds(550, 11, 86, 20);
		panel_1.add(textField_6);
		
		JLabel label_1 = new JLabel("Salario solicitado (Mensual):");
		label_1.setBounds(336, 96, 173, 14);
		panel_1.add(label_1);
		
		JLabel label_3 = new JLabel("Plazas:");
		label_3.setBounds(13, 96, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Porciento aceptable:");
		label_4.setBounds(13, 66, 126, 14);
		panel_1.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(140, 62, 178, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCiudadSolicitada = new JLabel("Ciudad Solicitada:");
		lblCiudadSolicitada.setBounds(336, 66, 102, 14);
		panel_1.add(lblCiudadSolicitada);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(473, 63, 173, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
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
