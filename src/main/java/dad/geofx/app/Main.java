package dad.geofx.app;

import java.io.IOException;

import com.google.gson.Gson;

import dad.geofx.model.Example;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		
		try {
			App.main(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder()
//            .url("https://ipapi.com/ip_api.php?ip=8.8.8.8")
//            .get()
//            .build();
//
//        Response response = client.newCall(request).execute();
//
//        String json = response.body().string();
//        
//        System.out.println(json);
//        
//        Gson gson = new Gson();
//        
//        Example example =  gson.fromJson(json, Example.class);
//        
//        System.out.println(example.getLocation().getCapital());
	}

}
