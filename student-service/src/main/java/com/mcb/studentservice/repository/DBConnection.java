package com.mcb.studentservice.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DBConnection {

	protected DataSource					dataSource					= null;

	protected JdbcTemplate					jdbcTemplate				= null;

	protected NamedParameterJdbcTemplate	namedParameterJdbcTemplate	= null;

	@Autowired
	public DBConnection(DataSource dataSource) {
		this.dataSource = dataSource;
		setJdbcTemplate();
		setNamedParameterJdbcTemplate();
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate() {
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate() {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
	}

}
