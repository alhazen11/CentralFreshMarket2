package com.centralfreshmarket.apps.centralfreshmarket.interfaces;

import android.view.View;

import com.centralfreshmarket.apps.centralfreshmarket.entities.wishlist.WishlistItem;

public interface WishlistInterface {

    void onWishlistItemSelected(View view, WishlistItem wishlistItem);

    void onRemoveItemFromWishList(View caller, WishlistItem wishlistItem, int adapterPosition);
}
