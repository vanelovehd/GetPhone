package com.example.getphone;

import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.getphone.databinding.ItemContactFragmentBinding;

public class ContactFragment  extends Fragment {
        ItemContactFragmentBinding binding;
    public static ContactFragment newInstance() {
        Bundle args = new Bundle();
        ContactFragment fragment = new ContactFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.item_contact_fragment,container,false);
//        return  view;
        binding = DataBindingUtil.inflate(inflater,R.layout.item_contact_fragment,container,false);
//
//        rcvList.setLayoutManager( new GridLayoutManager(
//                getBaseContext(), 1,RecyclerView.VERTICAL, false));
//            rcvList.setAdapter(contactAdapter);
        return  binding.getRoot();

    }
}
