package com.example.pioneers.dto;

import com.example.pioneers.domain.MbtiType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MbtiResult {

    private String name;
    private String imageUrl;
    private String description;
    private String advantages;
    private String disadvantages;
    private String teamwork;
    private String similarTypeEntrepreneurs;
    private String entrepreneurDescription;

    public static MbtiResult toDto(MbtiType mbtiType){
        MbtiResult mbtiResult = new MbtiResult();
        mbtiResult.setName(mbtiType.getName());
        mbtiResult.setImageUrl(mbtiType.getImageUrl());
        mbtiResult.setDescription(mbtiType.getDescription());
        mbtiResult.setAdvantages(mbtiType.getAdvantages());
        mbtiResult.setDisadvantages(mbtiType.getDisadvantages());
        mbtiResult.setTeamwork(mbtiType.getTeamwork());
        mbtiResult.setSimilarTypeEntrepreneurs(mbtiType.getSimilarTypeEntrepreneurs());
        mbtiResult.setEntrepreneurDescription(mbtiType.getEntrepreneurDescription());

        return mbtiResult;
    }
}
