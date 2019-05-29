package com.lqt.hr.dao;

import com.lqt.hr.model.ComRecord;
import com.lqt.hr.model.ComRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComRecordMapper {
    long countByExample(ComRecordExample example);

    int deleteByExample(ComRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComRecord record);

    int insertSelective(ComRecord record);

    List<ComRecord> selectByExample(ComRecordExample example);

    ComRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComRecord record, @Param("example") ComRecordExample example);

    int updateByExample(@Param("record") ComRecord record, @Param("example") ComRecordExample example);

    int updateByPrimaryKeySelective(ComRecord record);

    int updateByPrimaryKey(ComRecord record);
}