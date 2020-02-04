package com.accp.mapper;

import com.accp.domain.Me2ber;
import com.accp.domain.Me2berExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me2berMapper {
    int countByExample(Me2berExample example);

    int deleteByExample(Me2berExample example);

    int deleteByPrimaryKey(Integer me2berid);

    int insert(Me2ber record);

    int insertSelective(Me2ber record);

    List<Me2ber> selectByExample(Me2berExample example);

    Me2ber selectByPrimaryKey(Integer me2berid);

    int updateByExampleSelective(@Param("record") Me2ber record, @Param("example") Me2berExample example);

    int updateByExample(@Param("record") Me2ber record, @Param("example") Me2berExample example);

    int updateByPrimaryKeySelective(Me2ber record);

    int updateByPrimaryKey(Me2ber record);
}