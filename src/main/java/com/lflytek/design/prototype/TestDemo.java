package com.lflytek.design.prototype;

import com.lflytek.design.prototype.po.Dog;
import com.lflytek.design.prototype.po.Person;

/**
 * @createDate:2021/6/6
 */
public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("阿黄",1);
        Person p = new Person("Marry","武汉市",18,dog);

        Person person = DeepClone.deepClone(p);
        System.out.println(person.getDog().hashCode() == p.getDog().hashCode());
        System.out.println("person.getDog() = " + person.getDog());
        System.out.println(" p.getDog() =  " + p.getDog());
    }
}
