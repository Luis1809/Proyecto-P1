package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class RegistrarEmpresaVisual extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreEmpresa;
	private JTextField txtDireccionEmpresa;
	private JTextField txtTelefonoEmpresa;
	private JTextField txtEmailEmpresa;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarEmpresaVisual dialog = new RegistrarEmpresaVisual();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarEmpresaVisual() {
		setTitle("Registrar Empresa");
		setBounds(100, 100, 451, 322);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Informacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 415, 228);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombreEmpresa = new JLabel("Nombre:");
		lblNombreEmpresa.setBounds(10, 21, 95, 14);
		panel.add(lblNombreEmpresa);
		
		txtNombreEmpresa = new JTextField();
		txtNombreEmpresa.setBounds(10, 40, 284, 20);
		panel.add(txtNombreEmpresa);
		txtNombreEmpresa.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(181, 115, 53, 14);
		panel.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 115, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 63, 60, 14);
		panel.add(lblDireccion);
		
		txtDireccionEmpresa = new JTextField();
		txtDireccionEmpresa.setBounds(10, 84, 284, 20);
		panel.add(txtDireccionEmpresa);
		txtDireccionEmpresa.setColumns(10);
		
		txtTelefonoEmpresa = new JTextField();
		txtTelefonoEmpresa.setBounds(181, 140, 113, 20);
		panel.add(txtTelefonoEmpresa);
		txtTelefonoEmpresa.setColumns(10);
		
		txtEmailEmpresa = new JTextField();
		txtEmailEmpresa.setBounds(10, 140, 126, 20);
		panel.add(txtEmailEmpresa);
		txtEmailEmpresa.setColumns(10);
		
		JLabel lblRnc = new JLabel("Rnc:");
		lblRnc.setBounds(10, 165, 46, 14);
		panel.add(lblRnc);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(181, 171, 46, 14);
		panel.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(10, 184, 126, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 184, 113, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
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
				JButton btnCancel = new JButton("Cancel");
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}
}
