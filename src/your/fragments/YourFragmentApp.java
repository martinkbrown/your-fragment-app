package your.fragments;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YourFragmentApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        YourWebFragment frag = new YourWebFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.left_fragment_container, frag);
        ft.commit();
    }
}