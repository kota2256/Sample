package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;	//JDBCを使ってSQLを実行できる
	
	public Map<String, Object> findById(String id){		//キー：カラム名（id, name, age）、値：DBの値（型は Object）
		//Select文
		String query = "SELECT * FROM employee WHERE id=?";	//?：プレースホルダー（idが入る）
		
		//検索実行
		Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);
		return employee;
	}
}
