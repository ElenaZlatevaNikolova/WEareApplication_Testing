package com.weare.testframework.api.utils;

import com.weare.testframework.api.models.CategoryModel;
import com.weare.testframework.api.models.LocationModel;
import com.weare.testframework.api.models.PageModel;
import com.weare.testframework.api.models.UserModel;

public class Constants {


    public static final int USERNAME_INDEX = 3;
    public static final int USER_ID_INDEX = 6;

    public static final String ROLE_USER = "ROLE_USER";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";

    public static final String ADMIN_PREFIX = "admin";

    public static UserModel USER;
    public static UserModel ADMIN;

    public static final CategoryModel CATEGORY_ALL = new CategoryModel(100, "All");

    public static final PageModel PAGE = new PageModel(0, true, "", "", 10);

    public static final double AVAILABILITY = 0.5;

    public static final LocationModel LOCATION = new LocationModel(0, 1, "Sofia");

    public static final String POST_DEFAULT_PICTURE = "";

    public static final boolean POST_PUBLIC = true;

    public static final String APPROVE_REQUEST_MESSAGE = "approved request of";
    public static final String SEND_REQUEST_MESSAGE = "send friend request to";

}
