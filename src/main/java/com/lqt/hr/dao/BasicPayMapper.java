package com.lqt.hr.dao;

import com.lqt.hr.model.BasicPay;
import com.lqt.hr.model.BasicPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicPayMapper {
    long countByExample(BasicPayExample example);

    int deleteByExample(BasicPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasicPay record);

    int insertSelective(BasicPay record);

    List<BasicPay> selectByExample(BasicPayExample example);

    BasicPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasicPay record, @Param("example") BasicPayExample example);

    int updateByExample(@Param("record") BasicPay record, @Param("example") BasicPayExample example);

    int updateByPrimaryKeySelective(BasicPay record);

    int updateByPrimaryKey(BasicPay record);
}