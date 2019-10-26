package br.inatel.dm110.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.api.HelloService;
import br.inatel.dm110.api.IbgeService;
import br.inatel.dm110.api.MessageTO;
import br.inatel.dm110.api.StateTO;
import br.inatel.dm110.hello.interfaces.HelloRemote;
import br.inatel.dm110.ibge.interfaces.IbgeRemote;

@RequestScoped
public class IbgeServiceImpl implements IbgeService {

	@EJB(lookup="ejb:dm110-ear-1.0/dm110-ejb-1.0/IbgeBean!br.inatel.dm110.ibge.interfaces.IbgeRemote")
	private IbgeRemote ibgeBean;
	
	@Override
	public void saveState(StateTO state) {
		ibgeBean.insert(state);		
	}
	
	@Override
	public List<StateTO> listAll() {
		return ibgeBean.listAll();
	}
}
