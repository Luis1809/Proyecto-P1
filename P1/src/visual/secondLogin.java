package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.sun.javafx.font.Disposer;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secondLogin extends JPanel {
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnIniciar;


	public secondLogin() {
		
		
		//look and feel
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		setBackground(new Color(0, 0, 102));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 0, 517, 759);
		add(panel);
		panel.setLayout(null);
		
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
		add(panel_1);
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
				
					
					Principal p= new Principal();
					p.setVisible(true);
					
					
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

	}

}
