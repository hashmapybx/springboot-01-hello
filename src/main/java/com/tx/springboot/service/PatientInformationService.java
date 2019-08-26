package com.tx.springboot.service;


import com.tx.springboot.mapper.PatientInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PatientInformationService {

    @Autowired
    PatientInformationMapper patientInformationMapper;

    /**
     * 简单的根据性别来做统计操作
     * @param sex
     * @return
     */

    public Integer countNumberBySex(String sex) {
        return patientInformationMapper.countNumberBySex(sex);
    }


    /**
     * patient表和serise表根据id关联查询 去重之后根据性别做统计
     *
     */
    public Integer countNumber(String sex) {
        return patientInformationMapper.countNumber(sex);
    }


    /**
     * 多条件查询操作
     *
     */
    public List<Integer> mulitCondition(Map map) {
        return patientInformationMapper.mulitCondition(map);
    }


}
