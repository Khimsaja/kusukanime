package io.github.jan.supabase.storage.resumable;

import F.w;
import F3.b;
import O3.C;
import T3.a;
import U3.c;
import U3.e;
import a6.C0673c;
import a6.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0015J$\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0018j\u0002`\u00190\u0017H\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/storage/resumable/SettingsResumableCache;", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "settings", "Lcom/russhwolf/settings/Settings;", "<init>", "(Lcom/russhwolf/settings/Settings;)V", "Lcom/russhwolf/settings/coroutines/SuspendSettings;", "set", "", "fingerprint", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "entry", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "get-iiNwMIM", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "remove-iiNwMIM", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entries", "", "Lkotlin/Pair;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsResumableCache implements ResumableCache {
    private final b settings;

    @e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {35, 36}, m = "clear", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.SettingsResumableCache$clear$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
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
            return SettingsResumableCache.this.clear(this);
        }
    }

    @e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {41, 44}, m = "entries", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.resumable.SettingsResumableCache$entries$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11551 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C11551(S3.c<? super C11551> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsResumableCache.this.entries(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsResumableCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clear(S3.c<? super O3.C> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.github.jan.supabase.storage.resumable.SettingsResumableCache.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            io.github.jan.supabase.storage.resumable.SettingsResumableCache$clear$1 r0 = (io.github.jan.supabase.storage.resumable.SettingsResumableCache.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.storage.resumable.SettingsResumableCache$clear$1 r0 = new io.github.jan.supabase.storage.resumable.SettingsResumableCache$clear$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L46
            if (r2 == r5) goto L42
            if (r2 != r6) goto L3a
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r0.L$0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            P3.r.Y(r10)
            goto L6a
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L42:
            P3.r.Y(r10)
            goto L62
        L46:
            P3.r.Y(r10)
            F3.b r10 = r9.settings
            r0.label = r5
            F.w r10 = (F.w) r10
            r10.getClass()
            F3.d r2 = new F3.d
            r2.<init>(r10, r3)
            java.lang.Object r10 = r10.f2038m
            H5.w r10 = (H5.AbstractC0281w) r10
            java.lang.Object r10 = H5.D.G(r10, r2, r0)
            if (r10 != r1) goto L62
            goto La3
        L62:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r5 = r10
            r2 = r4
        L6a:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Lb4
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r7 = "::"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r8 = 6
            java.util.List r7 = z5.AbstractC2510o.u0(r10, r7, r4, r8)
            int r7 = r7.size()
            if (r7 != r6) goto L6a
            io.github.jan.supabase.storage.resumable.Fingerprint$Companion r7 = io.github.jan.supabase.storage.resumable.Fingerprint.INSTANCE
            java.lang.String r7 = r7.m95invoke3xapfgk(r10)
            if (r7 == 0) goto La4
            r0.L$0 = r3
            r0.L$1 = r5
            r0.L$2 = r3
            r0.L$3 = r3
            r0.I$0 = r2
            r0.I$1 = r4
            r0.label = r6
            java.lang.Object r10 = r9.mo98removeiiNwMIM(r7, r0)
            if (r10 != r1) goto L6a
        La3:
            return r1
        La4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid fingerprint "
            java.lang.String r10 = r1.concat(r10)
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        Lb4:
            O3.C r10 = O3.C.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.SettingsResumableCache.clear(S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e7 -> B:35:0x00e8). Please report as a decompilation issue!!! */
    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object entries(S3.c<? super java.util.List<O3.l>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.SettingsResumableCache.entries(S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* renamed from: get-iiNwMIM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo97getiiNwMIM(java.lang.String r6, S3.c<? super io.github.jan.supabase.storage.resumable.ResumableCacheEntry> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1
            if (r0 == 0) goto L13
            r0 = r7
            io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1 r0 = (io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1 r0 = new io.github.jan.supabase.storage.resumable.SettingsResumableCache$get$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            P3.r.Y(r7)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            P3.r.Y(r7)
            F3.b r7 = r5.settings
            r0.L$0 = r3
            r0.label = r4
            F.w r7 = (F.w) r7
            r7.getClass()
            F3.c r2 = new F3.c
            r2.<init>(r7, r6, r3)
            java.lang.Object r6 = r7.f2038m
            H5.w r6 = (H5.AbstractC0281w) r6
            java.lang.Object r7 = H5.D.G(r6, r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L6e
            a6.c r6 = a6.d.f10459d
            r6.getClass()
            io.github.jan.supabase.storage.resumable.ResumableCacheEntry$Companion r0 = io.github.jan.supabase.storage.resumable.ResumableCacheEntry.INSTANCE
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            kotlinx.serialization.KSerializer r0 = n6.m.K(r0)
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
            java.lang.Object r6 = r6.b(r7, r0)
            io.github.jan.supabase.storage.resumable.ResumableCacheEntry r6 = (io.github.jan.supabase.storage.resumable.ResumableCacheEntry) r6
            return r6
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.resumable.SettingsResumableCache.mo97getiiNwMIM(java.lang.String, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* renamed from: remove-iiNwMIM */
    public Object mo98removeiiNwMIM(String str, S3.c<? super C> cVar) {
        Object objK = ((w) this.settings).K(str, cVar);
        return objK == a.f9048k ? objK : C.a;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* renamed from: set-zb63x2Q */
    public Object mo99setzb63x2Q(String str, ResumableCacheEntry resumableCacheEntry, S3.c<? super C> cVar) {
        b bVar = this.settings;
        C0673c c0673c = d.f10459d;
        c0673c.getClass();
        Object objI = ((w) bVar).I(str, c0673c.d(ResumableCacheEntry.INSTANCE.serializer(), resumableCacheEntry), cVar);
        return objI == a.f9048k ? objI : C.a;
    }

    public SettingsResumableCache(E3.a aVar) {
        l.f("settings", aVar);
        this.settings = AbstractC1420H.P(aVar);
    }

    public /* synthetic */ SettingsResumableCache(E3.a aVar, int i7, f fVar) {
        this((i7 & 1) != 0 ? z1.c.c() : aVar);
    }
}
