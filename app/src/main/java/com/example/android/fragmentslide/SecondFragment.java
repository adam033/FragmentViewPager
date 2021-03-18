package com.example.android.fragmentslide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.fragmentslide.R;

import org.w3c.dom.Text;

public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName;
    private TextView txtVisi;
    private TextView txtJumlah;

    public SecondFragment() {
// Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// initialise ViewModel here
        pageViewModel =
                ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle
            savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtVisi = view.findViewById(R.id.textViewVisi);
        txtJumlah = view.findViewById(R.id.textViewJumlah);
        pageViewModel.getName().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(@Nullable String s) {
                        txtName.setText(s);
                    }
                });
        pageViewModel.getVisi().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(String v) {
                        txtVisi.setText(v);
                    }
                });
        pageViewModel.getJumlah().observe(requireActivity(), new
                Observer<String>() {
                    @Override
                    public void onChanged(String j) {
                        txtJumlah.setText(j);
                    }
                });
    }
}
