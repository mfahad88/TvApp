package com.example.fahad.tvapp.Interface;


import com.example.fahad.tvapp.model.CategoryBean;
import com.example.fahad.tvapp.model.RegionBean;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

	@GET("region/get.php")
	Call<List<RegionBean>> region();


	@GET("category/get.php")
	Call<List<CategoryBean>> category();
}