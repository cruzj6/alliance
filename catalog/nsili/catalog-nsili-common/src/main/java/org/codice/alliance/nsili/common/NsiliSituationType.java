/**
 * Copyright (c) Codice Foundation
 * <p>
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 */

package org.codice.alliance.nsili.common;

import java.util.HashMap;
import java.util.Map;

public enum NsiliSituationType {
    GENERAL("GENERAL"),
    MILITARY("MILITARY"),
    LAND("LAND"),
    MARITIME("MARITIME"),
    AIR("AIR"),
    SPACE("SPACE"),
    CI_SECURITY("CI/SECURITY"),
    OTHER("OTHER");

    private static final Map<String, NsiliSituationType> specNameMap = new HashMap<>();

    static {
        for (NsiliSituationType classification : NsiliSituationType.values()) {
            specNameMap.put(classification.getSpecName(), classification);
        }
    }

    private String specName;

    NsiliSituationType(String specName) {
        this.specName = specName;
    }

    public String getSpecName() {
        return specName;
    }

    public static NsiliSituationType fromSpecName(String specName) {
        return specNameMap.get(specName);
    }
}
