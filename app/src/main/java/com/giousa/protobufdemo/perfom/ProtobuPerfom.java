package com.giousa.protobufdemo.perfom;

import com.giousa.protobufdemo.model.Person;

/**
 * Description:
 * Author:Giousa
 * Date:2017/2/8
 * Email:65489469@qq.com
 */
public class ProtobuPerfom {

    public static void main(String[] args) {
        System.out.println("protobuf执行了");

        Person person = new Person.Builder()
                .name("giousa")
                .email("65489469@qq.com")
                .id(23)
                .build();

        System.out.println(person.toString());

    }
}
