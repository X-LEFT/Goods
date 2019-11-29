package com.cy.pj.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	public  GoodsService goodsService;
	@RequestMapping("doFindGoods")
	public String doSelectAllGoods(Model model) {
		List<Goods> list=goodsService.selectAllGoods();
		model.addAttribute("glist",list);
		return "goods";
	}
	@RequestMapping("doDeleteById")
	public String doDeleteById(long id) {
		int rows=goodsService.deleteById(id);
		return "redirect:/doFindGoods";
	}
	
	
	
	
	
	
}
