package E1;

import B1.AbstractC0015b;
import B1.K;
import android.net.Uri;
import android.util.Base64;
import b1.AbstractC0703b;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* renamed from: E1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137f extends AbstractC0134c {

    /* renamed from: o, reason: collision with root package name */
    public k f1867o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f1868p;

    /* renamed from: q, reason: collision with root package name */
    public int f1869q;

    /* renamed from: r, reason: collision with root package name */
    public int f1870r;

    @Override // E1.h
    public final void close() {
        if (this.f1868p != null) {
            this.f1868p = null;
            k();
        }
        this.f1867o = null;
    }

    @Override // E1.h
    public final long g(k kVar) throws i, y1.E {
        m();
        this.f1867o = kVar;
        Uri uriNormalizeScheme = kVar.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC0015b.b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i7 = K.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new y1.E("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f1868p = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw new y1.E(AbstractC0703b.i("Error while parsing Base64 encoded string: ", str), e7, true, 0);
            }
        } else {
            this.f1868p = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f1868p;
        long length = bArr.length;
        long j7 = kVar.f1886f;
        if (j7 > length) {
            this.f1868p = null;
            throw new i(2008);
        }
        int i8 = (int) j7;
        this.f1869q = i8;
        int length2 = bArr.length - i8;
        this.f1870r = length2;
        long j8 = kVar.f1887g;
        if (j8 != -1) {
            this.f1870r = (int) Math.min(length2, j8);
        }
        q(kVar);
        return j8 != -1 ? j8 : this.f1870r;
    }

    @Override // E1.h
    public final Uri getUri() {
        k kVar = this.f1867o;
        if (kVar != null) {
            return kVar.a;
        }
        return null;
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f1870r;
        if (i9 == 0) {
            return -1;
        }
        int iMin = Math.min(i8, i9);
        byte[] bArr2 = this.f1868p;
        int i10 = K.a;
        System.arraycopy(bArr2, this.f1869q, bArr, i7, iMin);
        this.f1869q += iMin;
        this.f1870r -= iMin;
        b(iMin);
        return iMin;
    }
}
