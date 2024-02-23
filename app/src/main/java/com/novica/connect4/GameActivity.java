package com.novica.connect4;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ui.AppBarConfiguration;

import com.novica.connect4.databinding.ActivityGameBinding;
import com.novica.connect4.listener.ColumnClickListener;

public class GameActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityGameBinding binding;
    private ConstraintLayout constraintLayout;
    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();
    }


    private void init(){
        constraintLayout = findViewById(R.id.constraintLayout);
        tableLayout = findViewById(R.id.tableLayout);

        initMatrix();
    }

    private void initMatrix() {
        for (int i = 0; i < 6; i++){
            TableRow row = new TableRow(this);
            for (int j = 0; j < 7; j++) {
                ImageButton button = new ImageButton(this);
                button.setId(j);
                button.setImageResource(R.drawable.circle_empty);
                button.setOnClickListener(new ColumnClickListener(j, this));
                row.addView(button);
            }
            tableLayout.addView(row);
        }
    }

    public void pressedColumn(int index){
        Toast.makeText(this, ("Pressed column: " + (index+1)), Toast.LENGTH_SHORT).show();
    }
}