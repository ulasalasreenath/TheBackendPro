package com.thebackendpro.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;

public class ProtobufToJson {

    public static void main(String[] args) throws InvalidProtocolBufferException {

        String json = "{\n" +
                "    \"fruit\": \"Apple\",\n" +
                "    \"size\": \"Large\",\n" +
                "    \"color\": \"Red\"\n" +
                "}";

        Struct.Builder builder = Struct.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
        Struct protoBuf = builder.build();

        String json2 = JsonFormat.printer().print(protoBuf);
        System.out.println(json2);
    }
}
