package io.github.jan.supabase.network;

import e4.k;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.http.HeadersBuilder;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12073k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ KtorSupabaseHttpClient f12074l;

    public /* synthetic */ a(KtorSupabaseHttpClient ktorSupabaseHttpClient, int i7) {
        this.f12073k = i7;
        this.f12074l = ktorSupabaseHttpClient;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12073k) {
            case 0:
                return KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$0(this.f12074l, (DefaultRequest.DefaultRequestBuilder) obj);
            case 1:
                return KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$2(this.f12074l, (HttpTimeoutConfig) obj);
            default:
                return KtorSupabaseHttpClient.applyDefaultConfiguration$lambda$0$0(this.f12074l, (HeadersBuilder) obj);
        }
    }
}
