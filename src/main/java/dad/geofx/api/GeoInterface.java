package dad.geofx.api;

import dad.geofx.model.Example;
import dad.geofx.model.Location;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface GeoInterface {

	@GET("ip_api.php?ip={IP}")
	public Call<Example> ConnectionData(@Path("IP") String IP);
	
}
