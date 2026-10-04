package io.github.jan.supabase.storage.resumable;

import O3.C;
import O3.l;
import S3.c;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000e\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0013j\u0002`\u00140\u0012H¦@¢\u0006\u0002\u0010\u0010¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCache;", "", "set", "", "fingerprint", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "entry", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "get-iiNwMIM", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "remove-iiNwMIM", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "", "Lkotlin/Pair;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ResumableCache {
    Object clear(c<? super C> cVar);

    Object entries(c<? super List<l>> cVar);

    /* renamed from: get-iiNwMIM */
    Object mo97getiiNwMIM(String str, c<? super ResumableCacheEntry> cVar);

    /* renamed from: remove-iiNwMIM */
    Object mo98removeiiNwMIM(String str, c<? super C> cVar);

    /* renamed from: set-zb63x2Q */
    Object mo99setzb63x2Q(String str, ResumableCacheEntry resumableCacheEntry, c<? super C> cVar);
}
