package com.mycompany.service;

import com.mycompany.domain.Emp;
import com.mycompany.rm.EmpRowMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl extends BaseDAO implements EmpService {

    
     @Autowired
     @Override
    public List<Emp> getEmpList() {
        String sql = "SELECT empId,name,salary,remark FROM emp";
        List<Emp> emps = getJdbcTemplate().query(sql, new EmpRowMapper());
        return emps;       
    }

    @Override
    public void save(Emp e) {
       String sql = "INSERT INTO emp(name,salary,remark) VALUES (:name,:salary,:remark)";
      MapSqlParameterSource ps = new  MapSqlParameterSource();
      ps.addValue("name",e.getName());
      ps.addValue("salary",e.getSalary());
      ps.addValue("remark",e.getRemark());
      GeneratedKeyHolder kh = new GeneratedKeyHolder();
      getNamedParameterJdbcTemplate().update(sql,ps,kh);
      e.setEmpId(kh.getKey().intValue());
    }
    
}
