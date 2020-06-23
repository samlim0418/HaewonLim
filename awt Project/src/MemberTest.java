import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberTest{

	static MemberDAO dao;
	static Frame f;
	static TextField name, sal, messege;
	static Button btn;
	/**
	 * @wbp.nonvisual location=468,389
	 */
	private static final Button Admin = new Button("New button");
	
	
	public static void main(String[] args) {
		Admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		dao = new MemberDAO();
		f = new Frame("������� ��ȸ ���α׷�");
		f.setSize(501, 414);
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Label lid = new Label("������ : ", Label.RIGHT);
		Label lpwd = new Label("�޿� : ", Label.RIGHT);
		name = new TextField(10);
		sal = new TextField(10);
		messege = new TextField(40);

//      sal.setEchoChar('*');
		btn = new Button("��ȸ");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sal.setText("");
				messege.setText("");
				messege.setSize(300, 400);
				System.out.println(name.getText());
				System.out.println(sal.getText());

				if (name.getText().equals("")) {
					messege.setText("��� ���� �Է��ϼ���");
				} else {
					ArrayList<MemberVo> list = dao.list(name.getText());

					if (list.size() == 0) {
						messege.setText("��� ���� ��ġ�ϴ� ����� �����ϴ�.");
					} else {
						messege.setText("��ȸ�� �Ǿ����ϴ�.");
						 
					}

					for (int i = 0; i < list.size(); i++) {
						MemberVo data = (MemberVo) list.get(i);
						String empno = data.getEmpno();
						String ename = data.getEname();
						String job = data.getJob();
						int iSal = data.getSal();
						sal.setText(Integer.toString(iSal));
						System.out.println(empno + " : " + ename + " : " + sal);
					}
				}
			}

		});
		
		f.add(lid);
		f.add(name);
		f.add(lpwd);
		f.add(sal);
		f.add(btn);
		f.add(messege);
		f.setVisible(true);

//      System.out.print("Input ename...?");
//      Scanner sc = new Scanner(System.in);
//      String inp = sc.next();
//
//      System.out.println(inp);
//      sc.close();
	}
}