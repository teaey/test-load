package cn.teaey.test.load;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.List;
import java.util.UUID;
/**
 * User: Teaey
 * Date: 13-7-31
 */
public class FieldInit
{
    public static List<Blobable> initField(List<Blobable> objs)
    {
        for (Object each : objs)
        {
            initField0(each);
        }
        return objs;
    }
    public static Object initField0(Object o)
    {
        if (null == o)
            return o;
        Class<?> cl = o.getClass();
        while (null != cl)
        {
            for (Field each : cl.getDeclaredFields())
            {
                if (each.getType().isPrimitive() || Modifier.isStatic(each.getModifiers()))
                    continue;
                boolean access = each.isAccessible();
                each.setAccessible(true);
                //
                Object oldValue = null;
                try
                {
                    oldValue = each.get(o);
                } catch (IllegalAccessException e)
                {
                    e.printStackTrace();
                }
                if (null != oldValue)
                {
                    continue;
                }
                Object val = getValue(each.getType());
                if (null != val)
                {
                    try
                    {
                        each.set(o, val);
                    } catch (IllegalArgumentException e)
                    {
                        e.printStackTrace();
                    } catch (IllegalAccessException e)
                    {
                        e.printStackTrace();
                    }
                }
                //
                each.setAccessible(access);
            }
            cl = cl.getSuperclass();
        }
        return o;
    }
    public static Object getValue(Class<?> type)
    {
        if (type == Boolean.class)
        {
            return Boolean.FALSE;
        }
        else if (type == Byte.class)
        {
            return Byte.MAX_VALUE;
        }
        else if (type == Short.class)
        {
            return Short.MAX_VALUE;
        }
        else if (type == Integer.class)
        {
            return Integer.MAX_VALUE;
        }
        else if (type == Long.class)
        {
            return Long.MAX_VALUE;
        }
        else if (type == Float.class)
        {
            return Float.MIN_NORMAL;
        }
        else if (type == Double.class)
        {
            return Double.MAX_VALUE;
        }
        else if (type == String.class)
        {
            return UUID.randomUUID().toString();
        }
        else if (type == Date.class)
        {
            return new Date();
        }
        else
        {
            return null;
        }
    }
}
