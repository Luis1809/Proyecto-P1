package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import org.jfree.chart.ChartPanel;

import graficos.BarData;
import graficos.ChartFactoryCreator;
import logico.Bolsa;
import logico.EmpresaSolicitadora;
import logico.Obrero;
import logico.Solicitantes;
import logico.Solicitudes;
import logico.SolicitudesObrero;
import logico.SolicitudesTecnico;
import logico.SolicitudesUni;
import logico.Tecnico;
import logico.Universitario;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

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
	private EmpresaSolicitadora emp;
	private static MaskFormatter formatoRNC;
	private JComboBox cbxID;
	private JTable tblCuentas;
	private static Object[] fila;
	private static DefaultTableModel model;
	private JButton okButton;
	private JTextField txtEstadoSolicitud;
	private JProgressBar progressBar;

	public Macheo() {
		setTitle("Datos");
		setResizable(false);
		setBounds(100, 100, 678, 563);
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 150, 652, 20);
		contentPanel.add(separator);
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
				txtRNC.setBounds(164, 18, 158, 23);
				panel_1.add(txtRNC);
			}
			{
				JButton button = new JButton("Buscar");
				button.setIcon(new ImageIcon(Macheo.class.getResource("/imagenes/buscador-de-lupa (1).png")));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (txtRNC.getText().toString().equalsIgnoreCase("")||Bolsa.buscarEmpresa(txtRNC.getText().toString())==null){
						JOptionPane.showMessageDialog(null, "No se ha encontrado la empresa", "Informacion", JOptionPane.WARNING_MESSAGE);
					}
					else{
					emp=null;
					cbxID.removeAllItems();
					clean();
					okButton.setEnabled(false);
					String RNC;	
					RNC=txtRNC.getText();
					//txtRNC.setText("");
					cargarDatos(RNC);
					loadSolicitudes();}
					}
				}
					
				);
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
				txtNombreEmpresa.setBounds(476, 11, 177, 23);
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
				txtCiudadEmpresa.setBounds(476, 38, 177, 23);
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
				txtTelefono.setBounds(476, 66, 177, 23);
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
			String[] columnName = {"Cedula","Nombre","Edad","Telefono","Porciento", "Fecha"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(columnName);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
				scrollPane.setBounds(7, 18, 641, 157);
				panel_1.add(scrollPane);
				{
					table= new JTable();
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.setForeground(Color.WHITE);
					table.setBackground(new Color(220, 20, 60));
					table.setModel(model);
					scrollPane.setViewportView(table);//
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
		txtSalarioSolicitado.setBounds(473, 93, 173, 23);
		panel_1.add(txtSalarioSolicitado);
		
		txtPlaza = new JTextField();
		txtPlaza.setForeground(new Color(0, 0, 0));
		txtPlaza.setEditable(false);
		txtPlaza.setColumns(10);
		txtPlaza.setBackground(new Color(255, 255, 255));
		txtPlaza.setBounds(125, 62, 186, 23);
		panel_1.add(txtPlaza);
		
		JLabel lblSolicitudDe = new JLabel("Solicitud de:");
		lblSolicitudDe.setBounds(13, 34, 110, 14);
		panel_1.add(lblSolicitudDe);
		
		JLabel label_5 = new JLabel("Fecha:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_5.setBounds(473, 6, 46, 14);
		panel_1.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setText("  "+LocalDate.now());
		textField_6.setForeground(new Color(0, 0, 0));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setBounds(536, 3, 110, 23);
		panel_1.add(textField_6);
		
		JLabel lblSalarioSolicitado = new JLabel("Salario solicitado:");
		lblSalarioSolicitado.setBounds(336, 96, 173, 14);
		panel_1.add(lblSalarioSolicitado);
		
		JLabel label_3 = new JLabel("Plazas:");
		label_3.setBounds(13, 65, 46, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Porciento aceptable:");
		label_4.setBounds(13, 96, 126, 14);
		panel_1.add(label_4);
		
		txtPorcientoAceptable = new JTextField();
		txtPorcientoAceptable.setEditable(false);
		txtPorcientoAceptable.setBounds(125, 93, 186, 23);
		panel_1.add(txtPorcientoAceptable);
		txtPorcientoAceptable.setColumns(10);
		
		JLabel lblCiudadSolicitada = new JLabel("Ciudad Solicitada:");
		lblCiudadSolicitada.setBounds(336, 66, 102, 14);
		panel_1.add(lblCiudadSolicitada);
		
		txtCiudadSolicitud = new JTextField();
		txtCiudadSolicitud.setEditable(false);
		txtCiudadSolicitud.setBounds(473, 63, 173, 23);
		panel_1.add(txtCiudadSolicitud);
		txtCiudadSolicitud.setColumns(10);
		
		cbxID = new JComboBox();
		cbxID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((cbxID.getSelectedItem()==null||cbxID.getSelectedItem().toString()==""))
					System.out.println("");
				else{
					if(!cbxID.getSelectedItem().toString().equalsIgnoreCase("<Seleccionar>")){
						Solicitudes solicitud = Bolsa.buscarSolicitud((cbxID.getSelectedItem().toString()));
						if(solicitud!=null){
							txtPorcientoAceptable.setText(Integer.toString((int) solicitud.getPorcientoAceptable()));
							txtPlaza.setText(Integer.toString((int) solicitud.getPlaza()));
							txtCiudadSolicitud.setText(solicitud.getCuidad());
							txtSalarioSolicitado.setText(Integer.toString((int) solicitud.getSalirioSolicitado()));
							okButton.setEnabled(true);
						}
					}
					else
						okButton.setEnabled(false);
				}
			}
		});
		cbxID.setBounds(125, 31, 186, 23);
		panel_1.add(cbxID);
		
		JLabel lblNewLabel = new JLabel("Solicitud:");
		lblNewLabel.setBounds(336, 34, 87, 14);
		panel_1.add(lblNewLabel);
		
		txtEstadoSolicitud = new JTextField();
		txtEstadoSolicitud.setEditable(false);
		txtEstadoSolicitud.setBounds(473, 33, 173, 23);
		panel_1.add(txtEstadoSolicitud);
		txtEstadoSolicitud.setColumns(10);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(40, 474, 601, 14);
		contentPanel.add(progressBar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(220, 20, 60));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Match");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Solicitudes s = Bolsa.buscarSolicitud((cbxID.getSelectedItem().toString()));
						String RNC = emp.getRNC();
						Bolsa.RealizarMacheo(s, RNC);
						funcionTiempo();
					}
				});
				okButton.setEnabled(false);
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
		boolean ingresar=true;
		cbxID.insertItemAt("<Seleccionar>", 0);
		for (int i = 0; i < emp.getMiSolicitudes().size();i++) {
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesUni){
				SolicitudesUni uni = (SolicitudesUni) emp.getMiSolicitudes().get(i);
				tipo = uni.getId();
			}
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesTecnico){
				SolicitudesTecnico tec = (SolicitudesTecnico) emp.getMiSolicitudes().get(i);
				tipo = tec.getId();
			}
			if ( emp.getMiSolicitudes().get(i) instanceof SolicitudesObrero){
				SolicitudesObrero obre = (SolicitudesObrero) emp.getMiSolicitudes().get(i);
				tipo = obre.getId();
			}
				cbxID.addItem(new String(tipo));	
		}
		cbxID.setSelectedIndex(0);
	}
	public void loadTable(String ID) {
		int a=0;
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int b=0; b<emp.getMiSolicitudes().size();b++){
			if(emp.getMiSolicitudes().get(b).getId().equalsIgnoreCase(ID)){
				for (int i = 0; i < emp.getMiSolicitudes().get(b).getMiSolicitantes().size(); i++) {
					fila[0] = emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getCedula();
					fila[1] = emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getNombre()+emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getApellido();
					fila[2] = mayorEdad(emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i));
					fila[3] = emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getTelefono();
					if(emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getPorciento()>99)
						fila[4] = "100"+"%";
					else
						fila[4] = emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getPorciento()+"%";
					fila[5] = emp.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getFecha();
					model.addRow(fila);
					
				}
			}
			a=b;
		}
		if(emp.getMiSolicitudes().get(a).getMiSolicitantes().size()<emp.getMiSolicitudes().get(a).getPlaza()){
			txtEstadoSolicitud.setText("Incompleto");
		}
		else
			txtEstadoSolicitud.setText("Satisfecha");
	}
	public int mayorEdad(Solicitantes vac){
		 Calendar today = Calendar.getInstance();
		    Calendar birthDate = Calendar.getInstance();
		    int age = 0;

		    birthDate.setTime(vac.getFechaNacimiento());
		    if (birthDate.after(today)) {
		        throw new IllegalArgumentException("Verifique su fecha de nacimiento");
		    }

		    age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		    // If birth date is greater than todays date (after 2 days adjustment of leap year) then decrement age one year   
		    if ( (birthDate.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) > 3) ||
		            (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH ))){
		        age--;

		     // If birth date and todays date are of same month and birth day of month is greater than todays day of month then decrement age
		    }else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH )) &&
		              (birthDate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH ))){
		        age--;
		    }
	
		    return age;
	}
	
	public void clean(){
		txtEstadoSolicitud.setText("");
		txtCiudadSolicitud.setText("");
		txtPorcientoAceptable.setText("");
		txtSalarioSolicitado.setText("");
		txtPlaza.setText("");
	}
	
	public void funcionTiempo(){
		boolean seguir=false;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        progressBar.setValue(i);
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Macheo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                loadTable(cbxID.getSelectedItem().toString());
				Principal.cargarBarra();
				Principal.cargarPIE();
            }
        });
        thread.start();
    }
	
}
	
