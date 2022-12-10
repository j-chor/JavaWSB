package com.wsb.devices;

import com.wsb.creatures.Human;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    private static final String DEFAULT_APP_SOURCE = "store.play.com";
    private static final Double DEFAULT_APP_VERSION = 1.0;
    private static final String DEFAULT_PROTOCOL = "https";

    public Phone(String model, String producer, String color, Integer year, Double value) {
        super(producer, model, year, color, value);
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, Double appVersion) {
        this.installAnApp(appName, appVersion, DEFAULT_APP_SOURCE);
    }

    public void installAnApp(String appName, Double appVersion, String appServerAddress) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, appServerAddress, "/" + appName + "-" + appVersion);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            System.out.println("fail" + appName);
            throw new RuntimeException(e);
        }

    }

    public void installAnApp(URL url) {
        System.out.println("Instalowanie " + url);
        System.out.println("Proszę czekać...");
        System.out.println("|----90%----|");
        System.out.println("Instalacja zakońcoczna powodzeniem");
    }

    public void installAnApp(String[] appList) {
        for (String appName :
                appList) {
            installAnApp(appName);
        }
    }


    @Override
    void turnOn() {
        System.out.println("Włączam...");
        System.out.println("Witaj");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != null) {
            if (buyer.getCash() >= price) {
                buyer.phone = (seller.phone);
                seller.phone = null;
                seller.setCash(seller.getCash() + price);
                buyer.setCash(buyer.getCash() - price);
                System.out.println("Kupujący " + buyer + " kupił " + buyer.phone
                        + " od " + seller + " za " + price + " PLN");
            }
        }
    }
}
