package com.yao.entity;

import java.sql.Blob;

public class GoodsInfo {
    private Integer id;
    private String goodsInfo_name;
    private Double goodsInfo_price;
    private String goodsInfo_description;
    private String goodsInfo_stock;

    public GoodsInfo(Integer id, String goodsInfo_name, Double goodsInfo_price, String goodsInfo_description, String goodsInfo_stock) {
        this.id = id;
        this.goodsInfo_name = goodsInfo_name;
        this.goodsInfo_price = goodsInfo_price;
        this.goodsInfo_description = goodsInfo_description;
        this.goodsInfo_stock = goodsInfo_stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsInfo_name() {
        return goodsInfo_name;
    }

    public void setGoodsInfo_name(String goodsInfo_name) {
        this.goodsInfo_name = goodsInfo_name;
    }

    public Double getGoodsInfo_price() {
        return goodsInfo_price;
    }

    public void setGoodsInfo_price(Double goodsInfo_price) {
        this.goodsInfo_price = goodsInfo_price;
    }

    public String getGoodsInfo_description() {
        return goodsInfo_description;
    }

    public void setGoodsInfo_description(String goodsInfo_description) {
        this.goodsInfo_description = goodsInfo_description;
    }

    public String getGoodsInfo_stock() {
        return goodsInfo_stock;
    }

    public void setGoodsInfo_stock(String goodsInfo_stock) {
        this.goodsInfo_stock = goodsInfo_stock;
    }
}
