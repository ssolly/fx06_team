package fx06_team.blog;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BlogProc {

	public void blogPage() {
		System.out.println("blog페이지 이동");
		try {
			Stage blogStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("blogWrite.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			BlogController ctl = loader.getController();
			ctl.setRoot(root);
			
			blogStage.setScene(scene);
			blogStage.setTitle("naver_blog");
			blogStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
