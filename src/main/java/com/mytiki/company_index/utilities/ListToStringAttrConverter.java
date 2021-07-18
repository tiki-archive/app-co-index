package com.mytiki.company_index.utilities;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.List;

public class ListToStringAttrConverter implements AttributeConverter<List<String>, String> {
    private static final String DELIMITER = ",";

    @Override
    public String convertToDatabaseColumn(List<String> strings) {
        return strings == null ?
                null :
                String.join(DELIMITER, strings);
    }

    @Override
    public List<String> convertToEntityAttribute(String s) {
       return s == null ?
               null :
               Arrays.asList(s.split(DELIMITER));
    }
}
