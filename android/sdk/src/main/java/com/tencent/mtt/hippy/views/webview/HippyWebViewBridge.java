package com.tencent.mtt.hippy.views.webview;

import android.webkit.JavascriptInterface;

class HippyWebViewBridge {
	private HippyWebView hippyView;

	public HippyWebViewBridge(HippyWebView webView) {
		hippyView = webView;
	}

	@JavascriptInterface
	public void postMessage(String msg)
	{
		if (hippyView != null)
			hippyView.postMessage(msg);
	}
}
