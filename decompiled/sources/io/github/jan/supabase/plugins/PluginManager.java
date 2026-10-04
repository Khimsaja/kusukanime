package io.github.jan.supabase.plugins;

import O3.C;
import U3.c;
import U3.e;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007JF\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u0010\b\u0000\u0010\u000b\u0018\u0001*\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0004\b\u0001\u0010\f\"\u0014\b\u0002\u0010\r*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u000f\u001a\u0002H\rH\u0086\b¢\u0006\u0002\u0010\u0010JD\u0010\u0011\u001a\u0002H\u000b\"\u0010\b\u0000\u0010\u000b\u0018\u0001*\b\u0012\u0004\u0012\u0002H\f0\u0005\"\u0004\b\u0001\u0010\f\"\u0014\b\u0002\u0010\r*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u000f\u001a\u0002H\rH\u0086\b¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0012\u001a\u00020\u0013H\u0086H¢\u0006\u0002\u0010\u0014R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/plugins/PluginManager;", "", "installedPlugins", "", "", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "<init>", "(Ljava/util/Map;)V", "getInstalledPlugins", "()Ljava/util/Map;", "getPluginOrNull", "Plugin", "Config", "Provider", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "provider", "(Lio/github/jan/supabase/plugins/SupabasePluginProvider;)Lio/github/jan/supabase/plugins/SupabasePlugin;", "getPlugin", "closeAllPlugins", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PluginManager {
    private final Map<String, SupabasePlugin<?>> installedPlugins;

    @e(c = "io.github.jan.supabase.plugins.PluginManager", f = "PluginManager.kt", l = {35}, m = "closeAllPlugins", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: io.github.jan.supabase.plugins.PluginManager$closeAllPlugins$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PluginManager.this.closeAllPlugins(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PluginManager(Map<String, ? extends SupabasePlugin<?>> map) {
        l.f("installedPlugins", map);
        this.installedPlugins = map;
        SupabaseClient.Companion companion = SupabaseClient.INSTANCE;
        SupabaseLogger logger = companion.getLOGGER();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (logLevel.compareTo(level == null ? companion.getDEFAULT_LOG_LEVEL() : level) >= 0) {
            logger.log(logLevel, (Throwable) null, "PluginManager initialized with plugins: " + map.keySet());
        }
    }

    private final Object closeAllPlugins$$forInline(S3.c<? super C> cVar) {
        Iterator<T> it = getInstalledPlugins().values().iterator();
        while (it.hasNext()) {
            ((SupabasePlugin) it.next()).close(null);
        }
        return C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object closeAllPlugins(S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.github.jan.supabase.plugins.PluginManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.plugins.PluginManager$closeAllPlugins$1 r0 = (io.github.jan.supabase.plugins.PluginManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.plugins.PluginManager$closeAllPlugins$1 r0 = new io.github.jan.supabase.plugins.PluginManager$closeAllPlugins$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r2 = r0.I$1
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$3
            io.github.jan.supabase.plugins.SupabasePlugin r6 = (io.github.jan.supabase.plugins.SupabasePlugin) r6
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            P3.r.Y(r9)
            goto L54
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L40:
            P3.r.Y(r9)
            java.util.Map r9 = r8.getInstalledPlugins()
            java.util.Collection r9 = r9.values()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r6 = r9
            r2 = r4
            r5 = r2
        L54:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L78
            java.lang.Object r9 = r6.next()
            io.github.jan.supabase.plugins.SupabasePlugin r9 = (io.github.jan.supabase.plugins.SupabasePlugin) r9
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r7
            r0.I$0 = r5
            r0.I$1 = r2
            r0.I$2 = r4
            r0.label = r3
            java.lang.Object r9 = r9.close(r0)
            if (r9 != r1) goto L54
            return r1
        L78:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.plugins.PluginManager.closeAllPlugins(S3.c):java.lang.Object");
    }

    public final Map<String, SupabasePlugin<?>> getInstalledPlugins() {
        return this.installedPlugins;
    }

    public final <Plugin extends SupabasePlugin<Config>, Config, Provider extends SupabasePluginProvider<Config, Plugin>> Plugin getPlugin(Provider provider) {
        l.f("provider", provider);
        getInstalledPlugins().get(provider.getKey());
        l.k();
        throw null;
    }

    public final <Plugin extends SupabasePlugin<Config>, Config, Provider extends SupabasePluginProvider<Config, Plugin>> Plugin getPluginOrNull(Provider provider) {
        l.f("provider", provider);
        getInstalledPlugins().get(provider.getKey());
        l.k();
        throw null;
    }
}
