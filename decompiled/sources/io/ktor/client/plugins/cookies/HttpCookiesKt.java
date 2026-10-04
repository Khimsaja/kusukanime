package io.ktor.client.plugins.cookies;

import P3.q;
import U3.c;
import U3.e;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.http.ContentDisposition;
import io.ktor.http.Cookie;
import io.ktor.http.CookieKt;
import io.ktor.http.Url;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0002\u0010\t\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0002\u0010\u000b\u001a$\u0010\r\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Lio/ktor/http/Cookie;", "cookies", "", "renderClientCookies", "(Ljava/util/List;)Ljava/lang/String;", "Lio/ktor/client/HttpClient;", "Lio/ktor/http/Url;", "url", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;LS3/c;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;LS3/c;)Ljava/lang/Object;", ContentDisposition.Parameters.Name, "get", "(Ljava/util/List;Ljava/lang/String;)Lio/ktor/http/Cookie;", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCookiesKt {
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCookies");

    @e(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", l = {150}, m = "cookies")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCookiesKt.cookies((HttpClient) null, (Url) null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", l = {158}, m = "cookies")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2, reason: invalid class name */
    public static final class AnonymousClass2 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(S3.c<? super AnonymousClass2> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCookiesKt.cookies((HttpClient) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookiesKt$renderClientCookies$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C11761 extends j implements k {
        public static final C11761 INSTANCE = new C11761();

        public C11761() {
            super(1, CookieKt.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);
        }

        @Override // e4.k
        public final String invoke(Cookie cookie) {
            l.f("p0", cookie);
            return CookieKt.renderCookieHeader(cookie);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient r4, io.ktor.http.Url r5, S3.c<? super java.util.List<io.ktor.http.Cookie>> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1 r0 = (io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1 r0 = new io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r6)
            io.ktor.client.plugins.cookies.HttpCookies$Companion r6 = io.ktor.client.plugins.cookies.HttpCookies.INSTANCE
            java.lang.Object r4 = io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(r4, r6)
            io.ktor.client.plugins.cookies.HttpCookies r4 = (io.ktor.client.plugins.cookies.HttpCookies) r4
            if (r4 == 0) goto L4b
            r0.label = r3
            java.lang.Object r6 = r4.get(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L4a
            goto L4b
        L4a:
            return r6
        L4b:
            P3.y r4 = P3.y.f7779k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookiesKt.cookies(io.ktor.client.HttpClient, io.ktor.http.Url, S3.c):java.lang.Object");
    }

    public static final Cookie get(List<Cookie> list, String str) {
        Object next;
        l.f("<this>", list);
        l.f(ContentDisposition.Parameters.Name, str);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (l.a(((Cookie) next).getName(), str)) {
                break;
            }
        }
        return (Cookie) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderClientCookies(List<Cookie> list) {
        return q.y0(list, "; ", null, null, C11761.INSTANCE, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object cookies(io.ktor.client.HttpClient r4, java.lang.String r5, S3.c<? super java.util.List<io.ktor.http.Cookie>> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2 r0 = (io.ktor.client.plugins.cookies.HttpCookiesKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2 r0 = new io.ktor.client.plugins.cookies.HttpCookiesKt$cookies$2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r6)
            io.ktor.client.plugins.cookies.HttpCookies$Companion r6 = io.ktor.client.plugins.cookies.HttpCookies.INSTANCE
            java.lang.Object r4 = io.ktor.client.plugins.HttpClientPluginKt.pluginOrNull(r4, r6)
            io.ktor.client.plugins.cookies.HttpCookies r4 = (io.ktor.client.plugins.cookies.HttpCookies) r4
            if (r4 == 0) goto L4f
            io.ktor.http.Url r5 = io.ktor.http.URLUtilsKt.Url(r5)
            r0.label = r3
            java.lang.Object r6 = r4.get(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L4e
            goto L4f
        L4e:
            return r6
        L4f:
            P3.y r4 = P3.y.f7779k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookiesKt.cookies(io.ktor.client.HttpClient, java.lang.String, S3.c):java.lang.Object");
    }
}
