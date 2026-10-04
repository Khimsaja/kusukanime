package io.ktor.client.engine.okhttp;

import H5.C0263e0;
import H5.C0270k;
import H5.InterfaceC0265f0;
import O3.C;
import P3.r;
import S3.c;
import S3.f;
import S3.h;
import e4.k;
import e4.n;
import f6.C0887A;
import f6.C0890D;
import f6.C0895I;
import f6.C0920r;
import f6.EnumC0888B;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.ContentDisposition;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import j6.i;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lf6/A;", "Lf6/D;", "request", "Lio/ktor/client/request/HttpRequestData;", "requestData", "LS3/h;", "callContext", "Lf6/I;", "execute", "(Lf6/A;Lf6/D;Lio/ktor/client/request/HttpRequestData;LS3/h;LS3/c;)Ljava/lang/Object;", "Lf6/r;", "Lio/ktor/http/Headers;", "fromOkHttp", "(Lf6/r;)Lio/ktor/http/Headers;", "Lf6/B;", "Lio/ktor/http/HttpProtocolVersion;", "(Lf6/B;)Lio/ktor/http/HttpProtocolVersion;", "Ljava/io/IOException;", "origin", "", "mapOkHttpException", "(Lio/ktor/client/request/HttpRequestData;Ljava/io/IOException;)Ljava/lang/Throwable;", "", "isConnectException", "(Ljava/io/IOException;)Z", "ktor-client-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkUtilsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0888B.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object execute(C0887A c0887a, C0890D c0890d, HttpRequestData httpRequestData, h hVar, c<? super C0895I> cVar) {
        C0270k c0270k = new C0270k(1, r.E(cVar));
        c0270k.r();
        final i iVarB = c0887a.b(c0890d);
        f fVar = hVar.get(C0263e0.f3843k);
        l.c(fVar);
        ((InterfaceC0265f0) fVar).L(true, true, new k() { // from class: io.ktor.client.engine.okhttp.OkUtilsKt$execute$2$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C.a;
            }

            public final void invoke(Throwable th) {
                ((i) iVarB).cancel();
            }
        });
        iVarB.d(new OkHttpCallback(httpRequestData, c0270k));
        Object objQ = c0270k.q();
        T3.a aVar = T3.a.f9048k;
        return objQ;
    }

    public static final Headers fromOkHttp(final C0920r c0920r) {
        l.f("<this>", c0920r);
        return new Headers() { // from class: io.ktor.client.engine.okhttp.OkUtilsKt.fromOkHttp.1
            private final boolean caseInsensitiveName = true;

            @Override // io.ktor.util.StringValues
            public boolean contains(String str) {
                return Headers.DefaultImpls.contains(this, str);
            }

            @Override // io.ktor.util.StringValues
            public Set<Map.Entry<String, List<String>>> entries() {
                C0920r c0920r2 = c0920r;
                c0920r2.getClass();
                Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                l.e("CASE_INSENSITIVE_ORDER", comparator);
                TreeMap treeMap = new TreeMap(comparator);
                int size = c0920r2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String strH = c0920r2.h(i7);
                    Locale locale = Locale.US;
                    l.e("US", locale);
                    String lowerCase = strH.toLowerCase(locale);
                    l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
                    List arrayList = (List) treeMap.get(lowerCase);
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        treeMap.put(lowerCase, arrayList);
                    }
                    arrayList.add(c0920r2.m(i7));
                }
                return treeMap.entrySet();
            }

            @Override // io.ktor.util.StringValues
            public void forEach(n nVar) {
                Headers.DefaultImpls.forEach(this, nVar);
            }

            @Override // io.ktor.util.StringValues
            public String get(String str) {
                return Headers.DefaultImpls.get(this, str);
            }

            @Override // io.ktor.util.StringValues
            public List<String> getAll(String name) {
                l.f(ContentDisposition.Parameters.Name, name);
                List<String> listO = c0920r.o(name);
                if (listO.isEmpty()) {
                    return null;
                }
                return listO;
            }

            @Override // io.ktor.util.StringValues
            public boolean getCaseInsensitiveName() {
                return this.caseInsensitiveName;
            }

            @Override // io.ktor.util.StringValues
            public boolean isEmpty() {
                return c0920r.size() == 0;
            }

            @Override // io.ktor.util.StringValues
            public Set<String> names() {
                C0920r c0920r2 = c0920r;
                c0920r2.getClass();
                Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                l.e("CASE_INSENSITIVE_ORDER", comparator);
                TreeSet treeSet = new TreeSet(comparator);
                int size = c0920r2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    treeSet.add(c0920r2.h(i7));
                }
                Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
                l.e("unmodifiableSet(result)", setUnmodifiableSet);
                return setUnmodifiableSet;
            }

            @Override // io.ktor.util.StringValues
            public boolean contains(String str, String str2) {
                return Headers.DefaultImpls.contains(this, str, str2);
            }
        };
    }

    private static final boolean isConnectException(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && AbstractC2510o.W(message, "connect", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable mapOkHttpException(HttpRequestData httpRequestData, IOException iOException) {
        if (!(iOException instanceof StreamAdapterIOException)) {
            return iOException instanceof SocketTimeoutException ? isConnectException(iOException) ? HttpTimeoutKt.ConnectTimeoutException(httpRequestData, iOException) : HttpTimeoutKt.SocketTimeoutException(httpRequestData, iOException) : iOException;
        }
        Throwable cause = iOException.getCause();
        return cause == null ? iOException : cause;
    }

    public static final HttpProtocolVersion fromOkHttp(EnumC0888B enumC0888B) {
        l.f("<this>", enumC0888B);
        int iOrdinal = enumC0888B.ordinal();
        if (iOrdinal == 0) {
            return HttpProtocolVersion.INSTANCE.getHTTP_1_0();
        }
        if (iOrdinal == 1) {
            return HttpProtocolVersion.INSTANCE.getHTTP_1_1();
        }
        if (iOrdinal == 2) {
            return HttpProtocolVersion.INSTANCE.getSPDY_3();
        }
        if (iOrdinal == 3) {
            return HttpProtocolVersion.INSTANCE.getHTTP_2_0();
        }
        if (iOrdinal == 4) {
            return HttpProtocolVersion.INSTANCE.getHTTP_2_0();
        }
        if (iOrdinal == 5) {
            return HttpProtocolVersion.INSTANCE.getQUIC();
        }
        throw new D6.r();
    }
}
