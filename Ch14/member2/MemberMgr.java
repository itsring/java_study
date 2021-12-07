package member2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;


public class MemberMgr {

	private DBConnectionMgr pool;

	public MemberMgr() {
		pool = DBConnectionMgr.getInstance();
		
	}
	
	//모든 리스트 가져오기
	public Vector<MemberBean> getMemberList(){
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;				
		String sql = null;
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblmember2";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberBean bean = new MemberBean(rs.getInt("id")
						,rs.getString("name"),rs.getString("phone"),
						rs.getString("team"),rs.getString("address").trim());
//				bean.setId(rs.getInt("id"));
//				bean.setName(rs.getString("name"));
//				bean.setPhone(rs.getString("phone"));
//				bean.setAddress(rs.getString("address"));
//				bean.setTeam(rs.getString("team"));
//				list.add(bean);
				vlist.addElement(bean);
//				System.out.println("id name phone address team");
//				System.out.print(list.get(i).getId()+" ");
//				System.out.print(list.get(i).getName()+" ");
//				System.out.print(list.get(i).getPhone()+" ");
//				System.out.print(list.get(i).getAddress()+" ");
//				System.out.println(list.get(i).getTeam());
//				System.out.println(vlist);		
			}
			
//			if(rs.next()&&rs.getInt(1)==1) {
//				flag=true;
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	//저장하기
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert into ";
			sql +="tblmember2 (name, phone, address, team) ";
			sql +="values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			
			/*적용된 레코드 갯수 리턴 (성공시 1 / 실패시 0)*/
			int cnt = pstmt.executeUpdate();
			if(cnt==1) {
				flag=true;
			}
//			System.out.println("추가 성공!");
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("추가 실패!");
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//회원정보(레코드 1개)
	public MemberBean select(int id) {
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;				
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblmember2 where id =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setTeam(rs.getString("team"));
				bean.setAddress(rs.getString("address"));
				System.out.println(bean.getAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	//수정하기 
	public boolean updateMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update ";
			sql +="tblmember2 set name=?, phone=?, address=?, team=? ";
			sql +="where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getTeam());
			pstmt.setInt(5, bean.getId());
			
			/*적용된 레코드 갯수 리턴 (성공시 1 / 실패시 0)*/
			int cnt = pstmt.executeUpdate();
			if(cnt==1) {
				flag=true;
			}
//			System.out.println("추가 성공!");
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("추가 실패!");
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	//삭제하기
	public boolean deleteMember(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from tblMember2 where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			
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
	
	//team 리스트
	public Vector<String> listTeam(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<String> vlist = new Vector<String>();
		try {
			con = pool.getConnection();
			sql = "select distinct team from tblMember2";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				vlist.addElement(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
}
