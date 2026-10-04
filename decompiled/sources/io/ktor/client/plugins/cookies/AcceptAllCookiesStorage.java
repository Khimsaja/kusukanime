package io.ktor.client.plugins.cookies;

import P3.v;
import U3.c;
import U3.e;
import e4.InterfaceC0821a;
import e4.k;
import io.ktor.client.plugins.cookies.AcceptAllCookiesStorage;
import io.ktor.http.Cookie;
import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/Function0;", "", "clock", "<init>", "(Le4/a;)V", "timestamp", "LO3/C;", "cleanup", "(J)V", "Lio/ktor/http/Cookie;", "createdAt", "maxAgeOrExpires", "(Lio/ktor/http/Cookie;J)Ljava/lang/Long;", "Lio/ktor/http/Url;", "requestUrl", "", "get", "(Lio/ktor/http/Url;LS3/c;)Ljava/lang/Object;", "cookie", "addCookie", "(Lio/ktor/http/Url;Lio/ktor/http/Cookie;LS3/c;)Ljava/lang/Object;", "close", "()V", "Le4/a;", "", "Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "container", "Ljava/util/List;", "LR5/a;", "mutex", "LR5/a;", "CookieWithTimestamp", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AcceptAllCookiesStorage implements CookiesStorage {
    private final InterfaceC0821a clock;
    private final List<CookieWithTimestamp> container;
    private final R5.a mutex;
    private volatile /* synthetic */ long oldestCookie;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "", "Lio/ktor/http/Cookie;", "cookie", "", "createdAt", "<init>", "(Lio/ktor/http/Cookie;J)V", "component1", "()Lio/ktor/http/Cookie;", "component2", "()J", "copy", "(Lio/ktor/http/Cookie;J)Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/http/Cookie;", "getCookie", "J", "getCreatedAt", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CookieWithTimestamp {
        private final Cookie cookie;
        private final long createdAt;

        public CookieWithTimestamp(Cookie cookie, long j7) {
            l.f("cookie", cookie);
            this.cookie = cookie;
            this.createdAt = j7;
        }

        public static /* synthetic */ CookieWithTimestamp copy$default(CookieWithTimestamp cookieWithTimestamp, Cookie cookie, long j7, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                cookie = cookieWithTimestamp.cookie;
            }
            if ((i7 & 2) != 0) {
                j7 = cookieWithTimestamp.createdAt;
            }
            return cookieWithTimestamp.copy(cookie, j7);
        }

        /* renamed from: component1, reason: from getter */
        public final Cookie getCookie() {
            return this.cookie;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final CookieWithTimestamp copy(Cookie cookie, long createdAt) {
            l.f("cookie", cookie);
            return new CookieWithTimestamp(cookie, createdAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CookieWithTimestamp)) {
                return false;
            }
            CookieWithTimestamp cookieWithTimestamp = (CookieWithTimestamp) other;
            return l.a(this.cookie, cookieWithTimestamp.cookie) && this.createdAt == cookieWithTimestamp.createdAt;
        }

        public final Cookie getCookie() {
            return this.cookie;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public int hashCode() {
            return Long.hashCode(this.createdAt) + (this.cookie.hashCode() * 31);
        }

        public String toString() {
            return "CookieWithTimestamp(cookie=" + this.cookie + ", createdAt=" + this.createdAt + ')';
        }
    }

    @e(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", l = {79}, m = "addCookie")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcceptAllCookiesStorage.this.addCookie(null, null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", l = {79}, m = "get")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11751 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11751(S3.c<? super C11751> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcceptAllCookiesStorage.this.get(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcceptAllCookiesStorage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addCookie$lambda$7$lambda$5(Cookie cookie, Url url, CookieWithTimestamp cookieWithTimestamp) {
        l.f("<destruct>", cookieWithTimestamp);
        Cookie cookie2 = cookieWithTimestamp.getCookie();
        return l.a(cookie2.getName(), cookie.getName()) && CookiesStorageKt.matches(cookie2, url);
    }

    private final void cleanup(final long timestamp) {
        v.g0(new k() { // from class: io.ktor.client.plugins.cookies.b
            @Override // e4.k
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AcceptAllCookiesStorage.cleanup$lambda$8(this.f12120k, timestamp, (AcceptAllCookiesStorage.CookieWithTimestamp) obj));
            }
        }, this.container);
        long jMin = Long.MAX_VALUE;
        for (CookieWithTimestamp cookieWithTimestamp : this.container) {
            Long lMaxAgeOrExpires = maxAgeOrExpires(cookieWithTimestamp.getCookie(), cookieWithTimestamp.getCreatedAt());
            if (lMaxAgeOrExpires != null) {
                jMin = Math.min(jMin, lMaxAgeOrExpires.longValue());
            }
        }
        this.oldestCookie = jMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cleanup$lambda$8(AcceptAllCookiesStorage acceptAllCookiesStorage, long j7, CookieWithTimestamp cookieWithTimestamp) {
        l.f("<destruct>", cookieWithTimestamp);
        Long lMaxAgeOrExpires = acceptAllCookiesStorage.maxAgeOrExpires(cookieWithTimestamp.getCookie(), cookieWithTimestamp.getCreatedAt());
        return lMaxAgeOrExpires != null && lMaxAgeOrExpires.longValue() < j7;
    }

    private final Long maxAgeOrExpires(Cookie cookie, long j7) {
        if (cookie.getMaxAgeInt() != null) {
            return Long.valueOf((r0.intValue() * 1000) + j7);
        }
        GMTDate expires = cookie.getExpires();
        if (expires != null) {
            return Long.valueOf(expires.getTimestamp());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v8, types: [R5.a] */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object addCookie(final io.ktor.http.Url r7, final io.ktor.http.Cookie r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 r0 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            O3.C r3 = O3.C.a
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r7 = r0.L$2
            R5.a r7 = (R5.a) r7
            java.lang.Object r8 = r0.L$1
            io.ktor.http.Cookie r8 = (io.ktor.http.Cookie) r8
            java.lang.Object r0 = r0.L$0
            io.ktor.http.Url r0 = (io.ktor.http.Url) r0
            P3.r.Y(r9)
            r9 = r7
            r7 = r0
            goto L60
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            P3.r.Y(r9)
            java.lang.String r9 = r8.getName()
            boolean r9 = z5.AbstractC2510o.g0(r9)
            if (r9 == 0) goto L4d
            return r3
        L4d:
            R5.a r9 = r6.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            R5.c r9 = (R5.c) r9
            java.lang.Object r0 = r9.c(r0)
            if (r0 != r1) goto L60
            return r1
        L60:
            r0 = 0
            java.util.List<io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp> r1 = r6.container     // Catch: java.lang.Throwable -> L98
            io.ktor.client.plugins.cookies.a r2 = new io.ktor.client.plugins.cookies.a     // Catch: java.lang.Throwable -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L98
            P3.v.g0(r2, r1)     // Catch: java.lang.Throwable -> L98
            e4.a r1 = r6.clock     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L98
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L98
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L98
            java.util.List<io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp> r4 = r6.container     // Catch: java.lang.Throwable -> L98
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp r5 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp     // Catch: java.lang.Throwable -> L98
            io.ktor.http.Cookie r7 = io.ktor.client.plugins.cookies.CookiesStorageKt.fillDefaults(r8, r7)     // Catch: java.lang.Throwable -> L98
            r5.<init>(r7, r1)     // Catch: java.lang.Throwable -> L98
            r4.add(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.Long r7 = r6.maxAgeOrExpires(r8, r1)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L9a
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L98
            long r1 = r6.oldestCookie     // Catch: java.lang.Throwable -> L98
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L9a
            r6.oldestCookie = r7     // Catch: java.lang.Throwable -> L98
            goto L9a
        L98:
            r7 = move-exception
            goto La0
        L9a:
            R5.c r9 = (R5.c) r9
            r9.e(r0)
            return r3
        La0:
            R5.c r9 = (R5.c) r9
            r9.e(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.addCookie(io.ktor.http.Url, io.ktor.http.Cookie, S3.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6, types: [R5.a] */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(io.ktor.http.Url r6, S3.c<? super java.util.List<io.ktor.http.Cookie>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.C11751
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 r0 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.C11751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 r0 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            R5.a r6 = (R5.a) r6
            java.lang.Object r0 = r0.L$0
            io.ktor.http.Url r0 = (io.ktor.http.Url) r0
            P3.r.Y(r7)
            r7 = r6
            r6 = r0
            goto L4d
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            P3.r.Y(r7)
            R5.a r7 = r5.mutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            R5.c r7 = (R5.c) r7
            java.lang.Object r0 = r7.c(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = 0
            e4.a r1 = r5.clock     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L64
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L64
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L64
            long r3 = r5.oldestCookie     // Catch: java.lang.Throwable -> L64
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L66
            r5.cleanup(r1)     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r6 = move-exception
            goto Lb5
        L66:
            java.util.List<io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp> r1 = r5.container     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L64
        L71:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L64
            r4 = r3
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp r4 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) r4     // Catch: java.lang.Throwable -> L64
            io.ktor.http.Cookie r4 = r4.getCookie()     // Catch: java.lang.Throwable -> L64
            boolean r4 = io.ktor.client.plugins.cookies.CookiesStorageKt.matches(r4, r6)     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L71
            r2.add(r3)     // Catch: java.lang.Throwable -> L64
            goto L71
        L8c:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r1 = 10
            int r1 = P3.r.p(r2, r1)     // Catch: java.lang.Throwable -> L64
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L64
        L9b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L64
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$CookieWithTimestamp r2 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) r2     // Catch: java.lang.Throwable -> L64
            io.ktor.http.Cookie r2 = r2.getCookie()     // Catch: java.lang.Throwable -> L64
            r6.add(r2)     // Catch: java.lang.Throwable -> L64
            goto L9b
        Laf:
            R5.c r7 = (R5.c) r7
            r7.e(r0)
            return r6
        Lb5:
            R5.c r7 = (R5.c) r7
            r7.e(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.get(io.ktor.http.Url, S3.c):java.lang.Object");
    }

    public AcceptAllCookiesStorage(InterfaceC0821a interfaceC0821a) {
        l.f("clock", interfaceC0821a);
        this.clock = interfaceC0821a;
        this.container = new ArrayList();
        this.oldestCookie = 0L;
        this.mutex = new R5.c();
    }

    public /* synthetic */ AcceptAllCookiesStorage(InterfaceC0821a interfaceC0821a, int i7, f fVar) {
        this((i7 & 1) != 0 ? new J3.a(21) : interfaceC0821a);
    }
}
