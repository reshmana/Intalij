package com.xworkz.dam.service;

import com.xworkz.dam.DTO.Dam;
import com.xworkz.dam.repository.DamRepository;
import com.xworkz.dam.repository.DamRepositoryImpl;

import javax.naming.Name;
import java.util.List;

public class DamServiceImpl implements DamService{
    DamRepository damRepository=new DamRepositoryImpl();
    @Override
    public void saveDetails(Dam dam) {
        if (dam.getName().isEmpty()){
            System.out.println("please enter valid name");
        }else{
            damRepository.saveDetails(dam);
        }

    }

    @Override
    public void update( String Name, String Place, String State, double Height) {
           if(Name==null|| Name.isEmpty()){
               System.out.println("please enter valid name");
           }
           else{
               damRepository.update(Name,Place,State,Height);
           }
    }
    @Override
    public void saveAll(List<Dam> dams) {
        for (Dam dam:dams){
            if (dam.getName().isEmpty()){
                System.out.println("name is valid");
            }
            else {
                damRepository.saveAll(dams);
            }
        }
    }
    @Override
    public void updateAll(List<Dam> dams1) {
        for (Dam dam:dams1){
            if (dam.getName().isEmpty()){
                System.out.println("name is updated");
            }else {
                damRepository.updateAll(dams1);
            }
        }
    }
}
