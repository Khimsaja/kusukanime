package io.ktor.client.engine;

import H5.C0263e0;
import H5.InterfaceC0265f0;
import H5.N;
import O3.C;
import P3.m;
import P3.q;
import S3.f;
import S3.h;
import e4.k;
import e4.n;
import io.ktor.client.utils.HeadersKt;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.PlatformUtils;
import io.ktor.utils.io.InternalAPI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0010\u0010\u000b\u001a\u00020\nH\u0087@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0080H¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0014\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/Function2;", "", "LO3/C;", "block", "mergeHeaders", "(Lio/ktor/http/Headers;Lio/ktor/http/content/OutgoingContent;Le4/n;)V", "LS3/h;", "callContext", "(LS3/c;)Ljava/lang/Object;", "LH5/f0;", "callJob", "attachToUserJob", "(LH5/f0;LS3/c;)Ljava/lang/Object;", "", "needUserAgent", "()Z", "KTOR_DEFAULT_USER_AGENT", "Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT", "()Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT$annotations", "()V", "", "DATE_HEADERS", "Ljava/util/Set;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    private static final Set<String> DATE_HEADERS;
    private static final String KTOR_DEFAULT_USER_AGENT = "ktor-client";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.client.engine.UtilsKt$attachToUserJob$2, reason: invalid class name */
    public static final class AnonymousClass2 implements k {
        final /* synthetic */ N $cleanupHandler;

        public AnonymousClass2(N n7) {
            this.$cleanupHandler = n7;
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C.a;
        }

        public final void invoke(Throwable th) {
            this.$cleanupHandler.dispose();
        }
    }

    static {
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        DATE_HEADERS = m.v0(new String[]{httpHeaders.getDate(), httpHeaders.getExpires(), httpHeaders.getLastModified(), httpHeaders.getIfModifiedSince(), httpHeaders.getIfUnmodifiedSince()});
    }

    public static final Object attachToUserJob(InterfaceC0265f0 interfaceC0265f0, S3.c<? super C> cVar) {
        InterfaceC0265f0 interfaceC0265f02 = (InterfaceC0265f0) cVar.getContext().get(C0263e0.f3843k);
        C c2 = C.a;
        if (interfaceC0265f02 == null) {
            return c2;
        }
        interfaceC0265f0.x(new AnonymousClass2(interfaceC0265f02.L(true, true, new UtilsKt$attachToUserJob$cleanupHandler$1(interfaceC0265f0))));
        return c2;
    }

    private static final Object attachToUserJob$$forInline(InterfaceC0265f0 interfaceC0265f0, S3.c<? super C> cVar) {
        throw null;
    }

    @InternalAPI
    public static final Object callContext(S3.c<? super h> cVar) {
        f fVar = cVar.getContext().get(KtorCallContextElement.INSTANCE);
        l.c(fVar);
        return ((KtorCallContextElement) fVar).getCallContext();
    }

    public static final String getKTOR_DEFAULT_USER_AGENT() {
        return KTOR_DEFAULT_USER_AGENT;
    }

    @InternalAPI
    public static /* synthetic */ void getKTOR_DEFAULT_USER_AGENT$annotations() {
    }

    @InternalAPI
    public static final void mergeHeaders(Headers headers, OutgoingContent outgoingContent, n nVar) {
        String string;
        String string2;
        l.f("requestHeaders", headers);
        l.f("content", outgoingContent);
        l.f("block", nVar);
        HeadersKt.buildHeaders(new a(2, headers, outgoingContent)).forEach(new c(nVar, 0));
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (headers.get(httpHeaders.getUserAgent()) == null && outgoingContent.getHeaders().get(httpHeaders.getUserAgent()) == null && needUserAgent()) {
            nVar.invoke(httpHeaders.getUserAgent(), KTOR_DEFAULT_USER_AGENT);
        }
        ContentType contentType = outgoingContent.getContentType();
        if ((contentType == null || (string = contentType.toString()) == null) && (string = outgoingContent.getHeaders().get(httpHeaders.getContentType())) == null) {
            string = headers.get(httpHeaders.getContentType());
        }
        Long contentLength = outgoingContent.getContentLength();
        if ((contentLength == null || (string2 = contentLength.toString()) == null) && (string2 = outgoingContent.getHeaders().get(httpHeaders.getContentLength())) == null) {
            string2 = headers.get(httpHeaders.getContentLength());
        }
        if (string != null) {
            nVar.invoke(httpHeaders.getContentType(), string);
        }
        if (string2 != null) {
            nVar.invoke(httpHeaders.getContentLength(), string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C mergeHeaders$lambda$0(Headers headers, OutgoingContent outgoingContent, HeadersBuilder headersBuilder) {
        l.f("$this$buildHeaders", headersBuilder);
        headersBuilder.appendAll(headers);
        headersBuilder.appendAll(outgoingContent.getHeaders());
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C mergeHeaders$lambda$2(n nVar, String str, List list) {
        l.f("key", str);
        l.f("values", list);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        boolean zA = l.a(httpHeaders.getContentLength(), str);
        C c2 = C.a;
        if (!zA && !l.a(httpHeaders.getContentType(), str)) {
            if (!DATE_HEADERS.contains(str)) {
                nVar.invoke(str, q.y0(list, l.a(httpHeaders.getCookie(), str) ? "; " : ",", null, null, null, 62));
                return c2;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nVar.invoke(str, (String) it.next());
            }
        }
        return c2;
    }

    private static final boolean needUserAgent() {
        return !PlatformUtils.INSTANCE.getIS_BROWSER();
    }
}
