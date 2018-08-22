package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class InquiryServiceImpl implements InquiryService {

 //todo: fetch all the data from  table "City"   
    @Override
    public List<City> getCityList() {
        List<City> cities = new ArrayList();
        cities.add(new City(101,"Rewa"));
        cities.add(new City(102,"Bhopal"));
        cities.add(new City(103,"Satna"));
        cities.add(new City(104,"Guna"));
        cities.add(new City(105,"Sagur"));
        cities.add(new City(106,"Bina"));
        cities.add(new City(107,"Vidisha"));
        cities.add(new City(108,"Katni"));
        cities.add(new City(109,"Jbalpur"));
        cities.add(new City(110,"Indore"));
        return cities;
        
        }

 //todo: fetch all the data from  table "Courses"
    @Override
    public List<String> getCourseList() {
        List<String> courses = new ArrayList<String>();
        courses.add("JAVA");
        courses.add("PYTHON");
        courses.add("C/C++");
        courses.add("ANDROID");       
        courses.add("SWIFT");
        return courses;
        }
    
}
