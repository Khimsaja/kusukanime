package m6;

import io.ktor.http.ContentDisposition;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e {
    public static final C1528b[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f13017b;

    static {
        C1528b c1528b = new C1528b(C1528b.f13001i, "");
        w6.l lVar = C1528b.f12998f;
        C1528b c1528b2 = new C1528b(lVar, "GET");
        C1528b c1528b3 = new C1528b(lVar, "POST");
        w6.l lVar2 = C1528b.f12999g;
        C1528b c1528b4 = new C1528b(lVar2, "/");
        C1528b c1528b5 = new C1528b(lVar2, "/index.html");
        w6.l lVar3 = C1528b.f13000h;
        C1528b c1528b6 = new C1528b(lVar3, "http");
        C1528b c1528b7 = new C1528b(lVar3, "https");
        w6.l lVar4 = C1528b.f12997e;
        C1528b[] c1528bArr = {c1528b, c1528b2, c1528b3, c1528b4, c1528b5, c1528b6, c1528b7, new C1528b(lVar4, "200"), new C1528b(lVar4, "204"), new C1528b(lVar4, "206"), new C1528b(lVar4, "304"), new C1528b(lVar4, "400"), new C1528b(lVar4, "404"), new C1528b(lVar4, "500"), new C1528b("accept-charset", ""), new C1528b("accept-encoding", "gzip, deflate"), new C1528b("accept-language", ""), new C1528b("accept-ranges", ""), new C1528b("accept", ""), new C1528b("access-control-allow-origin", ""), new C1528b("age", ""), new C1528b("allow", ""), new C1528b("authorization", ""), new C1528b("cache-control", ""), new C1528b("content-disposition", ""), new C1528b("content-encoding", ""), new C1528b("content-language", ""), new C1528b("content-length", ""), new C1528b("content-location", ""), new C1528b("content-range", ""), new C1528b("content-type", ""), new C1528b("cookie", ""), new C1528b("date", ""), new C1528b("etag", ""), new C1528b("expect", ""), new C1528b("expires", ""), new C1528b("from", ""), new C1528b("host", ""), new C1528b("if-match", ""), new C1528b("if-modified-since", ""), new C1528b("if-none-match", ""), new C1528b("if-range", ""), new C1528b("if-unmodified-since", ""), new C1528b("last-modified", ""), new C1528b("link", ""), new C1528b("location", ""), new C1528b("max-forwards", ""), new C1528b("proxy-authenticate", ""), new C1528b("proxy-authorization", ""), new C1528b("range", ""), new C1528b("referer", ""), new C1528b("refresh", ""), new C1528b("retry-after", ""), new C1528b("server", ""), new C1528b("set-cookie", ""), new C1528b("strict-transport-security", ""), new C1528b("transfer-encoding", ""), new C1528b("user-agent", ""), new C1528b("vary", ""), new C1528b("via", ""), new C1528b("www-authenticate", "")};
        a = c1528bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i7 = 0; i7 < 61; i7++) {
            if (!linkedHashMap.containsKey(c1528bArr[i7].a)) {
                linkedHashMap.put(c1528bArr[i7].a, Integer.valueOf(i7));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.l.e("unmodifiableMap(result)", mapUnmodifiableMap);
        f13017b = mapUnmodifiableMap;
    }

    public static void a(w6.l lVar) throws IOException {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, lVar);
        int iD = lVar.d();
        for (int i7 = 0; i7 < iD; i7++) {
            byte bI = lVar.i(i7);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(lVar.r()));
            }
        }
    }
}
