package io.ktor.client.engine;

import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.content.OutgoingContent;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12100k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f12101l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12102m;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f12100k = i7;
        this.f12101l = obj;
        this.f12102m = obj2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12100k) {
            case 0:
                return HttpClientEngine.AnonymousClass1.invokeSuspend$lambda$2((HttpClient) this.f12101l, (HttpResponse) this.f12102m, (Throwable) obj);
            case 1:
                return HttpClientEngineKt.AnonymousClass1.create$lambda$0((k) this.f12101l, (k) this.f12102m, (HttpClientEngineConfig) obj);
            default:
                return UtilsKt.mergeHeaders$lambda$0((Headers) this.f12101l, (OutgoingContent) this.f12102m, (HeadersBuilder) obj);
        }
    }
}
