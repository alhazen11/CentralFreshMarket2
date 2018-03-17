package com.centralfreshmarket.apps.centralfreshmarket.interfaces;

import android.view.View;

import com.centralfreshmarket.apps.centralfreshmarket.entities.product.Product;

public interface RelatedProductsRecyclerInterface {

    void onRelatedProductSelected(View v, int position, Product product);
}
