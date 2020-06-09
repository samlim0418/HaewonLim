import java.awt.*;
import java.awt.event.*;


public class Main { static MemberDAO dao;
static TextField id, pwd;
static Button btn;

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("PassWord : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');
		
		btn = new Button("확인");
		//btn.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
				//id.setText("");
				//pwd.setText("");
				//System.out.println(user.getText());
				//System.out.println(sal.getText());
		//if (id = dao.user) {
			//return MemberTest.f;
		//}
		//}
		//};
		
		//Dialog info = new Dialog(f, "information", true);
		//info.setSize(140, 90);
		//info.setLocation(50, 50);
		//info.setLayout(new FlowLayout());
		
		//Label msg = new Label("틀렸습니다.", Label.CENTER);
		//Button ok = new Button("확인");
		//info.add(msg);
		//info.add(ok);
		
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(btn);
		f.setVisible(true);
		//info.setVisible(true);

				
	}
}
