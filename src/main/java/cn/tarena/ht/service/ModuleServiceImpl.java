package cn.tarena.ht.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.ModuleMapper;
import cn.tarena.ht.pojo.Module;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService{
	@Resource
	private ModuleMapper moduleMapper;

	
	public void saveModule(Module module) {
		moduleMapper.saveModule(module);
	}

	@Override
	public Module getModuleOneById(String moduleId) {
		return null;
	}


}
