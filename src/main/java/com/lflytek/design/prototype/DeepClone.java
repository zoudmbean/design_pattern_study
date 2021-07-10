package com.lflytek.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @createDate:2021/6/6
 */
public class DeepClone<T> {
    /**
     * 利用序列化与反序列化方式实现深克隆
     */
    public static<T> T deepClone(T t){
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
        ){
            oos.writeObject(t); //t对象以对象流的方式输出

            //反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            T o = (T)ois.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
