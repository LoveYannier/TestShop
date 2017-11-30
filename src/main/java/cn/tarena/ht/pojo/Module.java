package cn.tarena.ht.pojo;

@SuppressWarnings("serial")
public class Module{

	private String moduleId;	//模块id
	private String name;	//模块名称 权限标识
	private Integer ctype;	//type在oracle中是敏感字
	private Integer state;	//状态
	private Integer orderNo;	//排序号
	private String remark;	//备注信息
}