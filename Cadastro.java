package dipinho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JTextField txtDataNas;
	private JTextField txtSSP;
	private JTextField txtEmail;
	private JTextField txtEmailConfirm;
	private JTextField txtRG2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(6, 6, 61, 16);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(6, 21, 254, 26);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(6, 54, 61, 16);
		frame.getContentPane().add(lblCPF);
		
		
		txtCPF = new JTextField();
		txtCPF.setBounds(6, 71, 130, 26);
		frame.getContentPane().add(txtCPF);
		//txtCPF.setColumns(10);
		try {
			txtCPF = new JFormattedTextField(new
			MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			e.printStackTrace();
	}
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setBounds(246, 54, 61, 16);
		frame.getContentPane().add(lblRG);
		
		txtRG = new JTextField();
		txtRG.setBounds(246, 71, 130, 26);
		frame.getContentPane().add(txtRG);
		txtRG.setColumns(10);
		
		JLabel lblDataNas = new JLabel("Data de Nascimento");
		lblDataNas.setBounds(6, 104, 130, 16);
		frame.getContentPane().add(lblDataNas);
		
		txtDataNas = new JTextField();
		txtDataNas.setBounds(6, 122, 109, 26);
		frame.getContentPane().add(txtDataNas);
		txtDataNas.setColumns(10);
		
		JLabel lblSSP = new JLabel("Código SSP");
		lblSSP.setBounds(246, 104, 85, 16);
		frame.getContentPane().add(lblSSP);
		
		txtSSP = new JTextField();
		txtSSP.setBounds(246, 122, 130, 26);
		frame.getContentPane().add(txtSSP);
		txtSSP.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(6, 153, 61, 16);
		frame.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(6, 171, 178, 26);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblEmailConfirm = new JLabel("Confirmar E-mail");
		lblEmailConfirm.setBounds(246, 153, 130, 16);
		frame.getContentPane().add(lblEmailConfirm);
		
		txtEmailConfirm = new JTextField();
		txtEmailConfirm.setBounds(246, 171, 178, 26);
		frame.getContentPane().add(txtEmailConfirm);
		txtEmailConfirm.setColumns(10);
		
		JLabel lblStatus = new JLabel("Ativo?");
			lblStatus.setBounds(6, 200, 61, 16);
			frame.getContentPane().add(lblStatus);
		
		JRadioButton rdbtnStatusSim = new JRadioButton("Sim");
			rdbtnStatusSim.setBounds(0, 215, 67, 23);
			frame.getContentPane().add(rdbtnStatusSim);
		
		JRadioButton rdbtnStatusNao = new JRadioButton("Não");
			rdbtnStatusNao.setBounds(66, 215, 61, 23);
			frame.getContentPane().add(rdbtnStatusNao);
		
		JLabel lblPerfil = new JLabel("Perfil");
			lblPerfil.setBounds(246, 200, 61, 16);
			frame.getContentPane().add(lblPerfil);
		
		JComboBox comboBoxPerfil = new JComboBox();
			comboBoxPerfil.setBounds(246, 215, 139, 27);
			comboBoxPerfil.addItem("-Selecione-");
			comboBoxPerfil.addItem("AUXILIAR");
			comboBoxPerfil.addItem("PREPOSTO");
			frame.getContentPane().add(comboBoxPerfil);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNovo.setBounds(45, 250, 117, 29);
		frame.getContentPane().add(btnNovo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(166, 250, 117, 29);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(284, 250, 117, 29);
		frame.getContentPane().add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setBounds(377, 74, 8, 21);
		frame.getContentPane().add(lblNewLabel);
		
		txtRG2 = new JTextField();
		txtRG2.setBounds(391, 71, 33, 26);
		frame.getContentPane().add(txtRG2);
		txtRG2.setColumns(10);
	}
}
