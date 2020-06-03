package com.wenpeng.fan.service;

import com.wenpeng.fan.entity.Person;
import com.wenpeng.fan.entity.Persondetail;

public interface PersonService {
    public void  insertpd(Persondetail persondetail);
    public int insert(Person person);
    public void deleteByid(int id);
    public Person getPerbyid(int id);
    public Person getPerangtetailbyid(int id);
    public Person getAll();
    public void updataPer(Person person);

}
