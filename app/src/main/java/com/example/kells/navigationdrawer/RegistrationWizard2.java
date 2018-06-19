package com.example.kells.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationWizard2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_details);
    }
    public void Register(View view) {
        Intent intent = new Intent(this, RegistrationWizard.class);
        startActivity(intent);
    }
}
