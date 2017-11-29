package cn.tarena.ht.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tarena.ht.pojo.Module;
import cn.tarena.ht.service.ModuleService;

@Controller
@RequestMapping("/sysadmin/module/")
public class ModuleController {
	@Resource
	private ModuleService moduleService;

	
	@RequestMapping("saveModule")
	public String toSaveModule(Module module){
		moduleService.saveModule(module);
		return "redirect:list";
	}
	
	//查看模块
	@RequestMapping("toview")
	public String toViewModule(String moduleId ,Model model){
		Module module = moduleService.getModuleOneById(moduleId);
		model.addAttribute("module", module);
		return "sysadmin/module/jViewModule";
	}
	

}
