package com.example.mvvm_activity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class PartsViewModel extends ViewModel {

    private MutableLiveData<List<PartsModel>> _partsList;

    public LiveData<List<PartsModel>> getParts() {
        if (_partsList == null) {
            _partsList = new MutableLiveData<>();
            loadParts();
        }
        return _partsList;
    }

    private void loadParts() {
        List<PartsModel> parts = new ArrayList<>();

        parts.add(new PartsModel("CPU", "Ryzen 9 9950x3D", R.drawable.r9));
        parts.add(new PartsModel("MotherBoard", "Asus ROG", R.drawable.asusmobo));
        parts.add(new PartsModel("RAM", "Trident-Z DDR5 2x16gb", R.drawable.ddr5));
        parts.add(new PartsModel("GPU", "RTX 5090", R.drawable.rtx5090));
        _partsList.setValue(parts);
    }
}