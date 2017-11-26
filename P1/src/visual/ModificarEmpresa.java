package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import jdk.nashorn.internal.scripts.JO;
import logico.Bolsa;
import logico.EmpresaSolicitadora;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class ModificarEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreEmpresa;
	private JTextField txtDireccionEmpresa;
	private JFormattedTextField txtTelefonoEmpresa;
	private JTextField txtEmailEmpresa;
	private JFormattedTextField txtRNC;
	private static MaskFormatter formatoCedula;
	private static MaskFormatter formatoNumero;
	private static MaskFormatter formatoRNC;
	private JComboBox cbxPais;
	private JComboBox cbxArea;
	private JComboBox cbxCiudad;   
	
	public ModificarEmpresa() {
		setResizable(false);
		setTitle("Registrar Empresa");
		setBounds(100, 100, 530, 448);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(255, 255, 255));
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		try{
			formatoCedula = new MaskFormatter("###-#######-#");//////////////////////////////////////
			formatoNumero = new MaskFormatter("(###) -###-####");//////////////////////////////////////
			formatoRNC    = new MaskFormatter("#########");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informacion General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 124, 519, 147);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblRnc = new JLabel("RNC:");
		lblRnc.setBounds(10, 42, 46, 14);
		panel.add(lblRnc);
		
		txtRNC = new JFormattedTextField(formatoRNC);
		txtRNC.setBounds(71, 39, 148, 23);
		panel.add(txtRNC);
		txtRNC.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ciudad:");
		lblNewLabel.setBounds(10, 98, 73, 14);
		panel.add(lblNewLabel);
		String[] ciudad= {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"};
		
		cbxCiudad = new JComboBox();
		cbxCiudad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Santo Domingo de Guzm\u00E1n", "Azua ", "Neiba", "Barahona", "Dajab\u00F3n", "San Francisco de Macor\u00EDs", "Comendador", "El Seibo", "Moca", "Jiman\u00ED", "Hig\u00FCey", "La Romana", "La Vega", "Nagua", "Monte Cristi", "Pedernales", "Ban\u00ED", "Puerto Plata", "Salcedo", "Saman\u00E1", "San Crist\u00F3bal", "San Juan", "San Pedro de Macor\u00EDs", "Cotu\u00ED", "Santiago de los Caballeros", "Sabaneta", "Mao", "Bonao", "Monte Plata\t", "Hato Mayor", "San Jos\u00E9 de Ocoa", "Santo Domingo Este"}));
		cbxCiudad.setBounds(70, 95, 148, 23);
		panel.add(cbxCiudad);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 70, 73, 14);
		panel.add(lblDireccion);
		
		txtDireccionEmpresa = new JTextField();
		txtDireccionEmpresa.setBounds(70, 67, 148, 23);
		panel.add(txtDireccionEmpresa);
		txtDireccionEmpresa.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pais:");
		lblNewLabel_1.setBounds(318, 42, 66, 14);
		panel.add(lblNewLabel_1);
		String[ ] pais ={"<Seleccionar>", "Republica Dominicana"};
		cbxPais = new JComboBox();
		cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
		cbxPais.setBounds(354, 39, 156, 23);
		panel.add(cbxPais);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(318, 70, 38, 14);
		panel.add(lblArea);
		 String[ ] area = {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}; 
		cbxArea = new JComboBox();
		cbxArea.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
		cbxArea.setBounds(352, 67, 158, 23);
		panel.add(cbxArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(220, 20, 60));
		panel_2.setBounds(0, 0, 529, 50);
		contentPanel.add(panel_2);
		
		JLabel lblIngresarEmpresa = new JLabel("Ingresar Empresa");
		lblIngresarEmpresa.setForeground(Color.WHITE);
		lblIngresarEmpresa.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblIngresarEmpresa.setBounds(134, 0, 231, 46);
		panel_2.add(lblIngresarEmpresa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos de la empresa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 274, 519, 102);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombreEmpresa = new JLabel("Nombre:");
		lblNombreEmpresa.setBounds(10, 32, 95, 14);
		panel_1.add(lblNombreEmpresa);
		
		txtNombreEmpresa = new JTextField();
		txtNombreEmpresa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()>=65&&e.getKeyCode()<=90||e.getKeyChar()==8||e.getKeyCode()==32||e.getKeyCode()==16)
					System.out.println("");
				else {
					JOptionPane.showMessageDialog(null, "Solo caracteres de tipo letra", "Informaci�n", JOptionPane.WARNING_MESSAGE);
					cleanNombre();}
			}
		});
		txtNombreEmpresa.setBounds(66, 29, 151, 23);
		panel_1.add(txtNombreEmpresa);
		txtNombreEmpresa.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(287, 32, 74, 14);
		panel_1.add(lblTelefono);
		
		txtTelefonoEmpresa = new JFormattedTextField(formatoNumero);
		txtTelefonoEmpresa.setBounds(358, 27, 145, 23);
		panel_1.add(txtTelefonoEmpresa);
		txtTelefonoEmpresa.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 57, 46, 14);
		panel_1.add(lblEmail);
		
		txtEmailEmpresa = new JTextField();
		txtEmailEmpresa.setBounds(66, 57, 151, 23);
		panel_1.add(txtEmailEmpresa);
		txtEmailEmpresa.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 62, 514, 50);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("RNC:");
		lblNewLabel_2.setBounds(12, 10, 38, 16);
		panel_3.add(lblNewLabel_2);
		
		JFormattedTextField txtBuscarRNC = new JFormattedTextField(formatoRNC);
		txtBuscarRNC.setColumns(10);
		txtBuscarRNC.setBounds(69, 6, 148, 23);
		panel_3.add(txtBuscarRNC);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(219, 4, 101, 29);
		panel_3.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtRNC.getText()!=null){
					
					EmpresaSolicitadora emp = null;	
						
					emp=Bolsa.buscarEmpresa(txtBuscarRNC.getText().toString());
			        if (emp!=null) {
				
			

				    String nom=emp.getNombreEmpresa();
			        String direc=emp.getDireccion();
					String emai=emp.getEmailEmpresa();
					String tel=	emp.getTelefonoEmpresa();
			        txtDireccionEmpresa.setText(direc);
			        txtEmailEmpresa.setText(emai);
			        txtNombreEmpresa.setText(nom);
			        txtTelefonoEmpresa.setText(tel);
				    
			        
			        
			        
			        
			        for (int i = 0; i < area.length; i++) {
						String string = area[i];
						
						if(emp.getAreaTrabajo().equalsIgnoreCase(string))
							cbxArea.setSelectedIndex(i);;
						
						
						
					}for (int i = 0; i < ciudad.length; i++) {
						
						
						String string = ciudad[i];
					
						if(emp.getCiudad().equalsIgnoreCase(string))
							cbxCiudad.setSelectedIndex(i);
						
						
					}for (int i = 0; i < pais.length; i++) {
						String string = pais[i];
						
						
						if(emp.getPaisEmpresa().equalsIgnoreCase(string))
						cbxPais.setSelectedIndex(i);
						
					}
					
		
			        
			   
			}else if (emp==null){
				JOptionPane.showMessageDialog(null, "Empresa no encontrada");
				
				
			}
						
					}
				
				
					
					
				
				
				
				
				
			}

		
		});
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
				JButton button_1 = new JButton("Modificar");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EmpresaSolicitadora emp;
						
						
					emp=Bolsa.buscarEmpresa(txtRNC.getText());
						
						if(emp!=null){
						
						
						emp.setDireccion(txtDireccionEmpresa.getText());
						emp.setEmailEmpresa(txtEmailEmpresa.getText());
						emp.setNombreEmpresa(txtNombreEmpresa.getText());
						emp.setRNC(txtRNC.getText());
						emp.setTelefonoEmpresa(txtTelefonoEmpresa.getText());
						
						
						}else{
							
							
							JOptionPane.showMessageDialog(null,"No se encontro la Empresa");
							
							
						}
						
						
						
						
						
						
					}
				});
				button_1.setIcon(new ImageIcon(ModificarEmpresa.class.getResource("/imagenes/un-par-de-flechas-cambiando-lugares.png")));
				button_1.setActionCommand("OK");
				buttonPane.add(button_1);
				
				JButton button = new JButton("Eliminar");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					EmpresaSolicitadora emp;
						
						emp=Bolsa.buscarEmpresa(txtRNC.getSelectedText().toString());
						if(emp!=null){
							
							Bolsa.eliminarEmpresa(emp);
							JOptionPane.showMessageDialog(null, "Operacion Satisfactoria");
							
							
						}else{
							
							JOptionPane.showConfirmDialog(null, "Empresa No encotrada");
							
							
							
							
							
						}
						
						
					
						
						
						
						
						
						
						
						
					}
				});
				button.setIcon(new ImageIcon(ModificarEmpresa.class.getResource("/imagenes/cubo-de-basura (1).png")));
				button.setActionCommand("OK");
				buttonPane.add(button);
			}
			{
				JButton btnCancel = new JButton("Cancelar");
				btnCancel.setIcon(new ImageIcon(RegistrarEmpresaVisual.class.getResource("/imagenes/boton-cancelar.png")));
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}
	public void clean(){
	txtRNC.setText("");
	txtNombreEmpresa.setText("");
	txtDireccionEmpresa.setText("");
	txtTelefonoEmpresa.setText("");
	txtEmailEmpresa.setText("");
	cbxArea.setSelectedIndex(0);
	cbxPais.setSelectedIndex(0);
	cbxCiudad.setSelectedIndex(0);
	}
	
	public void cleanNombre(){
		txtNombreEmpresa.setText(""+txtNombreEmpresa.getText().substring(0, txtNombreEmpresa.getText().length()-1));
	}
}