package com.rama.demos.hooks;

import com.rama.demos.models.YorLogoCreateAccountM;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class YorLogoCreateAccountH {

    @DataTableType
    public YorLogoCreateAccountM transformToTShirt(Map<String, String> entry) {
        return new YorLogoCreateAccountM(entry.get("title"),entry.get("emailAddress"),  entry.get("firstName"), entry.get("lastName"), entry.get("password"),
                entry.get("dateOfBirth"), entry.get("company"),entry.get("address"), entry.get("addressLine"),
                entry.get("city"),entry.get("state"), entry.get("postalCode"),entry.get("information"),
                entry.get("homePhone"),entry.get("mobilePhone"), entry.get("alias"));
    }


}
