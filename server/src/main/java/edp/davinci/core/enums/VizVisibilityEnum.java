/*
 * <<
 *  Davinci
 *  ==
 *  Copyright (C) 2016 - 2019 EDP
 *  ==
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  >>
 *
 */

package edp.davinci.core.enums;

public enum VizVisibilityEnum {
    PORTAL("portal"),
    DASHBOARD("dashboard"),
    DISPLAY("display"),
    SLIDE("slide");

    private String viz;

    VizVisibilityEnum(String viz) {
        this.viz = viz;
    }

    VizVisibilityEnum() {
    }

    public static VizVisibilityEnum vizOf(String viz) {
        for (VizVisibilityEnum visibilityEnum : VizVisibilityEnum.values()) {
            if (viz.equals(visibilityEnum.viz)) {
                return visibilityEnum;
            }
        }
        return null;
    }
}
