package com.kusukanime.data;

import E1.m;
import E1.q;
import F.w;
import F1.d;
import F1.r;
import F1.u;
import Z3.h;
import Z3.i;
import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y5.e;
import y5.f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/kusukanime/data/VideoCache;", "", "<init>", "()V", "CACHE_DIR", "", "WATCH_BUDGET_BYTES", "", "simpleCache", "Landroidx/media3/datasource/cache/SimpleCache;", "getCache", "context", "Landroid/content/Context;", "buildDataSourceFactory", "Landroidx/media3/datasource/cache/CacheDataSource$Factory;", "httpFactory", "Landroidx/media3/datasource/DefaultHttpDataSource$Factory;", "clearWatchCache", "", "watchCacheBytes", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoCache {
    private static final String CACHE_DIR = "kusukanime_video_cache";
    private static final long WATCH_BUDGET_BYTES = 419430400;
    private static volatile u simpleCache;
    public static final VideoCache INSTANCE = new VideoCache();
    public static final int $stable = 8;

    private VideoCache() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean watchCacheBytes$lambda$0(File file) {
        l.f("it", file);
        return file.isFile();
    }

    public final d buildDataSourceFactory(Context context, m mVar) {
        l.f("context", context);
        l.f("httpFactory", mVar);
        w wVar = new w(context.getApplicationContext(), mVar);
        d dVar = new d();
        dVar.f2166l = new q();
        dVar.f2165k = getCache(context);
        dVar.f2167m = wVar;
        dVar.f2168n = 6;
        return dVar;
    }

    public final void clearWatchCache(Context context) {
        HashSet hashSet;
        l.f("context", context);
        u cache = getCache(context);
        synchronized (cache) {
            hashSet = new HashSet(((HashMap) cache.f2217c.f275k).keySet());
        }
        Iterator it = P3.q.S0(hashSet).iterator();
        while (it.hasNext()) {
            try {
                INSTANCE.getCache(context).k((String) it.next());
            } catch (Exception unused) {
            }
        }
    }

    public final u getCache(Context context) {
        u uVar;
        l.f("context", context);
        u uVar2 = simpleCache;
        if (uVar2 != null) {
            return uVar2;
        }
        synchronized (this) {
            try {
                uVar = simpleCache;
                if (uVar == null) {
                    File file = new File(context.getApplicationContext().getCacheDir(), CACHE_DIR);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    u uVar3 = new u(file, new r(), new D1.b(context.getApplicationContext().getApplicationContext(), "exoplayer_internal.db", null, 1));
                    simpleCache = uVar3;
                    uVar = uVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public final long watchCacheBytes(Context context) {
        l.f("context", context);
        File file = new File(context.getApplicationContext().getCacheDir(), CACHE_DIR);
        long length = 0;
        if (!file.exists()) {
            return 0L;
        }
        i iVar = i.f10263k;
        e eVar = new e(new f(new h(file), true, new A3.e(20)));
        while (eVar.hasNext()) {
            length += ((File) eVar.next()).length();
        }
        return length;
    }
}
