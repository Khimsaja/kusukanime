package E1;

import B1.AbstractC0015b;
import android.net.Uri;
import io.ktor.sse.ServerSentEventKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y1.AbstractC2402y;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1881j = 0;
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1882b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1883c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1884d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f1885e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1886f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1887g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1888h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1889i;

    static {
        AbstractC2402y.a("media3.datasource");
    }

    public k(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8) {
        AbstractC0015b.c(j7 + j8 >= 0);
        AbstractC0015b.c(j8 >= 0);
        AbstractC0015b.c(j9 > 0 || j9 == -1);
        uri.getClass();
        this.a = uri;
        this.f1882b = j7;
        this.f1883c = i7;
        this.f1884d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f1885e = Collections.unmodifiableMap(new HashMap(map));
        this.f1886f = j8;
        this.f1887g = j9;
        this.f1888h = str;
        this.f1889i = i8;
    }

    public final j a() {
        j jVar = new j();
        jVar.a = this.a;
        jVar.f1873b = this.f1882b;
        jVar.f1874c = this.f1883c;
        jVar.f1875d = this.f1884d;
        jVar.f1876e = this.f1885e;
        jVar.f1877f = this.f1886f;
        jVar.f1878g = this.f1887g;
        jVar.f1879h = this.f1888h;
        jVar.f1880i = this.f1889i;
        return jVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i7 = this.f1883c;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(ServerSentEventKt.SPACE);
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f1886f);
        sb.append(", ");
        sb.append(this.f1887g);
        sb.append(", ");
        sb.append(this.f1888h);
        sb.append(", ");
        sb.append(this.f1889i);
        sb.append("]");
        return sb.toString();
    }
}
