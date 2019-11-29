package com.cy.pj.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;


public interface GoodsService {
 
	List<Goods> selectAllGoods();
	
	int deleteById(long id);
}
