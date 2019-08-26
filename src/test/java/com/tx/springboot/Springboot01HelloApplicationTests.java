package com.tx.springboot;

import com.tx.springboot.mapper.PatientInformationMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01HelloApplicationTests {

    @Test
    public void contextLoads() {
    }



    @Autowired
    PatientInformationMapper patientInformationMapper;

    @Test
    public void muliteQuery() {
        Map<String,String> map  =new HashMap<String, String>();
        map.put("manu_facture", "UIH");
        map.put("stu_a", "23");
        map.put("stu_b", "45");
        map.put("sex", "M");
        List<Integer> integers = patientInformationMapper.mulitCondition(map);
        for(Integer id: integers) {
            System.err.println(id);
        }


    }

}
