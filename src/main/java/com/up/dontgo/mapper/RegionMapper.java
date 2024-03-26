package com.up.dontgo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.up.dontgo.entity.RegionEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RegionMapper extends BaseMapper<RegionEntity> {

    /**
     * 根据某级向下查询
     * @param code
     * @param flag 是否包括自己
     * @return
     */
    List<RegionEntity> downList(@Param("code") String code, @Param("flag") boolean flag);


    /**
     * 根据某级向上查询
     * @param code
     * @param flag 是否包括自己
     * @return
     */
    List<RegionEntity> upList(@Param("code") String code, @Param("flag") boolean flag);

}
