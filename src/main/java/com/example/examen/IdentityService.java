package com.example.examen;

import java.util.ArrayList;
import java.util.List;

public class IdentityService {
//    List<Integer> lista = new ArrayList<>();
    private static final List<Integer> listaCi = new ArrayList<>();
    static {
        listaCi.add(1);
        listaCi.add(2);
    }


    public boolean verifyExistence(int id) {
        return listaCi.contains(id);
    }
}
