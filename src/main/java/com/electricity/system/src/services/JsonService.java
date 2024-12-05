package com.electricity.system.src.services;

import com.electricity.system.src.models.Config;
import com.electricity.system.src.utils.JsonUtil;
import com.electricity.system.src.models.Tariff;

import java.io.IOException;
import java.util.List;

// this file will read all data (customers , bills ,..) from the json
// da example 3la el Tariffs
//ka2no begeb el data mn el database
public class JsonService {
    static Config config = new Config();

    final static String TARIFF_FILE = config.getTariffsPath();
    public static List<Tariff> loadTariffs() throws IOException {
        return List.of(JsonUtil.readJson(TARIFF_FILE, Tariff[].class));
    }

    public static void saveTariffs(List<Tariff> tariffs) throws IOException {
        JsonUtil.writeJson(TARIFF_FILE, tariffs);
    }
}
