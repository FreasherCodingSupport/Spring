package com.mycompany;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl extends BaseDAO implements EmpService {

    @Override
    public List<Emp> getEmpList() {
        String sql = "SELECT empId,name,salary,remark FROM emp"; 
        List<Emp> emps = getJdbcTemplate().query(sql, new EmpRowMapper());;
        return emps;
        
        }
    
}
