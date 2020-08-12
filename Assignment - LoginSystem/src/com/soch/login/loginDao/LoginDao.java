package com.soch.login.loginDao;

import java.sql.*;

import com.soch.login.loginBean.LoginBean;
import com.soch.login.util.DbUtil;

public class LoginDao {

	public static boolean validate(LoginBean bean) {
		boolean status = false;
		try {
			Connection con = DbUtil.getConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE email=? and password=?");

			ps.setString(1, bean.getEmail());
			ps.setString(2, bean.getPassword());
			
			System.out.println(bean.getEmail());
			System.out.println(bean.getPassword());

			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (Exception e) {

		}

		return status;

	}
}
