package dad.geofx.api;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.sql.ConnectionPoolDataSource;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import dad.geofx.model.Example;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GeoService {

	private static final String BASE_URL = "https://ipapi.com/";
	// +IP+"?access_key=107f87c16d92602ec3fd52fbd82a1f35"

	private GeoInterface service;

	public GeoService() {

		ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

		OkHttpClient client = new OkHttpClient.Builder()
								.connectionPool(pool).build();

		Retrofit retrofit = new Retrofit.Builder()
							.baseUrl(BASE_URL).client(client)
							.addConverterFactory(GsonConverterFactory
									.create())
							.build();

		service = retrofit.create(GeoInterface.class);
	}

	public Example ConnectionData(String IP) throws Exception {
		Response<Example> response = service.ConnectionData(IP).execute();
		assertResponse(response);
		Example message = response.body();
		return message;

	}

	private void assertResponse(Response<?> response) throws Exception {
		if (!response.isSuccessful()) {
			Gson gson = new Gson();
			ErrorMessage error = gson.fromJson(response.errorBody().string(), ErrorMessage.class);
			throw new Exception(error.getError().getInfo());

		}

	}

}
