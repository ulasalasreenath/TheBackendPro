package com.thebackendpro.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;

public class JsonToProtobufConvertor {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        String json = "{\n" +
                "    \"fruit\": \"Apple\",\n" +
                "    \"size\": \"Large\",\n" +
                "    \"color\": \"Red\"\n" +
                "}";

        Struct.Builder builder = Struct.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
        Struct protoBuf = builder.build();
        System.out.println(protoBuf);

        String json2 = "{\n" +
                "    \"quiz\": {\n" +
                "        \"sport\": {\n" +
                "            \"q1\": {\n" +
                "                \"question\": \"Which one is correct team name in NBA?\",\n" +
                "                \"options\": [\n" +
                "                    \"New York Bulls\",\n" +
                "                    \"Los Angeles Kings\",\n" +
                "                    \"Golden State Warriros\",\n" +
                "                    \"Huston Rocket\"\n" +
                "                ],\n" +
                "                \"answer\": \"Huston Rocket\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"maths\": {\n" +
                "            \"q1\": {\n" +
                "                \"question\": \"5 + 7 = ?\",\n" +
                "                \"options\": [\n" +
                "                    \"10\",\n" +
                "                    \"11\",\n" +
                "                    \"12\",\n" +
                "                    \"13\"\n" +
                "                ],\n" +
                "                \"answer\": \"12\"\n" +
                "            },\n" +
                "            \"q2\": {\n" +
                "                \"question\": \"12 - 8 = ?\",\n" +
                "                \"options\": [\n" +
                "                    \"1\",\n" +
                "                    \"2\",\n" +
                "                    \"3\",\n" +
                "                    \"4\"\n" +
                "                ],\n" +
                "                \"answer\": \"4\"\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";


        JsonFormat.parser().ignoringUnknownFields().merge(json2, builder);
        Struct protoBuf2 = builder.build();
        System.out.println(protoBuf2);
    }
}
