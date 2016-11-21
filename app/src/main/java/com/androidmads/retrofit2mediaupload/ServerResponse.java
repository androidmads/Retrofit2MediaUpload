package com.androidmads.retrofit2mediaupload;

import com.google.gson.annotations.SerializedName;

class ServerResponse {

    // variable name should be same as in the json response from php
    @SerializedName("success")
    boolean success;
    @SerializedName("message")
    String message;

    String getMessage() {
        return message;
    }

    boolean getSuccess() {
        return success;
    }

}
