package com.accp.mapper;

import com.accp.domain.Workcard;
import com.accp.domain.WorkcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkcardMapper {
    int countByExample(WorkcardExample example);

    int deleteByExample(WorkcardExample example);

    int deleteByPrimaryKey(Integer wodid);

    int insert(Workcard record);

    int insertSelective(Workcard record);

    List<Workcard> selectByExample(WorkcardExample example);

    Workcard selectByPrimaryKey(Integer wodid);

    int updateByExampleSelective(@Param("record") Workcard record, @Param("example") WorkcardExample example);

    int updateByExample(@Param("record") Workcard record, @Param("example") WorkcardExample example);

    int updateByPrimaryKeySelective(Workcard record);

    int updateByPrimaryKey(Workcard record);
}