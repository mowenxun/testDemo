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
        System.out.println("f==" + f);
    }

    @Test
    public void getSeqNo() {
        String s = redisUtil.getSeqNoByRedis("meituan", 3);
        System.out.println("s==" + s);
        s = redisUtil.getSeqNoByRedis("meituan", 3);
        System.out.println("s==" + s);
        s = redisUtil.getSeqNoByRedis("eleme", 5);
        System.out.println("s==" + s);
        s = redisUtil.getSeqNoByRedis("eleme", 5);
        System.out.println("s==" + s);

    }
}
