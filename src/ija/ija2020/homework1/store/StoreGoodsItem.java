/*
 * File:          StoreGoodsItem.java
 * Course:        Java Programming Language (IJA) -- BUT FIT
 * Project:       A simple implementation of a system that represents shelfs
                  for storing items
 * Author:        Tomas Beranek (xberan46)
 * Email:         xberan46@stud.fit.vutbr.cz
 * Date:          9.3.2021
 */

package ija.ija2020.homework1.store;

import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import java.time.LocalDate;


public class StoreGoodsItem implements GoodsItem{
  private Goods goodsType = null;
  private LocalDate date = null;


  public StoreGoodsItem(Goods goods, LocalDate date){
    this.goodsType = goods;
    this.date = date;
  }


  public Goods goods(){
    return this.goodsType;
  }


  public boolean sell(){
    return this.goodsType.remove(this);
  }
}
