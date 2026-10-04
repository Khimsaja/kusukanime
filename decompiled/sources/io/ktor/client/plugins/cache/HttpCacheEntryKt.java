package io.ktor.client.plugins.cache;

import J3.a;
import P3.q;
import P3.z;
import U3.c;
import U3.e;
import e4.InterfaceC0821a;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.DateUtilsKt;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.DateKt;
import io.ktor.util.date.GMTDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "isShared", "Lio/ktor/client/statement/HttpResponse;", "response", "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "HttpCacheEntry", "(ZLio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "", "", "varyKeys", "(Lio/ktor/client/statement/HttpResponse;)Ljava/util/Map;", "Lkotlin/Function0;", "Lio/ktor/util/date/GMTDate;", "fallback", "cacheExpires", "(Lio/ktor/client/statement/HttpResponse;ZLe4/a;)Lio/ktor/util/date/GMTDate;", "Lio/ktor/http/Headers;", "responseHeaders", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lio/ktor/client/plugins/cache/ValidateStatus;", "shouldValidate", "(Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/plugins/cache/ValidateStatus;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCacheEntryKt {

    @e(c = "io.ktor.client.plugins.cache.HttpCacheEntryKt", f = "HttpCacheEntry.kt", l = {18}, m = "HttpCacheEntry")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCacheEntryKt.HttpCacheEntry(false, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object HttpCacheEntry(boolean r4, io.ktor.client.statement.HttpResponse r5, S3.c<? super io.ktor.client.plugins.cache.HttpCacheEntry> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.HttpCacheEntryKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 r0 = (io.ktor.client.plugins.cache.HttpCacheEntryKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1 r0 = new io.ktor.client.plugins.cache.HttpCacheEntryKt$HttpCacheEntry$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r4 = r0.Z$0
            java.lang.Object r5 = r0.L$0
            io.ktor.client.statement.HttpResponse r5 = (io.ktor.client.statement.HttpResponse) r5
            P3.r.Y(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            P3.r.Y(r6)
            io.ktor.utils.io.ByteReadChannel r6 = r5.getRawContent()
            r0.L$0 = r5
            r0.Z$0 = r4
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            S5.n r6 = (S5.n) r6
            byte[] r6 = S5.p.h(r6)
            io.ktor.client.plugins.cache.HttpCacheEntry r0 = new io.ktor.client.plugins.cache.HttpCacheEntry
            r1 = 2
            r2 = 0
            io.ktor.util.date.GMTDate r4 = cacheExpires$default(r5, r4, r2, r1, r2)
            java.util.Map r1 = varyKeys(r5)
            r0.<init>(r4, r1, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.HttpCacheEntryKt.HttpCacheEntry(boolean, io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    public static final GMTDate cacheExpires(HttpResponse httpResponse, boolean z7, InterfaceC0821a interfaceC0821a) {
        String str;
        Long lV;
        Object next;
        String value;
        String str2;
        l.f("<this>", httpResponse);
        l.f("fallback", interfaceC0821a);
        List<HeaderValue> listCacheControl = HttpMessagePropertiesKt.cacheControl(httpResponse);
        if (!z7 || (listCacheControl != null && listCacheControl.isEmpty())) {
            str = io.ktor.client.utils.CacheControl.MAX_AGE;
        } else {
            Iterator<T> it = listCacheControl.iterator();
            while (it.hasNext()) {
                String value2 = ((HeaderValue) it.next()).getValue();
                str = io.ktor.client.utils.CacheControl.S_MAX_AGE;
                if (AbstractC2517v.T(value2, io.ktor.client.utils.CacheControl.S_MAX_AGE, false)) {
                    break;
                }
            }
            str = io.ktor.client.utils.CacheControl.MAX_AGE;
        }
        Iterator<T> it2 = listCacheControl.iterator();
        while (true) {
            lV = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (AbstractC2517v.T(((HeaderValue) next).getValue(), str, false)) {
                break;
            }
        }
        HeaderValue headerValue = (HeaderValue) next;
        if (headerValue != null && (value = headerValue.getValue()) != null && (str2 = (String) q.u0(1, AbstractC2510o.u0(value, new String[]{"="}, 0, 6))) != null) {
            lV = AbstractC2517v.V(str2);
        }
        if (lV != null) {
            return DateKt.plus(httpResponse.getRequestTime(), lV.longValue() * 1000);
        }
        String str3 = httpResponse.getHeaders().get(HttpHeaders.INSTANCE.getExpires());
        if (str3 == null) {
            return (GMTDate) interfaceC0821a.invoke();
        }
        if (str3.equals("0") || AbstractC2510o.g0(str3)) {
            return (GMTDate) interfaceC0821a.invoke();
        }
        try {
            return DateUtilsKt.fromHttpToGmtDate(str3);
        } catch (Throwable unused) {
            return (GMTDate) interfaceC0821a.invoke();
        }
    }

    public static /* synthetic */ GMTDate cacheExpires$default(HttpResponse httpResponse, boolean z7, InterfaceC0821a interfaceC0821a, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            interfaceC0821a = new a(20);
        }
        return cacheExpires(httpResponse, z7, interfaceC0821a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GMTDate cacheExpires$lambda$0() {
        return DateJvmKt.GMTDate$default(null, 1, null);
    }

    public static final ValidateStatus shouldValidate(GMTDate gMTDate, Headers headers, HttpRequestBuilder httpRequestBuilder) {
        int iIntValue;
        Object next;
        Integer numValueOf;
        String value;
        String value2;
        String str;
        l.f("cacheExpires", gMTDate);
        l.f("responseHeaders", headers);
        l.f("request", httpRequestBuilder);
        HeadersBuilder headers2 = httpRequestBuilder.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        List<String> all = headers.getAll(httpHeaders.getCacheControl());
        Object obj = null;
        List<HeaderValue> headerValue = HttpHeaderValueParserKt.parseHeaderValue(all != null ? q.y0(all, ",", null, null, null, 62) : null);
        List<String> all2 = headers2.getAll(httpHeaders.getCacheControl());
        List<HeaderValue> headerValue2 = HttpHeaderValueParserKt.parseHeaderValue(all2 != null ? q.y0(all2, ",", null, null, null, 62) : null);
        if (headerValue2.contains(CacheControl.INSTANCE.getNO_CACHE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().e("\"no-cache\" is set for " + httpRequestBuilder.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        Iterator<T> it = headerValue2.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC2517v.T(((HeaderValue) next).getValue(), "max-age=", false)) {
                break;
            }
        }
        HeaderValue headerValue3 = (HeaderValue) next;
        if (headerValue3 == null || (value2 = headerValue3.getValue()) == null || (str = (String) AbstractC2510o.u0(value2, new String[]{"="}, 0, 6).get(1)) == null) {
            numValueOf = null;
        } else {
            Integer numU = AbstractC2517v.U(str);
            numValueOf = Integer.valueOf(numU != null ? numU.intValue() : 0);
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            HttpCacheKt.getLOGGER().e("\"max-age\" is not set for " + httpRequestBuilder.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        CacheControl cacheControl = CacheControl.INSTANCE;
        if (headerValue.contains(cacheControl.getNO_CACHE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().e("\"no-cache\" is set for " + httpRequestBuilder.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        long timestamp = gMTDate.getTimestamp() - DateJvmKt.getTimeMillis();
        if (timestamp > 0) {
            HttpCacheKt.getLOGGER().e("Cached response is valid for " + httpRequestBuilder.getUrl() + ", should not validate");
            return ValidateStatus.ShouldNotValidate;
        }
        if (headerValue.contains(cacheControl.getMUST_REVALIDATE$ktor_client_core())) {
            HttpCacheKt.getLOGGER().e("\"must-revalidate\" is set for " + httpRequestBuilder.getUrl() + ", should validate cached response");
            return ValidateStatus.ShouldValidate;
        }
        Iterator<T> it2 = headerValue2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (AbstractC2517v.T(((HeaderValue) next2).getValue(), "max-stale=", false)) {
                obj = next2;
                break;
            }
        }
        HeaderValue headerValue4 = (HeaderValue) obj;
        if (headerValue4 != null && (value = headerValue4.getValue()) != null) {
            String strSubstring = value.substring(10);
            l.e("substring(...)", strSubstring);
            Integer numU2 = AbstractC2517v.U(strSubstring);
            if (numU2 != null) {
                iIntValue = numU2.intValue();
            }
        }
        if ((iIntValue * 1000) + timestamp > 0) {
            HttpCacheKt.getLOGGER().e("Cached response is stale for " + httpRequestBuilder.getUrl() + " but less than max-stale, should warn");
            return ValidateStatus.ShouldWarn;
        }
        HttpCacheKt.getLOGGER().e("Cached response is stale for " + httpRequestBuilder.getUrl() + ", should validate cached response");
        return ValidateStatus.ShouldValidate;
    }

    public static final Map<String, String> varyKeys(HttpResponse httpResponse) {
        l.f("<this>", httpResponse);
        List<String> listVary = HttpMessagePropertiesKt.vary(httpResponse);
        if (listVary == null) {
            return z.f7780k;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Headers headers = httpResponse.getCall().getRequest().getHeaders();
        for (String str : listVary) {
            String str2 = headers.get(str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
