package com.up.dontgo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.up.dontgo.entity.RegionEntity;
import com.up.dontgo.mapper.RegionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DontGoApplicationTests {

    /**
     * 测试类注入mapper时，调用应配合@RunWith(SpringRunner.class)注解使用
     */
    @Autowired
    private RegionMapper regionMapper;


    /**
     * 注：使用Wrapper构造SQL时。字段是不会有驼峰改变的，应和数据库字段保持一致
     */
    @Test
    public void testRegionMapper() {
        System.out.println(("----- 查询所有省 ------"));

        List<RegionEntity> userList = regionMapper.selectList(new QueryWrapper<RegionEntity>().eq("region_level", 1));
        Assert.notNull(userList, "没有数据");
        userList.forEach(System.out::println);
    }

}
