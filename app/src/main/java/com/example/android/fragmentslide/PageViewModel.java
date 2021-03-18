package com.example.android.fragmentslide;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class PageViewModel extends ViewModel {

    private MutableLiveData<String> mName = new MutableLiveData<>();
    public void setName(String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }
    private MutableLiveData<String> mVisi = new MutableLiveData<>();
    public void setVisi(String visi) {
        mVisi.setValue(visi);
    }
    public LiveData<String> getVisi() {
        return mVisi;
    }
    private MutableLiveData<String> mJumlah = new MutableLiveData<>();
    public void setJumlah(String jumlah) {
        mJumlah.setValue(jumlah);
    }
    public LiveData<String> getJumlah() {
        return mJumlah;
    }
}
