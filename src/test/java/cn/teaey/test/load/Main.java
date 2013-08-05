package cn.teaey.test.load;
import cn.teaey.test.load.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class Main
{
    // 0-10000条 耗时1927000ms
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args)
    {
        //init(398999);
        //load(1, 200000);
        sizeof(1, 20000);
    }
    public static void sizeof(int start, int num)
    {
        String subfix = "/" + num + "\r";
        {
            List<PlayerAllInOne> store = new ArrayList<>();
            long seriSize = 0;
            long startNano = System.nanoTime();
            for (int i = 0; i < num; i++)
            {
                PlayerAllInOne p = PlayerAllInOneTester.get(start + i, false);
                System.out.print((i + 1) + subfix);
                store.add(p);
                seriSize += p.size();
            }
            long endName = System.nanoTime();
            long useNano = endName - startNano;
            long useMillis = TimeUnit.NANOSECONDS.toMillis(useNano);
            log.info("加载[{}]条玩家数据耗时[{}]ms 平均每个玩家数据耗时[{}]ms", new Object[]{num, useMillis, ((double) useMillis / num)});
            log.info("[{}]玩家序列化大小[{}]bytes 平均每个玩家[{}]byte", new Object[]{num, seriSize, seriSize / num});
            log.info("进入Slepp...");
            try
            {
                Thread.sleep(10000000L);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(store.size());
        }
    }
    public static void load(int start, int num)
    {
        String subfix = "/" + num + "\r";
        {
            long startNano = System.nanoTime();
            for (int i = 0; i < num; i++)
            {
                PlayerTester.get(start + i, false);
                System.out.print((i + 1) + subfix);
            }
            long endName = System.nanoTime();
            long useNano = endName - startNano;
            long useMillis = TimeUnit.NANOSECONDS.toMillis(useNano);
            log.info("传统表结构方式加载[{}]条玩家数据耗时[{}]ms 平均每个玩家数据耗时[{}]ms", new Object[]{num, useMillis, ((double) useMillis / num)});
        }
        {
            long startNano = System.nanoTime();
            for (int i = 0; i < num; i++)
            {
                PlayerAllInOneTester.get(start + i, false);
                System.out.print((i + 1) + subfix);
            }
            long endName = System.nanoTime();
            long useNano = endName - startNano;
            long useMillis = TimeUnit.NANOSECONDS.toMillis(useNano);
            log.info("Blob方式加载[{}]条玩家数据耗时[{}]ms 平均每个玩家数据耗时[{}]ms", new Object[]{num, useMillis, ((double) useMillis / num)});
        }
    }
    public static void init(int size)
    {
        String subfix = "/" + size + "\r";
        {
            long startNano = System.nanoTime();
            for (int i = 0; i < size; i++)
            {
                PlayerTester.insert();
                System.out.print((i + 1) + subfix);
            }
            long endName = System.nanoTime();
            long useNano = endName - startNano;
            long useMillis = TimeUnit.NANOSECONDS.toMillis(useNano);
            log.info("传统表结构方式插入[{}]条玩家数据耗时[{}]ms 平均每个玩家数据初始化耗时[{}]ms", new Object[]{size, useMillis, ((double) useMillis / size)});
        }
        {
            long startNano = System.nanoTime();
            for (int i = 0; i < size; i++)
            {
                PlayerAllInOneTester.insert();
                System.out.print((i + 1) + subfix);
            }
            long endName = System.nanoTime();
            long useNano = endName - startNano;
            long useMillis = TimeUnit.NANOSECONDS.toMillis(useNano);
            log.info("Blob方式插入[{}]条玩家数据耗时[{}]ms 平均每个玩家数据初始化耗时[{}]ms", new Object[]{size, useMillis, ((double) useMillis / size)});
        }
    }
}
