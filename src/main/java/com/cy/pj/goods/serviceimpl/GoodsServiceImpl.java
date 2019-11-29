package com.cy.pj.goods.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService{
@Autowired
private GoodsDao goodsDao;
@Override
public  List<Goods> selectAllGoods() {
	long t1=System.currentTimeMillis();
	List<Goods> goods = goodsDao.selectAllGoods();
	long t2=System.currentTimeMillis();
	log.info("findGoods execute time:"+(t2-t1));
	return  goods;
}
@Override
public int deleteById(long id) {
	int rows=goodsDao.deleteById(id);
	log.info("{} delete ok",id);
	return rows;
}

}
