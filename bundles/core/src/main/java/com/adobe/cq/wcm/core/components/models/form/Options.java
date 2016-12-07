/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2016 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models.form;

import java.util.List;

/**
 * Interface for the Form Options Sling Model
 */
public interface Options {

    /**
     * @return The name of the options field.
     */
    public String getName();

    /**
     * Returns the list of all the options.
     *
     * @return {@link List} of {@link OptionItem}s
     */
    List<OptionItem> getOptionItems();

    /**
     * @return unique identifier for the form element
     */
    String getId();

    /**
     * @return the message for the help block
     */
    String getHelpMessage();

    /**
     * @return the caption for the options element
     */
    String getCaption();
}
