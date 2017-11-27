package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import logico.Bolsa;
import logico.EmpresaSolicitadora;
import logico.Obrero;
import logico.Solicitantes;
import logico.Tecnico;
import logico.Universitario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class SolicitantesContratados extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombreEmpresa;
	private JTextField txtciudadEmpresa;
	private JFormattedTextField txtRNC;
	private JFormattedTextField txttelefonoEmpresa;
	private static MaskFormatter formatoCedula;
    private static MaskFormatter formatoNumero;
	private static MaskFormatter formatoRNC;
	private static Object[] fila;
	private static DefaultTableModel model;
	private EmpresaSolicitadora miEmpresa;
	private JTable table;

	public SolicitantesContratados() {
		setResizable(false);
		setBounds(100, 100, 678, 510);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
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
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 47, 675, 108);
		contentPanel.add(panel);
		
		JLabel label = new JLabel("Ingrese el RNC :");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 191, 28);
		panel.add(label);
		
		txtRNC = new JFormattedTextField(formatoRNC);
		txtRNC.setForeground(Color.BLACK);
		txtRNC.setColumns(10);
		txtRNC.setBackground(new Color(211, 211, 211));
		txtRNC.setBounds(164, 18, 158, 23);
		panel.add(txtRNC);
		
		JButton button = new JButton("Buscar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtRNC.getText().toString().equalsIgnoreCase("")||Bolsa.buscarEmpresa(txtRNC.getText().toString())==null){
					JOptionPane.showMessageDialog(null, "No se ha encontrado la empresa", "Informaci�n", JOptionPane.WARNING_MESSAGE);
				}
				else{
				miEmpresa = Bolsa.buscarEmpresa(txtRNC.getText().toString());
				txtnombreEmpresa.setText(miEmpresa.getNombreEmpresa());
				txtciudadEmpresa.setText(miEmpresa.getCiudad());
				txttelefonoEmpresa.setText(miEmpresa.getTelefonoEmpresa());	
				loadTable();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setActionCommand("OK");
		button.setBounds(218, 42, 104, 27);
		panel.add(button);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(360, 20, 68, 14);
		panel.add(label_1);
		
		txtnombreEmpresa = new JTextField();
		txtnombreEmpresa.setForeground(Color.BLACK);
		txtnombreEmpresa.setEditable(false);
		txtnombreEmpresa.setColumns(10);
		txtnombreEmpresa.setBackground(new Color(211, 211, 211));
		txtnombreEmpresa.setBounds(438, 18, 177, 23);
		panel.add(txtnombreEmpresa);
		
		JLabel label_2 = new JLabel("Telefono:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(360, 75, 81, 14);
		panel.add(label_2);
		
		txtciudadEmpresa = new JTextField();
		txtciudadEmpresa.setForeground(Color.BLACK);
		txtciudadEmpresa.setEditable(false);
		txtciudadEmpresa.setColumns(10);
		txtciudadEmpresa.setBackground(new Color(211, 211, 211));
		txtciudadEmpresa.setBounds(438, 45, 177, 23);
		panel.add(txtciudadEmpresa);
		
		JLabel label_3 = new JLabel("Ciudad:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(360, 49, 93, 14);
		panel.add(label_3);
		
		txttelefonoEmpresa = new JFormattedTextField();
		txttelefonoEmpresa.setForeground(Color.BLACK);
		txttelefonoEmpresa.setEditable(false);
		txttelefonoEmpresa.setColumns(10);
		txttelefonoEmpresa.setBackground(new Color(211, 211, 211));
		txttelefonoEmpresa.setBounds(438, 73, 177, 23);
		panel.add(txttelefonoEmpresa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(220, 20, 60));
		panel_1.setBounds(0, 0, 675, 48);
		contentPanel.add(panel_1);
		
		JLabel lblSolicitantesContratados = new JLabel("Solicitantes Contratados");
		lblSolicitantesContratados.setForeground(Color.WHITE);
		lblSolicitantesContratados.setFont(new Font("Cambria", Font.PLAIN, 27));
		lblSolicitantesContratados.setBounds(234, 0, 316, 46);
		panel_1.add(lblSolicitantesContratados);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		//panel_2.setBounds(10, 166, 652, 271);
		contentPanel.add(panel_2);
		String[] columnName = {"Categoria","Profesion","Cedula","Nombre","Edad","Telefono","Porciento"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(columnName);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPanel.add(scrollPane);
		scrollPane.setBounds(10, 166, 652, 271);
		
			table = new JTable();
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setForeground(Color.WHITE);
			table.setBackground(new Color(220, 20, 60));
			table.setModel(model);
			scrollPane.setViewportView(table);//
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	public void loadTable() {
		int a=0;
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int b=0; b<miEmpresa.getMiSolicitudes().size();b++){
			for (int i = 0; i < miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().size(); i++) {
				String tipo="";
				if(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i) instanceof Universitario)
					tipo="Universitario";
				if(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i) instanceof Obrero)
					tipo="Obrero";
				if(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i) instanceof Tecnico)
					tipo="Tecnico";
				
				fila[0]=tipo;
				String profesion="";
				if(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i) instanceof Universitario)
					profesion = (String) ((Universitario) miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i)).getCarrera();
				if(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i) instanceof Obrero)
					profesion = (String) ((Obrero) miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i)).getListaHabilidades().get(0);
				if(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i) instanceof Tecnico)
					profesion = (String) ((Tecnico) miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i)).getInstitucion();
				 
				fila[1]= profesion;
				fila[2] = miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getCedula();
				fila[3] = miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getNombre()+miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getApellido();
				fila[4] = mayorEdad(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i));
				fila[5] = miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getTelefono();
				if(miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getPorciento()>99)
					fila[6] = "100"+"%";
				else
					fila[6] = miEmpresa.getMiSolicitudes().get(b).getMiSolicitantes().get(i).getPorciento()+"%";
				model.addRow(fila);
					
			}
		}
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
}
