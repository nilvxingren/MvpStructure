package app.season.mvpstructure.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.season.mvpstructure.injection.ApplicationContext;

/**
 * preferencesHelper
 *
 * User: Season(ssseasonnn@gmail.com)
 * Date: 2016-3-25
 * Time: 13:12
 * FIXME
 */
@Singleton
public class PreferencesHelper {

    public static final String PREF_FILE_NAME = "preferences_file_name";

    private final SharedPreferences mPref;
    private final Gson mGson;

    @Inject
    public PreferencesHelper(@ApplicationContext Context context) {
        this.mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
//        this.mGson = new GsonBuilder()
//                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz")
//                .create();
        this.mGson = new Gson();
    }

    public void clear() {
        mPref.edit().clear().apply();
    }


}
