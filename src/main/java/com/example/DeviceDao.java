package com.example;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by uyiqgyy on 21/05/2017.
 */
public class DeviceDao {
    ConcurrentHashMap<String, Device> fakeDB = new ConcurrentHashMap<>();
    public DeviceDao() {
        fakeDB.put("10.11.58.163", new Device("10.11.58.163"));
        fakeDB.put("10.11.58.184", new Device("10.11.58.184"));
    }
    public Device getDevice(String ip) {
        Device device = fakeDB.get(ip);
        return device;
    }
    public Device updateDevice(Device device) {
        String ip = device.getIp();
        fakeDB.put(ip, device);
        return fakeDB.get(ip);
    }

}
