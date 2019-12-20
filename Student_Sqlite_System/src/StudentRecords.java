import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;


import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import java.text.MessageFormat;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class StudentRecords {

	private JFrame frame;
	private JTextField textStudentID;
	private JTextField textFirstname;
	private JTextField textLastname;
	private JTextField textField_4;
	private JTextField textTotalscore;
	private JTextField textAverage;
	private JTextField textRanking;
	private JTextField textBusiness;
	private JTextField textAddmaths;
	private JTextField textPhysics;
	private JTextField textChemistry;
	private JTextField textComputing;
	private JTextField textBiology;
	private JTextField textEnglish;
	private JTextField textMath;
	private JTable table;
	
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	DefaultTableModel model = new DefaultTableModel();
	
	

	/**
	 * Launch the application.
	 */
	
	public void updateTable()
	{
		conn = SqliteConnection.ConnectDB();
		if(conn != null)
		{
			String sql = "Select StudentID, CourseCode ,Maths, English, Biology, Computing, Chemistry, Physics, AddMaths, Business, TotalScore, Average, Ranking from Student";
			
			try {
				
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				Object[] columnData = new Object[13];
				
				while(rs.next())
				{
					columnData[0] = rs.getString("StudentID");
					columnData[1] = rs.getString("CourseCode");
					columnData[2] = rs.getString("Maths");
					columnData[3] = rs.getString("English");
					columnData[4] = rs.getString("Biology");
					columnData[5] = rs.getString("Computing");
					columnData[6] = rs.getString("Chemistry");
					columnData[7] = rs.getString("Physics");
					columnData[8] = rs.getString("AddMaths");
					columnData[9] = rs.getString("Business");
					columnData[10] = rs.getString("TotalScore");
					columnData[11] = rs.getString("Average");
					columnData[12] = rs.getString("Ranking");	
					
					model.addRow(columnData);
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,e);
			}
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecords window = new StudentRecords();
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
	public StudentRecords() {
		initialize();
		conn = SqliteConnection.ConnectDB();
		
		Object col[] = {"StudentID", "CourseCode", "Maths", "English", "Biology", "Computing", "Chemistry", "Physics", "AddMaths", "Business", "TotalScore", "Average", "Ranking"};
		model.setColumnIdentifiers(col);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Course Code", "Maths", "English", "Biology", "Computing", "Chemistry", "Physics", "Add Maths", "Business", "Total Score", "Average", "Rankings"
			}
		));
		
		updateTable();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.getContentPane().setLayout(null);
		frame.setTitle("Student Database Management System");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBorder(new LineBorder(new Color(135, 206, 235), 12));
		panel.setBounds(10, 11, 894, 325);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(21, 20, 134, 30);
		panel.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("FirstName:");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFirstname.setBounds(21, 55, 134, 30);
		panel.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("LastName:");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLastname.setBounds(21, 90, 134, 30);
		panel.add(lblLastname);
		
		JLabel lblCourseCode = new JLabel("Course Code:");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourseCode.setBounds(21, 125, 134, 30);
		panel.add(lblCourseCode);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRanking.setBounds(21, 265, 134, 30);
		panel.add(lblRanking);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAverage.setBounds(21, 230, 134, 30);
		panel.add(lblAverage);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalScore.setBounds(21, 195, 134, 30);
		panel.add(lblTotalScore);
		
		JLabel lblExamNo = new JLabel("Exam No:");
		lblExamNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblExamNo.setBounds(21, 160, 134, 30);
		panel.add(lblExamNo);
		
		JLabel lblMaths = new JLabel("Maths:");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMaths.setBounds(473, 20, 109, 30);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English:");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnglish.setBounds(473, 55, 109, 30);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology:");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBiology.setBounds(473, 90, 109, 30);
		panel.add(lblBiology);
		
		JLabel lblComputing = new JLabel("Computing");
		lblComputing.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblComputing.setBounds(473, 125, 109, 30);
		panel.add(lblComputing);
		
		JLabel lblChemistry = new JLabel("Chemistry:");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChemistry.setBounds(473, 160, 109, 30);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics:");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhysics.setBounds(473, 195, 109, 30);
		panel.add(lblPhysics);
		
		JLabel lblAddMaths = new JLabel("Add Maths:");
		lblAddMaths.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddMaths.setBounds(473, 230, 109, 30);
		panel.add(lblAddMaths);
		
		JLabel lblBusiness = new JLabel("Business:");
		lblBusiness.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBusiness.setBounds(473, 265, 109, 30);
		panel.add(lblBusiness);
		
		textStudentID = new JTextField();
		textStudentID.setFont(new Font("Tahoma", Font.BOLD, 18));
		textStudentID.setBounds(176, 20, 245, 30);
		panel.add(textStudentID);
		textStudentID.setColumns(10);
		
		textFirstname = new JTextField();
		textFirstname.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFirstname.setColumns(10);
		textFirstname.setBounds(176, 55, 245, 30);
		panel.add(textFirstname);
		
		textLastname = new JTextField();
		textLastname.setFont(new Font("Tahoma", Font.BOLD, 18));
		textLastname.setColumns(10);
		textLastname.setBounds(176, 90, 245, 30);
		panel.add(textLastname);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(176, 160, 245, 30);
		panel.add(textField_4);
		
		textTotalscore = new JTextField();
		textTotalscore.setFont(new Font("Tahoma", Font.BOLD, 18));
		textTotalscore.setEditable(false);
		textTotalscore.setColumns(10);
		textTotalscore.setBounds(176, 195, 245, 30);
		panel.add(textTotalscore);
		
		textAverage = new JTextField();
		textAverage.setFont(new Font("Tahoma", Font.BOLD, 18));
		textAverage.setEditable(false);
		textAverage.setColumns(10);
		textAverage.setBounds(176, 230, 245, 30);
		panel.add(textAverage);
		
		textRanking = new JTextField();
		textRanking.setFont(new Font("Tahoma", Font.BOLD, 18));
		textRanking.setEditable(false);
		textRanking.setColumns(10);
		textRanking.setBounds(176, 265, 245, 35);
		panel.add(textRanking);
		
		textBusiness = new JTextField();
		textBusiness.setFont(new Font("Tahoma", Font.BOLD, 18));
		textBusiness.setColumns(10);
		textBusiness.setBounds(611, 265, 245, 35);
		panel.add(textBusiness);
		
		textAddmaths = new JTextField();
		textAddmaths.setFont(new Font("Tahoma", Font.BOLD, 18));
		textAddmaths.setColumns(10);
		textAddmaths.setBounds(611, 230, 245, 30);
		panel.add(textAddmaths);
		
		textPhysics = new JTextField();
		textPhysics.setFont(new Font("Tahoma", Font.BOLD, 18));
		textPhysics.setColumns(10);
		textPhysics.setBounds(611, 195, 245, 30);
		panel.add(textPhysics);
		
		textChemistry = new JTextField();
		textChemistry.setFont(new Font("Tahoma", Font.BOLD, 18));
		textChemistry.setColumns(10);
		textChemistry.setBounds(611, 160, 245, 30);
		panel.add(textChemistry);
		
		textComputing = new JTextField();
		textComputing.setFont(new Font("Tahoma", Font.BOLD, 18));
		textComputing.setColumns(10);
		textComputing.setBounds(611, 125, 245, 30);
		panel.add(textComputing);
		
		textBiology = new JTextField();
		textBiology.setFont(new Font("Tahoma", Font.BOLD, 18));
		textBiology.setColumns(10);
		textBiology.setBounds(611, 90, 245, 30);
		panel.add(textBiology);
		
		textEnglish = new JTextField();
		textEnglish.setFont(new Font("Tahoma", Font.BOLD, 18));
		textEnglish.setColumns(10);
		textEnglish.setBounds(611, 55, 245, 30);
		panel.add(textEnglish);
		
		textMath = new JTextField();
		textMath.setFont(new Font("Tahoma", Font.BOLD, 18));
		textMath.setColumns(10);
		textMath.setBounds(611, 20, 245, 30);
		panel.add(textMath);
		
		JComboBox jcmbCourseCode = new JComboBox();
		jcmbCourseCode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jcmbCourseCode.setModel(new DefaultComboBoxModel(new String[] {"", "CC90010", "CC90011", "CC90012", "CC90013", "CC90014", "CC90015", "CC90016", "CC90017"}));
		jcmbCourseCode.setBounds(176, 125, 245, 29);
		panel.add(jcmbCourseCode);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(135, 206, 235), 12));
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(914, 11, 364, 325);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		textArea.setBounds(20, 10, 334, 305);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(135, 206, 235), 12));
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBounds(10, 347, 1268, 325);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 22, 1217, 276);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Student Result");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(14, 691, 200, 44);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textArea.setText("");
				
				textArea.append("Student Result Recording Systems"
						+ "\n==============================="
						+ "\nStudent ID:\t\t" + textStudentID.getText()
						+ "\nFirstname:\t\t" + textFirstname.getText()
						+ "\nLastname:\t\t" + textLastname.getText()
						+ "\nMaths:\t\t\t" + textMath.getText()
						+ "\nEnglish:\t\t" + textEnglish.getText()
						+ "\nBiology:\t\t" + textBiology.getText()
						+ "\nComputing:\t\t" + textComputing.getText()
						+ "\nChemistry:\t\t" + textChemistry.getText()
						+ "\nPhysics:\t\t" + textPhysics.getText()
						+ "\nAdd Math:\t\t" + textAddmaths.getText()
						+ "\nBusiness:\t\t" + textBusiness.getText()
						+ "\n ==============================="
						+ "\nTotal Score:\t\t" + textTotalscore.getText()
						+ "\nAverage:\t\t" + textAverage.getText()
						+ "\nRanking:\t\t" + textRanking.getText());				
			}
		});
		
		
		btnTranscript.setForeground(new Color(255, 255, 255));
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTranscript.setBackground(new Color(100, 149, 237));
		btnTranscript.setBounds(224, 691, 200, 44);
		frame.getContentPane().add(btnTranscript);
		
		JButton btnPrint = new JButton("Delete");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			if(table.getSelectedRow() == -1)
			{
				if(table.getRowCount() == 0)
				{
					JOptionPane.showMessageDialog(null, "No data to delete", "Student Result System", JOptionPane.OK_OPTION );
				} else
				{
					JOptionPane.showMessageDialog(null, "Select a row to delete", "Student Result System", JOptionPane.OK_OPTION);
				}
			} else
			{
				model.removeRow(table.getSelectedRow());
			}
			
			
			}
		});
		
		btnPrint.setForeground(new Color(255, 255, 255));
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBackground(new Color(100, 149, 237));
		btnPrint.setBounds(644, 691, 200, 44);
		frame.getContentPane().add(btnPrint);
		
		JButton btnReset = new JButton("Print");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page {0, number,integer}");
				
				try {
					
					table.print();
					
				} catch (java.awt.print.PrinterException ev) {
					System.err.format("No printer found", ev.getMessage());
				}
				
			}
		});
		
		
		
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBackground(new Color(100, 149, 237));
		btnReset.setBounds(434, 691, 200, 44);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Reset");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField temp = null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField"))
					{
						temp = (JTextField)c;
						temp.setText(null);
					}
				}
				textArea.setText(null);
				jcmbCourseCode.setSelectedIndex(0);
				
				
			}
		});
		
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(new Color(100, 149, 237));
		btnExit.setBounds(854, 691, 200, 44);
		frame.getContentPane().add(btnExit);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Student Result  System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				};
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(new Color(100, 149, 237));
		button.setBounds(1068, 691, 200, 44);
		frame.getContentPane().add(button);
		frame.setBounds(0, 0, 1306, 798);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
