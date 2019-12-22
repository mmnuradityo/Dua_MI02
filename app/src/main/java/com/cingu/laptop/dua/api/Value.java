package com.cingu.laptop.dua.api;

import com.cingu.laptop.dua.model.Hidangan;
import com.cingu.laptop.dua.model.Komentar;
import com.cingu.laptop.dua.model.Pelanggan;

import java.util.List;

public class Value {

    Boolean success;
    List<Hidangan> hidangan;
    List<Komentar> komentar;
    //    Pelanggan pelanggan;
    List<Pelanggan> pelanggan;
    String message;

    public Boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<Hidangan> getHidangan() {
        return hidangan;
    }

    public List<Komentar> getKomentar() {
        return komentar;
    }

    public List<Pelanggan> getPelanggan() {
        return pelanggan;
    }

}
