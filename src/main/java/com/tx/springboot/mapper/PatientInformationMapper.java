package com.tx.springboot.mapper;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 操作病人信息的数据库
 */

@Repository
public interface PatientInformationMapper {

    /**
     * 根据性别字段统计信息
     *
     */
    Integer countNumberBySex(String Sex);


    /**
     *
     */
    Integer countNumber(String sex);



    List<Integer>  mulitCondition(@Param("map") Map map);

}
