package com.accp.mapper;

import com.accp.domain.Artisangrade;
import com.accp.domain.ArtisangradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtisangradeMapper {
    int countByExample(ArtisangradeExample example);

    int deleteByExample(ArtisangradeExample example);

    int deleteByPrimaryKey(Integer areid);

    int insert(Artisangrade record);

    int insertSelective(Artisangrade record);

    List<Artisangrade> selectByExample(ArtisangradeExample example);

    Artisangrade selectByPrimaryKey(Integer areid);

    int updateByExampleSelective(@Param("record") Artisangrade record, @Param("example") ArtisangradeExample example);

    int updateByExample(@Param("record") Artisangrade record, @Param("example") ArtisangradeExample example);

    int updateByPrimaryKeySelective(Artisangrade record);

    int updateByPrimaryKey(Artisangrade record);
}