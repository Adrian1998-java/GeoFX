package dad.geofx.model;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.sql.ConnectionPoolDataSource;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GeoService {

	private static final String BASE_URL = "http://api.ipapi.com/";
	// +IP+"?access_key=107f87c16d92602ec3fd52fbd82a1f35"

	private GeoInterface service;

	public GeoService() {

		ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

		OkHttpClient client = new OkHttpClient.Builder().connectionPool(pool).build();

		Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(client)
				.addConverterFactory(GsonConverterFactory.create()).build();

		service = retrofit.create(GeoInterface.class);
	}

	public URL ConnectionData(String IP) throws Exception {
		Response<Example> response = service.ConnectionData(IP).execute();
		assertResponse(response);
		Example message = response.body();
		return new URL(message.getIp());

	}

	private void assertResponse(Response<Example> response) throws Exception {
		if (!response.isSuccessful()) {
			Gson gson = new Gson();
			ErrorMessage error = gson.fromJson(response.errorBody().string(), ErrorMessage.class);
			throw new Exception(error.getError().getInfo());

		}

	}

}
