package k6;

import f6.C0887A;
import f6.C0895I;
import f6.C0904b;
import f6.InterfaceC0924v;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a implements InterfaceC0924v {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12695b;

    public a(C0904b c0904b) {
        l.f("cookieJar", c0904b);
        this.f12695b = c0904b;
    }

    public static int c(C0895I c0895i, int i7) throws NumberFormatException {
        String strB = C0895I.b(c0895i, "Retry-After");
        if (strB == null) {
            return i7;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        l.e("compile(...)", patternCompile);
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        l.e("valueOf(header)", numValueOf);
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f6.C0890D a(f6.C0895I r11, H1.C0231l r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a.a(f6.I, H1.l):f6.D");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.io.IOException r4, j6.i r5, f6.C0890D r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12695b
            f6.A r0 = (f6.C0887A) r0
            boolean r0 = r0.f11452p
            r1 = 0
            if (r0 != 0) goto Lb
            goto La7
        Lb:
            if (r7 == 0) goto L1c
            f6.G r6 = r6.f11477d
            if (r6 == 0) goto L17
            boolean r6 = r6.isOneShot()
            if (r6 != 0) goto La7
        L17:
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1c
            return r1
        L1c:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L21
            return r1
        L21:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2c
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto La7
            if (r7 != 0) goto La7
            goto L3f
        L2c:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L3a
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L3a
            goto La7
        L3a:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L3f
            return r1
        L3f:
            j6.e r4 = r5.f12516r
            kotlin.jvm.internal.l.c(r4)
            int r5 = r4.f12500f
            r6 = 1
            if (r5 != 0) goto L53
            int r7 = r4.f12501g
            if (r7 != 0) goto L53
            int r7 = r4.f12502h
            if (r7 != 0) goto L53
            r4 = r1
            goto La5
        L53:
            f6.L r7 = r4.f12503i
            if (r7 == 0) goto L58
            goto La0
        L58:
            r7 = 0
            if (r5 > r6) goto L8b
            int r5 = r4.f12501g
            if (r5 > r6) goto L8b
            int r5 = r4.f12502h
            if (r5 <= 0) goto L64
            goto L8b
        L64:
            j6.i r5 = r4.f12497c
            j6.l r5 = r5.f12517s
            if (r5 != 0) goto L6b
            goto L8b
        L6b:
            monitor-enter(r5)
            int r0 = r5.f12538l     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L72
            monitor-exit(r5)
            goto L8b
        L72:
            f6.L r0 = r5.f12528b     // Catch: java.lang.Throwable -> L88
            f6.a r0 = r0.a     // Catch: java.lang.Throwable -> L88
            f6.t r0 = r0.f11529i     // Catch: java.lang.Throwable -> L88
            f6.a r2 = r4.f12496b     // Catch: java.lang.Throwable -> L88
            f6.t r2 = r2.f11529i     // Catch: java.lang.Throwable -> L88
            boolean r0 = g6.b.a(r0, r2)     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L84
            monitor-exit(r5)
            goto L8b
        L84:
            f6.L r7 = r5.f12528b     // Catch: java.lang.Throwable -> L88
            monitor-exit(r5)
            goto L8b
        L88:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L8b:
            if (r7 == 0) goto L91
            r4.f12503i = r7
        L8f:
            r4 = r6
            goto La5
        L91:
            F5.o r5 = r4.f12498d
            if (r5 == 0) goto L9c
            boolean r5 = r5.q()
            if (r5 != r6) goto L9c
            goto La0
        L9c:
            Q4.b r4 = r4.f12499e
            if (r4 != 0) goto La1
        La0:
            goto L8f
        La1:
            boolean r4 = r4.i()
        La5:
            if (r4 != 0) goto La8
        La7:
            return r1
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a.b(java.io.IOException, j6.i, f6.D, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        r3.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        return r9;
     */
    @Override // f6.InterfaceC0924v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f6.C0895I intercept(f6.InterfaceC0923u r26) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a.intercept(f6.u):f6.I");
    }

    public a(C0887A c0887a) {
        l.f("client", c0887a);
        this.f12695b = c0887a;
    }
}
