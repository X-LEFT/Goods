package com.cy.pj.goods.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data//生成set,get,tostring方法,eaquals,hashcode
@Setter
@Getter
@ToString
@NoArgsConstructor//无参构造方法
@AllArgsConstructor//有参构造方法

public class Goods {
	private Long id;;
	private String name;
	private String remark;
	private Date createdTime;

}
