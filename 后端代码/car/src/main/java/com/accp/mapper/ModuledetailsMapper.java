package com.accp.mapper;

import com.accp.domain.Moduledetails;
import com.accp.domain.ModuledetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuledetailsMapper {
    int countByExample(ModuledetailsExample example);

    int deleteByExample(ModuledetailsExample example);

    int deleteByPrimaryKey(Integer mosid);

    int insert(Moduledetails record);

    int insertSelective(Moduledetails record);

    List<Moduledetails> selectByExample(ModuledetailsExample example);

    Moduledetails selectByPrimaryKey(Integer mosid);

    int updateByExampleSelective(@Param("record") Moduledetails record, @Param("example") ModuledetailsExample example);

    int updateByExample(@Param("record") Moduledetails record, @Param("example") ModuledetailsExample example);

    int updateByPrimaryKeySelective(Moduledetails record);

    int updateByPrimaryKey(Moduledetails record);
}