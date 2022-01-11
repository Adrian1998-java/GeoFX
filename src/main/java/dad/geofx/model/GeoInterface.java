package dad.geofx.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface GeoInterface {

	@GET("api/{IP}?access_key=107f87c16d92602ec3fd52fbd82a1f35")
	public Call<Example> ConnectionData(@Path("IP") String IP);
	
}
