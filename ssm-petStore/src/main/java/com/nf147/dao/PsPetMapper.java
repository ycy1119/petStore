package com.nf147.dao;

import com.nf147.entity.PsPet;
import java.util.List;

public interface PsPetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_pet
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_pet
     *
     * @mbg.generated
     */
    int insert(PsPet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_pet
     *
     * @mbg.generated
     */
    PsPet selectByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_pet
     *
     * @mbg.generated
     */
    List<PsPet> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_pet
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PsPet record);

}