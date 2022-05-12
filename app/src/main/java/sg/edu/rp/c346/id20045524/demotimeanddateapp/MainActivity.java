package sg.edu.rp.c346.id20045524.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setIs24HourView(true);
                String getCurrentHour = tp.getCurrentHour().toString();
                String getCurrentMinute = tp.getCurrentMinute().toString();

                tvDisplay.setText("Time is "+ getCurrentHour + ":" + getCurrentMinute);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int getYear = dp.getYear();
                int getDate = dp.getDayOfMonth();
                int getMonth = dp.getMonth() + 1;

                tvDisplay.setText("Date is "+ getDate + "/" + getMonth + "/" + getYear);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp.updateDate(2020, 0,1);
                tp.setCurrentHour(0);
                tp.setCurrentMinute(00);
                tvDisplay.setText("Display");

            }
        });





    }

}