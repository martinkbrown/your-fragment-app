package your.fragments;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;

public class YourWebFragment extends WebViewFragment{

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		WebView webview = getWebView();
		
        webview.setWebViewClient(new WebViewClient() {
        	
        	public boolean shouldOverrideUrlLoading(WebView view, String url) {
        		return false;
        	}
        	
        });
        
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.youtube.com/watch?v=hLQl3WQQoQ0&ob=av2n");
		
	}
	
}
