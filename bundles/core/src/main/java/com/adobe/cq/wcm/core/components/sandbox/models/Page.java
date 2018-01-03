/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2017 Adobe Systems Incorporated
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
package com.adobe.cq.wcm.core.components.sandbox.models;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.osgi.annotation.versioning.ConsumerType;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ContainerExporter;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Defines the {@code Page} Sling Model used for the {@code /apps/core/wcm/components/page} component.
 */
@ConsumerType
public interface Page extends com.adobe.cq.wcm.core.components.models.Page, ContainerExporter {

    /**
     * Name of the configuration policy property that will store the category of the client library from which web application resources
     * will be served.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 4.0.0
     */
    String PN_APP_RESOURCES_CLIENTLIB = "appResourcesClientlib";

    /**
     * <p>
     * Retrieves the paths to the various favicons for the website as <code>&lt;favicon_name&gt;:&lt;path&gt;</code> pairs.
     * </p>
     * <p>
     * If a file corresponding to a particular type of favicon is found under the page's design path, then the
     * &lt;favicon_name&gt;:&lt;path&gt; pair is added to the map, otherwise that type of favicon is ignored. The following list
     * defines the currently supported favicons along with their brief descriptions:</p>
     *  <ul>
     *      <li>{@link #PN_FAVICON_ICO}: The favicon.ico favicon</li>
     *      <li>{@link #PN_FAVICON_PNG}: The png version of the favicon</li>
     *      <li>{@link #PN_TOUCH_ICON_60}: The touch icon with size 60px</li>
     *      <li>{@link #PN_TOUCH_ICON_76}: The touch icon with size 76px</li>
     *      <li>{@link #PN_TOUCH_ICON_120}: The touch icon with size 120px</li>
     *      <li>{@link #PN_TOUCH_ICON_152}: The touch icon with size 152px</li>
     *  </ul>
     *
     * @return {@link Map} containing the names of the favicons and their corresponding paths
     */
    @Deprecated
    default Map<String, String> getFavicons() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the root path of the application's web resources (e.g. favicons, application manifest, etc.).
     *
     * @return resources path; can return {@code null} if no such resources were defined
     */
    @Nullable
    default String getAppResourcesPath() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the CSS classes defined for the page
     *
     * @return {@link String} containing the CSS classes defined for the page, if one class exists, {@code null} otherwise
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.4.0
     */
    default String getCssClassNames() {
        throw new UnsupportedOperationException();
    }

    @Nonnull
    @Override
    default String[] getExportedItemsOrder() {
        throw new UnsupportedOperationException();
    }

    @Nonnull
    @Override
    default Map<String, ? extends ComponentExporter> getExportedItems() {
        throw new UnsupportedOperationException();
    }

    @Nonnull
    @Override
    default String getExportedType() {
        throw new UnsupportedOperationException();
    }

    @JsonIgnore
    @Override
    default String[] getClientLibCategories() {
        throw new UnsupportedOperationException();
    }

    @JsonIgnore
    @Override
    default String[] getKeywords() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the target page if this page is redirecting to another page.
     *
     * @return {@link NavigationItem} of redirect target
     * @since com.adobe.cq.wcm.core.components.sandbox.models 3.2.0
     */
    @Nullable
    default NavigationItem getRedirectTarget() {
        throw new UnsupportedOperationException();
    }

}
