package com.mycompany.domain;

public class Emp {
   Integer empId;
   String name;
   Float salary;
   String remark;
   
   public Emp(){
   }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Emp(Integer empId, String name, Float salary, String remark) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.remark = remark;
    }

   }
  

