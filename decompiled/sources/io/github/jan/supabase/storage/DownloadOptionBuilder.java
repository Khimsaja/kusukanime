package io.github.jan.supabase.storage;

import O3.C;
import e4.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BG\u0012\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\n¢\u0006\u0002\b\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0002\u001a\u00020\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006J#\u0010\u0013\u001a\u00020\u00052\u001b\u0010\u0014\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\n¢\u0006\u0002\b\u0006R+\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0007\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\n¢\u0006\u0002\b\u00060\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/storage/DownloadOptionBuilder;", "", "transform", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/ImageTransformation;", "", "Lkotlin/ExtensionFunctionType;", "httpRequestOverrides", "", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/github/jan/supabase/network/HttpRequestOverride;", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V", "getTransform$storage_kt_release", "()Lkotlin/jvm/functions/Function1;", "setTransform$storage_kt_release", "(Lkotlin/jvm/functions/Function1;)V", "getHttpRequestOverrides$storage_kt_release", "()Ljava/util/List;", "httpOverride", "override", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadOptionBuilder {
    private final List<k> httpRequestOverrides;
    private k transform;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadOptionBuilder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C _init_$lambda$0(ImageTransformation imageTransformation) {
        l.f("<this>", imageTransformation);
        return C.a;
    }

    public final List<k> getHttpRequestOverrides$storage_kt_release() {
        return this.httpRequestOverrides;
    }

    /* renamed from: getTransform$storage_kt_release, reason: from getter */
    public final k getTransform() {
        return this.transform;
    }

    public final void httpOverride(k kVar) {
        l.f("override", kVar);
        this.httpRequestOverrides.add(kVar);
    }

    public final void setTransform$storage_kt_release(k kVar) {
        l.f("<set-?>", kVar);
        this.transform = kVar;
    }

    public final void transform(k kVar) {
        l.f("transform", kVar);
        this.transform = kVar;
    }

    public DownloadOptionBuilder(k kVar, List<k> list) {
        l.f("transform", kVar);
        l.f("httpRequestOverrides", list);
        this.transform = kVar;
        this.httpRequestOverrides = list;
    }

    public /* synthetic */ DownloadOptionBuilder(k kVar, List list, int i7, kotlin.jvm.internal.f fVar) {
        this((i7 & 1) != 0 ? new a(20) : kVar, (i7 & 2) != 0 ? new ArrayList() : list);
    }
}
