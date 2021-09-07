package fx06_team.blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fx06_team.common.db.DBClass;


public class BlogDB {
	
	//public Connection conn;

	public int write(BlogDTO dto) {
		String sql = "insert into BLOG(title,blogContent) values(?,?)";
		int result=0;
		
		try {
			
			PreparedStatement ps = DBClass.conn.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getBlogContent());
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public BlogDTO view(String title) {
		String sql = "select * from BLOG where title = ?";
		BlogDTO dto = null;
		try {
			PreparedStatement ps = DBClass.conn.prepareStatement(sql);
			ps.setString(1, title);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto = new BlogDTO();
				dto.setTitle(rs.getString("title"));
				dto.setBlogContent(rs.getString("blogContent"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
