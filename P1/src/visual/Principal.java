package visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartPanel;

import graficos.BarData;
import graficos.ChartFactoryCreator;
import logico.Bolsa;
import logico.Obrero;
import logico.Tecnico;
import logico.Universitario;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JDialog;


public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	public static JPanel panel_bar;

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
		
		//look and feel
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
						JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
					
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
		///
		JMenu mnNewMenu = new JMenu("Ingresar datos");
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/usuario (1).png")));
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
		mnNewMenu_2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/transaccion (1).png")));
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
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Matching");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Macheo A = new Macheo();
				A.setModal(true);
				A.setLocationRelativeTo(null);
				A.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnModificar = new JMenu("Modificar Datos");
		mnModificar.setForeground(Color.WHITE);
		mnModificar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnModificar.setBackground(Color.BLACK);
		menuBar.add(mnModificar);
		
		JMenuItem menuItem = new JMenuItem("Solicitantes         ");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarSolicitantes m=new ModificarSolicitantes();
				m.setModal(true);
				m.setLocationRelativeTo(null);
				m.setVisible(true);
				
			}
		});
		menuItem.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnModificar.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Empresas");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarEmpresa emp=new ModificarEmpresa();
				emp.setModal(true);
				emp.setLocationRelativeTo(null);
				emp.setVisible(true);
				
				
				
				
			}
		});
		menuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnModificar.add(menuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Reportes");
		mnNewMenu_1.setForeground(Color.WHITE);
		mnNewMenu_1.setBackground(Color.BLACK);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Empleados contratados");
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitantesContratados p=new SolicitantesContratados();
				p.setModal(true);
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JPanel panel_pie = new JPanel();
		panel_pie.setBounds(26, 103, 500, 323);
		contentPane.add(panel_pie);
		
		panel_bar = new JPanel();
		panel_bar.setBounds(580, 103, 541, 329);
		contentPane.add(panel_bar);
		
		
		// El pnChart es el panel que vas a usar para mostrar el char
        // Ejemplo PieChar
        HashMap<String, Double> valoresPie = new HashMap<>();

        valoresPie.put("Ingenieros", new Double(10));
        valoresPie.put("Tecnicos", new Double(32));
        valoresPie.put("Doctor", new Double(3));
        valoresPie.put("Magister", new Double(5));
        valoresPie.put("Licenciado", new Double(25));
        
        ChartPanel chartPanelPie = ChartFactoryCreator.createPieChartPanel("Carreras vs Cantidad", valoresPie,panel_pie.getWidth(),panel_pie.getHeight());
        panel_pie.add(chartPanelPie,BorderLayout.CENTER);
        panel_pie.validate();
        
       cargarBarra();
        
		
	}
	public static void cargarBarra(){
		panel_bar.removeAll();
        ArrayList<BarData> valoresBar = new ArrayList<>();
        for(int i=0;i<Bolsa.getMiEmpresa().size();i++){
        	double uni =0;
        	double tec =0;
        	double obre=0;
        	for(int a=0;a<Bolsa.getMiEmpresa().get(i).getMiSolicitudes().size();a++){
        		for(int b=0;b<Bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().size();b++){
        		if(Bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b) instanceof Universitario)
        			uni++;
        		if(Bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b) instanceof Tecnico)
        			tec++;
        		if(Bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b) instanceof Obrero)
        			obre++;
        		}
        	}
        	
        	valoresBar.add(new BarData(uni,"Universitario", Bolsa.getMiEmpresa().get(i).getNombreEmpresa()));
            valoresBar.add(new BarData(tec,"Tecnicos", Bolsa.getMiEmpresa().get(i).getNombreEmpresa()));
            valoresBar.add(new BarData(obre,"Obreros", Bolsa.getMiEmpresa().get(i).getNombreEmpresa()));
        }
         
        ChartPanel chartPanelBar = ChartFactoryCreator.createBarChartPanel("Cantidad Empleados por empresa","Empresas","Cantidad",valoresBar,panel_bar.getWidth(),panel_bar.getHeight());
        panel_bar.add(chartPanelBar,BorderLayout.CENTER);
        panel_bar.validate();
	}
		
}
