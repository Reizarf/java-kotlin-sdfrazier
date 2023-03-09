package com.example.server;

import com.example.capco.Cap;
import com.example.capco.Size;

import java.util.ArrayList;
import java.util.List;

public class Model {
//    List<SchoolBus> sb;
//    //List<Cap> caps;
    Model() {
        caps = new ArrayList<Cap>();
        caps.add(new Cap("Go CMU", Size.LARGE));
        caps.add(new Cap("Jackalopes!", Size.MEDIUM));
    }
//    Model() {
//        sb = new ArrayList<SchoolBus>();
//        sb.add((new ))
//    }

    List<Cap> findAll() {
        return caps;
    }
}
