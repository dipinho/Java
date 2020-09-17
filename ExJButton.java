package dipinho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class ExJButton extends JFrame implements ActionListener{
		
		JButton jb = new JButton("Mensagem");
		JButton jb2 = new JButton("Sair");
	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jb) {
				JOptionPane.showMessageDialog(null, "Como fazer duas vezes melhor se você está pelo menos cem vezes atrasado?\nMano Brown");
			}
			if(e.getSource()==jb2) {
				System.exit(0);
			}
		}
		
		public ExJButton() {
			
			jb.addActionListener(this);
			jb2.addActionListener(this);
			
			setLayout(null);
			jb.setBounds(140, 80, 100, 60);
			add(jb);
			jb2.setBounds(290, 80, 100, 60);
			add(jb2);
			
			setTitle("JButton com Ação");
			setSize(500,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);	
		
		}
	
	public static void main(String[] args) {
		new ExJButton();
	}

	
}
