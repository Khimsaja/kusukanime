package E1;

import B1.AbstractC0015b;
import B1.K;
import android.net.Uri;
import b1.AbstractC0703b;
import j3.c0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p extends AbstractC0134c {

    /* renamed from: A, reason: collision with root package name */
    public long f1908A;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1909o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1910p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1911q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1912r;

    /* renamed from: s, reason: collision with root package name */
    public final F.w f1913s;

    /* renamed from: t, reason: collision with root package name */
    public final F.w f1914t;

    /* renamed from: u, reason: collision with root package name */
    public k f1915u;

    /* renamed from: v, reason: collision with root package name */
    public HttpURLConnection f1916v;

    /* renamed from: w, reason: collision with root package name */
    public InputStream f1917w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1918x;

    /* renamed from: y, reason: collision with root package name */
    public int f1919y;

    /* renamed from: z, reason: collision with root package name */
    public long f1920z;

    public p(String str, int i7, int i8, boolean z7, F.w wVar) {
        super(true);
        this.f1912r = str;
        this.f1910p = i7;
        this.f1911q = i8;
        this.f1909o = z7;
        this.f1913s = wVar;
        this.f1914t = new F.w(13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E1.h
    public final void close() {
        try {
            InputStream inputStream = this.f1917w;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i7 = K.a;
                    throw new u(2000, 3, e7);
                }
            }
        } finally {
            this.f1917w = null;
            r();
            if (this.f1918x) {
                this.f1918x = false;
                k();
            }
            this.f1916v = null;
            this.f1915u = null;
        }
    }

    @Override // E1.h
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f1916v;
        return httpURLConnection == null ? c0.f12326q : new o(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125 A[Catch: IOException -> 0x0130, TRY_LEAVE, TryCatch #4 {IOException -> 0x0130, blocks: (B:49:0x011d, B:51:0x0125), top: B:108:0x011d }] */
    @Override // E1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(E1.k r28) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.p.g(E1.k):long");
    }

    @Override // E1.h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f1916v;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.f1915u;
        if (kVar != null) {
            return kVar.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // y1.InterfaceC2385g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f1920z     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.f1908A     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.f1917w     // Catch: java.io.IOException -> L32
            int r1 = B1.K.a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.f1908A     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.f1908A = r8     // Catch: java.io.IOException -> L32
            r6.b(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = B1.K.a
            r8 = 2
            E1.u r7 = E1.u.a(r8, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.p.o(byte[], int, int):int");
    }

    public final void r() {
        HttpURLConnection httpURLConnection = this.f1916v;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                AbstractC0015b.n("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
        }
    }

    public final URL s(URL url, String str) throws u {
        if (str == null) {
            throw new u("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new u(AbstractC0703b.i("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f1909o || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e7) {
            throw new u(2001, 1, e7);
        }
    }

    public final HttpURLConnection t(k kVar) throws IOException {
        HttpURLConnection httpURLConnectionU;
        int i7;
        byte[] bArr;
        URL url = new URL(kVar.a.toString());
        int i8 = 1;
        boolean z7 = (kVar.f1889i & 1) == 1;
        boolean z8 = this.f1909o;
        int i9 = kVar.f1883c;
        byte[] bArr2 = kVar.f1884d;
        long j7 = kVar.f1886f;
        long j8 = kVar.f1887g;
        if (!z8) {
            return u(url, i9, bArr2, j7, j8, z7, true, kVar.f1885e);
        }
        byte[] bArr3 = bArr2;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new u(2001, 1, new NoRouteToHostException(AbstractC0703b.g(i11, "Too many redirects: ")));
            }
            byte[] bArr4 = bArr3;
            httpURLConnectionU = u(url, i9, bArr4, j7, j8, z7, false, kVar.f1885e);
            int responseCode = httpURLConnectionU.getResponseCode();
            String headerField = httpURLConnectionU.getHeaderField("Location");
            if ((i9 == i8 || i9 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionU.disconnect();
                url = s(url, headerField);
                i7 = i9;
                bArr = bArr4;
            } else {
                if (i9 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionU.disconnect();
                url = s(url, headerField);
                bArr = null;
                i7 = 1;
            }
            bArr3 = bArr;
            i9 = i7;
            i10 = i11;
            i8 = 1;
        }
        return httpURLConnectionU;
    }

    public final HttpURLConnection u(URL url, int i7, byte[] bArr, long j7, long j8, boolean z7, boolean z8, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f1910p);
        httpURLConnection.setReadTimeout(this.f1911q);
        HashMap map2 = new HashMap();
        F.w wVar = this.f1913s;
        if (wVar != null) {
            map2.putAll(wVar.z());
        }
        map2.putAll(this.f1914t.z());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = x.a;
        if (j7 == 0 && j8 == -1) {
            string = null;
        } else {
            StringBuilder sbK = A6.b.k("bytes=", j7, "-");
            if (j8 != -1) {
                sbK.append((j7 + j8) - 1);
            }
            string = sbK.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f1912r;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z7 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z8);
        httpURLConnection.setDoOutput(bArr != null);
        int i8 = k.f1881j;
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
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void v(long j7) throws IOException {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            int iMin = (int) Math.min(j7, 4096);
            InputStream inputStream = this.f1917w;
            int i7 = K.a;
            int i8 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new u(2000, 1, new InterruptedIOException());
            }
            if (i8 == -1) {
                throw new u();
            }
            j7 -= i8;
            b(i8);
        }
    }
}
