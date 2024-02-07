package com.xworkz.dam.repository;

import com.xworkz.dam.DTO.Dam;

import java.util.List;

public interface DamRepository {
    public void saveDetails(Dam dam);
    public  void update(String Name,String Place,String State, double Height);

    public void saveAll(List<Dam> dams);
    public void updateAll(List<Dam> dams1);
}
