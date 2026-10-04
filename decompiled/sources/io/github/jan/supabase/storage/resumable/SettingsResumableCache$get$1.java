package io.github.jan.supabase.storage.resumable;

import U3.c;
import U3.e;
import kotlin.Metadata;

@e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {25}, m = "get-iiNwMIM", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsResumableCache$get$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsResumableCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsResumableCache$get$1(SettingsResumableCache settingsResumableCache, S3.c<? super SettingsResumableCache$get$1> cVar) {
        super(cVar);
        this.this$0 = settingsResumableCache;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo97getiiNwMIM(null, this);
    }
}
