package com.dongogong.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductCategory implements Serializable {
    // 移댄뀒怨좊━ idx 
    private int productCategoryId;

    // 移댄뀒怨좊━ �씠由� 
    private String name;

    // 寃뚯떆臾� idx 
    private int postIdx;

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }


    // ProductCategory 紐⑤뜽 蹂듭궗
    public void CopyData(ProductCategory param)
    {
        this.productCategoryId = param.getProductCategoryId();
        this.name = param.getName();
        this.postIdx = param.getPostIdx();
    }
}
