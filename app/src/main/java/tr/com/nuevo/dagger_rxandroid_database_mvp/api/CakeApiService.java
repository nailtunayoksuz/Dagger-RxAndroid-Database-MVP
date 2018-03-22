package tr.com.nuevo.dagger_rxandroid_database_mvp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;
import tr.com.nuevo.dagger_rxandroid_database_mvp.mvp.model.CakesResponse;

/**
 * Created by nuevomacpro13 on 22.03.2018.
 */

public interface CakeApiService {
    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Observable<CakesResponse> getCakes();

    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Call<CakesResponse> getTheCakes();
}
