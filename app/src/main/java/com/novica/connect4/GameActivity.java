package com.novica.connect4;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ui.AppBarConfiguration;

import com.novica.connect4.button.SquareImageButton;
import com.novica.connect4.databinding.ActivityGameBinding;
import com.novica.connect4.layout.SquareTableLayout;
import com.novica.connect4.listener.ColumnClickListener;

public class GameActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityGameBinding binding;
    private ConstraintLayout constraintLayout;
    private SquareTableLayout tableLayout;

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
            row.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    0,
                    1.0f)); // This line sets the height of the row to be proportional to its weight
            for (int j = 0; j < 7; j++) {
                ImageButton button = new SquareImageButton(this);
                button.setId(j);
                button.setImageResource(R.drawable.circle_empty);
                button.setBackground(null);
                button.setOnClickListener(new ColumnClickListener(j, this));
                TableRow.LayoutParams params = new TableRow.LayoutParams(
                        0,
                        TableRow.LayoutParams.MATCH_PARENT,
                        1.0f); // This line sets the width of the button to be proportional to its weight
                button.setLayoutParams(params);
                row.addView(button);
            }
            tableLayout.addView(row);
        }
    }

    public void pressedColumn(int index){
        Toast.makeText(this, ("Pressed column: " + (index+1)), Toast.LENGTH_SHORT).show();
    }
}