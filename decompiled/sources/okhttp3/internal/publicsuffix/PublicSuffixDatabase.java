package okhttp3.internal.publicsuffix;

import P3.q;
import P3.r;
import P3.y;
import e5.AbstractC0832b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import n6.o;
import p.I0;
import w6.AbstractC2217b;
import w6.C;
import w6.s;
import y5.h;
import y5.k;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "p/I0", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13828e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f13829f = r.H("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f13830g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f13831b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f13832c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f13833d;

    public static List c(String str) {
        List listV0 = AbstractC2510o.v0(str, new char[]{'.'});
        return l.a(q.A0(listV0), "") ? q.p0(listV0) : listV0;
    }

    public final String a(String str) throws InterruptedException {
        String strL;
        String strL2;
        String strL3;
        List listV0;
        int size;
        int size2;
        int i7 = 0;
        String unicode = IDN.toUnicode(str);
        l.e("unicodeDomain", unicode);
        List listC = c(unicode);
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.f13831b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z7 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z7 = true;
                    } catch (IOException e7) {
                        o oVar = o.a;
                        o.a.getClass();
                        o.i("Failed to read public suffix list", 5, e7);
                        if (z7) {
                        }
                    }
                } finally {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f13832c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i8 = 0; i8 < size3; i8++) {
            String str2 = (String) listC.get(i8);
            Charset charset = StandardCharsets.UTF_8;
            l.e("UTF_8", charset);
            byte[] bytes = str2.getBytes(charset);
            l.e("this as java.lang.String).getBytes(charset)", bytes);
            bArr[i8] = bytes;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                strL = null;
                break;
            }
            byte[] bArr2 = this.f13832c;
            if (bArr2 == null) {
                l.l("publicSuffixListBytes");
                throw null;
            }
            strL = I0.l(bArr2, bArr, i9);
            if (strL != null) {
                break;
            }
            i9++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i10 = 0; i10 < length; i10++) {
                bArr3[i10] = f13828e;
                byte[] bArr4 = this.f13832c;
                if (bArr4 == null) {
                    l.l("publicSuffixListBytes");
                    throw null;
                }
                strL2 = I0.l(bArr4, bArr3, i10);
                if (strL2 != null) {
                    break;
                }
            }
            strL2 = null;
        } else {
            strL2 = null;
        }
        if (strL2 != null) {
            int i11 = size3 - 1;
            for (int i12 = 0; i12 < i11; i12++) {
                byte[] bArr5 = this.f13833d;
                if (bArr5 == null) {
                    l.l("publicSuffixExceptionListBytes");
                    throw null;
                }
                strL3 = I0.l(bArr5, bArr, i12);
                if (strL3 != null) {
                    break;
                }
            }
            strL3 = null;
        } else {
            strL3 = null;
        }
        if (strL3 != null) {
            listV0 = AbstractC2510o.v0("!".concat(strL3), new char[]{'.'});
        } else if (strL == null && strL2 == null) {
            listV0 = f13829f;
        } else {
            List listV02 = y.f7779k;
            List listV03 = strL != null ? AbstractC2510o.v0(strL, new char[]{'.'}) : listV02;
            if (strL2 != null) {
                listV02 = AbstractC2510o.v0(strL2, new char[]{'.'});
            }
            listV0 = listV03.size() > listV02.size() ? listV03 : listV02;
        }
        if (listC.size() == listV0.size() && ((String) listV0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listV0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listV0.size();
        } else {
            size = listC.size();
            size2 = listV0.size() + 1;
        }
        h hVarP = k.P(q.l0(c(str)), size - size2);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : hVarP) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC0832b.h(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                C c2 = AbstractC2217b.c(new s(AbstractC2217b.h(resourceAsStream)));
                try {
                    long j7 = c2.readInt();
                    c2.Q(j7);
                    byte[] bArrP = c2.f17114l.P(j7);
                    long j8 = c2.readInt();
                    c2.Q(j8);
                    byte[] bArrP2 = c2.f17114l.P(j8);
                    c2.close();
                    synchronized (this) {
                        this.f13832c = bArrP;
                        this.f13833d = bArrP2;
                    }
                } finally {
                }
            }
        } finally {
            this.f13831b.countDown();
        }
    }
}
