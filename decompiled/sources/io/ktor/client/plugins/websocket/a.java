package io.ktor.client.plugins.websocket;

import e4.k;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HttpMethod;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12146k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HttpMethod f12147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f12148m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f12149n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f12150o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f12151p;

    public /* synthetic */ a(HttpMethod httpMethod, String str, Integer num, String str2, k kVar, int i7) {
        this.f12146k = i7;
        this.f12147l = httpMethod;
        this.f12148m = str;
        this.f12149n = num;
        this.f12150o = str2;
        this.f12151p = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12146k) {
            case 0:
                Integer num = this.f12149n;
                String str = this.f12150o;
                return BuildersKt.webSocketSession$lambda$4(this.f12147l, this.f12148m, num, str, this.f12151p, (HttpRequestBuilder) obj);
            default:
                Integer num2 = this.f12149n;
                String str2 = this.f12150o;
                return BuildersKt.webSocket$lambda$11(this.f12147l, this.f12148m, num2, str2, this.f12151p, (HttpRequestBuilder) obj);
        }
    }
}
