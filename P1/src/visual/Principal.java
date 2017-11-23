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
		setBounds(100, 100, 845, 550);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim.width, (dim.height-50));
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Registro");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Solicitantes");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitantesVisual md = new SolicitantesVisual();
				md.setModal(true);
				md.setLocationRelativeTo(null);
				md.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
