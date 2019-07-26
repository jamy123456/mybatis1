package tk.mybatis.simple.mapper;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import tk.mybatis.simple.model.User;

public class TestUserAndRole {
	private static Logger logger = LoggerFactory.getLogger(TestUserAndRole.class);
	
	public static SqlSession getSession() {
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession sqlSession = null;
		try {
			//初始化读取mybatis-config.xml文件
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			logger.info("==========异常信息：{}===========",e.getMessage());
		}
		return sqlSession;
	}
	
	
//	@Test
//	public void testUserRole() {
//		SqlSession sqlSession = null;
//		try {
//			sqlSession = getSession();
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//			User user = userMapper.nestQuery(1);
//			logger.info("=======User:{}========", user.toString());
//			
//			Assert.assertNotNull(user);
//			
//			Assert.assertNotNull(user.getRole());
//		} finally {
//			if (null != sqlSession) {
//				sqlSession.close();
//			}
//		}
//	}
	
//	@Test
//	public void testInsertUser() {
//		SqlSession sqlSession = null;
//		try {
//			sqlSession = getSession();
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//			User user = new User();
//			user.setName("李四");
//			user.setAge("23");
//			user.setAddress("安徽池州");
//			int a = userMapper.insertUser(user);
//			logger.info("=======插入{}个用户,用户信息为:{}========", a, user.toString());			
//		} finally {
//			sqlSession.commit();
//			if (null != sqlSession) {
//				sqlSession.close();
//			}
//		}
//	}
	
//	@Test
//	public void testUpdateUser() {
//		SqlSession sqlSession = null;
//		try {
//			sqlSession = getSession();
//			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//			User user = new User();
//			user.setName("张三");
//			user.setId(10);
//			int a = userMapper.updateUser(user);
//			logger.info("=======修改{}个用户,用户信息为:{}========", a, user.toString());			
//		} finally {
//			sqlSession.commit();
//			if (null != sqlSession) {
//				sqlSession.close();
//			}
//		}
//	}
	
	@Test
	public void testDeleteUser() {
		SqlSession sqlSession = null;
		try {
			sqlSession = getSession();
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User();
			user.setId(8);
			int a = userMapper.deleteUser(user);
			logger.info("=======删除{}个用户,用户信息为:{}========", a, user.toString());			
		} finally {
			sqlSession.commit();
			if (null != sqlSession) {
				sqlSession.close();
			}
		}
	}

}
