package com.ahsanshamim.nfcreader.RetrofitAPI;

import com.ahsanshamim.nfcreader.Models.getproductinfo;
import com.ahsanshamim.nfcreader.Models.getproductsInfo;
import com.ahsanshamim.nfcreader.Models.iteminfoP;
import com.ahsanshamim.nfcreader.Models.responseproduct;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("getproducts")
    Call<getproductsInfo> getproducts();

    @GET("getproductbyid")
    Call<getproductinfo> getproductbyid(@Query("productid") String id);

    @POST("setproduct")
    Call<responseproduct> setproducts(@Body iteminfoP item);
}
