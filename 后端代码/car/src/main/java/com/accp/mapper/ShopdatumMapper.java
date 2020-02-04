package com.accp.mapper;

import com.accp.domain.Shopdatum;
import com.accp.domain.ShopdatumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopdatumMapper {
    int countByExample(ShopdatumExample example);

    int deleteByExample(ShopdatumExample example);

    int deleteByPrimaryKey(String shmid);

    int insert(Shopdatum record);

    int insertSelective(Shopdatum record);

    List<Shopdatum> selectByExample(ShopdatumExample example);

    Shopdatum selectByPrimaryKey(String shmid);

    int updateByExampleSelective(@Param("record") Shopdatum record, @Param("example") ShopdatumExample example);

    int updateByExample(@Param("record") Shopdatum record, @Param("example") ShopdatumExample example);

    int updateByPrimaryKeySelective(Shopdatum record);

    int updateByPrimaryKey(Shopdatum record);
}