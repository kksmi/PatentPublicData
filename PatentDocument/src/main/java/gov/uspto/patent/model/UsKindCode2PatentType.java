package gov.uspto.patent.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * USPTO Kind Codes and WIPO ST.16
 *
 */
public class UsKindCode2PatentType {

    private static Map<String, PatentType> mapping = new HashMap<String, PatentType>();

    static {
        // UTILITY
        mapping.put("A", PatentType.UTILITY);
        mapping.put("A1", PatentType.UTILITY);
        mapping.put("A2", PatentType.UTILITY);
        mapping.put("A9", PatentType.UTILITY);

        // Re-examination
        mapping.put("B1", PatentType.UTILITY);
        mapping.put("B2", PatentType.UTILITY);
        mapping.put("B3", PatentType.UTILITY);
        mapping.put("C1", PatentType.UTILITY);
        mapping.put("C2", PatentType.UTILITY);
        mapping.put("C3", PatentType.UTILITY);

        // REISSUE
        mapping.put("E", PatentType.REISSUE);

        // DESIGN
        mapping.put("S", PatentType.DESIGN);

        // PLANT
        mapping.put("P", PatentType.PLANT);
        mapping.put("P1", PatentType.PLANT);
        mapping.put("P2", PatentType.PLANT);
        mapping.put("P3", PatentType.PLANT);
        mapping.put("P4", PatentType.PLANT);
        mapping.put("P9", PatentType.PLANT);

        // STATUTORY_INVENTION_REGISTRATION
        mapping.put("H", PatentType.STATUTORY_INVENTION_REGISTRATION);
    }

    public PatentType lookupPatentType(String kindCode) {
        return mapping.get(kindCode);
    }
}
