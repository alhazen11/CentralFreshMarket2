package com.centralfreshmarket.apps.centralfreshmarket.interfaces;

public interface UpdateCartItemListener {

    void updateProductInCart(long productCartId, long newVariantId, int newQuantity);

}

