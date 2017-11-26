package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import logico.Bolsa;
import logico.EmpresaSolicitadora;
import logico.Solicitantes;

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

public class RegistrarEmpresaVisual extends JDialog {

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
	
	public RegistrarEmpresaVisual() {
		setResizable(false);
		setTitle("Registrar Empresa");
		setBounds(100, 100, 463, 382);
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
		panel.setBounds(10, 62, 446, 147);
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
		lblNewLabel_1.setBounds(231, 42, 66, 14);
		panel.add(lblNewLabel_1);
		
		cbxPais = new JComboBox();
		cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Republica Dominicana"}));
		cbxPais.setBounds(282, 38, 156, 25);
		panel.add(cbxPais);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(230, 70, 38, 14);
		panel.add(lblArea);
		
		cbxArea = new JComboBox();
		cbxArea.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Salud", "Educacion", "Turismo", "Ventas", "Comunicion", "Bancario", "Construccion", "Tecnologia", "Agricultura", "Gastronomia"}));
		cbxArea.setBounds(282, 67, 156, 23);
		panel.add(cbxArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(220, 20, 60));
		panel_2.setBounds(0, 0, 463, 50);
		contentPanel.add(panel_2);
		
		JLabel lblIngresarEmpresa = new JLabel("Ingresar Empresa");
		lblIngresarEmpresa.setForeground(Color.WHITE);
		lblIngresarEmpresa.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblIngresarEmpresa.setBounds(134, 0, 231, 46);
		panel_2.add(lblIngresarEmpresa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos de la empresa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 214, 446, 102);
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
		lblTelefono.setBounds(223, 32, 64, 14);
		panel_1.add(lblTelefono);
		
		txtTelefonoEmpresa = new JFormattedTextField(formatoNumero);
		txtTelefonoEmpresa.setBounds(285, 27, 148, 23);
		panel_1.add(txtTelefonoEmpresa);
		txtTelefonoEmpresa.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 57, 46, 14);
		panel_1.add(lblEmail);
		
		txtEmailEmpresa = new JTextField();
		txtEmailEmpresa.setBounds(66, 57, 151, 23);
		panel_1.add(txtEmailEmpresa);
		txtEmailEmpresa.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
