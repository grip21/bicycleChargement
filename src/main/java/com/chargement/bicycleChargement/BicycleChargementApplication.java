package com.chargement.bicycleChargement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.DatagramSocket;
import java.net.SocketException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.DatagramSocket;
import java.net.SocketException;

@SpringBootApplication
public class BicycleChargementApplication {

	public static DatagramSocket socket;
	private static Database db = new Database();


	public static void main(String[] args) throws SocketException {
		SpringApplication.run(BicycleChargementApplication.class, args);

	socket = new DatagramSocket(11111);
	System.out.println("**SERVER Running**");
	new Thread(new ListenSocket()).start();
	new Thread(new GreenList()).start();
	new Thread(new CheckConsumption()).start();
	}

}