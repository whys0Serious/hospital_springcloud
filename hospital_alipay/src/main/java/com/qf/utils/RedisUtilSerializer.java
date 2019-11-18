package com.qf.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisUtilSerializer implements RedisSerializer<Object> {

    Converter<Object, byte[]> serializingConverter = new SerializingConverter();//获取序列化的转换器
    Converter<byte[], Object> deserializingConverter = new DeserializingConverter();//获取反序列化转换器
    private static final byte[] EMPTY_BYTE_ARRAY  = new byte[0];//声明一个数组常量
    @Override
    public byte[] serialize(Object o) throws SerializationException {

        if(o == null){
            return EMPTY_BYTE_ARRAY;
        }
        return serializingConverter.convert(o);   //指定对value做序列化转换
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if(bytes==null){
            return null;
        }
        return deserializingConverter.convert(bytes);
    }

}
