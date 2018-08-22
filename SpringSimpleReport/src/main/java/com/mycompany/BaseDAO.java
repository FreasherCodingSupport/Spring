package com.mycompany;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;


public class BaseDAO extends NamedParameterJdbcDaoSupport {

    @Autowired
    public void setDS( DataSource dataSource){
    super.setDataSource(dataSource);
    }
    
}
