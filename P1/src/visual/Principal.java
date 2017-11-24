package visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Bolsa;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Insets;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bolsa.init();
					Principal frame = new Principal();
					frame.setVisible(true);
					//if(Controladora.archivoCreado()){
						//Controladora.CargarCliente();
						//Controladora.CargarCuenta();}
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					frame.addWindowListener( new WindowAdapter() {
					@Override
					public void  windowClosing(WindowEvent we){
						JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios.", "Información", JOptionPane.INFORMATION_MESSAGE);
					
						//try {
							//Controladora.GuardarCliente();
							//Controladora.GuardarCuenta();
						//} catch (IOException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						//}
						
						System.exit(0);
					}
				});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Bolsa laboral V1.0");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 340);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim.width, (dim.height-50));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 1360, 31);
		contentPane.add(menuBar);
		menuBar.setBackground(new Color(178, 34, 34));
		menuBar.setForeground(new Color(220, 20, 60));
		
		JMenu mnNewMenu = new JMenu("Ingresar datos");
		mnNewMenu.setBackground(new Color(0, 0, 0));
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Solicitantes         ");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitantesVisual md = new SolicitantesVisual();
				md.setModal(true);
				md.setLocationRelativeTo(null);
				md.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Empresas");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarEmpresaVisual ev = new RegistrarEmpresaVisual();
				ev.setModal(true);
				ev.setLocationRelativeTo(null);
				ev.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Solicitudes");
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		mnNewMenu_2.setBackground(new Color(0, 0, 0));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Nueva solicitud");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarPlaza rp = new RegistrarPlaza();
				rp.setModal(true);
				rp.setLocationRelativeTo(null);
				rp.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_2);
	}
}
