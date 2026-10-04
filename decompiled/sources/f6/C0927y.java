package f6;

import f.AbstractC0841b;
import io.ktor.http.LinkHeader;
import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;
import w6.C2224i;
import w6.InterfaceC2225j;

/* renamed from: f6.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927y extends AbstractC0893G {

    /* renamed from: e, reason: collision with root package name */
    public static final C0925w f11620e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0925w f11621f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f11622g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f11623h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f11624i;
    public final w6.l a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11625b;

    /* renamed from: c, reason: collision with root package name */
    public final C0925w f11626c;

    /* renamed from: d, reason: collision with root package name */
    public long f11627d;

    static {
        Pattern pattern = C0925w.f11614e;
        f11620e = AbstractC0841b.k("multipart/mixed");
        AbstractC0841b.k("multipart/alternative");
        AbstractC0841b.k("multipart/digest");
        AbstractC0841b.k("multipart/parallel");
        f11621f = AbstractC0841b.k("multipart/form-data");
        f11622g = new byte[]{58, 32};
        f11623h = new byte[]{13, 10};
        f11624i = new byte[]{45, 45};
    }

    public C0927y(w6.l lVar, C0925w c0925w, List list) {
        kotlin.jvm.internal.l.f("boundaryByteString", lVar);
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, c0925w);
        this.a = lVar;
        this.f11625b = list;
        Pattern pattern = C0925w.f11614e;
        this.f11626c = AbstractC0841b.k(c0925w + "; boundary=" + lVar.r());
        this.f11627d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(InterfaceC2225j interfaceC2225j, boolean z7) throws EOFException {
        C2224i c2224i;
        InterfaceC2225j c2224i2;
        if (z7) {
            c2224i2 = new C2224i();
            c2224i = c2224i2;
        } else {
            c2224i = 0;
            c2224i2 = interfaceC2225j;
        }
        List list = this.f11625b;
        int size = list.size();
        long j7 = 0;
        int i7 = 0;
        while (true) {
            w6.l lVar = this.a;
            byte[] bArr = f11624i;
            byte[] bArr2 = f11623h;
            if (i7 >= size) {
                kotlin.jvm.internal.l.c(c2224i2);
                c2224i2.E(bArr);
                c2224i2.k(lVar);
                c2224i2.E(bArr);
                c2224i2.E(bArr2);
                if (!z7) {
                    return j7;
                }
                kotlin.jvm.internal.l.c(c2224i);
                long j8 = j7 + c2224i.f17156l;
                c2224i.b();
                return j8;
            }
            C0926x c0926x = (C0926x) list.get(i7);
            C0920r c0920r = c0926x.a;
            kotlin.jvm.internal.l.c(c2224i2);
            c2224i2.E(bArr);
            c2224i2.k(lVar);
            c2224i2.E(bArr2);
            int size2 = c0920r.size();
            for (int i8 = 0; i8 < size2; i8++) {
                c2224i2.R(c0920r.h(i8)).E(f11622g).R(c0920r.m(i8)).E(bArr2);
            }
            AbstractC0893G abstractC0893G = c0926x.f11619b;
            C0925w c0925wContentType = abstractC0893G.contentType();
            if (c0925wContentType != null) {
                c2224i2.R("Content-Type: ").R(c0925wContentType.a).E(bArr2);
            }
            long jContentLength = abstractC0893G.contentLength();
            if (jContentLength != -1) {
                c2224i2.R("Content-Length: ").S(jContentLength).E(bArr2);
            } else if (z7) {
                kotlin.jvm.internal.l.c(c2224i);
                c2224i.b();
                return -1L;
            }
            c2224i2.E(bArr2);
            if (z7) {
                j7 += jContentLength;
            } else {
                abstractC0893G.writeTo(c2224i2);
            }
            c2224i2.E(bArr2);
            i7++;
        }
    }

    @Override // f6.AbstractC0893G
    public final long contentLength() throws EOFException {
        long j7 = this.f11627d;
        if (j7 != -1) {
            return j7;
        }
        long jA = a(null, true);
        this.f11627d = jA;
        return jA;
    }

    @Override // f6.AbstractC0893G
    public final C0925w contentType() {
        return this.f11626c;
    }

    @Override // f6.AbstractC0893G
    public final void writeTo(InterfaceC2225j interfaceC2225j) throws EOFException {
        a(interfaceC2225j, false);
    }
}
