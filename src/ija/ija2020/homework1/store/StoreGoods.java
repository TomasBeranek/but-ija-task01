/*
 * File:          StoreGoods.java
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
import java.util.HashSet;
import java.util.Objects;


public class StoreGoods implements Goods{
  private String name = null;
  private HashSet<GoodsItem> goods = new HashSet<GoodsItem>();


  public StoreGoods(String name){
    this.name = name;
  }


  public boolean addItem(GoodsItem item){
    /* returns false if item is already present */
    return this.goods.add(item);
  }


  public boolean empty(){
    return this.goods.size() == 0;
  }


  public String getName(){
    return this.name;
  }


  public GoodsItem newItem(LocalDate loaded){
    GoodsItem newItem = new StoreGoodsItem(this, loaded);
    this.goods.add(newItem);
    return newItem;
  }


  public boolean remove(GoodsItem item){
    if (item == null){
      return false;
    }
    /* return false if item is not present */
    return this.goods.remove(item);
  }


  public int size(){
    return this.goods.size();
  }


  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      StoreGoods that = (StoreGoods) o;
      return name.equals(that.name);
  }

  @Override
  public int hashCode() {
      return Objects.hash(name);
  }
}
