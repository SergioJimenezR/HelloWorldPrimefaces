package com.sergiojimenez.backbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import com.sergiojimenez.dao.BancoDao;
import com.sergiojimenez.model.Banco;

@Component
@ManagedBean
@SessionScoped
public class BancoControl {

	private List<Banco> listaBancos;
	private Banco banco;

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
	}

	public void eliminarBanco() {
		BancoDao ad = BancoDao.getBancoDao();
		ad.eliminar(banco);
		limpiarBanco();
	}

}