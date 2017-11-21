package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Solicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtFechaSolicitud;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtEstadoCivil;
	private JTextField textField_6;
	private JTextField txtNombreReferente;
	private JTextField txtApellidoReferente;
	private JTextField textField_10;
	private JTextField textField_11;
	private JComboBox cbxPais;
	private JComboBox cbxIdiomas;
	private JRadioButton btnSiMudarse;
	private JRadioButton btnNoMudarse;
	
	ButtonGroup sexo =new ButtonGroup();
	ButtonGroup mudarse =new ButtonGroup();
	ButtonGroup conducir =new ButtonGroup();
	ButtonGroup jornada =new ButtonGroup();
	ButtonGroup nivelEducativo =new ButtonGroup();
	
	//_____Solicitante_______________________//
	private String nombreSolicitante;
	private String apellidoSolicitante;
	private String cedulaSolicitante;
	private String telefonoSolicitante;
    private String sexoSolicitante;
    private String estadoCivilSolicitante;
    private String direccionSolicitante;
    private String paisSolicitante;
  //_______Experiencia laboral_______________//
    private String nombreEmpresa;
    private String areTrabajo;
    private String nombreReferente;
    private String telReferente;
    private JPanel pProfesional;
    private JTextField txtInstitucionProf;
    private JTextField txtInstitucionTecn;
    private JRadioButton btnProfesional;
    private JRadioButton btnTecnico;
    private JRadioButton btnObrero;
    private JRadioButton btnMedioTiempo;
    private JRadioButton btnTiempoCompleto;
    private JRadioButton btnNoLicencia;
    private JRadioButton btnSiLicencia;
    private JRadioButton btnFemenino;
    private JRadioButton btnMasculino;
    private JPanel pTecnico;
    private JPanel pObrero;
    private JScrollPane scrollPaneIdiomas;
    private JTextField textField;
    private JTextField textField_1;
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Solicitudes dialog = new Solicitudes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Solicitudes() {
		setResizable(false);
		setBounds(100, 100, 1000, 632);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombres:");
			lblNombre.setBounds(6, 41, 61, 16);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(79, 36, 506, 26);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtFechaSolicitud = new JTextField();
			txtFechaSolicitud.setEditable(false);
			txtFechaSolicitud.setBounds(824, 6, 146, 26);
			panel.add(txtFechaSolicitud);
			txtFechaSolicitud.setColumns(10);
			
			JLabel lblFecha = new JLabel("Fecha de Solicitud:");
			lblFecha.setBounds(689, 11, 123, 16);
			panel.add(lblFecha);
			
			JLabel lblApellido = new JLabel("Apellidos:");
			lblApellido.setBounds(6, 82, 73, 16);
			panel.add(lblApellido);
			
			txtApellido = new JTextField();
			txtApellido.setColumns(10);
			txtApellido.setBounds(79, 77, 506, 26);
			panel.add(txtApellido);
			
			JLabel lblCedula = new JLabel("Cedula:");
			lblCedula.setBounds(6, 124, 61, 16);
			panel.add(lblCedula);
			
			txtCedula = new JTextField();
			txtCedula.setBounds(79, 119, 208, 26);
			panel.add(txtCedula);
			txtCedula.setColumns(10);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(316, 124, 61, 16);
			panel.add(lblTelefono);
			
			txtTelefono = new JTextField();
			txtTelefono.setBounds(393, 119, 192, 26);
			panel.add(txtTelefono);
			txtTelefono.setColumns(10);
			
			JLabel lblSexo = new JLabel("Sexo:");
			lblSexo.setBounds(6, 169, 61, 16);
			panel.add(lblSexo);
			
			btnMasculino = new JRadioButton("Masculino");
			btnMasculino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sexo.add(btnMasculino);
					sexo.add(btnFemenino);
					
				}
			});
			btnMasculino.setBounds(79, 165, 103, 23);
			panel.add(btnMasculino);
			
			btnFemenino = new JRadioButton("Femenino");
			btnFemenino.setBounds(194, 165, 103, 23);
			panel.add(btnFemenino);
			
			JLabel lblEstadoCivil = new JLabel("Estado Civil:");
			lblEstadoCivil.setBounds(316, 169, 84, 16);
			panel.add(lblEstadoCivil);
			
			txtEstadoCivil = new JTextField();
			txtEstadoCivil.setColumns(10);
			txtEstadoCivil.setBounds(393, 164, 192, 26);
			panel.add(txtEstadoCivil);
			
			JLabel lblNacimiento = new JLabel("Nacimiento:");
			lblNacimiento.setBounds(6, 211, 84, 16);
			panel.add(lblNacimiento);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(79, 206, 208, 26);
			panel.add(textField_6);
			
			JLabel lblPais = new JLabel("Pais:");
			lblPais.setBounds(318, 211, 61, 16);
			panel.add(lblPais);
			
			JLabel lblDisponibilidadDeMudarse = new JLabel("Disponibilidad de Mudarse:");
			lblDisponibilidadDeMudarse.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lblDisponibilidadDeMudarse.setBounds(6, 256, 192, 16);
			panel.add(lblDisponibilidadDeMudarse);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(6, 270, 173, 12);
			panel.add(separator);
			
			JLabel lblJornada = new JLabel("Tipo de Jornada:");
			lblJornada.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lblJornada.setBounds(318, 322, 148, 16);
			panel.add(lblJornada);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(318, 336, 103, 12);
			panel.add(separator_1);
			
			btnSiMudarse = new JRadioButton("Si");
			btnSiMudarse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudarse.add(btnNoMudarse);
					mudarse.add(btnSiMudarse);
				}
			});
			btnSiMudarse.setBounds(79, 284, 54, 23);
			panel.add(btnSiMudarse);
			
			btnNoMudarse = new JRadioButton("No");
			btnNoMudarse.setBounds(194, 285, 54, 23);
			panel.add(btnNoMudarse);
			
			btnMedioTiempo = new JRadioButton("Medio Tiempo");
			btnMedioTiempo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					jornada.add(btnMedioTiempo);
					jornada.add(btnTiempoCompleto);
				}
			});
			btnMedioTiempo.setBounds(316, 381, 123, 23);
			panel.add(btnMedioTiempo);
			
			btnTiempoCompleto = new JRadioButton("Tiempo Completo");
			btnTiempoCompleto.setBounds(439, 350, 149, 23);
			panel.add(btnTiempoCompleto);
			
			JLabel lblLicenciaDeConducior = new JLabel("Licencia de conducir:");
			lblLicenciaDeConducior.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lblLicenciaDeConducior.setBounds(6, 322, 160, 16);
			panel.add(lblLicenciaDeConducior);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBounds(6, 336, 134, 12);
			panel.add(separator_2);
			
			btnSiLicencia = new JRadioButton("Si");
			btnSiLicencia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					conducir.add(btnNoLicencia);
					conducir.add(btnSiLicencia);
				}
			});
			btnSiLicencia.setBounds(79, 350, 54, 23);
			panel.add(btnSiLicencia);
			
			btnNoLicencia = new JRadioButton("No");
			btnNoLicencia.setBounds(194, 350, 54, 23);
			panel.add(btnNoLicencia);
			
			JLabel lblExperienciaLaboral = new JLabel("Experiencia Laboral:");
			lblExperienciaLaboral.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lblExperienciaLaboral.setBounds(6, 383, 146, 16);
			panel.add(lblExperienciaLaboral);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(6, 396, 134, 12);
			panel.add(separator_3);
			
			JLabel lblNombreDeEmpresa = new JLabel("Nombre de Empresa:");
			lblNombreDeEmpresa.setBounds(6, 430, 134, 16);
			panel.add(lblNombreDeEmpresa);
			
			JLabel lblAreaDeTrabajo = new JLabel("Area de Trabajo:");
			lblAreaDeTrabajo.setBounds(6, 465, 127, 16);
			panel.add(lblAreaDeTrabajo);
			
			JLabel lblNombresDeReferente = new JLabel("Nombre de Referente:");
			lblNombresDeReferente.setBounds(6, 498, 146, 16);
			panel.add(lblNombresDeReferente);
			
			JLabel lblTelefono_1 = new JLabel("Telefono de Referente:");
			lblTelefono_1.setBounds(6, 531, 146, 21);
			panel.add(lblTelefono_1);
			
			txtNombreReferente = new JTextField();
			txtNombreReferente.setColumns(10);
			txtNombreReferente.setBounds(150, 425, 449, 26);
			panel.add(txtNombreReferente);
			
			txtApellidoReferente = new JTextField();
			txtApellidoReferente.setColumns(10);
			txtApellidoReferente.setBounds(150, 460, 449, 26);
			panel.add(txtApellidoReferente);
			
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(150, 493, 435, 26);
			panel.add(textField_10);
			
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(150, 526, 435, 26);
			panel.add(textField_11);
			
			JLabel lblIdioma = new JLabel("Idioma:");
			lblIdioma.setBounds(318, 256, 61, 16);
			panel.add(lblIdioma);
			
			cbxIdiomas = new JComboBox();
			cbxIdiomas.setBounds(393, 251, 99, 26);
			panel.add(cbxIdiomas);
			
			cbxPais = new JComboBox();
			cbxPais.setBounds(393, 207, 192, 27);
			panel.add(cbxPais);
			
			JLabel lblNivelEducativo = new JLabel("Nivel educativo:");
			lblNivelEducativo.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lblNivelEducativo.setBounds(753, 82, 115, 16);
			panel.add(lblNivelEducativo);
				
			btnProfesional = new JRadioButton("Profesional");
			btnProfesional.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				nivelEducativo.add(btnProfesional);
					nivelEducativo.add(btnObrero);
					nivelEducativo.add(btnTecnico);
				pObrero.setVisible(false);
				pProfesional.setVisible(true);
				pTecnico.setVisible(false);
					
					
				}
			});
			btnProfesional.setBounds(656, 120, 115, 23);
			panel.add(btnProfesional);
			
			btnTecnico = new JRadioButton("Tecnico");
			btnTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pTecnico.setVisible(true);
					pObrero.setVisible(false);
					pProfesional.setVisible(false);
					
				}
			});
			btnTecnico.setBounds(778, 120, 103, 23);
			panel.add(btnTecnico);
			
			btnObrero = new JRadioButton("Obrero");
			btnObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				pObrero.setVisible(true);
				pProfesional.setVisible(false);
				pTecnico.setVisible(false);
				}
			});
			btnObrero.setBounds(894, 120, 76, 23);
			panel.add(btnObrero);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBounds(753, 101, 109, 12);
			panel.add(separator_4);
			
			JButton btnNewButton = new JButton("Agregar");
			btnNewButton.setBounds(493, 251, 92, 29);
			panel.add(btnNewButton);
			
			pProfesional = new JPanel();
			pProfesional.setBounds(656, 169, 314, 100);
			panel.add(pProfesional);
			pProfesional.setLayout(null);
			
			JLabel lblInstitucion = new JLabel("Institucion:");
			lblInstitucion.setBounds(6, 6, 84, 16);
			pProfesional.add(lblInstitucion);
			
			txtInstitucionProf = new JTextField();
			txtInstitucionProf.setBounds(82, 1, 226, 26);
			pProfesional.add(txtInstitucionProf);
			txtInstitucionProf.setColumns(10);
			
			JLabel lblCarrera = new JLabel("Carrera:");
			lblCarrera.setBounds(6, 47, 61, 16);
			pProfesional.add(lblCarrera);
			
			JComboBox cbxCarrera = new JComboBox();
			cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"              <Seleccione>", "             Ing. Telematica", "                 Ing. Civil", "              Ing. Industrial", "            Ing. Mecatronica", "              Ing. Sistemas"}));
			cbxCarrera.setBounds(82, 39, 226, 26);
			pProfesional.add(cbxCarrera);
			
			pTecnico = new JPanel();
			pTecnico.setLayout(null);
			pTecnico.setBounds(656, 169, 314, 100);
			panel.add(pTecnico);
			
			JLabel label = new JLabel("Institucion:");
			label.setBounds(6, 6, 84, 16);
			pTecnico.add(label);
			
			txtInstitucionTecn = new JTextField();
			txtInstitucionTecn.setColumns(10);
			txtInstitucionTecn.setBounds(82, 1, 226, 26);
			pTecnico.add(txtInstitucionTecn);
			
			JLabel lblTecnico = new JLabel("Tecnico:");
			lblTecnico.setBounds(6, 47, 61, 16);
			pTecnico.add(lblTecnico);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(82, 39, 226, 26);
			pTecnico.add(comboBox_1);
			
			pObrero = new JPanel();
			pObrero.setLayout(null);
			pObrero.setBounds(656, 169, 314, 100);
			panel.add(pObrero);
			
			JLabel lblHabilidad = new JLabel("Habilidad:");
			lblHabilidad.setBounds(6, 47, 79, 16);
			pObrero.add(lblHabilidad);
			
			JComboBox cbxHabilidad = new JComboBox();
			cbxHabilidad.setBounds(82, 39, 226, 26);
			pObrero.add(cbxHabilidad);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(393, 278, 192, 35);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			scrollPaneIdiomas = new JScrollPane();
			scrollPaneIdiomas.setBounds(5, 4, 181, 26);
			panel_1.add(scrollPaneIdiomas);
			
			JLabel lblHola = new JLabel("Hola");
			lblHola.setBounds(656, 324, 46, 14);
			panel.add(lblHola);
			
			textField = new JTextField();
			textField.setBounds(666, 351, 86, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("Casa");
			lblNewLabel.setBounds(656, 385, 46, 14);
			panel.add(lblNewLabel);
			
			textField_1 = new JTextField();
			textField_1.setBounds(666, 407, 86, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
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
}
