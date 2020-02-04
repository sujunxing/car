package com.accp.mapper;

import com.accp.domain.Serve;
import com.accp.domain.ServeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServeMapper {
    int countByExample(ServeExample example);

    int deleteByExample(ServeExample example);

    int deleteByPrimaryKey(String seeid);

    int insert(Serve record);

    int insertSelective(Serve record);

    List<Serve> selectByExample(ServeExample example);

    Serve selectByPrimaryKey(String seeid);

    int updateByExampleSelective(@Param("record") Serve record, @Param("example") ServeExample example);

    int updateByExample(@Param("record") Serve record, @Param("example") ServeExample example);

    int updateByPrimaryKeySelective(Serve record);

    int updateByPrimaryKey(Serve record);
}