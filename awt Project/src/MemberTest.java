import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MemberTest {static MemberDAO dao;
static Frame f;
static TextField name, sal, messege;
static Button btn;

public static void main(String[] args) {
	dao = new MemberDAO();
	f = new Frame("사원정보 조회 프로그램");
	f.setSize(460, 100);
	f.setLayout(new FlowLayout());
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	Label lid = new Label("직원명 : ", Label.RIGHT);
	Label lpwd = new Label("급여 : ", Label.RIGHT);
	name = new TextField(10);
	sal = new TextField(10);
	messege = new TextField(40);
	messege.setEditable(false);

//  sal.setEchoChar('*');
	btn = new Button("조회");
	btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sal.setText("");
			messege.setText("");
			System.out.println(name.getText());
			System.out.println(sal.getText());

			if (name.getText().equals("")) {
				messege.setText("사원 명을 입력하세요");
			} else {
				ArrayList<MemberVo> list = dao.list(name.getText());

				if (list.size() == 0) {
					messege.setText("사원 명이 일치하는 사람이 없습니다.");
				} else {
					messege.setText("조회가 되었습니다.");
				}

				for (int i = 0; i < list.size(); i++) {
					MemberVo data = (MemberVo) list.get(i);
					String empno = data.getEmpno();
					String ename = data.getEname();
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

	}
}