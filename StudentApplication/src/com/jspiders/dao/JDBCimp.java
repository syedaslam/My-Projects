package com.jspiders.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jspiders.bean.StudentBean;
import com.mysql.jdbc.Driver;

public class JDBCimp implements StudentDAO {

	Connection con = null;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;
	PreparedStatement pstmt3 = null;
	PreparedStatement pstmt4 = null;
	Statement stmt = null;
	ResultSet rs = null;

	String dburl = "jdbc:mysql://localhost:3306/BECME156_DB";
	String user = "root";
	String pass = "";

	@Override
	public boolean createProfile(StudentBean data) {
		boolean check = false;

		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);
			con = DriverManager.getConnection(dburl, user, pass);
			String query1 = "insert into student_info      values (?, ?, ?, ?)";
			String query2 = "insert into guardian_info     values (?, ?, ?, ?)";
			String query3 = "insert into student_otherinfo values (?, ?, ?)";
			String query4 = "insert into userimage         values (?,?)";
			pstmt1 = con.prepareStatement(query1);
			pstmt2 = con.prepareStatement(query2);
			pstmt3 = con.prepareStatement(query3);
			pstmt4 = con.prepareStatement(query4);

			pstmt1.setInt(1, data.getRegno());
			pstmt1.setString(2, data.getFirstname());
			pstmt1.setString(3, data.getMiddlename());
			pstmt1.setString(4, data.getLastname());
			int count1 = pstmt1.executeUpdate();

			pstmt2.setInt(1, data.getRegno());
			pstmt2.setString(2, data.getG_firstname());
			pstmt2.setString(3, data.getG_middlename());
			pstmt2.setString(4, data.getG_lastname());
			int count2 = pstmt2.executeUpdate();

			pstmt3.setInt(1, data.getRegno());
			pstmt3.setString(2, data.getIsAdmin());
			pstmt3.setString(3, data.getPassword());
			int count3 = pstmt3.executeUpdate();

			/*
			 * pstmt4.setInt(1, data.getRegno()); File imgfile = new File("");
			 * FileInputStream fin = new FileInputStream(imgfile); pstmt4.setBinaryStream(2,
			 * (InputStream)fin, (int)imgfile.length()); int count4 =
			 * pstmt4.executeUpdate();
			 */

			if (count1 > 0 && count2 > 0 && count3 > 0) {
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt1 != null && pstmt2 != null && pstmt3 != null) {
					pstmt1.close();
					pstmt2.close();
					pstmt3.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return check;
	}

