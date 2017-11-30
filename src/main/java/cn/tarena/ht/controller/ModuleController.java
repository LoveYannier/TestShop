package cn.tarena.ht.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tarena.ht.pojo.Module;
import cn.tarena.ht.service.ModuleService;

@Controller
@RequestMapping("/module/")
public class ModuleController {
	@Resource
	private ModuleService moduleService;

	@RequestMapping("/home")
	public String toHome(){
		return "testWrite";
	}
	
	@RequestMapping("saveModule")
	@ResponseBody
	public String toSaveModule(Module module){
		moduleService.saveModule(module);
		return "";
	}
	
	//查看模块
	@RequestMapping("toview")
	public String toViewModule(String moduleId ,Model model){
		Module module = moduleService.getModuleOneById(moduleId);
		model.addAttribute("module", module);
		return "module/jViewModule";
	}
	

}
