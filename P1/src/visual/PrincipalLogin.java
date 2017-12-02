package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import sun.security.jgss.LoginConfigImpl;
import java.awt.Color;
import java.awt.Toolkit;

public class PrincipalLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		//look and feel
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalLogin frame = new PrincipalLogin();
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
	public PrincipalLogin() {
		setResizable(false);
		setTitle("                                                                            Iniciar sesion\r\n ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrincipalLogin.class.getResource("/imagenes/lista-de-usuarios.png")));
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 795);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.setLayout(null);
		secondLogin login =new 	secondLogin();
		login.setBounds(5, 0, 1052, 773);
		
		//contentPane.add(panel, BorderLayout.CENTER);
	//	panel.setLayout(null);
		
		contentPane.add(login);
		login.setLayout(null);
		
		
		
		
		
	}

}
