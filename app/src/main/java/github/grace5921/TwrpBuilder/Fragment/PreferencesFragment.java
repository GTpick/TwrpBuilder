package github.grace5921.TwrpBuilder.Fragment;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
import github.grace5921.TwrpBuilder.R;


/**
 * Created by: veli
 * Date: 10/26/16 12:08 AM
 */

public class PreferencesFragment extends PreferenceFragmentCompat
{
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey)
    {
        addPreferencesFromResource(R.xml.preferences_main);
    }
}