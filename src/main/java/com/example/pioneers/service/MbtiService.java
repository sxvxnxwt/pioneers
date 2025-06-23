package com.example.pioneers.service;

import com.example.pioneers.domain.MbtiType;
import com.example.pioneers.dto.MbtiResponse;
import com.example.pioneers.dto.MbtiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class MbtiService {

    public String evaluateMbti(MbtiResponse mbtiResponse){
        int E, I, N, S, F, T, P, J;

        List<String> arr = new ArrayList<>();
        arr.add(mbtiResponse.getQ1()); arr.add(mbtiResponse.getQ2()); arr.add(mbtiResponse.getQ3()); arr.add(mbtiResponse.getQ4());
        arr.add(mbtiResponse.getQ5()); arr.add(mbtiResponse.getQ6()); arr.add(mbtiResponse.getQ7()); arr.add(mbtiResponse.getQ8());
        arr.add(mbtiResponse.getQ9()); arr.add(mbtiResponse.getQ10()); arr.add(mbtiResponse.getQ11()); arr.add(mbtiResponse.getQ12());

        E = Collections.frequency(arr, "E");
        I = Collections.frequency(arr, "I");
        S = Collections.frequency(arr, "S");
        N = Collections.frequency(arr, "N");
        F = Collections.frequency(arr, "F");
        T = Collections.frequency(arr, "T");
        P = Collections.frequency(arr, "P");
        J = Collections.frequency(arr, "J");

        String result = "";

        if(E > I) {
            result += "E";
        } else{
            result += "I";
        }
        if(N > S) {
            result += "N";
        } else{
            result += "S";
        }
        if(T > F) {
            result += "T";
        } else{
            result += "F";
        }
        if(P > J) {
            result += "P";
        } else{
            result += "J";
        }

        return result;
    }

    public MbtiResult findMbtiInfo(String result){
        return MbtiType.findMbtiInfo(result);
    }
}
