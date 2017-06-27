package com.doban.domain;

import org.dozer.DozerConverter;

/**
 * Created by Administrator on 2017/6/8.
 */
public class Enum2IntConverter extends DozerConverter<Type, Integer> {


    public Enum2IntConverter() {
        super(Type.class, Integer.class);
    }

    public Integer convertTo(Type type, Integer integer) {
        if( type.name() == "man"){
             return 0;
        }
        return 1;
    }

    public Type convertFrom(Integer integer, Type type) {
        if( integer == 0 ) {
            return Type.man;
        }

        return Type.woman;
    }
}
