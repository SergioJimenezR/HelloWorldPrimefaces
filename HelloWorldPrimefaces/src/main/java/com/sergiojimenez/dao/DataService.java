package com.sergiojimenez.dao;

import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DataService {

	public Map<Integer, Double> getLineChartData() {
		Map<Integer, Double> map = new LinkedHashMap<>();
		map.put(1, 5.20);
		map.put(2, 19.63);
		map.put(3, 59.01);
		map.put(4, 139.76);
		map.put(5, 300.4);
		map.put(6, 630.0);
		return map;
	}

	public void pruebaD1() {
		System.out.println("DataService pruebaD1 Hola mundo");
	}

	public void pruebaD2(String frase) {
		System.out.println("DataService pruebaD2 " + frase);
	}

}