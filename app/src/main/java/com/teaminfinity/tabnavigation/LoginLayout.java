package com.teaminfinity.tabnavigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by BrandonWiggins on 01/03/2016.
 */
public class LoginLayout  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }


    public void onButtonClick(View view) {
        if (view.getId() == R.id.createAccountLogin) {
            Intent i = new Intent(LoginLayout.this, CreateProfile.class);
            startActivity(i);
        }
    }
}