package y3;

import O.Z;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class u extends WebViewClient {
    public final /* synthetic */ Z a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e4.k f18356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f18357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f18358d;

    public u(Z z7, e4.k kVar, Z z8, Z z9) {
        this.a = z7;
        this.f18356b = kVar;
        this.f18357c = z8;
        this.f18358d = z9;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        kotlin.jvm.internal.l.f("view", webView);
        super.onPageFinished(webView, str);
        final Z z7 = this.a;
        webView.evaluateJavascript("(function(){var v=document.querySelector('video');var f=document.querySelector('iframe');return (v||f)?'player':'none';})()", new ValueCallback() { // from class: y3.t
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                String str2 = (String) obj;
                if (str2 == null || !AbstractC2510o.W(str2, "player", false)) {
                    return;
                }
                z7.setValue(Boolean.TRUE);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        kotlin.jvm.internal.l.f("view", webView);
        kotlin.jvm.internal.l.f("request", webResourceRequest);
        kotlin.jvm.internal.l.f("error", webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            Z z7 = this.a;
            if (((Boolean) z7.getValue()).booleanValue()) {
                return;
            }
            Boolean bool = Boolean.TRUE;
            z7.setValue(bool);
            this.f18358d.setValue(bool);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        kotlin.jvm.internal.l.f("view", webView);
        kotlin.jvm.internal.l.f("request", webResourceRequest);
        String string = webResourceRequest.getUrl().toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        Z z7 = this.a;
        if (!((Boolean) z7.getValue()).booleanValue()) {
            Z z8 = this.f18357c;
            if (((String) z8.getValue()) == null) {
                boolean zFind = C.a.f19061k.matcher(string).find();
                boolean zFind2 = C.f18243b.f19061k.matcher(string).find();
                if (zFind && !zFind2) {
                    z7.setValue(Boolean.TRUE);
                    z8.setValue(string);
                    e4.k kVar = this.f18356b;
                    if (kVar != null) {
                        kVar.invoke(string);
                    }
                }
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
