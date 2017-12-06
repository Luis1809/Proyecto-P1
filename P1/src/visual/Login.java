package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;

public class Login extends JDialog {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Login() {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					addWindowListener( new WindowAdapter() {
						@Override
						public void  windowClosing(WindowEvent we){
							Principal.Validacion=false;
							System.exit(0);
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 648, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(0, 0, 299, 562);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(297, 0, 338, 562);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("Iniciar Seccion");
		label.setForeground(new Color(0, 0, 102));
		label.setFont(new Font("Tahoma", Font.BOLD, 35));
		label.setBounds(46, 44, 293, 99);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Usuario:");
		label_1.setForeground(new Color(0, 0, 102));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(143, 182, 92, 20);
		panel_2.add(label_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(46, 235, 271, 55);
		panel_2.add(txtUsuario);
		
		JLabel label_2 = new JLabel("Contrasena:");
		label_2.setForeground(new Color(0, 0, 102));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(120, 334, 114, 20);
		panel_2.add(label_2);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setColumns(10);
		txtPassword.setBounds(46, 387, 271, 55);
		panel_2.add(txtPassword);
		
		JButton button = new JButton("Iniciar Seccion");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char clave[]= txtPassword.getPassword();
				String clavedef=new String(clave);
				
				
				if (txtUsuario.getText().equals("Administrador")&& clavedef.equals("12345")) {	
			        dispose();
					
				}else{
					JOptionPane.showMessageDialog(null,"Contrasena incorrecta o Usuario incorrecto");
				}
				
				
				
				
			}
		});
		button.setForeground(new Color(0, 0, 102));
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(85, 473, 185, 48);
		panel_2.add(button);
		
		JLabel label_3 = new JLabel("Si desea Registrarse comunicese con soporte tecnico");
		label_3.setForeground(new Color(0, 0, 102));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(23, 536, 315, 20);
		panel_2.add(label_3);
	}
}
