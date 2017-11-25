package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import logico.Bolsa;
import logico.EmpresaSolicitadora;
import logico.Solicitudes;
import logico.SolicitudesObrero;
import logico.SolicitudesTecnico;
import logico.SolicitudesUni;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class Macheo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreEmpresa;
	private JTextField txtCiudadEmpresa;
	private JTable table;
	private JTextField txtSalarioSolicitado;
	private JTextField txtPlaza;
	private JTextField textField_6;
	private JTextField txtPorcientoAceptable;
	private JTextField txtCiudadSolicitud;
	private JFormattedTextField txtRNC;
	private JFormattedTextField txtTelefono;
	private JComboBox cbxSolicitudTipo;
	private EmpresaSolicitadora emp;
	private static MaskFormatter formatoRNC;
	private JComboBox cbxID;

	public Macheo() {
		setTitle("Datos");
		setResizable(false);
		setBounds(100, 100, 678, 543);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		try{
			formatoRNC    = new MaskFormatter("#########");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 150, 652, 20);
		contentPanel.add(separator);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(220, 20, 60));
		panel.setBounds(0, 0, 675, 48);
		contentPanel.add(panel);
		
		JLabel lblRealizarMacheo = new JLabel("Matching de datos");
		lblRealizarMacheo.setForeground(Color.WHITE);
		lblRealizarMacheo.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblRealizarMacheo.setBounds(237, 0, 311, 46);
		panel.add(lblRealizarMacheo);
		{
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(0, 48, 675, 100);
			contentPanel.add(panel_1);
			{
				JLabel label = new JLabel("Ingrese el RNC :");
				label.setFont(new Font("Tahoma", Font.BOLD, 18));
				label.setBackground(Color.WHITE);
				label.setBounds(10, 11, 191, 28);
				panel_1.add(label);
			}
			{
				txtRNC = new JFormattedTextField(formatoRNC);
				txtRNC.setForeground(Color.BLACK);
				txtRNC.setColumns(10);
				txtRNC.setBackground(new Color(211, 211, 211));
				txtRNC.setBounds(164, 18, 158, 20);
				panel_1.add(txtRNC);
			}
			{
				JButton button = new JButton("Buscar");
				button.setIcon(new ImageIcon(Macheo.class.getResource("/imagenes/buscador-de-lupa (1).png")));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String RNC;	
					RNC=txtRNC.getText();
					cargarDatos(RNC);
					loadSolicitudes();
					}
				});
				button.setFont(new Font("Tahoma", Font.PLAIN, 14));
				button.setActionCommand("OK");
				button.setBounds(218, 42, 104, 27);
				panel_1.add(button);
			}
			{
				JLabel label = new JLabel("Nombre:");
				label.setFont(new Font("Tahoma", Font.BOLD, 13));
				label.setBounds(398, 13, 68, 14);
				panel_1.add(label);
			}
			{
				txtNombreEmpresa = new JTextField();
				txtNombreEmpresa.setForeground(Color.BLACK);
				txtNombreEmpresa.setEditable(false);
				txtNombreEmpresa.setColumns(10);
				txtNombreEmpresa.setBackground(new Color(211, 211, 211));
				txtNombreEmpresa.setBounds(476, 11, 177, 20);
				panel_1.add(txtNombreEmpresa);
			}
			{
				JLabel label = new JLabel("Telefono:");
				label.setFont(new Font("Tahoma", Font.BOLD, 13));
				label.setBounds(398, 68, 81, 14);
				panel_1.add(label);
			}
			{
				txtCiudadEmpresa = new JTextField();
				txtCiudadEmpresa.setForeground(Color.BLACK);
				txtCiudadEmpresa.setEditable(false);
				txtCiudadEmpresa.setColumns(10);
				txtCiudadEmpresa.setBackground(new Color(211, 211, 211));
				txtCiudadEmpresa.setBounds(476, 38, 177, 20);
				panel_1.add(txtCiudadEmpresa);
			}
			{
				JLabel label = new JLabel("Ciudad:");
				label.setFont(new Font("Tahoma", Font.BOLD, 13));
				label.setBounds(398, 42, 93, 14);
				panel_1.add(label);
			}
			{
				txtTelefono = new JFormattedTextField();
				txtTelefono.setForeground(Color.BLACK);
				txtTelefono.setEditable(false);
				txtTelefono.setColumns(10);
				txtTelefono.setBackground(new Color(211, 211, 211));
				txtTelefono.setBounds(476, 66, 177, 20);
				panel_1.add(txtTelefono);
			}
		}
		{
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nuevos empleados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(6, 285, 656, 186);
			contentPanel.add(panel_1);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
				scrollPane.setBounds(7, 18, 641, 157);
				panel_1.add(scrollPane);
				{
					table = new JTable();
					scrollPane.setViewportView(table);
				}
			}
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos de Solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(6, 159, 656, 124);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		txtSalarioSolicitado = new JTextField();
		txtSalarioSolicitado.setForeground(new Color(0, 0, 0));
		txtSalarioSolicitado.setEditable(false);
		txtSalarioSolicitado.setColumns(10);
		txtSalarioSolicitado.setBackground(new Color(255, 255, 255));
		txtSalarioSolicitado.setBounds(506, 93, 140, 20);
		panel_1.add(txtSalarioSolicitado);
		
		txtPlaza = new JTextField();
		txtPlaza.setForeground(new Color(0, 0, 0));
		txtPlaza.setEditable(false);
		txtPlaza.setColumns(10);
		txtPlaza.setBackground(new Color(255, 255, 255));
		txtPlaza.setBounds(125, 93, 61, 20);
		panel_1.add(txtPlaza);
		
		JLabel lblSolicitudDe = new JLabel("Solicitud de:");
		lblSolicitudDe.setBounds(13, 34, 110, 14);
		panel_1.add(lblSolicitudDe);
		
		cbxSolicitudTipo = new JComboBox();
		cbxSolicitudTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxSolicitudTipo.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
					loadID(cbxSolicitudTipo.getSelectedItem().toString());
				}
			}
		});
		cbxSolicitudTipo.setBounds(125, 31, 193, 20);
		panel_1.add(cbxSolicitudTipo);
		
		JLabel label_5 = new JLabel("Fecha:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(494, 13, 46, 14);
		panel_1.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setText("  "+LocalDate.now());
		textField_6.setForeground(new Color(0, 0, 0));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setBounds(550, 11, 86, 20);
		panel_1.add(textField_6);
		
		JLabel label_1 = new JLabel("Salario solicitado (Mensual):");
		label_1.setBounds(336, 96, 173, 14);
		panel_1.add(label_1);
		
		JLabel label_3 = new JLabel("Plazas:");
		label_3.setBounds(13, 96, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Porciento aceptable:");
		label_4.setBounds(13, 62, 126, 14);
		panel_1.add(label_4);
		
		txtPorcientoAceptable = new JTextField();
		txtPorcientoAceptable.setEditable(false);
		txtPorcientoAceptable.setBounds(125, 62, 71, 20);
		panel_1.add(txtPorcientoAceptable);
		txtPorcientoAceptable.setColumns(10);
		
		JLabel lblCiudadSolicitada = new JLabel("Ciudad Solicitada:");
		lblCiudadSolicitada.setBounds(336, 66, 102, 14);
		panel_1.add(lblCiudadSolicitada);
		
		txtCiudadSolicitud = new JTextField();
		txtCiudadSolicitud.setEditable(false);
		txtCiudadSolicitud.setBounds(473, 63, 173, 20);
		panel_1.add(txtCiudadSolicitud);
		txtCiudadSolicitud.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(219, 68, 56, 14);
		panel_1.add(lblNewLabel);
		
		cbxID = new JComboBox();
		cbxID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbxID.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
					Solicitudes solicitud = Bolsa.buscarSolicitud(cbxID.getSelectedItem().toString());
					txtPorcientoAceptable.setText(Integer.toString((int) solicitud.getPorcientoAceptable()));
					txtPlaza.setText(Integer.toString((int) solicitud.getPlaza()));
					txtCiudadSolicitud.setText(solicitud.getCuidad());
					txtSalarioSolicitado.setText(Integer.toString((int) solicitud.getSalirioSolicitado()));
				}
			}
		});
		cbxID.setBounds(262, 62, 56, 20);
		panel_1.add(cbxID);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setIcon(new ImageIcon(Macheo.class.getResource("/imagenes/ok-appproval-aceptacion.png")));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setIcon(new ImageIcon(Macheo.class.getResource("/imagenes/boton-cancelar.png")));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void cargarDatos(String RNC) {
		emp=Bolsa.buscarEmpresa(RNC);
		String ciudad=emp.getCiudad();
		String nombre= emp.getNombreEmpresa();
	    String pais=	emp.getPaisEmpresa();
	    String tel=emp.getTelefonoEmpresa();;	
		txtCiudadEmpresa.setText(ciudad);
		txtNombreEmpresa.setText(nombre);
		txtTelefono.setText(tel);
		// TODO Auto-generated method stub
	}
	

	private void loadSolicitudes() {
		String tipo = "";
		cbxSolicitudTipo.insertItemAt("<Seleccionar>", 0);
		for (int i = 0; i < emp.getMiSolicitudes().size();i++) {
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesUni){
				SolicitudesUni uni = (SolicitudesUni) emp.getMiSolicitudes().get(i);
				tipo = uni.getCarrera();
			}
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesTecnico){
				SolicitudesTecnico tec = (SolicitudesTecnico) emp.getMiSolicitudes().get(i);
				tipo = tec.getTecnico();
			}
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesObrero){
				SolicitudesObrero obre = (SolicitudesObrero) emp.getMiSolicitudes().get(i);
				tipo = obre.getListaHabilidades().get(0);
			}
			cbxSolicitudTipo.addItem(new String(tipo));	
		}
		cbxSolicitudTipo.setSelectedIndex(0);
	}
	
	private void loadID(String dedicacion) {
		cbxID.insertItemAt("<Seleccionar>", 0);
		for (int i = 0; i < emp.getMiSolicitudes().size();i++) {
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesUni){
				SolicitudesUni uni = (SolicitudesUni) emp.getMiSolicitudes().get(i);
				if (dedicacion.equalsIgnoreCase(uni.getCarrera()))
					cbxID.addItem(new String(Integer.toString(uni.getId())));
			}
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesTecnico){
				SolicitudesTecnico tec = (SolicitudesTecnico) emp.getMiSolicitudes().get(i);
				if (dedicacion.equalsIgnoreCase(tec.getTecnico()))
					cbxID.addItem(new String(Integer.toString(tec.getId())));
				
			}
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesObrero){
				SolicitudesObrero obre = (SolicitudesObrero) emp.getMiSolicitudes().get(i);
				if (dedicacion.equalsIgnoreCase(obre.getListaHabilidades().get(0)))
					cbxID.addItem(new String(Integer.toString(obre.getId())));
				
			}	
		}
		cbxID.setSelectedIndex(0);
	}
}
