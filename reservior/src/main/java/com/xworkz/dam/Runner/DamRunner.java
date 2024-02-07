package com.xworkz.dam.Runner;

import com.xworkz.dam.DTO.Dam;
import com.xworkz.dam.repository.DamRepository;
import com.xworkz.dam.repository.DamRepositoryImpl;
import com.xworkz.dam.service.DamService;
import com.xworkz.dam.service.DamServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DamRunner {
    public static void main(String[] args) {
        //DamRepository damRepository=new DamRepositoryImpl(1,"Krishna","Alimati","karnataka",950d);;
      Dam dam=new Dam(1,"Krishna Dam","Alimati","karnataka",950d);
      //damRepository.saveDetails();
        DamService damService=new DamServiceImpl();
        damService.saveDetails(dam);

          //damService.update("TungaBadra","Hospate","karnataka",550d);

//        List<Dam> dams=new ArrayList<>();
//       Dam dam1=new Dam(1,"krishna","almatti","karnataka",950d);
//       Dam dam2=new Dam(2,"nagarjuna","vijayvada","andrapradesh",500d);
//       dams.add(dam1);
//       dams.add(dam2);
//       damService.saveAll(dams);

       List<Dam> dams1=new ArrayList<>();
       Dam dam3=new Dam(1,"Linganmakki","Sagara","karnataka",555d);
       Dam dam4=new Dam(2,"BasavaSagar","Narayanpura","karnataka",30d);
           damService.updateAll(dams1);

  }
}
