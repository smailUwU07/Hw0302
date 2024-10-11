package com.example.hw0302;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment_hw extends Fragment {
    private Button btnPlus, btnMinus, btnNext;
    private TextView textView;
    private int num = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_hw, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();

    }

    public void initListener(){
        btnMinus.setOnClickListener(v -> {
            num--;
            textView.setText(String.valueOf(num));
        });
        btnPlus.setOnClickListener(v -> {
            num++;
            textView.setText(String.valueOf(num));
        });
        btnNext.setOnClickListener(v -> {
            requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, new SecondFragment()).commit();
        });
    }
    public void initView() {
        btnNext = requireActivity().findViewById(R.id.btn_next);
        btnMinus = requireActivity().findViewById(R.id.btn_minus);
        btnPlus = requireActivity().findViewById(R.id.bnt_plus);
        textView = requireActivity().findViewById(R.id.tv_num);
    }
}