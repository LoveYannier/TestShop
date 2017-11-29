package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Module;

public interface ModuleService {

	

	void saveModule(Module module);

	
	Module getModuleOneById(String moduleId);

}
