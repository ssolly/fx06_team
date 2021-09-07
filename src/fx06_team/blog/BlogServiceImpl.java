package fx06_team.blog;

import fx06_team.common.alert.AlertClass;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BlogServiceImpl implements BlogService {

	Parent root;
	BlogDB db;
	
	public BlogServiceImpl() {
		db = new BlogDB();
	}
	
	@Override
	public void write(Parent root) {
		
		TextField title = (TextField)root.lookup("#title");
		TextArea blogContent = (TextArea)root.lookup("#blogContent");
		String msg = null;
		
		BlogDTO dto = new BlogDTO();
		dto.setTitle(title.getText());
		dto.setBlogContent(blogContent.getText());
		
		int result = db.write(dto);
		if (result==1) {
			msg = "블로그 작성 완료";
		} else {
			msg = "블로그 작성 실패 : 동일한 제목 존재";
		}
		AlertClass.alert(msg);
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	
}
