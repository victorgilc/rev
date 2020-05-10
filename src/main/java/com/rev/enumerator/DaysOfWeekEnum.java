package com.rev.enumerator;

import lombok.Getter;

public enum DaysOfWeekEnum {

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    
    @Getter
    private Integer numericValue;

    DaysOfWeekEnum(Integer numericValue){
        this.numericValue = numericValue;
    }
}