package cn.tarena.ht.mapper;


import org.apache.ibatis.annotations.Select;

import cn.tarena.ht.pojo.Module;

public interface ModuleMapper {


	void saveModule(Module module);


	@Select("select * from module_p where module_id = #{moduleId}")
	Module findModuleById(String moduleId);


	
}
