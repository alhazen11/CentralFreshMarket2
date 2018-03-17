package com.centralfreshmarket.apps.centralfreshmarket.interfaces;

import android.view.View;

import com.centralfreshmarket.apps.centralfreshmarket.entities.drawerMenu.DrawerItemCategory;
import com.centralfreshmarket.apps.centralfreshmarket.entities.drawerMenu.DrawerItemPage;

public interface DrawerRecyclerInterface {

    void onCategorySelected(View v, DrawerItemCategory drawerItemCategory);

    void onPageSelected(View v, DrawerItemPage drawerItemPage);

    void onHeaderSelected();
}
