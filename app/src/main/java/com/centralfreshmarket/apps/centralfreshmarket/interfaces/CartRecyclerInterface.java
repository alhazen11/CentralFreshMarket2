package com.centralfreshmarket.apps.centralfreshmarket.interfaces;

import com.centralfreshmarket.apps.centralfreshmarket.entities.cart.CartDiscountItem;
import com.centralfreshmarket.apps.centralfreshmarket.entities.cart.CartProductItem;

public interface CartRecyclerInterface {

    void onProductUpdate(CartProductItem cartProductItem);

    void onProductDelete(CartProductItem cartProductItem);

    void onDiscountDelete(CartDiscountItem cartDiscountItem);

    void onProductSelect(long productId);

}
