package com.ict.dao;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class OracleConnectionPoolTest {

	
	@Autowired
	private DataSource dataSource;
	
	
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	
	
	@Test
	public void testConnection() {
		try(Connection con = dataSource.getConnection()){
			log.info(con);
			log.info("hikariCP connection");
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	

	
	
	@Test
	public void testMyBaatis() {
		try(SqlSession session = sqlSessionFactory.openSession();
				Connection con = session.getConnection();   ){
			
			log.info(session);
			log.info(con);
			System.out.println("마이바티스 연결시작");
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
}
