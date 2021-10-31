package com.example.donation;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.donation.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private int totalDonated = 0;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amount = binding.amountPicker.getValue();
                totalDonated = totalDonated + amount;
                binding.progressBar.setProgress(totalDonated);
                int radioId = binding.paymentMethod.getCheckedRadioButtonId();
                String method = radioId == R.id.PayPal ? "PayPal" : "Direct";

                Log.v("Donate", "Donate Pressed! with amount " + amount + ", method: " + method + "\nCurrent total " + totalDonated);
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        binding.amountPicker.setMinValue(0);
        binding.amountPicker.setMaxValue(1000);
        binding.progressBar.setMax(10000);

//        binding.paymentMethod.setOnCheckedChangeListener();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void donateButtonPressed() {
        Log.v("Donate", "Donate Pressed!");
    }

}