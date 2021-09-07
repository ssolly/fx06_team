package fx06_team.main;

import java.net.URL;
import java.util.ResourceBundle;

import cafeHjm.CafeController;
import fx06_team.common.db.DBClass;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable {

	CafeController cafe = new CafeController();
	Parent root;
	DBClass db;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		db = new DBClass();

	}

	public void setRoot(Parent root) {
		this.root = root;
	}

	public void mail() {
		System.out.println("메일선택");
	}

	public void blog() {

	}

	public void cafe() {
		System.out.println("카페 선택");

	}

	public void kin() {

	}

	public void shopping() {

	}

}
