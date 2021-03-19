package com.fisha.mvvm_livedata;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.fisha.mvvm_livedata.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private ScoreViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(ScoreViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        viewModel.teamBScore.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer i) {
                Toast toast = Toast.makeText(MainActivity.this.getApplicationContext(), Integer.toString(i), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });
    }
}