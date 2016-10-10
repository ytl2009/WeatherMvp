package android.yuchang.weathermvp.protocol;

import android.yuchang.weathermvp.commom.url.ApiUrl;
import android.yuchang.weathermvp.model.entity.WeatherBean;
import android.yuchang.weathermvp.model.entity.WeatherQulityBean;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * @author MrChang45
 * @time 2016/10/9
 * @desc
 */
public interface WeatherQulityApi {

    String HOST = ApiUrl.WEATHER_QUALITY_YRL;

    /***
     * 获取天气质量
     *
     * @param cityName
     * @return
     */
    @GET("/apistore/aqiservice/aqi")
    Observable<WeatherQulityBean> GetWeatherQulityInfo(@Query("city") String cityName);
}