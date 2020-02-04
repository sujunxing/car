package com.accp.mapper;

import com.accp.domain.Keclassify;
import com.accp.domain.KeclassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeclassifyMapper {
    int countByExample(KeclassifyExample example);

    int deleteByExample(KeclassifyExample example);

    int deleteByPrimaryKey(String keyid);

    int insert(Keclassify record);

    int insertSelective(Keclassify record);

    List<Keclassify> selectByExample(KeclassifyExample example);

    Keclassify selectByPrimaryKey(String keyid);

    int updateByExampleSelective(@Param("record") Keclassify record, @Param("example") KeclassifyExample example);

    int updateByExample(@Param("record") Keclassify record, @Param("example") KeclassifyExample example);

    int updateByPrimaryKeySelective(Keclassify record);

    int updateByPrimaryKey(Keclassify record);
}