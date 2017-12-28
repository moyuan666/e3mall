package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/**
	 * 通过id 得到对象
	 */
	TbItem getItemById(Long itemId);
}
