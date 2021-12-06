package member2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class ZipcodeMgr {
	private DBConnectionMgr pool;
	public ZipcodeMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	public Vector<ZipcodeBean> zipCodeRead(String area3){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblZipcode where area3 like ? ";
			pstmt = con.prepareStatement(sql);
			
			/*? -> '%강남대로%'*/
			pstmt.setString(1, "%"+area3+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				bean.setZipcode(rs.getString(1));// zipcode 컬럼
				bean.setArea1(rs.getString(2));// zipcode 컬럼
				bean.setArea2(rs.getString(3));// zipcode 컬럼
				bean.setArea3(rs.getString(4));// zipcode 컬럼
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return vlist;
	}
}
