package io.github.jan.supabase.storage.resumable;

import O3.C;
import O3.l;
import P3.r;
import S3.c;
import a6.C0673c;
import a6.d;
import io.github.jan.supabase.collections.AtomicMutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import n6.m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0015J$\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0018j\u0002`\u00190\u0017H\u0096@¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/storage/resumable/MemoryResumableCache;", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "map", "", "", "<init>", "(Ljava/util/Map;)V", "set", "", "fingerprint", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "entry", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "get-iiNwMIM", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "remove-iiNwMIM", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "", "Lkotlin/Pair;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MemoryResumableCache implements ResumableCache {
    private final Map<String, String> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MemoryResumableCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    public Object clear(c<? super C> cVar) {
        this.map.clear();
        return C.a;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    public Object entries(c<? super List<l>> cVar) {
        Map<String, String> map = this.map;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String strM95invoke3xapfgk = Fingerprint.INSTANCE.m95invoke3xapfgk(it.next().getKey());
            Fingerprint fingerprintM85boximpl = strM95invoke3xapfgk != null ? Fingerprint.m85boximpl(strM95invoke3xapfgk) : null;
            if (fingerprintM85boximpl != null) {
                arrayList.add(fingerprintM85boximpl);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strM94unboximpl = ((Fingerprint) it2.next()).m94unboximpl();
            Fingerprint fingerprintM85boximpl2 = Fingerprint.m85boximpl(strM94unboximpl);
            C0673c c0673c = d.f10459d;
            c0673c.getClass();
            arrayList2.add(new l(fingerprintM85boximpl2, c0673c.b(strM94unboximpl, ResumableCacheEntry.INSTANCE.serializer())));
        }
        return arrayList2;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* renamed from: get-iiNwMIM, reason: not valid java name */
    public Object mo97getiiNwMIM(String str, c<? super ResumableCacheEntry> cVar) {
        String str2 = this.map.get(str);
        if (str2 == null) {
            return null;
        }
        C0673c c0673c = d.f10459d;
        c0673c.getClass();
        return (ResumableCacheEntry) c0673c.b(str2, m.K(ResumableCacheEntry.INSTANCE.serializer()));
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* renamed from: remove-iiNwMIM, reason: not valid java name */
    public Object mo98removeiiNwMIM(String str, c<? super C> cVar) {
        this.map.remove(str);
        return C.a;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* renamed from: set-zb63x2Q, reason: not valid java name */
    public Object mo99setzb63x2Q(String str, ResumableCacheEntry resumableCacheEntry, c<? super C> cVar) {
        Map<String, String> map = this.map;
        C0673c c0673c = d.f10459d;
        c0673c.getClass();
        map.put(str, c0673c.d(ResumableCacheEntry.INSTANCE.serializer(), resumableCacheEntry));
        return C.a;
    }

    public MemoryResumableCache(Map<String, String> map) {
        kotlin.jvm.internal.l.f("map", map);
        this.map = map;
    }

    public /* synthetic */ MemoryResumableCache(Map map, int i7, f fVar) {
        this((i7 & 1) != 0 ? new AtomicMutableMap(new l[0]) : map);
    }
}
