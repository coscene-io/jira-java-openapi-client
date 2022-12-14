/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.coscene.jira.client.v3.api;

import io.coscene.jira.client.v3.ApiException;
import io.coscene.jira.client.v3.model.TimeTrackingConfiguration;
import io.coscene.jira.client.v3.model.TimeTrackingProvider;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for TimeTrackingApi
 */
@Disabled
public class TimeTrackingApiTest {

    private final TimeTrackingApi api = new TimeTrackingApi();

    /**
     * Get all time tracking providers
     *
     * Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvailableTimeTrackingImplementationsTest() throws ApiException {
        List<TimeTrackingProvider> response = api.getAvailableTimeTrackingImplementations();
        // TODO: test validations
    }

    /**
     * Get selected time tracking provider
     *
     * Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSelectedTimeTrackingImplementationTest() throws ApiException {
        TimeTrackingProvider response = api.getSelectedTimeTrackingImplementation();
        // TODO: test validations
    }

    /**
     * Get time tracking settings
     *
     * Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSharedTimeTrackingConfigurationTest() throws ApiException {
        TimeTrackingConfiguration response = api.getSharedTimeTrackingConfiguration();
        // TODO: test validations
    }

    /**
     * Select time tracking provider
     *
     * Selects a time tracking provider.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void selectTimeTrackingImplementationTest() throws ApiException {
        TimeTrackingProvider timeTrackingProvider = null;
        Object response = api.selectTimeTrackingImplementation(timeTrackingProvider);
        // TODO: test validations
    }

    /**
     * Set time tracking settings
     *
     * Sets the time tracking settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setSharedTimeTrackingConfigurationTest() throws ApiException {
        TimeTrackingConfiguration timeTrackingConfiguration = null;
        TimeTrackingConfiguration response = api.setSharedTimeTrackingConfiguration(timeTrackingConfiguration);
        // TODO: test validations
    }

}
