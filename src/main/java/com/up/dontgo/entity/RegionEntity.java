package com.up.dontgo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 地区实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_region")
public class RegionEntity {

    /**
     * 地区主键编号
     */
    @TableId
    private String regionId;

    /**
     * 地区主键编号
     */
    private String regionName;

    /**
     * 地区主键编号
     */
    private String regionShortName;

    /**
     * 地区主键编号
     */
    private String regionCode;

    /**
     * 地区主键编号
     */
    private String regionParentId;

    /**
     * 地区主键编号
     */
    @TableField("region_level")
    private Integer regionLevel;

}
