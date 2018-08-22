package com.mycompany.service;

import com.mycompany.domain.Emp;
import java.util.List;

public interface EmpService {
   public List<Emp> getEmpList();
   public void save(Emp e);
  //todo:other biz logic
}
