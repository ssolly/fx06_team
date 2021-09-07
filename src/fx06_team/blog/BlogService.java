package fx06_team.blog;

import javafx.scene.Parent;

public interface BlogService {

	public void setRoot(Parent root);
	public void write(Parent root);
	public void edit();
	public void delete();
	public void viewContent();
	public void viewList();
	
}
