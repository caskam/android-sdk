package com.dreamfactory.sampleapp.api.services;

import com.dreamfactory.sampleapp.models.ContactInfoRecord;
import com.dreamfactory.sampleapp.models.ContactRecord;
import com.dreamfactory.sampleapp.models.Resource;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Nirmel on 6/3/2016.
 */
public interface ContactInfoService {

    @GET("db/_table/contact_info")
    Call<Resource<ContactInfoRecord>> getContactInfo(@Query(value = "filter") String filter);

    @PATCH("db/_table/contact_info")
    Call<Resource<ContactInfoRecord>> updateContactInfo(@Body Resource<ContactInfoRecord> contactRecord);

    @GET("db/_table/contact_info/{id}")
    Call<ContactInfoRecord> getContactInfo(@Path(value = "id") Long contactInfoId);
}
