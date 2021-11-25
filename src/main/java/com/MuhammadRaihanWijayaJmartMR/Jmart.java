package com.MuhammadRaihanWijayaJmartMR;
import com.MuhammadRaihanWijayaJmartMR.dbjson.JsonDBEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class for Jmart
 *
 * @author Muhammad Raihan Wijaya
 * @version v1.0 in Modul 4
 */

@SpringBootApplication
public class Jmart
{
    public static void main(String[] args) {
        JsonDBEngine.Run(Jmart.class);
        SpringApplication.run(Jmart.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(JsonDBEngine::join));
    }
}