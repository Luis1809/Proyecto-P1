package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(25, 71, 385, 102);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(6, 23, 52, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblContrasen = new JLabel("Contraseña:");
		lblContrasen.setBounds(6, 67, 75, 16);
		panel_1.add(lblContrasen);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(89, 18, 233, 26);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setColumns(10);
		txtContrasena.setBounds(89, 62, 233, 26);
		panel_1.add(txtContrasena);
		
		JButton btnA = new JButton("Login");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				char clave[]=txtContrasena.getPassword();
				String clavedef=new String(clave);
				
				
				if(txtUsuario.getText().equals("Administrador")&&clavedef.equals("12345")){
					
		         dispose();
		         
		         Principal p=new Principal();
		       
		         p.setVisible(true);
		       
					
				}
				
			}
		});
		btnA.setBounds(161, 202, 117, 29);
		panel.add(btnA);
	}
}
