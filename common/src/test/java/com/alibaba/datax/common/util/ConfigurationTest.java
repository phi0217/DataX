package com.alibaba.datax.common.util;

/**
 * @author : phi
 * @date : 2022/2/14
 */
public class ConfigurationTest {
    public static void main(String[] args) {
        String json = "{\n" +
                "  \"job\": {\n" +
                "    \"content\": [\n" +
                "      {\n" +
                "        \"reader\": {\n" +
                "          \"name\": \"streamreader\",\n" +
                "          \"parameter\": {\n" +
                "            \"sliceRecordCount\": 10,\n" +
                "            \"column\": [\n" +
                "              {\n" +
                "                \"type\": \"long\",\n" +
                "                \"value\": \"10\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"type\": \"string\",\n" +
                "                \"value\": \"hello，你好，世界-DataX\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        },\n" +
                "        \"writer\": {\n" +
                "          \"name\": \"streamwriter\",\n" +
                "          \"parameter\": {\n" +
                "            \"encoding\": \"UTF-8\",\n" +
                "            \"print\": true\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"setting\": {\n" +
                "      \"speed\": {\n" +
                "        \"channel\": 5\n" +
                "       }\n" +
                "    }\n" +
                "  }\n" +
                "}";
        Configuration.from(json);
    }

}