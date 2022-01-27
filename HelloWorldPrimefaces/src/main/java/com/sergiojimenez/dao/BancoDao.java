package com.sergiojimenez.dao;

import java.util.ArrayList;
import java.util.List;

import com.sergiojimenez.model.Banco;

public class BancoDao {

	private static BancoDao miBancoDao;
	private List<Banco> listaBancos;

	public static BancoDao getBancoDao() {
		if (miBancoDao == null)
			miBancoDao = new BancoDao();
		return miBancoDao;
	}

	private BancoDao() {
		listaBancos = new ArrayList<>();
	}

	public List<Banco> listarBancos() {
		return listaBancos;
	}

	public void agregar(Banco banco) {
		listaBancos.add(banco);
	}

	public void modificar(Banco banco) {
		for (int i = 0; i < listaBancos.size(); i++)
			if (listaBancos.get(i).getIdBanco().equals(banco.getIdBanco()))
				listaBancos.set(i, banco);
	}

	public void eliminar(Banco banco) {
		listaBancos.remove(banco);
	}

}