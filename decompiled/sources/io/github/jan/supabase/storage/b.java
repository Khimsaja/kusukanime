package io.github.jan.supabase.storage;

import e4.k;
import io.ktor.client.request.HttpRequestBuilder;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12079k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BucketApiImpl f12080l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f12081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f12082n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ DownloadOptionBuilder f12083o;

    public /* synthetic */ b(BucketApiImpl bucketApiImpl, String str, boolean z7, DownloadOptionBuilder downloadOptionBuilder, int i7) {
        this.f12079k = i7;
        this.f12080l = bucketApiImpl;
        this.f12081m = str;
        this.f12082n = z7;
        this.f12083o = downloadOptionBuilder;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12079k) {
            case 0:
                return BucketApiImpl.channelDownloadRequest$lambda$0(this.f12080l, this.f12081m, this.f12082n, this.f12083o, (HttpRequestBuilder) obj);
            default:
                return BucketApiImpl.normalDownloadRequest$lambda$0(this.f12080l, this.f12081m, this.f12082n, this.f12083o, (HttpRequestBuilder) obj);
        }
    }
}
