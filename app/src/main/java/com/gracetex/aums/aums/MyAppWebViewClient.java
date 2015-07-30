package com.gracetex.aums.aums;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by r3v0 on 12/7/15.
 */
public class MyAppWebViewClient extends WebViewClient {

    @Override

    public boolean shouldOverrideUrlLoading(WebView view, String url ){
    if(Uri.parse(url).getHost().endsWith("www.amrita.edu/aums")) {
        return false;
    }

    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
    view.getContext().startActivity(intent);
    return true;
}
}

