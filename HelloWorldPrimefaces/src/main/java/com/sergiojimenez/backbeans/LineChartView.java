package com.sergiojimenez.backbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sergiojimenez.controllers.PruebaController;
import com.sergiojimenez.dao.DataService;

@Component
@ManagedBean
@ViewScoped
public class LineChartView {
	@Autowired
	private DataService dataService;

	@Autowired
	PruebaController pruebaController;

	private LineChartModel lineModel;

	private int numero;

	@PostConstruct
	public void init() {
		System.out.println("LineChartView Init.");

		lineModel = new LineChartModel();
		LineChartSeries s = new LineChartSeries();
		s.setLabel("Population");

		dataService.getLineChartData().forEach(s::set);

		lineModel.addSeries(s);
		lineModel.setLegendPosition("e");
		Axis y = lineModel.getAxis(AxisType.Y);
		y.setMin(0.5);
		y.setMax(700);
		y.setLabel("Millions");

		Axis x = lineModel.getAxis(AxisType.X);
		x.setMin(0);
		x.setMax(7);
		x.setTickInterval("1");
		x.setLabel("Number of Years");

		numero = 1;

		System.out.println("init");
		dataService.pruebaD1();
		dataService.pruebaD2("frase");
		pruebaController.pruebaP1();
		pruebaController.pruebaP2("frase");

	}

	public LineChartModel getLineModel() {
		return lineModel;
	}

	public void setLineModel(LineChartModel lineModel) {
		this.lineModel = lineModel;
	}

	public int getNumero() {
		System.out.println("getNumero");
		dataService.pruebaD1();
		dataService.pruebaD2("frase");
		pruebaController.pruebaP1();
		pruebaController.pruebaP2("frase");
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void incrementarNumero() {
		numero++;
	}

	public void evento(ActionEvent event) {

	}

}