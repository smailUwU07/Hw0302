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

public class SecondFragment extends Fragment {
    private Button button;
    private TextView textView;
    private int num = 0;
    private boolean flag = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
        while (flag){
            num++;
            textView.setText(String.valueOf(num));
        }
    }

    private void initListener() {
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                flag = true;
                return true;
            }

        });
    }

    private void initView() {
        button = requireActivity().findViewById(R.id.btn_onTouch);
        textView = requireActivity().findViewById(R.id.tv_num_second);
    }

}