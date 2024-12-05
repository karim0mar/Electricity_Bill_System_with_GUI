package com.electricity.system.src.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//da file by2ra files el json bs w berg3 el data bta3to

public class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T readJson(String filePath, Class<T> clazz) throws IOException {
        return objectMapper.readValue(new File(filePath), clazz);
    }

    public static void writeJson(String filePath, Object data) throws IOException {
        objectMapper.writeValue(new File(filePath), data);
    }
}
