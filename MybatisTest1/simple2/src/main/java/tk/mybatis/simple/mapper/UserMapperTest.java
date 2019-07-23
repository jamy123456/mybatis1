package tk.mybatis.simple.mapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tk.mybatis.simple.model.User;


public class UserMapperTest {
	private static Logger logger = LoggerFactory.getLogger(UserMapperTest.class);
	private static SqlSessionFactory sqlSessionFactory;
	
	@BeforeClass	
	public static void init() {
		try {
			//初始化读取mybatis-config.xml文件
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			logger.info("==========异常信息：{}===========",e.getMessage());
		}
	}
	
	@Test
	public void selectAll() {
		//打开sql会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			List<User> list = sqlSession.selectList("query");
			logger.info("=========查询结果：{}=========",list.toString());
		}finally {
			sqlSession.close();
		}
		
		
		
		
	}

}
