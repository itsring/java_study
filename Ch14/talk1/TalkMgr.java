package talk1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ch14.DBConnectionMgr;

public class TalkMgr {
	private DBConnectionMgr pool;
	public TalkMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public boolean loginChk(String id, String passwd) {
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;				
		String sql = null;
		boolean flag = false;
		try {
			con=pool.getConnection();
			sql = "select count(*) from talk where user_name=? and user_passwd=?";
			pstmt = con.prepareStatement(sql);
			/*첫번째, 두번째 ?에 매개변수 세팅*/
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			/*SQL문 실행*/
			rs=pstmt.executeQuery();
			/*rs : select 했을때 결과값과 scheme를 리턴받는 객체*/
			if(rs.next()&&rs.getInt(1)==1) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*con 반납하고 pstmt, rs는 close*/
			pool.freeConnection(con, pstmt, rs);
		}
		return flag;
	}
}
