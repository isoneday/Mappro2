package com.training.mappro.network;


import com.training.mappro.model.Modelwaypoint;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by FUADMASKA on 6/16/2017.
 */

public interface ApiService {

        @GET("api/directions/json")
    Call<Modelwaypoint> request_route(
                @Query("origin") String origin,
                @Query("destination") String tujuan,
                @Query("mode") String mode

        );




}
