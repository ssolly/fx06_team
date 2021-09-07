package fx06_team.main;

import java.net.URL;
import java.util.ResourceBundle;

import fx06_team.blog.BlogProc;
import fx06_team.common.db.DBClass;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable {

	Parent root;
	DBClass db;
	BlogProc bp;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		db = new DBClass();
		bp = new BlogProc();
		
	}

	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void mail() {
		System.out.println("메일선택");
	}
	
	public void blog() {
		bp.blogPage();
	}
	
	public void cafe() {
		
	}
	
	public void kin() {
		
	}
	
	public void shopping() {
		
	}
	
}
