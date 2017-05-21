package com.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by uyiqgyy on 21/05/2017.
 */
@Path("device")
public class DeviceResource {
    private final DeviceDao deviceDao;
    public DeviceResource() {
        deviceDao = new DeviceDao();
    }
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Device get(@QueryParam("ip") final String deviceIp) {
        Device result = null;
        if(deviceIp != null) {
            result = deviceDao.getDevice(deviceIp);
        }
        return  result;
    }
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Device put(final Device device) {
        Device result = null;
        if (device != null) {
            result = deviceDao.updateDevice(device);
        }
        return result;
    }
}
