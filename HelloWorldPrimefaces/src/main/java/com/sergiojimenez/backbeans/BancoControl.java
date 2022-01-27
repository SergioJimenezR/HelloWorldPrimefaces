package com.sergiojimenez.backbeans;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

import com.sergiojimenez.dao.BancoDao;
import com.sergiojimenez.model.Banco;

@Component
@ManagedBean
@SessionScoped
public class BancoControl {

	private List<Banco> listaBancos;
	private Banco banco;

	@PostConstruct
	public void init() {
	}

	public BancoControl() {
		banco = new Banco();
	}

	public List<Banco> getListaBancos() {
		BancoDao ad = BancoDao.getBancoDao();
		listaBancos = ad.listarBancos();
		return listaBancos;
	}

	public void setListaBancos(List<Banco> listaBancos) {
		this.listaBancos = listaBancos;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public void limpiarBanco() {
		banco = new Banco();
	}

	public void agregarBanco() {
		BancoDao ad = BancoDao.getBancoDao();
		ad.agregar(banco);
	}

	public void modificarBanco() {
		for (int i = 0; i < listaBancos.size(); i++) {

		}
		BancoDao ad = BancoDao.getBancoDao();
		ad.modificar(banco);
		limpiarBanco();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Título", "Descripción"));
	}

	public void eliminarBanco() {
		BancoDao ad = BancoDao.getBancoDao();
		ad.eliminar(banco);
		limpiarBanco();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Título", "Descripción"));
	}

	private String numero;

	public String getNumero() {
		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		System.out.println(params.get("token"));
		return "a";
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}