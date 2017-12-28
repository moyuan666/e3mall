package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;


/**
 * 
 * @Controller
   @ResponseBody
   public @interface RestController
 *注解:RestController;就是相当于上面两个注解都有了,也就是在返回json数据的时候不需要在家注解@responseBody了
 */
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	/**
	 * 通过id 得到对象
	 */
	@RequestMapping("item/{id}")
	public TbItem getItemById(@PathVariable Long id){
		TbItem item = itemService.getItemById(id);
		return item;
	}
}
