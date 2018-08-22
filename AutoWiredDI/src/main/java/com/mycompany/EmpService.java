package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    private DatabaseParam databaseParam;
    @Autowired
    public void setDatabaseParam(DatabaseParam databaseParam){
        System.out.println("setDatabaseParam");
        this.databaseParam=databaseParam;
    }
    public void save(Emp e)throws Exception{
        Class.forName(databaseParam.getDriverClassName());
        Connection conn = DriverManager.getConnection(databaseParam.getUrl(),databaseParam.getUsername(),databaseParam.getPassword());
        String sql = "INSERT INTO s VALUES (?,?)";
        PreparedStatement  pst=conn.prepareStatement(sql);
        pst.setString(1,e.getUser_name());
        pst.setString(2,e.getPassword());
        pst.executeUpdate();
    }
}
