package ch14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*DB연동 기능의 클래스(select/ insert, update, delete)*/
public class ChatMgr3 {
	
	private DBConnectionMgr pool;
	
	
	public ChatMgr3() {
		// pool 객체 안에 DB 연결 객체 Connection 10개 생성
		pool = DBConnectionMgr.getInstance();
	}
	//select
	public boolean loginChk(String id, String passwd) {
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;				
		String sql = null;
		boolean flag = false;
		try {
			con=pool.getConnection();
			sql = "select count(id) from tblMember where id=? and pwd=?";
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
	
	//insert
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert tblMember \r\n"
					+ "values (?,?,?,?,?)";
			//pstmt = PrepareStaTeMenT
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPwd());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getPhone());
			pstmt.setString(5, bean.getTeam());
			/*DML 실행은 적용된 레코드 갯수가 리턴됨*/
			int cnt = pstmt.executeUpdate();
			if(cnt ==1 ) {
				/*flag = 깃발 / 프로그래밍에서는 '제어권'이라는 뜻으로 사용 */
				flag =true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	//update
	public boolean updateMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update tblMember set  pwd=?, name=?, phone=?,team=? "
					+"where id=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getPwd());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getPhone());
			pstmt.setString(4, bean.getTeam());
			pstmt.setString(5, bean.getId());
			int cnt = pstmt.executeUpdate();
			if(cnt==1) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	//delete
	public boolean deleteMember(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from tblMember where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			int cnt = pstmt.executeUpdate();
			if(cnt == 1) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	public static void main(String[] args) {
		ChatMgr3 mgr = new ChatMgr3();
		MemberBean bean = new MemberBean(); 
//		System.out.println(mgr.loginChk("aaa", "1234"));
		bean.setId("ddd");
		bean.setPwd("1234");
		bean.setName("장발장");
		bean.setPhone("010-4567-8910");
		bean.setTeam("인물");
//		System.out.println(mgr.insertMember(bean));
		bean.setPwd("1233");
		bean.setName("장장발");
		bean.setPhone("010-4567-8911");
		bean.setTeam("인물");
//		System.out.println(mgr.updateMember(bean));
//		System.out.println(mgr.deleteMember("ddd"));
		
	}
		
	
}
