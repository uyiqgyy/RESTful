package com.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by uyiqgyy on 21/05/2017.
 */
@XmlRootElement(name = "device")
public class Device {
    private String deviceIp;
    private int devicdStatus;
    public Device() {

    }
    public Device(String deviceIp) {
        super();
        this.deviceIp = deviceIp;
    }
    public String getIp() {
        return deviceIp;
    }

    public void setIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }
    @XmlAttribute
    public int getStatus() {
        return devicdStatus;
    }
    public void setStatus(int devicdStatus) {
        this.devicdStatus = devicdStatus;
    }

}
