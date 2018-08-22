package com.mycompany.rm;

import com.mycompany.domain.Emp;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;



public class EmpRowMapper implements RowMapper<Emp> {

    @Override
    public Emp mapRow(ResultSet rs, int i) throws SQLException {
        //fetch a record from rs & bind to Domain object: Emp
        Emp e = new Emp();
        e.setEmpId(rs.getInt("empId"));
        e.setName(rs.getString("name"));
        e.setSalary(rs.getFloat("salary"));
        e.setRemark(rs.getString("remark"));
        return e;
    }
    
}
