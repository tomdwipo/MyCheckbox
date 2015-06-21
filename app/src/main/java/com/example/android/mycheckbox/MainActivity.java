package com.example.android.mycheckbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView showTextview;
    private Button buttonShow;
    private CheckBox checkBoxDog;
    private CheckBox checkBoxCat;
    private CheckBox checkBoxChicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTextview = (TextView)findViewById(R.id.textViewShow);
        checkBoxDog = (CheckBox)findViewById(R.id.checkBoxDog);
        checkBoxCat = (CheckBox)findViewById(R.id.checkBoxCat);
        checkBoxChicken = (CheckBox)findViewById(R.id.checkBoxChicken);
        buttonShow = (Button)findViewById(R.id.showButton);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(checkBoxDog.getText().toString() + "status is: "+ checkBoxDog.isChecked());
                stringBuilder.append(checkBoxCat.getText().toString()+ "status is :" +checkBoxCat.isChecked());
                stringBuilder.append(checkBoxChicken.getText().toString() + "status is :" +checkBoxChicken.isChecked());
                showTextview.setText(stringBuilder);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
