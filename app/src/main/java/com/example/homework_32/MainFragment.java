package com.example.homework_32;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    Button btnPlus;
    Button btnMinus;
    EditText textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initListener();
        initView();
    }

    private void initView() {
        btnMinus = requireActivity().findViewById(R.id.btn_minus);
        btnPlus = requireActivity().findViewById(R.id.btn_plus);
        textView = requireActivity().findViewById(R.id.txt);
    }

    private void initListener() {
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                int newValue = Integer.parseInt(currentText) - 1;
                    textView.setText(newValue);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = textView.getText().toString();
                int newValue = Integer.parseInt(currentText) + 1;
                    textView.setText(newValue);
            }
        });
    }
}
