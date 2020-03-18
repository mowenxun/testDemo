package com.deepexi.test.test;

import com.deepexi.test.util.RedisUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName RedisTest
 * @Description: TODO
 * @Author mowenxun
 * @Date 2020/3/18
 * @Version V1.0
 **/
public class RedisTest extends BasicTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void existsKey() {
        boolean f = redisUtil.hasKey("12");
        System.out.println("f=="+f);
    }
}
