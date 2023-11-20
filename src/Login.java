import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Usrtxt;
	private JTextField pwtxt;
	private JButton loginbtn;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pwlbl = new JLabel("Password");
		pwlbl.setBounds(182, 151, 62, 19);
		pwlbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(pwlbl);
		
		JLabel usrlbl = new JLabel("User Name");
		usrlbl.setBounds(170, 76, 74, 19);
		usrlbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(usrlbl);
		
		Usrtxt = new JTextField();
		Usrtxt.setBounds(286, 78, 96, 19);
		contentPane.add(Usrtxt);
		Usrtxt.setColumns(10);
		
		pwtxt = new JTextField();
		pwtxt.setBounds(286, 153, 96, 19);
		contentPane.add(pwtxt);
		pwtxt.setColumns(10);
		
		loginbtn = new JButton("Login");
		loginbtn.setBounds(276, 213, 74, 40);
		//loginbtn.setIcon(new ImageIcon("images\\right.png"));
		contentPane.add(loginbtn);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("images\\login.png"));
		lblNewLabel.setBounds(63, 100, 62, 69);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HSU Thinzar\\Downloads\\right.png"));
		lblNewLabel_1.setBounds(231, 213, 47, 40);
		contentPane.add(lblNewLabel_1);
		
		JButton btnnewBtnButton = new JButton("Login");
		btnnewBtnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
