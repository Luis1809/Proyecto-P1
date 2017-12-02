package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import logico.Bolsa;
import sun.security.jgss.LoginConfigImpl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class PrincipalLogin extends JDialog {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnIniciar;
	private Dimension dim;

	public PrincipalLogin() {
		
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
		
		
		
		setBounds(100, 100, 1920, 1096);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim.width, (dim.height-50));
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("                                                                            Iniciar sesion\r\n ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrincipalLogin.class.getResource("/imagenes/lista-de-usuarios.png")));
		
		
		
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 795);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.setLayout(null);
	
		
		setBackground(new Color(0, 0, 102));
		getContentPane().setLayout(null);
		
	
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 102));
		panel_3.setBounds(0, 0, 517, 540);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(secondLogin.class.getResource("/imagenes/hombre-de-negocios (3).png")));
		lblNewLabel.setBounds(0, 0, 517, 540);
		panel_3.add(lblNewLabel);
		
		JLabel lblBolsaDeEmplados = new JLabel("Bolsa de Emplados");
		lblBolsaDeEmplados.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblBolsaDeEmplados.setForeground(new Color(255, 255, 255));
		lblBolsaDeEmplados.setBackground(new Color(0, 0, 102));
		lblBolsaDeEmplados.setBounds(169, 564, 209, 51);
		panel.add(lblBolsaDeEmplados);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(517, 0, 539, 759);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSingUp = new JLabel("Iniciar Seccion");
		lblSingUp.setForeground(new Color(0, 0, 102));
		lblSingUp.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSingUp.setBounds(161, 96, 293, 99);
		panel_1.add(lblSingUp);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(0, 0, 102));
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsuario.setBounds(256, 248, 92, 20);
		panel_1.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contrasena:");
		lblContrasena.setForeground(new Color(0, 0, 102));
		lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContrasena.setBounds(234, 423, 114, 20);
		panel_1.add(lblContrasena);
		
		btnIniciar = new JButton("Iniciar Seccion");
		btnIniciar.setIcon(new ImageIcon(secondLogin.class.getResource("/imagenes/login.png")));
		btnIniciar.addActionListener(new ActionListener() {
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
		btnIniciar.setForeground(new Color(0, 0, 102));
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnIniciar.setBounds(153, 587, 281, 99);
		panel_1.add(btnIniciar);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsuario.setBounds(103, 305, 381, 55);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setBounds(103, 482, 381, 55);
		panel_1.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblSiDeseaRegistrarse = new JLabel("Si desea Registrarse comunicese con soporte tecnico");
		lblSiDeseaRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSiDeseaRegistrarse.setForeground(new Color(0, 0, 102));
		lblSiDeseaRegistrarse.setBounds(70, 723, 443, 20);
		panel_1.add(lblSiDeseaRegistrarse);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 102));
		panel_2.setBounds(0, 0, 519, 759);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PrincipalLogin.class.getResource("/imagenes/hombre-de-negocios (3).png")));
		label.setBounds(0, 0, 504, 569);
		panel_2.add(label);
	}

}