	@Override
	public StudentBean login(String regno, String password) {
		StudentBean data = null;
		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);
			con = DriverManager.getConnection(dburl, user, pass);
			String sql = "select * from student_info si, guardian_info gi, student_otherinfo so "
					+ "where si.regno=gi.regno and si.regno=so.regno and si.regno=? and so.pass=?";
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setInt(1, Integer.parseInt(regno));
			pstmt1.setString(2, password);
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				data = new StudentBean();
				data.setRegno(rs.getInt("regno"));
				data.setFirstname(rs.getString("firstname"));
				data.setMiddlename(rs.getString("middlename"));
				data.setLastname(rs.getString("lastname"));
				data.setG_firstname(rs.getString("gfirstname"));
				data.setG_middlename(rs.getString("gmiddlename"));
				data.setG_lastname(rs.getString("glastname"));
				// data.setPhoto(rs.getBinaryStream("image"));
				data.setIsAdmin(rs.getString("isAdmin"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt1 != null) {
				try {
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}

	@Override
	public ArrayList<StudentBean> getAllStudentDetails() {

		ArrayList<StudentBean> studetnList = null;
		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);
			con = DriverManager.getConnection(dburl, user, pass);
			String sql = "select * from student_info si, " + " guardian_info gi, student_otherinfo so "
					+ " where si.regno=so.regno and si.regno=gi.regno";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			studetnList = new ArrayList<StudentBean>();
			while (rs.next()) {
				StudentBean data = new StudentBean();
				data.setRegno(rs.getInt("regno"));
				data.setFirstname(rs.getString("firstname"));
				data.setMiddlename(rs.getString("middlename"));
				data.setLastname(rs.getString("lastname"));
				data.setG_firstname(rs.getString("gfirstname"));
				data.setG_middlename(rs.getString("gmiddlename"));
				data.setG_lastname(rs.getString("glastname"));
				data.setIsAdmin(rs.getString("isAdmin"));
				studetnList.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt1 != null) {
				try {
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return studetnList;
	}

	@Override
	public StudentBean searchStudent(String regno) {
		StudentBean data = null;
		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);
			con = DriverManager.getConnection(dburl, user, pass);
			String sql = "select * from student_info si, guardian_info gi, student_otherinfo so "
					+ "where si.regno=gi.regno and si.regno=so.regno and si.regno=?";
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setInt(1, Integer.parseInt(regno));
			rs = pstmt1.executeQuery();
			while (rs.next()) {
				data = new StudentBean();
				data.setRegno(rs.getInt("regno"));
				data.setFirstname(rs.getString("firstname"));
				data.setMiddlename(rs.getString("middlename"));
				data.setLastname(rs.getString("lastname"));
				data.setG_firstname(rs.getString("gfirstname"));
				data.setG_middlename(rs.getString("gmiddlename"));
				data.setG_lastname(rs.getString("glastname"));
				data.setIsAdmin(rs.getString("isAdmin"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt1 != null) {
				try {
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}

	@Override
	public boolean changePassword(String regno, String oldPassword, String newPassword) {
		boolean check = false;
		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);
			con = DriverManager.getConnection(dburl, user, pass);
			String sql = "update student_otherinfo set pass=? where regno=? and pass=?";
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, newPassword);
			pstmt1.setInt(2, Integer.parseInt(regno));
			pstmt1.setString(3, oldPassword);
			int count = pstmt1.executeUpdate();
			if (count > 0) {
				check = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt1 != null) {
				try {
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return check;
	}

	@Override
	public StudentBean editProfile(String regno) {
		StudentBean data = null;
		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);
			con = DriverManager.getConnection(dburl, user, pass);
			String sql = "select * from student_info si, guardian_info gi, student_otherinfo so "
					+ "where si.regno=gi.regno and si.regno=so.regno and si.regno=?";
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setInt(1, Integer.parseInt(regno));
			rs = pstmt1.executeQuery();
			while (rs.next()) {
				data = new StudentBean();
				data.setRegno(rs.getInt("regno"));
				data.setFirstname(rs.getString("firstname"));
				data.setMiddlename(rs.getString("middlename"));
				data.setLastname(rs.getString("lastname"));
				data.setG_firstname(rs.getString("gfirstname"));
				data.setG_middlename(rs.getString("gmiddlename"));
				data.setG_lastname(rs.getString("glastname"));
				data.setIsAdmin(rs.getString("isAdmin"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt1 != null) {
				try {
					pstmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}

	@Override
	public boolean updateProfile(StudentBean data) {
		boolean check = false;
		try {

			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(dburl, user, pass);
			con.setAutoCommit(false);
			String sql1 = "update student_info set firstname=?, middlename=?, lastname=? where regno = ?";
			String sql2 = "update guardian_info set gfirstname=?, gmiddlename=?, glastname=? where regno = ?";
			pstmt1 = con.prepareStatement(sql1);
			pstmt2 = con.prepareStatement(sql2);

			pstmt1.setString(1, data.getFirstname());
			pstmt1.setString(2, data.getMiddlename());
			pstmt1.setString(3, data.getLastname());
			pstmt1.setInt(4, data.getRegno());

			pstmt2.setString(1, data.getG_firstname());
			pstmt2.setString(2, data.getG_middlename());
			pstmt2.setString(3, data.getG_lastname());
			pstmt2.setInt(4, data.getRegno());

			int count1 = pstmt1.executeUpdate();
			int count2 = pstmt2.executeUpdate();

			if (count1 > 0 && count2 > 0) {
				check = true;
			}
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (pstmt2 != null)
					pstmt2.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}

	@Override
	public boolean deleteStudent(String regno) {
		boolean check = false;
		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);

			con = DriverManager.getConnection(dburl, user, pass);

			String sql1 = "delete from student_info where regno=?";
			String sql2 = "delete from guardian_info where regno=?";
			String sql3 = "delete from student_otherinfo where regno=?";

			pstmt1 = con.prepareStatement(sql1);
			pstmt2 = con.prepareStatement(sql2);
			pstmt3 = con.prepareStatement(sql3);

			pstmt1.setInt(1, Integer.parseInt(regno));
			int count1 = pstmt1.executeUpdate();

			pstmt2.setInt(1, Integer.parseInt(regno));
			int count2 = pstmt2.executeUpdate();

			pstmt3.setInt(1, Integer.parseInt(regno));
			int count3 = pstmt3.executeUpdate();
			if (count1 > 0 && count2 > 0 && count3 > 0) {
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (pstmt2 != null)
					pstmt2.close();
				if (pstmt3 != null)
					pstmt3.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}

	public boolean profilePhoto(String regno, String image) {
		boolean check = false;
		PreparedStatement ps = null;
		try {
			Driver ref = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(ref);
			con = DriverManager.getConnection(dburl, user, pass);
			ps = con.prepareStatement("insert into userimage values(?,?)");
			ps.setInt(1, Integer.parseInt(regno));

			FileInputStream fin = new FileInputStream("d:\\g.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int count = ps.executeUpdate();
			if (count > 0) {
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (ps != null)
					pstmt1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
}
