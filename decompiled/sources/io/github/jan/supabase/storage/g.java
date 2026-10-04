package io.github.jan.supabase.storage;

import e4.k;
import io.github.jan.supabase.storage.FlowExtensionKt;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12091k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f12092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f12093m;

    public /* synthetic */ g(k kVar, k kVar2, int i7) {
        this.f12091k = i7;
        this.f12092l = kVar;
        this.f12093m = kVar2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12091k) {
            case 0:
                return FlowExtensionKt.AnonymousClass2.invokeSuspend$lambda$0(this.f12092l, this.f12093m, (DownloadOptionBuilder) obj);
            case 1:
                return FlowExtensionKt.AnonymousClass4.invokeSuspend$lambda$0(this.f12092l, this.f12093m, (DownloadOptionBuilder) obj);
            case 2:
                return FlowExtensionKt.C11432.invokeSuspend$lambda$0(this.f12092l, this.f12093m, (DownloadOptionBuilder) obj);
            case 3:
                return FlowExtensionKt.C11444.invokeSuspend$lambda$0(this.f12092l, this.f12093m, (DownloadOptionBuilder) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return FlowExtensionKt.C11452.invokeSuspend$lambda$0(this.f12092l, this.f12093m, (UploadOptionBuilder) obj);
            case 5:
                return FlowExtensionKt.AnonymousClass3.invokeSuspend$lambda$0(this.f12092l, this.f12093m, (UploadOptionBuilder) obj);
            default:
                return FlowExtensionKt.C11472.invokeSuspend$lambda$0(this.f12092l, this.f12093m, (UploadOptionBuilder) obj);
        }
    }
}
