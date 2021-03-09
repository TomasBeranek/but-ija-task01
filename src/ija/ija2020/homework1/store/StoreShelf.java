/*
 * File:          StoreShelf.java
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
import ija.ija2020.homework1.goods.GoodsShelf;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class StoreShelf implements GoodsShelf{
  Set<GoodsItem> items = new HashSet<GoodsItem>();


  public boolean containsGoods(Goods goods){
    Iterator<GoodsItem> it = this.items.iterator();
    GoodsItem tmp;

    while(it.hasNext()){
      tmp = it.next();
      if (tmp.goods().getName() == goods.getName()){
        return true;
      }
    }

    return false;
  }


  public void put(GoodsItem item){
    this.items.add(item);
  }


  public GoodsItem removeAny(Goods goods){
    Iterator<GoodsItem> it = this.items.iterator();
    GoodsItem itemToDelete = null;
    GoodsItem tmp;

    while(it.hasNext()){
       tmp = it.next();
      if (tmp.goods().getName() == goods.getName()){
        itemToDelete = tmp;
      }
    }

    if (itemToDelete != null){
      this.items.remove(itemToDelete);
    }
    return itemToDelete;
  }


  public int size(Goods goods){
    Iterator<GoodsItem> it = this.items.iterator();
    GoodsItem tmp;
    int cnt = 0;

    while(it.hasNext()){
      tmp = it.next();
      if (tmp.goods().getName() == goods.getName()){
        cnt++;
      }
    }

    return cnt;
  }
}
