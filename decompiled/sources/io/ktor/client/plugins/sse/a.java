package io.ktor.client.plugins.sse;

import e4.k;
import io.ktor.client.request.HttpRequestBuilder;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12136k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f12137l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f12138m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f12139n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f12140o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f12141p;

    public /* synthetic */ a(String str, String str2, Integer num, String str3, k kVar, int i7) {
        this.f12136k = i7;
        this.f12137l = str;
        this.f12138m = str2;
        this.f12139n = num;
        this.f12140o = str3;
        this.f12141p = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12136k) {
            case 0:
                Integer num = this.f12139n;
                String str = this.f12140o;
                return BuildersKt.serverSentEvents_1wIb_0I$lambda$7(this.f12137l, this.f12138m, num, str, this.f12141p, (HttpRequestBuilder) obj);
            case 1:
                Integer num2 = this.f12139n;
                String str2 = this.f12140o;
                return BuildersKt.serverSentEventsSession_xEWcMm4$lambda$3(this.f12137l, this.f12138m, num2, str2, this.f12141p, (HttpRequestBuilder) obj);
            case 2:
                Integer num3 = this.f12139n;
                String str3 = this.f12140o;
                return BuildersKt.serverSentEventsSession_tL6_L_A$lambda$16(this.f12137l, this.f12138m, num3, str3, this.f12141p, (HttpRequestBuilder) obj);
            default:
                Integer num4 = this.f12139n;
                String str4 = this.f12140o;
                return BuildersKt.serverSentEvents_BqdlHlk$lambda$20(this.f12137l, this.f12138m, num4, str4, this.f12141p, (HttpRequestBuilder) obj);
        }
    }
}
