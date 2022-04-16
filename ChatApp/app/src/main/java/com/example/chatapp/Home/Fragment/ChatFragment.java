package com.example.chatapp.Home.Fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.example.chatapp.R;


public class ChatFragment extends Fragment {
    private Context context;
    private RecyclerView recyclerView_chat_fragment;
    RelativeLayout relative_layout_chat_fragment;

    public ChatFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);



        return view;

    }
}
