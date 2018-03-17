package com.centralfreshmarket.apps.centralfreshmarket.interfaces;

import com.centralfreshmarket.apps.centralfreshmarket.entities.User;

/**
 * Interface declaring methods for login dialog.
 */
public interface LoginDialogInterface {

    void successfulLoginOrRegistration(User user);

}
