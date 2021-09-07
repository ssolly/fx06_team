package fx06_team.blog;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class BlogController implements Initializable {

	Parent root;
	BlogService bs;
	BlogDB db;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		bs = new BlogServiceImpl();
		
	}

	public void setRoot(Parent root) {
		this.root = root;
		bs.setRoot(root);
	}
	
	public void regist() {
		System.out.println("등록");
		bs.write(root);
	}
	
	public void cancel() {
		System.out.println("취소");
		
	}
	
	public void goMain() {
		
	}

}
